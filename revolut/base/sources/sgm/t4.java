package sgm;

import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.schedulers.Timed;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes14.dex */
public final class t4 extends k4 {
    public final Scheduler d;
    public final long e;
    public final TimeUnit f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f263183g;

    public t4(int i, long j2, TimeUnit timeUnit, Scheduler scheduler, boolean z) {
        super(z);
        this.d = scheduler;
        this.f263183g = i;
        this.e = j2;
        this.f = timeUnit;
    }

    @Override // sgm.k4
    public final Object d(Object obj2) {
        this.d.getClass();
        TimeUnit timeUnit = this.f;
        return new Timed(obj2, Scheduler.a(timeUnit), timeUnit);
    }

    @Override // sgm.k4
    public final n4 e() {
        n4 n4Var;
        Timed timed;
        Object obj2;
        this.d.getClass();
        long jA = Scheduler.a(this.f) - this.e;
        n4 n4Var2 = (n4) get();
        Object obj3 = n4Var2.get();
        while (true) {
            n4 n4Var3 = (n4) obj3;
            n4Var = n4Var2;
            n4Var2 = n4Var3;
            if (n4Var2 != null && (obj2 = (timed = (Timed) n4Var2.f263025a).f163121a) != ygm.l.COMPLETE && !(obj2 instanceof ygm.j) && timed.f163122b <= jA) {
                obj3 = n4Var2.get();
            }
        }
        return n4Var;
    }

    @Override // sgm.k4
    public final Object f(Object obj2) {
        return ((Timed) obj2).f163121a;
    }

    @Override // sgm.k4
    public final void i() {
        n4 n4Var;
        this.d.getClass();
        long jA = Scheduler.a(this.f) - this.e;
        n4 n4Var2 = (n4) get();
        n4 n4Var3 = (n4) n4Var2.get();
        int i = 0;
        while (true) {
            n4 n4Var4 = n4Var3;
            n4Var = n4Var2;
            n4Var2 = n4Var4;
            int i2 = this.f262963b;
            if (i2 > 1) {
                if (i2 <= this.f263183g) {
                    if (((Timed) n4Var2.f263025a).f163122b > jA) {
                        break;
                    }
                    i++;
                    this.f262963b = i2 - 1;
                    n4Var3 = (n4) n4Var2.get();
                } else {
                    i++;
                    this.f262963b = i2 - 1;
                    n4Var3 = (n4) n4Var2.get();
                }
            } else {
                break;
            }
        }
        if (i != 0) {
            h(n4Var);
        }
    }

    @Override // sgm.k4
    public final void k() {
        n4 n4Var;
        this.d.getClass();
        long jA = Scheduler.a(this.f) - this.e;
        n4 n4Var2 = (n4) get();
        n4 n4Var3 = (n4) n4Var2.get();
        int i = 0;
        while (true) {
            n4 n4Var4 = n4Var3;
            n4Var = n4Var2;
            n4Var2 = n4Var4;
            int i2 = this.f262963b;
            if (i2 <= 1 || ((Timed) n4Var2.f263025a).f163122b > jA) {
                break;
            }
            i++;
            this.f262963b = i2 - 1;
            n4Var3 = (n4) n4Var2.get();
        }
        if (i != 0) {
            h(n4Var);
        }
    }
}
