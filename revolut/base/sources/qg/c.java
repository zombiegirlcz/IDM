package qg;

import ch.qos.logback.core.CoreConstants;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;
import kg.e0;
import kg.j;

/* JADX INFO: loaded from: classes.dex */
public class c implements Closeable, Flushable {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Pattern f245608l = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String[] f245609m = new String[128];

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String[] f245610n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Writer f245611a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f245612b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f245613c;
    public j d;
    public String e;
    public String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f245614g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public e0 f245615h;
    public boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f245616j;
    public boolean k;

    static {
        for (int i = 0; i <= 31; i++) {
            f245609m[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = f245609m;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        f245610n = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public c(Writer writer) {
        int[] iArr = new int[32];
        this.f245612b = iArr;
        this.f245613c = 0;
        if (iArr.length == 0) {
            this.f245612b = Arrays.copyOf(iArr, 0);
        }
        int[] iArr2 = this.f245612b;
        int i = this.f245613c;
        this.f245613c = i + 1;
        iArr2[i] = 6;
        this.f245615h = e0.LEGACY_STRICT;
        this.k = true;
        Objects.requireNonNull(writer, "out == null");
        this.f245611a = writer;
        o(j.d);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f245611a.close();
        int i = this.f245613c;
        if (i > 1 || (i == 1 && this.f245612b[i - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f245613c = 0;
    }

    public final void d() throws IOException {
        int iN = n();
        if (iN == 1) {
            this.f245612b[this.f245613c - 1] = 2;
            l();
            return;
        }
        Writer writer = this.f245611a;
        if (iN == 2) {
            writer.append((CharSequence) this.f);
            l();
        } else {
            if (iN == 4) {
                writer.append((CharSequence) this.e);
                this.f245612b[this.f245613c - 1] = 5;
                return;
            }
            if (iN != 6) {
                if (iN != 7) {
                    throw new IllegalStateException("Nesting problem.");
                }
                if (this.f245615h != e0.LENIENT) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            this.f245612b[this.f245613c - 1] = 7;
        }
    }

    public void f() throws IOException {
        x();
        d();
        int i = this.f245613c;
        int[] iArr = this.f245612b;
        if (i == iArr.length) {
            this.f245612b = Arrays.copyOf(iArr, i * 2);
        }
        int[] iArr2 = this.f245612b;
        int i2 = this.f245613c;
        this.f245613c = i2 + 1;
        iArr2[i2] = 1;
        this.f245611a.write(91);
    }

    public void flush() throws IOException {
        if (this.f245613c == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f245611a.flush();
    }

    public c g() throws IOException {
        x();
        d();
        int i = this.f245613c;
        int[] iArr = this.f245612b;
        if (i == iArr.length) {
            this.f245612b = Arrays.copyOf(iArr, i * 2);
        }
        int[] iArr2 = this.f245612b;
        int i2 = this.f245613c;
        this.f245613c = i2 + 1;
        iArr2[i2] = 3;
        this.f245611a.write(123);
        return this;
    }

    public final void h(int i, int i2, char c2) throws IOException {
        int iN = n();
        if (iN != i2 && iN != i) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f245616j != null) {
            throw new IllegalStateException("Dangling name: " + this.f245616j);
        }
        this.f245613c--;
        if (iN == i2) {
            l();
        }
        this.f245611a.write(c2);
    }

    public void i() throws IOException {
        h(1, 2, ']');
    }

    public void j() throws IOException {
        h(3, 5, CoreConstants.CURLY_RIGHT);
    }

    public c k(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.f245616j != null) {
            throw new IllegalStateException("Already wrote a name, expecting a value.");
        }
        int iN = n();
        if (iN != 3 && iN != 5) {
            throw new IllegalStateException("Please begin an object before writing a name.");
        }
        this.f245616j = str;
        return this;
    }

    public final void l() throws IOException {
        if (this.f245614g) {
            return;
        }
        String strB = this.d.b();
        Writer writer = this.f245611a;
        writer.write(strB);
        int i = this.f245613c;
        for (int i2 = 1; i2 < i; i2++) {
            writer.write(this.d.a());
        }
    }

    public c m() throws IOException {
        if (this.f245616j != null) {
            if (!this.k) {
                this.f245616j = null;
                return this;
            }
            x();
        }
        d();
        this.f245611a.write("null");
        return this;
    }

    public final int n() {
        int i = this.f245613c;
        if (i != 0) {
            return this.f245612b[i - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public final void o(j jVar) {
        Objects.requireNonNull(jVar);
        this.d = jVar;
        this.f = ",";
        if (jVar.c()) {
            this.e = ": ";
            if (this.d.b().isEmpty()) {
                this.f = ", ";
            }
        } else {
            this.e = ":";
        }
        this.f245614g = this.d.b().isEmpty() && this.d.a().isEmpty();
    }

    public final void p(e0 e0Var) {
        Objects.requireNonNull(e0Var);
        this.f245615h = e0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void q(java.lang.String r9) throws java.io.IOException {
        /*
            r8 = this;
            boolean r0 = r8.i
            if (r0 == 0) goto L7
            java.lang.String[] r0 = qg.c.f245610n
            goto L9
        L7:
            java.lang.String[] r0 = qg.c.f245609m
        L9:
            java.io.Writer r1 = r8.f245611a
            r2 = 34
            r1.write(r2)
            int r3 = r9.length()
            r4 = 0
            r5 = r4
        L16:
            if (r4 >= r3) goto L41
            char r6 = r9.charAt(r4)
            r7 = 128(0x80, float:1.8E-43)
            if (r6 >= r7) goto L25
            r6 = r0[r6]
            if (r6 != 0) goto L32
            goto L3e
        L25:
            r7 = 8232(0x2028, float:1.1535E-41)
            if (r6 != r7) goto L2c
            java.lang.String r6 = "\\u2028"
            goto L32
        L2c:
            r7 = 8233(0x2029, float:1.1537E-41)
            if (r6 != r7) goto L3e
            java.lang.String r6 = "\\u2029"
        L32:
            if (r5 >= r4) goto L39
            int r7 = r4 - r5
            r1.write(r9, r5, r7)
        L39:
            r1.write(r6)
            int r5 = r4 + 1
        L3e:
            int r4 = r4 + 1
            goto L16
        L41:
            if (r5 >= r3) goto L47
            int r3 = r3 - r5
            r1.write(r9, r5, r3)
        L47:
            r1.write(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qg.c.q(java.lang.String):void");
    }

    public c r(Number number) throws IOException {
        if (number == null) {
            return m();
        }
        x();
        String string = number.toString();
        Class<?> cls = number.getClass();
        if (cls != Integer.class && cls != Long.class && cls != Byte.class && cls != Short.class && cls != BigDecimal.class && cls != BigInteger.class && cls != AtomicInteger.class && cls != AtomicLong.class) {
            if (string.equals("-Infinity") || string.equals("Infinity") || string.equals("NaN")) {
                if (this.f245615h != e0.LENIENT) {
                    throw new IllegalArgumentException("Numeric values must be finite, but was ".concat(string));
                }
            } else if (cls != Float.class && cls != Double.class && !f245608l.matcher(string).matches()) {
                throw new IllegalArgumentException("String created by " + cls + " is not a valid JSON number: " + string);
            }
        }
        d();
        this.f245611a.append((CharSequence) string);
        return this;
    }

    public c s(String str) throws IOException {
        if (str == null) {
            return m();
        }
        x();
        d();
        q(str);
        return this;
    }

    public void t(double d) throws IOException {
        x();
        if (this.f245615h == e0.LENIENT || !(Double.isNaN(d) || Double.isInfinite(d))) {
            d();
            this.f245611a.append((CharSequence) Double.toString(d));
        } else {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + d);
        }
    }

    public void u(long j2) throws IOException {
        x();
        d();
        this.f245611a.write(Long.toString(j2));
    }

    public void v(Boolean bool) throws IOException {
        if (bool == null) {
            m();
            return;
        }
        x();
        d();
        this.f245611a.write(bool.booleanValue() ? "true" : "false");
    }

    public void w(boolean z) throws IOException {
        x();
        d();
        this.f245611a.write(z ? "true" : "false");
    }

    public final void x() throws IOException {
        if (this.f245616j != null) {
            int iN = n();
            if (iN == 5) {
                this.f245611a.write(this.f);
            } else if (iN != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            l();
            this.f245612b[this.f245613c - 1] = 4;
            q(this.f245616j);
            this.f245616j = null;
        }
    }
}
