package io.grpc.okhttp.internal;

import android.graphics.Bitmap;
import ch.qos.logback.core.CoreConstants;
import ecm.q;
import java.io.FileOutputStream;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.net.ProtocolException;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class n implements zk0.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f163016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f163017b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f163018c;
    public Object d;

    public /* synthetic */ n(int i, int i2, Serializable serializable, Object obj2) {
        this.f163016a = i2;
        this.d = serializable;
        this.f163018c = i;
        this.f163017b = obj2;
    }

    public static n h(String str) {
        m mVar;
        int i;
        String strSubstring;
        if (str.startsWith("HTTP/1.")) {
            i = 9;
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            int iCharAt = str.charAt(7) - '0';
            if (iCharAt == 0) {
                mVar = m.HTTP_1_0;
            } else {
                if (iCharAt != 1) {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                mVar = m.HTTP_1_1;
            }
        } else {
            if (!str.startsWith("ICY ")) {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            mVar = m.HTTP_1_0;
            i = 4;
        }
        int i2 = i + 3;
        if (str.length() < i2) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
        try {
            int i3 = Integer.parseInt(str.substring(i, i2));
            if (str.length() <= i2) {
                strSubstring = "";
            } else {
                if (str.charAt(i2) != ' ') {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                strSubstring = str.substring(i + 4);
            }
            return new n(i3, 0, mVar, strSubstring);
        } catch (NumberFormatException unused) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
    }

    public boolean a(dom.a aVar) {
        Object obj2;
        Object obj3 = this.d;
        while (true) {
            Object[] objArr = (Object[]) obj3;
            if (objArr == null) {
                return false;
            }
            for (int i = 0; i < 4 && (obj2 = objArr[i]) != null; i++) {
                if (obj2 == ygm.l.COMPLETE) {
                    aVar.onComplete();
                    return true;
                }
                if (obj2 instanceof ygm.j) {
                    aVar.onError(((ygm.j) obj2).f313674a);
                    return true;
                }
                if (obj2 instanceof ygm.k) {
                    aVar.e(((ygm.k) obj2).f313675a);
                } else {
                    aVar.onNext(obj2);
                }
            }
            obj3 = objArr[4];
        }
    }

    public void b(Object obj2) {
        int i = this.f163018c;
        if (i == 4) {
            Object[] objArr = new Object[5];
            ((Object[]) this.f163017b)[4] = objArr;
            this.f163017b = objArr;
            i = 0;
        }
        ((Object[]) this.f163017b)[i] = obj2;
        this.f163018c = i + 1;
    }

    public jcm.a c() {
        if (((String) this.f163017b) == null) {
            throw new IllegalStateException("scheme == null");
        }
        if (((String) this.d) != null) {
            return new jcm.a(this);
        }
        throw new IllegalStateException("host == null");
    }

    public void d(String str, byte[] bArr) {
        this.f163018c = 0;
        this.f163017b = str;
        if (bArr.length == 0) {
            throw new UnsupportedOperationException(p.a.p("Cannot deserialize empty byte array for ", (String) this.f163017b, " key! May be your read/write contract isn't mirror-implemented or old disk version is not backward compatible with new class version?"));
        }
        this.f163018c = 1;
        int i = 1 + 5;
        int length = bArr.length;
        if (i > length) {
            throw new ArrayIndexOutOfBoundsException(j6.a.v(v0.a.k(i, "Can't read out of bounds array (expected size: ", (String) this.f163017b, " bytes > disk size: ", " bytes) for "), "! keyMay be your read/write contract isn't mirror-implemented or old disk version is not backward compatible with new class version?", length));
        }
        byte b4 = bArr[1];
        if (b4 != -3) {
            throw new ClassCastException(j6.a.l(b4, "int cannot be deserialized in '", "' flag type"));
        }
        af.f.o(1, bArr);
        this.f163018c += 5;
        q qVar = (q) this.d;
        String str2 = (String) this.f163017b;
        HashMap map = (HashMap) qVar.f124861b;
        if (!map.containsKey(str2)) {
            throw new UnsupportedClassVersionError(p.a.p("Cannot find Persistable type for '", str2, "' key. Please, add it through 'registerPersistable' builder method."));
        }
        try {
            ((Class) map.get(str2)).newInstance().getClass();
            throw new ClassCastException();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void e(ygm.a aVar) {
        Object obj2;
        for (Object[] objArr = (Object[]) this.d; objArr != null; objArr = objArr[4]) {
            for (int i = 0; i < 4 && (obj2 = objArr[i]) != null; i++) {
                if (aVar.test(obj2)) {
                    return;
                }
            }
        }
    }

    public boolean equals(Object obj2) {
        switch (this.f163016a) {
            case 3:
                int i = this.f163018c;
                if (obj2 == this) {
                    return true;
                }
                if (x9.f.n(obj2, (Class) this.d) && Array.getLength(obj2) == i) {
                    for (int i2 = 0; i2 < i; i2++) {
                        Object obj3 = Array.get(this.f163017b, i2);
                        Object obj4 = Array.get(obj2, i2);
                        if (obj3 == obj4 || obj3 == null || obj3.equals(obj4)) {
                        }
                    }
                    return true;
                }
                return false;
            default:
                return super.equals(obj2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:132:0x01b3, code lost:
    
        throw new java.lang.AssertionError();
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00ff, code lost:
    
        r1 = null;
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0133, code lost:
    
        if (r10 == 16) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0135, code lost:
    
        if (r11 != (-1)) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0138, code lost:
    
        r1 = r10 - r11;
        java.lang.System.arraycopy(r8, r11, r8, 16 - r1, r1);
        r2 = 0;
        java.util.Arrays.fill(r8, r11, (16 - r10) + r11, (byte) 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0147, code lost:
    
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0148, code lost:
    
        r1 = java.net.InetAddress.getByAddress(r8);
     */
    /* JADX WARN: Removed duplicated region for block: B:191:0x00ff A[EDGE_INSN: B:191:0x00ff->B:79:0x00ff BREAK  A[LOOP:7: B:51:0x00b7->B:76:0x00f2], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00f2 A[LOOP:7: B:51:0x00b7->B:76:0x00f2, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0109  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void f(java.lang.String r18) {
        /*
            Method dump skipped, instruction units count: 516
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.grpc.okhttp.internal.n.f(java.lang.String):void");
    }

    @Override // zk0.c
    public void g(FileOutputStream outputStream) {
        Intrinsics.checkNotNullParameter(outputStream, "outputStream");
        ((Bitmap) this.d).compress((Bitmap.CompressFormat) this.f163017b, this.f163018c, outputStream);
    }

    public void i(int i) {
        if (i <= 0 || i > 65535) {
            throw new IllegalArgumentException(a0.d.n("unexpected port: ", i));
        }
        this.f163018c = i;
    }

    public void j() {
        this.f163017b = "https";
    }

    public String toString() {
        switch (this.f163016a) {
            case 0:
                String str = (String) this.f163017b;
                StringBuilder sb6 = new StringBuilder();
                sb6.append(((m) this.d) == m.HTTP_1_0 ? "HTTP/1.0" : "HTTP/1.1");
                sb6.append(zsc.p.SPACE_CHAR);
                sb6.append(this.f163018c);
                if (str != null) {
                    sb6.append(zsc.p.SPACE_CHAR);
                    sb6.append(str);
                }
                return sb6.toString();
            case 1:
                StringBuilder sb9 = new StringBuilder();
                sb9.append((String) this.f163017b);
                sb9.append("://");
                int i = -1;
                if (((String) this.d).indexOf(58) != -1) {
                    sb9.append('[');
                    sb9.append((String) this.d);
                    sb9.append(']');
                } else {
                    sb9.append((String) this.d);
                }
                int i2 = this.f163018c;
                if (i2 == -1) {
                    String str2 = (String) this.f163017b;
                    i2 = str2.equals("http") ? 80 : str2.equals("https") ? 443 : -1;
                }
                String str3 = (String) this.f163017b;
                if (str3.equals("http")) {
                    i = 80;
                } else if (str3.equals("https")) {
                    i = 443;
                }
                if (i2 != i) {
                    sb9.append(CoreConstants.COLON_CHAR);
                    sb9.append(i2);
                }
                return sb9.toString();
            default:
                return super.toString();
        }
    }

    public n(int i, Bitmap.CompressFormat compressFormat, Bitmap bitmap) {
        this.f163016a = 5;
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(compressFormat, "compressFormat");
        this.d = bitmap;
        this.f163018c = i;
        this.f163017b = compressFormat;
    }

    public n(af.f fVar, q qVar) {
        this.f163016a = 2;
        this.f163018c = 0;
        this.d = qVar;
    }

    public n(int i) {
        this.f163016a = i;
        switch (i) {
            case 4:
                Object[] objArr = new Object[5];
                this.d = objArr;
                this.f163017b = objArr;
                break;
            default:
                this.f163018c = -1;
                break;
        }
    }
}
