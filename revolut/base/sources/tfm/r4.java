package tfm;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class r4 extends AtomicReference implements efm.y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f270772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AtomicInteger f270773b;

    public /* synthetic */ r4(AtomicInteger atomicInteger, int i) {
        this.f270772a = i;
        this.f270773b = atomicInteger;
    }

    @Override // efm.y
    public final void onComplete() {
        switch (this.f270772a) {
            case 0:
                s4 s4Var = (s4) this.f270773b;
                lfm.d.a(s4Var.f);
                jh.d.o(s4Var.f270809a, s4Var, s4Var.f270811c);
                break;
            default:
                o6 o6Var = (o6) this.f270773b;
                lfm.d.a(o6Var.f270704b);
                jh.d.o(o6Var.f270703a, o6Var, o6Var.d);
                break;
        }
    }

    @Override // efm.y
    public final void onError(Throwable th10) {
        switch (this.f270772a) {
            case 0:
                s4 s4Var = (s4) this.f270773b;
                lfm.d.a(s4Var.f);
                jh.d.p(s4Var.f270809a, th10, s4Var, s4Var.f270811c);
                break;
            default:
                o6 o6Var = (o6) this.f270773b;
                lfm.d.a(o6Var.f270704b);
                jh.d.p(o6Var.f270703a, th10, o6Var, o6Var.d);
                break;
        }
    }

    @Override // efm.y
    public final void onNext(Object obj2) {
        switch (this.f270772a) {
            case 0:
                ((s4) this.f270773b).a();
                break;
            default:
                lfm.d.a(this);
                o6 o6Var = (o6) this.f270773b;
                lfm.d.a(o6Var.f270704b);
                jh.d.o(o6Var.f270703a, o6Var, o6Var.d);
                break;
        }
    }

    @Override // efm.y
    public final void onSubscribe(ifm.c cVar) {
        switch (this.f270772a) {
            case 0:
                lfm.d.e(this, cVar);
                break;
            default:
                lfm.d.e(this, cVar);
                break;
        }
    }
}
