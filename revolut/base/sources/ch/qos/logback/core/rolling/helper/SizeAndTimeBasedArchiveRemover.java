package ch.qos.logback.core.rolling.helper;

import java.io.File;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes16.dex */
public class SizeAndTimeBasedArchiveRemover extends TimeBasedArchiveRemover {
    protected static final int NO_INDEX = -1;

    public SizeAndTimeBasedArchiveRemover(FileNamePattern fileNamePattern, RollingCalendar rollingCalendar) {
        super(fileNamePattern, rollingCalendar);
    }

    private String createStemRegex(Date date) {
        return FileFilterUtil.afterLastSlash(this.fileNamePattern.toRegexForFixedDate(date));
    }

    @Override // ch.qos.logback.core.rolling.helper.TimeBasedArchiveRemover
    public void descendingSort(File[] fileArr, Date date) {
        final Pattern patternCompile = Pattern.compile(createStemRegex(date));
        Arrays.sort(fileArr, new Comparator<File>() { // from class: ch.qos.logback.core.rolling.helper.SizeAndTimeBasedArchiveRemover.1
            private int extractIndex(Pattern pattern, File file) {
                String strGroup;
                Matcher matcher = pattern.matcher(file.getName());
                if (!matcher.find() || (strGroup = matcher.group(1)) == null || strGroup.isEmpty()) {
                    return -1;
                }
                return Integer.parseInt(strGroup);
            }

            @Override // java.util.Comparator
            public int compare(File file, File file2) {
                int iExtractIndex = extractIndex(patternCompile, file);
                int iExtractIndex2 = extractIndex(patternCompile, file2);
                if (iExtractIndex == iExtractIndex2) {
                    return 0;
                }
                return iExtractIndex2 < iExtractIndex ? -1 : 1;
            }
        });
    }

    @Override // ch.qos.logback.core.rolling.helper.TimeBasedArchiveRemover
    public File[] getFilesInPeriod(Date date) {
        return FileFilterUtil.filesInFolderMatchingStemRegex(getParentDir(new File(this.fileNamePattern.convertMultipleArguments(date, 0))), createStemRegex(date));
    }
}
