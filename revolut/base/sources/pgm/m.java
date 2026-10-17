package pgm;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes14.dex */
public final class m extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f236106c = 2;
    public final long d;
    public final TimeUnit e;
    public final Scheduler f;

    public m(t1 t1Var, long j2, TimeUnit timeUnit, Scheduler scheduler) {
        super(t1Var);
        this.d = j2;
        this.e = timeUnit;
        this.f = scheduler;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public final void k(dom.a aVar) {
        switch (this.f236106c) {
            case 0:
                this.f236000b.j(new l(new ghm.a(aVar), this.d, this.e, this.f.b()));
                break;
            case 1:
                this.f236000b.j(new n(new ghm.a(aVar), this.d, this.e, this.f.b()));
                break;
            case 2:
                this.f236000b.j(new k1(new ghm.a(aVar), this.d, this.e, this.f));
                break;
            default:
                this.f236000b.j(new u1(new ghm.a(aVar), this.d, this.e, this.f.b()));
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(Flowable flowable, long j2, Scheduler scheduler) {
        super(flowable);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.d = j2;
        this.e = timeUnit;
        this.f = scheduler;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(b0 b0Var, Scheduler scheduler) {
        super(b0Var);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.d = 3L;
        this.e = timeUnit;
        this.f = scheduler;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(s0 s0Var, Scheduler scheduler) {
        super(s0Var);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.d = 2000L;
        this.e = timeUnit;
        this.f = scheduler;
    }
}
