package mg;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: loaded from: classes17.dex */
public final class s extends qg.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final r f205118r = new r();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final kg.x f205119s = new kg.x("closed");
    public final ArrayList o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f205120p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public kg.u f205121q;

    public s() {
        super(f205118r);
        this.o = new ArrayList();
        this.f205121q = kg.v.f183890a;
    }

    public final void A(kg.u uVar) {
        if (this.f205120p != null) {
            if (!(uVar instanceof kg.v) || this.k) {
                ((kg.w) z()).g(this.f205120p, uVar);
            }
            this.f205120p = null;
            return;
        }
        if (this.o.isEmpty()) {
            this.f205121q = uVar;
            return;
        }
        kg.u uVarZ = z();
        if (!(uVarZ instanceof kg.r)) {
            throw new IllegalStateException();
        }
        ((kg.r) uVarZ).g(uVar);
    }

    @Override // qg.c, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        ArrayList arrayList = this.o;
        if (!arrayList.isEmpty()) {
            throw new IOException("Incomplete document");
        }
        arrayList.add(f205119s);
    }

    @Override // qg.c
    public final void f() {
        kg.r rVar = new kg.r();
        A(rVar);
        this.o.add(rVar);
    }

    @Override // qg.c, java.io.Flushable
    public final void flush() {
    }

    @Override // qg.c
    public final qg.c g() {
        kg.w wVar = new kg.w();
        A(wVar);
        this.o.add(wVar);
        return this;
    }

    @Override // qg.c
    public final void i() {
        ArrayList arrayList = this.o;
        if (arrayList.isEmpty() || this.f205120p != null) {
            throw new IllegalStateException();
        }
        if (!(z() instanceof kg.r)) {
            throw new IllegalStateException();
        }
        arrayList.remove(arrayList.size() - 1);
    }

    @Override // qg.c
    public final void j() {
        ArrayList arrayList = this.o;
        if (arrayList.isEmpty() || this.f205120p != null) {
            throw new IllegalStateException();
        }
        if (!(z() instanceof kg.w)) {
            throw new IllegalStateException();
        }
        arrayList.remove(arrayList.size() - 1);
    }

    @Override // qg.c
    public final qg.c k(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.o.isEmpty() || this.f205120p != null) {
            throw new IllegalStateException("Did not expect a name");
        }
        if (!(z() instanceof kg.w)) {
            throw new IllegalStateException("Please begin an object before writing a name.");
        }
        this.f205120p = str;
        return this;
    }

    @Override // qg.c
    public final qg.c m() {
        A(kg.v.f183890a);
        return this;
    }

    @Override // qg.c
    public final qg.c r(Number number) {
        if (number == null) {
            A(kg.v.f183890a);
            return this;
        }
        if (this.f245615h != kg.e0.LENIENT) {
            double dDoubleValue = number.doubleValue();
            if (Double.isNaN(dDoubleValue) || Double.isInfinite(dDoubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: " + number);
            }
        }
        A(new kg.x(number));
        return this;
    }

    @Override // qg.c
    public final qg.c s(String str) {
        if (str == null) {
            A(kg.v.f183890a);
            return this;
        }
        A(new kg.x(str));
        return this;
    }

    @Override // qg.c
    public final void t(double d) {
        if (this.f245615h == kg.e0.LENIENT || (!Double.isNaN(d) && !Double.isInfinite(d))) {
            A(new kg.x(Double.valueOf(d)));
        } else {
            throw new IllegalArgumentException("JSON forbids NaN and infinities: " + d);
        }
    }

    @Override // qg.c
    public final void u(long j2) {
        A(new kg.x(Long.valueOf(j2)));
    }

    @Override // qg.c
    public final void v(Boolean bool) {
        if (bool == null) {
            A(kg.v.f183890a);
        } else {
            A(new kg.x(bool));
        }
    }

    @Override // qg.c
    public final void w(boolean z) {
        A(new kg.x(Boolean.valueOf(z)));
    }

    public final kg.u y() {
        ArrayList arrayList = this.o;
        if (arrayList.isEmpty()) {
            return this.f205121q;
        }
        throw new IllegalStateException("Expected one JSON element but was " + arrayList);
    }

    public final kg.u z() {
        return (kg.u) p.a.i(1, this.o);
    }
}
