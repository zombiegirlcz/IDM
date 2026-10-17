package vlm;

import com.google.common.primitives.UnsignedBytes;
import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.d0;
import mmm.e0;
import mmm.f0;
import mmm.h0;
import mmm.k;
import mmm.l;
import mmm.m;
import mmm.s;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.bouncycastle.crypto.hpke.HPKE;
import ulm.v;

/* JADX INFO: loaded from: classes14.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f290508a = new byte[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f0 f290509b;

    static {
        e0 e0Var = f0.Companion;
        m.Companion.getClass();
        m[] mVarArr = {l.b("efbbbf"), l.b("feff"), l.b("fffe0000"), l.b("fffe"), l.b("0000feff")};
        e0Var.getClass();
        f290509b = e0.b(mVarArr);
    }

    public static final String A(int i, int i2, String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        int iP = p(i, i2, str);
        String strSubstring = str.substring(iP, r(iP, i2, str));
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final void B(IOException iOException, List suppressed) {
        Intrinsics.checkNotNullParameter(iOException, "<this>");
        Intrinsics.checkNotNullParameter(suppressed, "suppressed");
        Iterator it8 = suppressed.iterator();
        while (it8.hasNext()) {
            yhm.f.a(iOException, (Exception) it8.next());
        }
    }

    public static final void C(int i, mmm.j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        jVar.writeByte((i >>> 16) & 255);
        jVar.writeByte((i >>> 8) & 255);
        jVar.writeByte(i & 255);
    }

    public static final void a(ArrayList arrayList, xlm.b bVar) {
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        if (arrayList.contains(bVar)) {
            return;
        }
        arrayList.add(bVar);
    }

    public static final int b(byte b4) {
        return b4 & UnsignedBytes.MAX_VALUE;
    }

    public static final int c(short s2) {
        return s2 & HPKE.aead_EXPORT_ONLY;
    }

    public static final long d(int i) {
        return 2147483647L & ((long) i);
    }

    public static final void e(long j2, long j3, long j5) {
        if ((j3 | j5) < 0 || j3 > j2 || j2 - j3 < j5) {
            StringBuilder sbV = com.google.android.gms.internal.mlkit_vision_face.a.v(j2, "length=", ", offset=");
            sbV.append(j3);
            sbV.append(", count=");
            sbV.append(j3);
            throw new ArrayIndexOutOfBoundsException(sbV.toString());
        }
    }

    public static final void f(Closeable closeable) {
        Intrinsics.checkNotNullParameter(closeable, "<this>");
        try {
            closeable.close();
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception unused) {
        }
    }

    public static final String[] g(String value, String[] strArr) {
        Intrinsics.checkNotNullParameter(strArr, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        Object[] objArrCopyOf = Arrays.copyOf(strArr, strArr.length + 1);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
        String[] strArr2 = (String[]) objArrCopyOf;
        strArr2[kotlin.collections.d.T(strArr2)] = value;
        return strArr2;
    }

    public static final void h(h0 directory, s sVar) throws IOException {
        Intrinsics.checkNotNullParameter(sVar, "<this>");
        Intrinsics.checkNotNullParameter(directory, "directory");
        try {
            IOException iOException = null;
            for (h0 path : sVar.m(directory)) {
                try {
                    if (sVar.n(path).f127932c) {
                        h(path, sVar);
                    }
                    Intrinsics.checkNotNullParameter(path, "path");
                    sVar.j(path);
                } catch (IOException e) {
                    if (iOException == null) {
                        iOException = e;
                    }
                }
            }
            if (iOException != null) {
                throw iOException;
            }
        } catch (FileNotFoundException unused) {
        }
    }

    public static final void i(wlm.m mVar, h0 path) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(path, "path");
        try {
            mVar.k(path);
        } catch (FileNotFoundException unused) {
        }
    }

    public static final int j(int i, int i2, String str, String delimiters) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(delimiters, "delimiters");
        while (i < i2) {
            if (d0.K(delimiters, str.charAt(i))) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static final int k(String str, char c2, int i, int i2) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        while (i < i2) {
            if (str.charAt(i) == c2) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static /* synthetic */ int l(String str, char c2, int i, int i2, int i3) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = str.length();
        }
        return k(str, c2, i, i2);
    }

    public static final boolean m(String[] strArr, String[] strArr2, Comparator comparator) {
        Intrinsics.checkNotNullParameter(strArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (strArr.length != 0 && strArr2 != null && strArr2.length != 0) {
            for (String str : strArr) {
                for (String str2 : strArr2) {
                    if (comparator.compare(str, str2) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final int n(String[] strArr) {
        com.google.gson.internal.m comparator = v.f281143b;
        Intrinsics.checkNotNullParameter(strArr, "<this>");
        Intrinsics.checkNotNullParameter("TLS_FALLBACK_SCSV", "value");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            if (comparator.compare(strArr[i], "TLS_FALLBACK_SCSV") == 0) {
                return i;
            }
        }
        return -1;
    }

    public static final int o(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (Intrinsics.k(cCharAt, 31) <= 0 || Intrinsics.k(cCharAt, CertificateBody.profileType) >= 0) {
                return i;
            }
        }
        return -1;
    }

    public static final int p(int i, int i2, String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        while (i < i2) {
            char cCharAt = str.charAt(i);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static final int r(int i, int i2, String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        int i3 = i2 - 1;
        if (i <= i3) {
            while (true) {
                char cCharAt = str.charAt(i3);
                if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                    return i3 + 1;
                }
                if (i3 == i) {
                    break;
                }
                i3--;
            }
        }
        return i;
    }

    public static final String[] t(String[] strArr, String[] other, Comparator comparator) {
        Intrinsics.checkNotNullParameter(strArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = other.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (comparator.compare(str, other[i]) == 0) {
                    arrayList.add(str);
                    break;
                }
                i++;
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean u(wlm.m r3, mmm.h0 r4) throws java.lang.Throwable {
        /*
            java.lang.String r0 = "path"
            java.lang.String r1 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r1)
            java.lang.String r1 = "file"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r1)
            mmm.q0 r1 = r3.s(r4)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)     // Catch: java.io.IOException -> L1d java.lang.Throwable -> L29
            r3.j(r4)     // Catch: java.io.IOException -> L1d java.lang.Throwable -> L29
            r3 = 1
            if (r1 == 0) goto L1c
            r1.close()     // Catch: java.lang.Throwable -> L1c
        L1c:
            return r3
        L1d:
            kotlin.Unit r2 = kotlin.Unit.f186387a     // Catch: java.lang.Throwable -> L29
            if (r1 == 0) goto L27
            r1.close()     // Catch: java.lang.Throwable -> L25
            goto L27
        L25:
            r1 = move-exception
            goto L35
        L27:
            r1 = 0
            goto L35
        L29:
            r2 = move-exception
            if (r1 == 0) goto L34
            r1.close()     // Catch: java.lang.Throwable -> L30
            goto L34
        L30:
            r1 = move-exception
            yhm.f.a(r2, r1)
        L34:
            r1 = r2
        L35:
            if (r1 != 0) goto L3f
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r3.j(r4)
            r3 = 0
            return r3
        L3f:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: vlm.h.u(wlm.m, mmm.h0):boolean");
    }

    public static final boolean v(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return a0.z(name, "Authorization", true) || a0.z(name, "Cookie", true) || a0.z(name, "Proxy-Authorization", true) || a0.z(name, "Set-Cookie", true);
    }

    public static final int w(char c2) {
        if ('0' <= c2 && c2 < ':') {
            return c2 - '0';
        }
        if ('a' <= c2 && c2 < 'g') {
            return c2 - 'W';
        }
        if ('A' > c2 || c2 >= 'G') {
            return -1;
        }
        return c2 - '7';
    }

    public static final int x(k kVar) {
        Intrinsics.checkNotNullParameter(kVar, "<this>");
        return (kVar.readByte() & UnsignedBytes.MAX_VALUE) | ((kVar.readByte() & UnsignedBytes.MAX_VALUE) << 16) | ((kVar.readByte() & UnsignedBytes.MAX_VALUE) << 8);
    }

    public static final long y(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    public static final int z(int i, String str) {
        if (str == null) {
            return i;
        }
        try {
            long j2 = Long.parseLong(str);
            if (j2 > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            if (j2 < 0) {
                return 0;
            }
            return (int) j2;
        } catch (NumberFormatException unused) {
            return i;
        }
    }
}
