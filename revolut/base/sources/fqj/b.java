package fqj;

import a31.o;
import java.util.concurrent.TimeUnit;
import jqj.l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import qfm.j1;
import qfm.p2;
import qfm.x;
import te0.w;
import tof.hc;
import ufm.i;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f137265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f137266b;

    public /* synthetic */ b(h hVar, int i) {
        this.f137265a = i;
        this.f137266b = hVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f137265a) {
            case 0:
                String walletId = (String) obj2;
                Intrinsics.checkNotNullParameter(walletId, "walletId");
                l lVar = this.f137266b.f137273b;
                hc walletScope = new hc(walletId, null);
                lVar.getClass();
                Intrinsics.checkNotNullParameter(walletScope, "walletScope");
                ufm.c cVar = new ufm.c(new fag.g(lVar, walletScope, 19), 2);
                Intrinsics.checkNotNullExpressionValue(cVar, "fromCallable(...)");
                i iVar = new i(w.i0(cVar), new jof.a(11, new jqj.i(lVar, walletScope, 0)), 0);
                Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
                return iVar;
            default:
                efm.i errors = (efm.i) obj2;
                Intrinsics.checkNotNullParameter(errors, "errors");
                o oVar = new o(18, e.f137269a);
                dfm.c cVar2 = mfm.f.d;
                en.a aVar = mfm.f.f205043c;
                errors.getClass();
                p2 p2VarQ = new x(errors, oVar, cVar2, aVar, aVar).b(30000L, TimeUnit.MILLISECONDS).q(5L);
                efm.i flowable = this.f137266b.f137272a.c(false).filter(new fjj.b(new fo9.a(12), 24)).toFlowable(efm.a.DROP);
                fjj.b bVar = new fjj.b(new fo9.a(13), 25);
                flowable.getClass();
                return p2VarQ.j(new j1(flowable, bVar, 0));
        }
    }
}
