package ymm;

import java.util.ArrayList;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes14.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f315066a = 0;

    static {
        Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
    }

    public static String a(String str) {
        if (d(str)) {
            return str;
        }
        int length = str.length();
        char[] cArr = new char[length];
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            if (!Character.isWhitespace(str.charAt(i2))) {
                cArr[i] = str.charAt(i2);
                i++;
            }
        }
        return i == length ? str : new String(cArr, 0, i);
    }

    public static int b(int i, String str, String str2) {
        if (str == null || str2 == null) {
            return -1;
        }
        return str.indexOf(str2.toString(), i);
    }

    public static boolean c(CharSequence charSequence) {
        int length = charSequence == null ? 0 : charSequence.length();
        if (length == 0) {
            return true;
        }
        for (int i = 0; i < length; i++) {
            if (!Character.isWhitespace(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static boolean d(CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }

    public static String e(int i, String str, String str2) {
        if (str == null) {
            return null;
        }
        if (d(str2)) {
            str2 = " ";
        }
        int length = str2.length();
        int length2 = i - str.length();
        if (length2 <= 0) {
            return str;
        }
        if (length == 1 && length2 <= 8192) {
            return f(str, i, str2.charAt(0));
        }
        if (length2 == length) {
            return str2.concat(str);
        }
        if (length2 < length) {
            return str2.substring(0, length2).concat(str);
        }
        char[] cArr = new char[length2];
        char[] charArray = str2.toCharArray();
        for (int i2 = 0; i2 < length2; i2++) {
            cArr[i2] = charArray[i2 % length];
        }
        return new String(cArr).concat(str);
    }

    public static String f(String str, int i, char c2) {
        String str2;
        if (str == null) {
            return null;
        }
        int length = i - str.length();
        if (length <= 0) {
            return str;
        }
        if (length > 8192) {
            return e(i, str, String.valueOf(c2));
        }
        if (length <= 0) {
            str2 = "";
        } else {
            char[] cArr = new char[length];
            for (int i2 = length - 1; i2 >= 0; i2--) {
                cArr[i2] = c2;
            }
            str2 = new String(cArr);
        }
        return str2.concat(str);
    }

    public static String g(String str, String str2, String str3) {
        if (d(str) || d(str2) || str3 == null) {
            return str;
        }
        int i = 0;
        int iB = b(0, str, str2);
        if (iB == -1) {
            return str;
        }
        int length = str2.length();
        StringBuilder sb6 = new StringBuilder(str.length() + (Math.max(str3.length() - length, 0) * 16));
        int i2 = -1;
        while (iB != -1) {
            sb6.append((CharSequence) str, i, iB);
            sb6.append(str3);
            i = iB + length;
            i2--;
            if (i2 == 0) {
                break;
            }
            iB = b(i, str, str2);
        }
        sb6.append((CharSequence) str, i, str.length());
        return sb6.toString();
    }

    public static String h(String str, String str2) {
        String str3;
        if (d(str2)) {
            str2 = " ";
        }
        int length = str2.length();
        int length2 = 4 - str.length();
        if (length2 > 0) {
            if (length != 1 || length2 > 8192) {
                if (length2 == length) {
                    return str.concat(str2);
                }
                if (length2 < length) {
                    return str.concat(str2.substring(0, length2));
                }
                char[] cArr = new char[length2];
                char[] charArray = str2.toCharArray();
                for (int i = 0; i < length2; i++) {
                    cArr[i] = charArray[i % length];
                }
                return str.concat(new String(cArr));
            }
            char cCharAt = str2.charAt(0);
            int length3 = str.length();
            int i2 = 4 - length3;
            if (i2 > 0) {
                if (i2 > 8192) {
                    return h(str, String.valueOf(cCharAt));
                }
                if (i2 <= 0) {
                    str3 = "";
                } else {
                    char[] cArr2 = new char[i2];
                    for (int i3 = 3 - length3; i3 >= 0; i3--) {
                        cArr2[i3] = cCharAt;
                    }
                    str3 = new String(cArr2);
                }
                return str.concat(str3);
            }
        }
        return str;
    }

    public static String[] i(String str) {
        if (str == null) {
            return null;
        }
        int length = str.length();
        String[] strArr = a.f315057c;
        if (length == 0) {
            return strArr;
        }
        ArrayList arrayList = new ArrayList();
        char cCharAt = "/".charAt(0);
        int i = 0;
        boolean z = false;
        int i2 = 0;
        int i3 = 1;
        while (i < length) {
            if (str.charAt(i) == cCharAt) {
                if (z) {
                    int i5 = i3 + 1;
                    if (i3 == -1) {
                        i = length;
                    }
                    arrayList.add(str.substring(i2, i));
                    i3 = i5;
                    z = false;
                }
                i2 = i + 1;
                i = i2;
            } else {
                i++;
                z = true;
            }
        }
        if (z) {
            arrayList.add(str.substring(i2, i));
        }
        return (String[]) arrayList.toArray(strArr);
    }

    public static String j(String str) {
        String strTrim = str == null ? null : str.trim();
        if (d(strTrim)) {
            return null;
        }
        return strTrim;
    }
}
