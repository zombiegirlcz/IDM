package ch.qos.logback.core.rolling;

import ch.qos.logback.core.joran.spi.NoAutoStart;
import ch.qos.logback.core.rolling.helper.ArchiveRemover;
import ch.qos.logback.core.rolling.helper.CompressionMode;
import ch.qos.logback.core.rolling.helper.FileFilterUtil;
import ch.qos.logback.core.rolling.helper.SizeAndTimeBasedArchiveRemover;
import ch.qos.logback.core.util.DefaultInvocationGate;
import ch.qos.logback.core.util.FileSize;
import ch.qos.logback.core.util.InvocationGate;
import java.io.File;

/* JADX INFO: loaded from: classes16.dex */
@NoAutoStart
public class SizeAndTimeBasedFNATP<E> extends TimeBasedFileNamingAndTriggeringPolicyBase<E> {
    static String MISSING_DATE_TOKEN = "Missing date token, that is %d, in FileNamePattern [";
    static String MISSING_INT_TOKEN = "Missing integer token, that is %i, in FileNamePattern [";
    int currentPeriodsCounter;
    InvocationGate invocationGate;
    FileSize maxFileSize;
    private final Usage usage;

    public enum Usage {
        EMBEDDED,
        DIRECT
    }

    public SizeAndTimeBasedFNATP() {
        this(Usage.DIRECT);
    }

    private boolean validDateAndIntegerTokens() {
        boolean z;
        if (this.tbrp.fileNamePattern.getIntegerTokenConverter() == null) {
            addError(MISSING_INT_TOKEN + this.tbrp.fileNamePatternStr + "]");
            addError("See also http://logback.qos.ch/codes.html#sat_missing_integer_token");
            z = true;
        } else {
            z = false;
        }
        if (this.tbrp.fileNamePattern.getPrimaryDateTokenConverter() == null) {
            addError(MISSING_DATE_TOKEN + this.tbrp.fileNamePatternStr + "]");
            z = true;
        }
        return !z;
    }

    public void computeCurrentPeriodsHighestCounterValue(String str) {
        int i;
        File[] fileArrFilesInFolderMatchingStemRegex = FileFilterUtil.filesInFolderMatchingStemRegex(new File(getCurrentPeriodsFileNameWithoutCompressionSuffix()).getParentFile(), str);
        if (fileArrFilesInFolderMatchingStemRegex == null || fileArrFilesInFolderMatchingStemRegex.length == 0) {
            i = 0;
        } else {
            this.currentPeriodsCounter = FileFilterUtil.findHighestCounter(fileArrFilesInFolderMatchingStemRegex, str);
            if (this.tbrp.getParentsRawFileProperty() == null && this.tbrp.compressionMode == CompressionMode.NONE) {
                return;
            } else {
                i = this.currentPeriodsCounter + 1;
            }
        }
        this.currentPeriodsCounter = i;
    }

    public ArchiveRemover createArchiveRemover() {
        return new SizeAndTimeBasedArchiveRemover(this.tbrp.fileNamePattern, this.f24078rc);
    }

    @Override // ch.qos.logback.core.rolling.TimeBasedFileNamingAndTriggeringPolicyBase, ch.qos.logback.core.rolling.TimeBasedFileNamingAndTriggeringPolicy
    public String getCurrentPeriodsFileNameWithoutCompressionSuffix() {
        return this.tbrp.fileNamePatternWithoutCompSuffix.convertMultipleArguments(this.dateInCurrentPeriod, Integer.valueOf(this.currentPeriodsCounter));
    }

    @Override // ch.qos.logback.core.rolling.TriggeringPolicy
    public boolean isTriggeringEvent(File file, E e) {
        String str;
        long currentTime = getCurrentTime();
        if (currentTime >= this.nextCheck) {
            this.elapsedPeriodsFileName = this.tbrp.fileNamePatternWithoutCompSuffix.convertMultipleArguments(this.dateInCurrentPeriod, Integer.valueOf(this.currentPeriodsCounter));
            this.currentPeriodsCounter = 0;
            setDateInCurrentPeriod(currentTime);
            computeNextCheck();
            return true;
        }
        if (this.invocationGate.isTooSoon(currentTime)) {
            return false;
        }
        if (file == null) {
            str = "activeFile == null";
        } else {
            if (this.maxFileSize != null) {
                if (file.length() < this.maxFileSize.getSize()) {
                    return false;
                }
                this.elapsedPeriodsFileName = this.tbrp.fileNamePatternWithoutCompSuffix.convertMultipleArguments(this.dateInCurrentPeriod, Integer.valueOf(this.currentPeriodsCounter));
                this.currentPeriodsCounter++;
                return true;
            }
            str = "maxFileSize = null";
        }
        addWarn(str);
        return false;
    }

    public void setMaxFileSize(FileSize fileSize) {
        this.maxFileSize = fileSize;
    }

    @Override // ch.qos.logback.core.rolling.TimeBasedFileNamingAndTriggeringPolicyBase, ch.qos.logback.core.spi.LifeCycle
    public void start() {
        super.start();
        if (this.usage == Usage.DIRECT) {
            addWarn("SizeAndTimeBasedFNATP is deprecated. Use SizeAndTimeBasedRollingPolicy instead");
            addWarn("For more information see http://logback.qos.ch/manual/appenders.html#SizeAndTimeBasedRollingPolicy");
        }
        if (super.isErrorFree()) {
            if (this.maxFileSize == null) {
                addError("maxFileSize property is mandatory.");
                withErrors();
            }
            if (!validDateAndIntegerTokens()) {
                withErrors();
                return;
            }
            ArchiveRemover archiveRemoverCreateArchiveRemover = createArchiveRemover();
            this.archiveRemover = archiveRemoverCreateArchiveRemover;
            archiveRemoverCreateArchiveRemover.setContext(this.context);
            computeCurrentPeriodsHighestCounterValue(FileFilterUtil.afterLastSlash(this.tbrp.fileNamePattern.toRegexForFixedDate(this.dateInCurrentPeriod)));
            if (isErrorFree()) {
                this.started = true;
            }
        }
    }

    public SizeAndTimeBasedFNATP(Usage usage) {
        this.currentPeriodsCounter = 0;
        this.invocationGate = new DefaultInvocationGate();
        this.usage = usage;
    }
}
