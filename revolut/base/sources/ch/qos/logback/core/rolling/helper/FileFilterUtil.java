package ch.qos.logback.core.rolling.helper;

import ch.qos.logback.core.CoreConstants;
import j6.a;
import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public class FileFilterUtil {
    public static String afterLastSlash(String str) {
        int iLastIndexOf = str.lastIndexOf(47);
        return iLastIndexOf == -1 ? str : str.substring(iLastIndexOf + 1);
    }

    public static int extractCounter(File file, String str) {
        Pattern patternCompile = Pattern.compile(str);
        String name = file.getName();
        Matcher matcher = patternCompile.matcher(name);
        if (matcher.matches()) {
            return Integer.valueOf(matcher.group(1)).intValue();
        }
        throw new IllegalStateException(a.s("The regex [", str, "] should match [", name, "]"));
    }

    public static File[] filesInFolderMatchingStemRegex(File file, final String str) {
        return file == null ? new File[0] : (file.exists() && file.isDirectory()) ? file.listFiles(new FilenameFilter() { // from class: ch.qos.logback.core.rolling.helper.FileFilterUtil.3
            @Override // java.io.FilenameFilter
            public boolean accept(File file2, String str2) {
                return str2.matches(str);
            }
        }) : new File[0];
    }

    public static int findHighestCounter(File[] fileArr, String str) {
        int i = Integer.MIN_VALUE;
        for (File file : fileArr) {
            int iExtractCounter = extractCounter(file, str);
            if (i < iExtractCounter) {
                i = iExtractCounter;
            }
        }
        return i;
    }

    public static boolean isEmptyDirectory(File file) {
        if (file.isDirectory()) {
            String[] list = file.list();
            return list == null || list.length == 0;
        }
        throw new IllegalArgumentException("[" + file + "] must be a directory");
    }

    public static void removeEmptyParentDirectories(File file, int i) {
        if (i >= 3) {
            return;
        }
        File parentFile = file.getParentFile();
        if (parentFile.isDirectory() && isEmptyDirectory(parentFile)) {
            parentFile.delete();
            removeEmptyParentDirectories(parentFile, i + 1);
        }
    }

    public static void reverseSortFileArrayByName(File[] fileArr) {
        Arrays.sort(fileArr, new Comparator<File>() { // from class: ch.qos.logback.core.rolling.helper.FileFilterUtil.2
            @Override // java.util.Comparator
            public int compare(File file, File file2) {
                return file2.getName().compareTo(file.getName());
            }
        });
    }

    public static String slashify(String str) {
        return str.replace(CoreConstants.ESCAPE_CHAR, '/');
    }

    public static void sortFileArrayByName(File[] fileArr) {
        Arrays.sort(fileArr, new Comparator<File>() { // from class: ch.qos.logback.core.rolling.helper.FileFilterUtil.1
            @Override // java.util.Comparator
            public int compare(File file, File file2) {
                return file.getName().compareTo(file2.getName());
            }
        });
    }
}
