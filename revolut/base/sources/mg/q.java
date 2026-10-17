package mg;

import ch.qos.logback.core.CoreConstants;
import com.google.gson.stream.MalformedJsonException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class q extends qg.a {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final o f205113t = new o();
    public static final Object u = new Object();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Object[] f205114p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f205115q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String[] f205116r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int[] f205117s;

    public q(kg.u uVar) {
        super(f205113t);
        this.f205114p = new Object[32];
        this.f205115q = 0;
        this.f205116r = new String[32];
        this.f205117s = new int[32];
        R(uVar);
    }

    @Override // qg.a
    public final qg.b A() throws MalformedJsonException {
        if (this.f205115q == 0) {
            return qg.b.END_DOCUMENT;
        }
        Object objP = P();
        if (objP instanceof Iterator) {
            boolean z = this.f205114p[this.f205115q - 2] instanceof kg.w;
            Iterator it8 = (Iterator) objP;
            if (!it8.hasNext()) {
                return z ? qg.b.END_OBJECT : qg.b.END_ARRAY;
            }
            if (z) {
                return qg.b.NAME;
            }
            R(it8.next());
            return A();
        }
        if (objP instanceof kg.w) {
            return qg.b.BEGIN_OBJECT;
        }
        if (objP instanceof kg.r) {
            return qg.b.BEGIN_ARRAY;
        }
        if (objP instanceof kg.x) {
            Serializable serializable = ((kg.x) objP).f183892a;
            if (serializable instanceof String) {
                return qg.b.STRING;
            }
            if (serializable instanceof Boolean) {
                return qg.b.BOOLEAN;
            }
            if (serializable instanceof Number) {
                return qg.b.NUMBER;
            }
            throw new AssertionError();
        }
        if (objP instanceof kg.v) {
            return qg.b.NULL;
        }
        if (objP == u) {
            throw new IllegalStateException("JsonReader is closed");
        }
        throw new MalformedJsonException("Custom JsonElement subclass " + objP.getClass().getName() + " is not supported");
    }

    @Override // qg.a
    public final void H() throws MalformedJsonException {
        int i = p.f205112a[A().ordinal()];
        if (i == 1) {
            O(true);
            return;
        }
        if (i == 2) {
            i();
            return;
        }
        if (i == 3) {
            j();
            return;
        }
        if (i != 4) {
            Q();
            int i2 = this.f205115q;
            if (i2 > 0) {
                int[] iArr = this.f205117s;
                int i3 = i2 - 1;
                iArr[i3] = iArr[i3] + 1;
            }
        }
    }

    public final void L(qg.b bVar) {
        if (A() == bVar) {
            return;
        }
        throw new IllegalStateException("Expected " + bVar + " but was " + A() + N());
    }

    public final String M(boolean z) {
        StringBuilder sb6 = new StringBuilder("$");
        int i = 0;
        while (true) {
            int i2 = this.f205115q;
            if (i >= i2) {
                return sb6.toString();
            }
            Object[] objArr = this.f205114p;
            Object obj2 = objArr[i];
            if (obj2 instanceof kg.r) {
                i++;
                if (i < i2 && (objArr[i] instanceof Iterator)) {
                    int i3 = this.f205117s[i];
                    if (z && i3 > 0 && (i == i2 - 1 || i == i2 - 2)) {
                        i3--;
                    }
                    sb6.append('[');
                    sb6.append(i3);
                    sb6.append(']');
                }
            } else if ((obj2 instanceof kg.w) && (i = i + 1) < i2 && (objArr[i] instanceof Iterator)) {
                sb6.append(CoreConstants.DOT);
                String str = this.f205116r[i];
                if (str != null) {
                    sb6.append(str);
                }
            }
            i++;
        }
    }

    public final String N() {
        return " at path " + M(false);
    }

    public final String O(boolean z) {
        L(qg.b.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) P()).next();
        String str = (String) entry.getKey();
        this.f205116r[this.f205115q - 1] = z ? "<skipped>" : str;
        R(entry.getValue());
        return str;
    }

    public final Object P() {
        return this.f205114p[this.f205115q - 1];
    }

    public final Object Q() {
        Object[] objArr = this.f205114p;
        int i = this.f205115q - 1;
        this.f205115q = i;
        Object obj2 = objArr[i];
        objArr[i] = null;
        return obj2;
    }

    public final void R(Object obj2) {
        int i = this.f205115q;
        Object[] objArr = this.f205114p;
        if (i == objArr.length) {
            int i2 = i * 2;
            this.f205114p = Arrays.copyOf(objArr, i2);
            this.f205117s = Arrays.copyOf(this.f205117s, i2);
            this.f205116r = (String[]) Arrays.copyOf(this.f205116r, i2);
        }
        Object[] objArr2 = this.f205114p;
        int i3 = this.f205115q;
        this.f205115q = i3 + 1;
        objArr2[i3] = obj2;
    }

    @Override // qg.a, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f205114p = new Object[]{u};
        this.f205115q = 1;
    }

    @Override // qg.a
    public final void d() {
        L(qg.b.BEGIN_ARRAY);
        R(((kg.r) P()).iterator());
        this.f205117s[this.f205115q - 1] = 0;
    }

    @Override // qg.a
    public final void f() {
        L(qg.b.BEGIN_OBJECT);
        R(((kg.w) P()).f183891a.entrySet().iterator());
    }

    @Override // qg.a
    public final String getPath() {
        return M(false);
    }

    @Override // qg.a
    public final void i() {
        L(qg.b.END_ARRAY);
        Q();
        Q();
        int i = this.f205115q;
        if (i > 0) {
            int[] iArr = this.f205117s;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    @Override // qg.a
    public final void j() {
        L(qg.b.END_OBJECT);
        this.f205116r[this.f205115q - 1] = null;
        Q();
        Q();
        int i = this.f205115q;
        if (i > 0) {
            int[] iArr = this.f205117s;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    @Override // qg.a
    public final String m() {
        return M(true);
    }

    @Override // qg.a
    public final boolean n() throws MalformedJsonException {
        qg.b bVarA = A();
        return (bVarA == qg.b.END_OBJECT || bVarA == qg.b.END_ARRAY || bVarA == qg.b.END_DOCUMENT) ? false : true;
    }

    @Override // qg.a
    public final boolean q() {
        L(qg.b.BOOLEAN);
        boolean zH = ((kg.x) Q()).h();
        int i = this.f205115q;
        if (i > 0) {
            int[] iArr = this.f205117s;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return zH;
    }

    @Override // qg.a
    public final double r() throws MalformedJsonException {
        qg.b bVarA = A();
        qg.b bVar = qg.b.NUMBER;
        if (bVarA != bVar && bVarA != qg.b.STRING) {
            throw new IllegalStateException("Expected " + bVar + " but was " + bVarA + N());
        }
        double dI = ((kg.x) P()).i();
        if (this.f245600b != kg.e0.LENIENT && (Double.isNaN(dI) || Double.isInfinite(dI))) {
            throw new MalformedJsonException("JSON forbids NaN and infinities: " + dI);
        }
        Q();
        int i = this.f205115q;
        if (i > 0) {
            int[] iArr = this.f205117s;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return dI;
    }

    @Override // qg.a
    public final int s() throws MalformedJsonException {
        qg.b bVarA = A();
        qg.b bVar = qg.b.NUMBER;
        if (bVarA != bVar && bVarA != qg.b.STRING) {
            throw new IllegalStateException("Expected " + bVar + " but was " + bVarA + N());
        }
        kg.x xVar = (kg.x) P();
        int iIntValue = xVar.f183892a instanceof Number ? xVar.j().intValue() : Integer.parseInt(xVar.f());
        Q();
        int i = this.f205115q;
        if (i > 0) {
            int[] iArr = this.f205117s;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return iIntValue;
    }

    @Override // qg.a
    public final long t() throws MalformedJsonException {
        qg.b bVarA = A();
        qg.b bVar = qg.b.NUMBER;
        if (bVarA != bVar && bVarA != qg.b.STRING) {
            throw new IllegalStateException("Expected " + bVar + " but was " + bVarA + N());
        }
        long jE = ((kg.x) P()).e();
        Q();
        int i = this.f205115q;
        if (i > 0) {
            int[] iArr = this.f205117s;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return jE;
    }

    @Override // qg.a
    public final String toString() {
        return q.class.getSimpleName() + N();
    }

    @Override // qg.a
    public final String u() {
        return O(false);
    }

    @Override // qg.a
    public final void w() {
        L(qg.b.NULL);
        Q();
        int i = this.f205115q;
        if (i > 0) {
            int[] iArr = this.f205117s;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    @Override // qg.a
    public final String y() throws MalformedJsonException {
        qg.b bVarA = A();
        qg.b bVar = qg.b.STRING;
        if (bVarA != bVar && bVarA != qg.b.NUMBER) {
            throw new IllegalStateException("Expected " + bVar + " but was " + bVarA + N());
        }
        String strF = ((kg.x) Q()).f();
        int i = this.f205115q;
        if (i > 0) {
            int[] iArr = this.f205117s;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return strF;
    }
}
