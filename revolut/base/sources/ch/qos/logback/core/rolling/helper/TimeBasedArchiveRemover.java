package ch.qos.logback.core.rolling.helper;

import ch.qos.logback.core.pattern.Converter;
import ch.qos.logback.core.pattern.LiteralConverter;
import ch.qos.logback.core.spi.ContextAwareBase;
import ch.qos.logback.core.util.FileSize;
import java.io.File;
import java.util.Date;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes16.dex */
public class TimeBasedArchiveRemover extends ContextAwareBase implements ArchiveRemover {
    protected static final long INACTIVITY_TOLERANCE_IN_MILLIS = 2764800000L;
    static final int MAX_VALUE_FOR_INACTIVITY_PERIODS = 336;
    protected static final long UNINITIALIZED = -1;
    final FileNamePattern fileNamePattern;
    final boolean parentClean;

    /* JADX INFO: renamed from: rc, reason: collision with root package name */
    final RollingCalendar f24080rc;
    private int maxHistory = 0;
    private long totalSizeCap = 0;
    long lastHeartBeat = -1;

    public class ArhiveRemoverRunnable implements Runnable {
        Date now;

        public ArhiveRemoverRunnable(Date date) {
            this.now = date;
        }

        @Override // java.lang.Runnable
        public void run() {
            TimeBasedArchiveRemover.this.clean(this.now);
            if (TimeBasedArchiveRemover.this.totalSizeCap == 0 || TimeBasedArchiveRemover.this.totalSizeCap <= 0) {
                return;
            }
            TimeBasedArchiveRemover.this.capTotalSize(this.now);
        }
    }

    public TimeBasedArchiveRemover(FileNamePattern fileNamePattern, RollingCalendar rollingCalendar) {
        this.fileNamePattern = fileNamePattern;
        this.f24080rc = rollingCalendar;
        this.parentClean = computeParentCleaningFlag(fileNamePattern);
    }

    private boolean fileExistsAndIsFile(File file) {
        return file.exists() && file.isFile();
    }

    public void capTotalSize(Date date) {
        long j2 = 0;
        long j3 = 0;
        for (int i = 0; i < this.maxHistory; i++) {
            Date endOfNextNthPeriod = this.f24080rc.getEndOfNextNthPeriod(date, -i);
            File[] filesInPeriod = getFilesInPeriod(endOfNextNthPeriod);
            descendingSort(filesInPeriod, endOfNextNthPeriod);
            for (File file : filesInPeriod) {
                long length = file.length();
                j3 += length;
                if (j3 > this.totalSizeCap) {
                    addInfo("Deleting [" + file + "] of size " + new FileSize(length));
                    j2 += length;
                    file.delete();
                }
            }
        }
        addInfo("Removed  " + new FileSize(j2) + " of files");
    }

    @Override // ch.qos.logback.core.rolling.helper.ArchiveRemover
    public void clean(Date date) {
        long time = date.getTime();
        int iComputeElapsedPeriodsSinceLastClean = computeElapsedPeriodsSinceLastClean(time);
        this.lastHeartBeat = time;
        if (iComputeElapsedPeriodsSinceLastClean > 1) {
            addInfo("Multiple periods, i.e. " + iComputeElapsedPeriodsSinceLastClean + " periods, seem to have elapsed. This is expected at application start.");
        }
        for (int i = 0; i < iComputeElapsedPeriodsSinceLastClean; i++) {
            cleanPeriod(this.f24080rc.getEndOfNextNthPeriod(date, getPeriodOffsetForDeletionTarget() - i));
        }
    }

    @Override // ch.qos.logback.core.rolling.helper.ArchiveRemover
    public Future<?> cleanAsynchronously(Date date) {
        return this.context.getScheduledExecutorService().submit(new ArhiveRemoverRunnable(date));
    }

    public void cleanPeriod(Date date) {
        File[] filesInPeriod = getFilesInPeriod(date);
        for (File file : filesInPeriod) {
            addInfo("deleting " + file);
            file.delete();
        }
        if (!this.parentClean || filesInPeriod.length <= 0) {
            return;
        }
        removeFolderIfEmpty(getParentDir(filesInPeriod[0]));
    }

    public int computeElapsedPeriodsSinceLastClean(long j2) {
        long jPeriodBarriersCrossed;
        long j3 = this.lastHeartBeat;
        if (j3 == -1) {
            addInfo("first clean up after appender initialization");
            jPeriodBarriersCrossed = Math.min(this.f24080rc.periodBarriersCrossed(j2, INACTIVITY_TOLERANCE_IN_MILLIS + j2), 336L);
        } else {
            jPeriodBarriersCrossed = this.f24080rc.periodBarriersCrossed(j3, j2);
        }
        return (int) jPeriodBarriersCrossed;
    }

    public boolean computeParentCleaningFlag(FileNamePattern fileNamePattern) {
        if (fileNamePattern.getPrimaryDateTokenConverter().getDatePattern().indexOf(47) != -1) {
            return true;
        }
        Converter<Object> next = fileNamePattern.headTokenConverter;
        while (next != null && !(next instanceof DateTokenConverter)) {
            next = next.getNext();
        }
        while (next != null) {
            if ((next instanceof LiteralConverter) && next.convert(null).indexOf(47) != -1) {
                return true;
            }
            next = next.getNext();
        }
        return false;
    }

    public void descendingSort(File[] fileArr, Date date) {
    }

    public File[] getFilesInPeriod(Date date) {
        File file = new File(this.fileNamePattern.convert(date));
        return fileExistsAndIsFile(file) ? new File[]{file} : new File[0];
    }

    public File getParentDir(File file) {
        return file.getAbsoluteFile().getParentFile();
    }

    public int getPeriodOffsetForDeletionTarget() {
        return (-this.maxHistory) - 1;
    }

    public void removeFolderIfEmpty(File file) {
        removeFolderIfEmpty(file, 0);
    }

    @Override // ch.qos.logback.core.rolling.helper.ArchiveRemover
    public void setMaxHistory(int i) {
        this.maxHistory = i;
    }

    @Override // ch.qos.logback.core.rolling.helper.ArchiveRemover
    public void setTotalSizeCap(long j2) {
        this.totalSizeCap = j2;
    }

    public String toString() {
        return "c.q.l.core.rolling.helper.TimeBasedArchiveRemover";
    }

    private void removeFolderIfEmpty(File file, int i) {
        if (i < 3 && file.isDirectory() && FileFilterUtil.isEmptyDirectory(file)) {
            addInfo("deleting folder [" + file + "]");
            file.delete();
            removeFolderIfEmpty(file.getParentFile(), i + 1);
        }
    }
}
