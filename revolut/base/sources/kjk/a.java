package kjk;

import java.io.IOException;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes11.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Base64.Encoder f184418a = Base64.getUrlEncoder().withoutPadding();

    public static final String a(String str, List list) throws IOException {
        String strB = b(str);
        ArrayList arrayList = new ArrayList();
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            Pair pair = (Pair) it8.next();
            String str2 = (String) pair.f186385a;
            String str3 = (String) pair.f186386b;
            Pair pair2 = str3 != null ? new Pair(str2, str3) : null;
            if (pair2 != null) {
                arrayList.add(pair2);
            }
        }
        String strK0 = zhm.d0.k0(zhm.d0.P0(arrayList, cim.b.a(new kh4.b(24), new kh4.b(25))), "", strB, null, 0, new kh4.b(26), 28);
        Charset charset = Charsets.UTF_8;
        byte[] bytes = strK0.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        if (bytes.length <= 156) {
            return strK0;
        }
        byte[] bArrDigest = MessageDigest.getInstance("SHA-256").digest(bytes);
        Intrinsics.checkNotNullExpressionValue(bArrDigest, "digest(...)");
        byte[] bArrCopyOf = Arrays.copyOf(bArrDigest, 20);
        Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
        String strEncodeToString = f184418a.encodeToString(bArrCopyOf);
        String strP = t61.a.p(strEncodeToString, "encodeToString(...)", "|\\#", strEncodeToString);
        byte[] bytes2 = strP.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes2, "getBytes(...)");
        int length = bytes2.length;
        byte[] bytes3 = strB.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes3, "getBytes(...)");
        return bytes3.length + length <= 156 ? strB.concat(strP) : strP;
    }

    public static final String b(String str) {
        return kotlin.text.a0.D(kotlin.text.a0.D(kotlin.text.a0.D(str, "\\", "\\\\", false), "|", "\\|", false), "=", "\\=", false);
    }
}
