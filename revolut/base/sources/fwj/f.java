package fwj;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import mm0.q;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class f implements kfm.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f138666a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f138667b;

    public /* synthetic */ f(p pVar, int i) {
        this.f138666a = i;
        this.f138667b = pVar;
    }

    @Override // kfm.a
    public final void run() {
        switch (this.f138666a) {
            case 0:
                p pVar = this.f138667b;
                d dVar = pVar.v;
                ((com.revolut.analytics.tracking.v3.f) dVar.f138660a).f(dVar.f138662c, ((twj.f) pVar.f138685a).f275041h.get());
                return;
            case 1:
                p pVar2 = this.f138667b;
                mm0.o oVarD = ((cn0.g) pVar2.f138693n).d();
                mm0.p pVar3 = oVarD instanceof mm0.p ? (mm0.p) oVarD : null;
                if (pVar3 == null) {
                    return;
                }
                q qVar = pVar3.f207119b;
                ((cn0.g) pVar2.i).l(new mm0.j(o0.f186429a.b(mm0.n.class), qVar.f207121b, qVar.f207122c, qVar.d, qVar.f207120a));
                return;
            case 2:
                p pVar4 = this.f138667b;
                if (((ii0.b) pVar4.A).b("MB_DP_CHECK_AFTER_LOGIN")) {
                    ((j41.a) pVar4.C).a();
                    return;
                }
                return;
            case 3:
                p pVar5 = this.f138667b;
                zm0.b bVar = pVar5.i;
                mm0.f remove = new mm0.f(o0.f186429a.b(mm0.p.class));
                cn0.g gVar = (cn0.g) bVar;
                synchronized (gVar) {
                    Intrinsics.checkNotNullParameter(remove, "remove");
                    gVar.b();
                    gVar.h(remove);
                    gVar.d.onNext(Unit.f186387a);
                }
                ((twj.f) pVar5.f138685a).clear();
                return;
            default:
                this.f138667b.u.e();
                return;
        }
    }
}
