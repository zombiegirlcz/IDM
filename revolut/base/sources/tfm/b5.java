package tfm;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class b5 extends t4 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final efm.c0 f270366c;
    public final long d;
    public final TimeUnit e;
    public final int f;

    public b5(int i, long j2, TimeUnit timeUnit, efm.c0 c0Var) {
        this.f270366c = c0Var;
        this.f = i;
        this.d = j2;
        this.e = timeUnit;
    }

    @Override // tfm.t4
    public final Object c(Object obj2) {
        this.f270366c.getClass();
        TimeUnit timeUnit = this.e;
        return new hhm.g(obj2, efm.c0.a(timeUnit), timeUnit);
    }

    @Override // tfm.t4
    public final w4 d() {
        w4 w4Var;
        this.f270366c.getClass();
        long jA = efm.c0.a(this.e) - this.d;
        w4 w4Var2 = (w4) get();
        Object obj2 = w4Var2.get();
        while (true) {
            w4 w4Var3 = (w4) obj2;
            w4Var = w4Var2;
            w4Var2 = w4Var3;
            if (w4Var2 == null) {
                break;
            }
            hhm.g gVar = (hhm.g) w4Var2.f270921a;
            if (zfm.m.c(gVar.f152432a) || (gVar.f152432a instanceof zfm.k) || gVar.f152433b > jA) {
                break;
            }
            obj2 = w4Var2.get();
        }
        return w4Var;
    }

    @Override // tfm.t4
    public final Object f(Object obj2) {
        return ((hhm.g) obj2).f152432a;
    }

    @Override // tfm.t4
    public final void h() {
        w4 w4Var;
        this.f270366c.getClass();
        long jA = efm.c0.a(this.e) - this.d;
        w4 w4Var2 = (w4) get();
        w4 w4Var3 = (w4) w4Var2.get();
        int i = 0;
        while (true) {
            w4 w4Var4 = w4Var3;
            w4Var = w4Var2;
            w4Var2 = w4Var4;
            if (w4Var2 == null) {
                break;
            }
            int i2 = this.f270842b;
            if (i2 > this.f && i2 > 1) {
                i++;
                this.f270842b = i2 - 1;
                w4Var3 = (w4) w4Var2.get();
            } else {
                if (((hhm.g) w4Var2.f270921a).f152433b > jA) {
                    break;
                }
                i++;
                this.f270842b = i2 - 1;
                w4Var3 = (w4) w4Var2.get();
            }
        }
        if (i != 0) {
            set(w4Var);
        }
    }

    @Override // tfm.t4
    public final void i() {
        w4 w4Var;
        int i;
        this.f270366c.getClass();
        long jA = efm.c0.a(this.e) - this.d;
        w4 w4Var2 = (w4) get();
        w4 w4Var3 = (w4) w4Var2.get();
        int i2 = 0;
        while (true) {
            w4 w4Var4 = w4Var3;
            w4Var = w4Var2;
            w4Var2 = w4Var4;
            if (w4Var2 == null || (i = this.f270842b) <= 1 || ((hhm.g) w4Var2.f270921a).f152433b > jA) {
                break;
            }
            i2++;
            this.f270842b = i - 1;
            w4Var3 = (w4) w4Var2.get();
        }
        if (i2 != 0) {
            set(w4Var);
        }
    }
}
