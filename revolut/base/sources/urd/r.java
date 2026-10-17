package urd;

import aw0.b2;
import aw0.c2;
import aw0.d2;
import com.revolut.core.ui_kit.delegates.g6;
import com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.custom_asset_details_v2.CustomAssetDetailsV2Controller;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class r extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ CustomAssetDetailsV2Controller f282295w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(CustomAssetDetailsV2Controller customAssetDetailsV2Controller, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f282295w = customAssetDetailsV2Controller;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                r rVar = new r(this.f282295w, continuation, 0);
                rVar.v = obj2;
                return rVar;
            case 1:
                r rVar2 = new r(this.f282295w, continuation, 1);
                rVar2.v = obj2;
                return rVar2;
            default:
                r rVar3 = new r(this.f282295w, continuation, 2);
                rVar3.v = obj2;
                return rVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((r) create((g6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((r) create((d2) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((r) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        int i;
        int i2 = this.u;
        CustomAssetDetailsV2Controller customAssetDetailsV2Controller = this.f282295w;
        switch (i2) {
            case 0:
                g6 g6Var = (g6) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                d dVarE3 = customAssetDetailsV2Controller.d();
                amd.a period = pyd.c.X(g6Var.f54199a);
                x xVar = (x) dVarE3;
                xVar.getClass();
                Intrinsics.checkNotNullParameter(period, "period");
                xVar.H2(xVar.f282301s, new um7.d(period, 23));
                return Unit.f186387a;
            case 1:
                d2 selection = (d2) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                d dVarE32 = customAssetDetailsV2Controller.d();
                Intrinsics.h(selection);
                x xVar2 = (x) dVarE32;
                xVar2.getClass();
                Intrinsics.checkNotNullParameter(selection, "selection");
                if (selection instanceof b2) {
                    i = -1;
                } else {
                    if (!(selection instanceof c2)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i = ((c2) selection).f10253a;
                }
                xVar2.H2(xVar2.f282301s, new l2c.l(i, 26));
                return Unit.f186387a;
            default:
                ty0.a aVar3 = (ty0.a) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                Object obj3 = aVar3.d;
                String url2 = obj3 instanceof String ? (String) obj3 : null;
                if (url2 != null) {
                    x xVar3 = (x) customAssetDetailsV2Controller.d();
                    xVar3.getClass();
                    Intrinsics.checkNotNullParameter(url2, "url");
                    xVar3.n2(new un8.j(xVar3, url2, null, 7), new whi.b(6));
                }
                return Unit.f186387a;
        }
    }
}
