package lim;

import ch.qos.logback.core.CoreConstants;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import zhm.f0;
import zhm.w;

/* JADX INFO: loaded from: classes13.dex */
public class l {
    public static final int a(String str) {
        int iS;
        char c2 = File.separatorChar;
        int iS2 = d0.S(str, c2, 0, 4);
        if (iS2 == 0) {
            if (str.length() <= 1 || str.charAt(1) != c2 || (iS = d0.S(str, c2, 2, 4)) < 0) {
                return 1;
            }
            int iS3 = d0.S(str, c2, iS + 1, 4);
            return iS3 >= 0 ? iS3 + 1 : str.length();
        }
        if (iS2 > 0 && str.charAt(iS2 - 1) == ':') {
            return iS2 + 1;
        }
        if (iS2 == -1 && d0.L(str, CoreConstants.COLON_CHAR)) {
            return str.length();
        }
        return 0;
    }

    public static final b b(File file) {
        List list;
        Intrinsics.checkNotNullParameter(file, "<this>");
        String path = file.getPath();
        Intrinsics.h(path);
        int iA = a(path);
        String strSubstring = path.substring(0, iA);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        String strSubstring2 = path.substring(iA);
        Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
        if (strSubstring2.length() == 0) {
            list = f0.f322471a;
        } else {
            List listM0 = d0.m0(strSubstring2, new char[]{File.separatorChar}, 6);
            ArrayList arrayList = new ArrayList(w.t(listM0, 10));
            Iterator it8 = listM0.iterator();
            while (it8.hasNext()) {
                arrayList.add(new File((String) it8.next()));
            }
            list = arrayList;
        }
        return new b(list, new File(strSubstring));
    }
}
