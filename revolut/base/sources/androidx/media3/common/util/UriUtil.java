package androidx.media3.common.util;

import android.net.Uri;
import android.text.TextUtils;
import com.google.common.base.Ascii;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes15.dex */
public abstract class UriUtil {
    public static String getRelativePath(Uri uri2, Uri uri3) {
        if (uri2.isOpaque() || uri3.isOpaque()) {
            return uri3.toString();
        }
        String scheme = uri2.getScheme();
        String scheme2 = uri3.getScheme();
        if (scheme != null ? !(scheme2 == null || !Ascii.equalsIgnoreCase(scheme, scheme2)) : scheme2 == null) {
            if (Objects.equals(uri2.getAuthority(), uri3.getAuthority())) {
                List<String> pathSegments = uri2.getPathSegments();
                List<String> pathSegments2 = uri3.getPathSegments();
                int iMin = Math.min(pathSegments.size(), pathSegments2.size());
                int i = 0;
                for (int i2 = 0; i2 < iMin && pathSegments.get(i2).equals(pathSegments2.get(i2)); i2++) {
                    i++;
                }
                StringBuilder sb6 = new StringBuilder();
                for (int i3 = i; i3 < pathSegments.size(); i3++) {
                    sb6.append("../");
                }
                while (i < pathSegments2.size()) {
                    sb6.append(pathSegments2.get(i));
                    if (i < pathSegments2.size() - 1) {
                        sb6.append("/");
                    }
                    i++;
                }
                return sb6.toString();
            }
        }
        return uri3.toString();
    }

    private static int[] getUriIndices(String str) {
        int iIndexOf;
        int[] iArr = new int[4];
        if (TextUtils.isEmpty(str)) {
            iArr[0] = -1;
            return iArr;
        }
        int length = str.length();
        int iIndexOf2 = str.indexOf(35);
        if (iIndexOf2 != -1) {
            length = iIndexOf2;
        }
        int iIndexOf3 = str.indexOf(63);
        if (iIndexOf3 == -1 || iIndexOf3 > length) {
            iIndexOf3 = length;
        }
        int iIndexOf4 = str.indexOf(47);
        if (iIndexOf4 == -1 || iIndexOf4 > iIndexOf3) {
            iIndexOf4 = iIndexOf3;
        }
        int iIndexOf5 = str.indexOf(58);
        if (iIndexOf5 > iIndexOf4) {
            iIndexOf5 = -1;
        }
        int i = iIndexOf5 + 2;
        if (i < iIndexOf3 && str.charAt(iIndexOf5 + 1) == '/' && str.charAt(i) == '/') {
            iIndexOf = str.indexOf(47, iIndexOf5 + 3);
            if (iIndexOf == -1 || iIndexOf > iIndexOf3) {
                iIndexOf = iIndexOf3;
            }
        } else {
            iIndexOf = iIndexOf5 + 1;
        }
        iArr[0] = iIndexOf5;
        iArr[1] = iIndexOf;
        iArr[2] = iIndexOf3;
        iArr[3] = length;
        return iArr;
    }

    public static boolean isAbsolute(String str) {
        return (str == null || getUriIndices(str)[0] == -1) ? false : true;
    }

    private static String removeDotSegments(StringBuilder sb6, int i, int i2) {
        int i3;
        int iLastIndexOf;
        if (i >= i2) {
            return sb6.toString();
        }
        if (sb6.charAt(i) == '/') {
            i++;
        }
        int i5 = i;
        int i6 = i5;
        while (i5 <= i2) {
            if (i5 == i2) {
                i3 = i5;
            } else if (sb6.charAt(i5) == '/') {
                i3 = i5 + 1;
            } else {
                i5++;
            }
            int i21 = i6 + 1;
            if (i5 == i21 && sb6.charAt(i6) == '.') {
                sb6.delete(i6, i3);
                i2 -= i3 - i6;
            } else {
                if (i5 == i6 + 2 && sb6.charAt(i6) == '.' && sb6.charAt(i21) == '.') {
                    iLastIndexOf = sb6.lastIndexOf("/", i6 - 2) + 1;
                    int i22 = iLastIndexOf > i ? iLastIndexOf : i;
                    sb6.delete(i22, i3);
                    i2 -= i3 - i22;
                } else {
                    iLastIndexOf = i5 + 1;
                }
                i6 = iLastIndexOf;
            }
            i5 = i6;
        }
        return sb6.toString();
    }

    public static Uri removeQueryParameter(Uri uri2, String str) {
        Uri.Builder builderBuildUpon = uri2.buildUpon();
        builderBuildUpon.clearQuery();
        for (String str2 : uri2.getQueryParameterNames()) {
            if (!str2.equals(str)) {
                Iterator<String> it8 = uri2.getQueryParameters(str2).iterator();
                while (it8.hasNext()) {
                    builderBuildUpon.appendQueryParameter(str2, it8.next());
                }
            }
        }
        return builderBuildUpon.build();
    }

    public static String resolve(String str, String str2) {
        StringBuilder sb6 = new StringBuilder();
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        int[] uriIndices = getUriIndices(str2);
        if (uriIndices[0] != -1) {
            sb6.append(str2);
            removeDotSegments(sb6, uriIndices[1], uriIndices[2]);
            return sb6.toString();
        }
        int[] uriIndices2 = getUriIndices(str);
        if (uriIndices[3] == 0) {
            sb6.append((CharSequence) str, 0, uriIndices2[3]);
            sb6.append(str2);
            return sb6.toString();
        }
        if (uriIndices[2] == 0) {
            sb6.append((CharSequence) str, 0, uriIndices2[2]);
            sb6.append(str2);
            return sb6.toString();
        }
        int i = uriIndices[1];
        if (i != 0) {
            int i2 = uriIndices2[0] + 1;
            sb6.append((CharSequence) str, 0, i2);
            sb6.append(str2);
            return removeDotSegments(sb6, uriIndices[1] + i2, i2 + uriIndices[2]);
        }
        if (str2.charAt(i) == '/') {
            sb6.append((CharSequence) str, 0, uriIndices2[1]);
            sb6.append(str2);
            int i3 = uriIndices2[1];
            return removeDotSegments(sb6, i3, uriIndices[2] + i3);
        }
        int i5 = uriIndices2[0] + 2;
        int i6 = uriIndices2[1];
        if (i5 >= i6 || i6 != uriIndices2[2]) {
            int iLastIndexOf = str.lastIndexOf(47, uriIndices2[2] - 1);
            int i21 = iLastIndexOf == -1 ? uriIndices2[1] : iLastIndexOf + 1;
            sb6.append((CharSequence) str, 0, i21);
            sb6.append(str2);
            return removeDotSegments(sb6, uriIndices2[1], i21 + uriIndices[2]);
        }
        sb6.append((CharSequence) str, 0, i6);
        sb6.append('/');
        sb6.append(str2);
        int i22 = uriIndices2[1];
        return removeDotSegments(sb6, i22, uriIndices[2] + i22 + 1);
    }

    public static Uri resolveToUri(String str, String str2) {
        return Uri.parse(resolve(str, str2));
    }
}
