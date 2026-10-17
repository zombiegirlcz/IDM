package ecm;

import ch.qos.logback.core.CoreConstants;
import com.google.common.base.Charsets;
import com.google.common.io.BaseEncoding;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes13.dex */
public final class m1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Logger f124842c = Logger.getLogger(m1.class.getName());
    public static final f1 d = new f1();
    public static final BaseEncoding e = BaseEncoding.base64().omitPadding();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object[] f124843a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f124844b;

    public final void a(i1 i1Var) {
        if (this.f124844b == 0) {
            return;
        }
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = this.f124844b;
            if (i >= i3) {
                Arrays.fill(this.f124843a, i2 * 2, i3 * 2, (Object) null);
                this.f124844b = i2;
                return;
            }
            int i5 = i * 2;
            if (!Arrays.equals(i1Var.f124819b, (byte[]) this.f124843a[i5])) {
                Object[] objArr = this.f124843a;
                int i6 = i2 * 2;
                objArr[i6] = (byte[]) objArr[i5];
                Object obj2 = objArr[i5 + 1];
                if (objArr instanceof byte[][]) {
                    b(objArr.length);
                }
                this.f124843a[i6 + 1] = obj2;
                i2++;
            }
            i++;
        }
    }

    public final void b(int i) {
        Object[] objArr = new Object[i];
        int i2 = this.f124844b;
        if (i2 != 0) {
            System.arraycopy(this.f124843a, 0, objArr, 0, i2 * 2);
        }
        this.f124843a = objArr;
    }

    public final Object c(i1 i1Var) {
        int i;
        int i2 = this.f124844b;
        do {
            i2--;
            if (i2 < 0) {
                return null;
            }
            i = i2 * 2;
        } while (!Arrays.equals(i1Var.f124819b, (byte[]) this.f124843a[i]));
        Object obj2 = this.f124843a[i + 1];
        if (obj2 instanceof byte[]) {
            return i1Var.a((byte[]) obj2);
        }
        ((j1) obj2).getClass();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(ecm.i1 r5, java.lang.Object r6) {
        /*
            r4 = this;
            java.lang.String r0 = "key"
            com.google.common.base.Preconditions.checkNotNull(r5, r0)
            java.lang.String r0 = "value"
            com.google.common.base.Preconditions.checkNotNull(r6, r0)
            int r0 = r4.f124844b
            int r1 = r0 * 2
            if (r1 == 0) goto L19
            java.lang.Object[] r2 = r4.f124843a
            if (r2 == 0) goto L16
            int r2 = r2.length
            goto L17
        L16:
            r2 = 0
        L17:
            if (r1 != r2) goto L24
        L19:
            int r0 = r0 * 4
            r1 = 8
            int r0 = java.lang.Math.max(r0, r1)
            r4.b(r0)
        L24:
            int r0 = r4.f124844b
            byte[] r1 = r5.f124819b
            java.lang.Object[] r2 = r4.f124843a
            int r3 = r0 * 2
            r2[r3] = r1
            byte[] r5 = r5.b(r6)
            java.lang.Object[] r6 = r4.f124843a
            int r0 = r0 * 2
            int r0 = r0 + 1
            r6[r0] = r5
            int r5 = r4.f124844b
            int r5 = r5 + 1
            r4.f124844b = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ecm.m1.d(ecm.i1, java.lang.Object):void");
    }

    public final String toString() {
        StringBuilder sb6 = new StringBuilder("Metadata(");
        for (int i = 0; i < this.f124844b; i++) {
            if (i != 0) {
                sb6.append(CoreConstants.COMMA_CHAR);
            }
            int i2 = i * 2;
            byte[] bArr = (byte[]) this.f124843a[i2];
            Charset charset = Charsets.US_ASCII;
            String str = new String(bArr, charset);
            sb6.append(str);
            sb6.append('=');
            if (str.endsWith("-bin")) {
                Object obj2 = this.f124843a[i2 + 1];
                if (!(obj2 instanceof byte[])) {
                    ((j1) obj2).getClass();
                    throw null;
                }
                sb6.append(e.encode((byte[]) obj2));
            } else {
                Object obj3 = this.f124843a[i2 + 1];
                if (!(obj3 instanceof byte[])) {
                    ((j1) obj3).getClass();
                    throw null;
                }
                sb6.append(new String((byte[]) obj3, charset));
            }
        }
        sb6.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return sb6.toString();
    }
}
