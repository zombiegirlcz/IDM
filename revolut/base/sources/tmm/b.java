package tmm;

import ch.qos.logback.core.CoreConstants;
import java.io.File;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes14.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char f272272a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final char f272273b;

    static {
        Character.toString(CoreConstants.DOT);
        char c2 = File.separatorChar;
        f272272a = c2;
        char c3 = CoreConstants.ESCAPE_CHAR;
        if (c2 != '/') {
            if (c2 != '\\') {
                throw new IllegalArgumentException(String.valueOf(c2));
            }
            c3 = '/';
        }
        f272273b = c3;
        Pattern.compile("^(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})$");
        Pattern.compile("^[a-zA-Z0-9][a-zA-Z0-9-]*$");
    }

    public static String a(String str) {
        int i;
        if (str == null) {
            return null;
        }
        char c2 = f272272a;
        if (c2 == '\\') {
            int iLastIndexOf = str.lastIndexOf(c2);
            int iLastIndexOf2 = str.lastIndexOf(f272273b);
            if (iLastIndexOf == -1) {
                i = iLastIndexOf2 == -1 ? 0 : iLastIndexOf2 + 1;
            } else {
                if (iLastIndexOf2 != -1) {
                    iLastIndexOf = Math.max(iLastIndexOf, iLastIndexOf2);
                }
                i = iLastIndexOf + 1;
            }
            if (str.indexOf(58, i) != -1) {
                throw new IllegalArgumentException("NTFS ADS separator (':') in file name is forbidden.");
            }
        }
        int iLastIndexOf3 = str.lastIndexOf(46);
        if (Math.max(str.lastIndexOf(47), str.lastIndexOf(92)) > iLastIndexOf3) {
            iLastIndexOf3 = -1;
        }
        return iLastIndexOf3 == -1 ? "" : str.substring(iLastIndexOf3 + 1);
    }
}
