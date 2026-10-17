package uye;

import com.revolut.feature.tab.accounts.models.ProductId;
import com.revolut.feature.topup_screen.common.TopUpTarget;
import com.revolut.retail.core.navigation.NaviCommand;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zh9.u0;

/* JADX INFO: loaded from: classes8.dex */
public final class v extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.topup_screen.impl.flows.topup.flow.i f284324w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ xi0.b f284325x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(com.revolut.feature.topup_screen.impl.flows.topup.flow.i iVar, xi0.b bVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f284324w = iVar;
        this.f284325x = bVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new v(this.f284324w, this.f284325x, continuation, 0);
            default:
                return new v(this.f284324w, this.f284325x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((v) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        efm.d0 d0VarM;
        efm.h0 h0VarF;
        switch (this.u) {
            case 0:
                com.revolut.feature.topup_screen.impl.flows.topup.flow.i iVar = this.f284324w;
                g gVar = iVar.o;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    efm.d0 d0VarR = osg.b.r(iVar.E, this.f284325x, e1f.c.b(gVar.f284275a), null, e1f.c.a(gVar.f284275a), 28);
                    this.v = 1;
                    obj2 = nim.a.b(d0VarR, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                io3.d dVar = (io3.d) obj2;
                Intrinsics.h(dVar);
                iVar.S2(dVar);
                return Unit.f186387a;
            default:
                com.revolut.feature.topup_screen.impl.flows.topup.flow.i iVar2 = this.f284324w;
                g gVar2 = iVar2.o;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    eye.f fVar = iVar2.G;
                    TopUpTarget topUpTarget = gVar2.f284275a;
                    boolean zO2 = iVar2.O2();
                    fVar.getClass();
                    Intrinsics.checkNotNullParameter(topUpTarget, "topUpTarget");
                    xi0.b currency = this.f284325x;
                    Intrinsics.checkNotNullParameter(currency, "currency");
                    od0.i iVar3 = od0.i.f224256b;
                    if (zO2) {
                        od0.i.Companion.getClass();
                        h0VarF = efm.d0.m(iVar3);
                        Intrinsics.checkNotNullExpressionValue(h0VarF, "just(...)");
                    } else {
                        ProductId productIdC = e1f.c.c(topUpTarget);
                        if (productIdC == null) {
                            od0.i.Companion.getClass();
                            d0VarM = efm.d0.m(iVar3);
                            Intrinsics.checkNotNullExpressionValue(d0VarM, "just(...)");
                        } else {
                            efm.d0 d0VarR2 = osg.b.r(fVar.f130855a, currency, e1f.c.b(topUpTarget), null, e1f.c.a(topUpTarget), 28);
                            ey7.a aVar3 = new ey7.a(new eye.d(productIdC, 0), 1);
                            d0VarR2.getClass();
                            ufm.i iVar4 = new ufm.i(d0VarR2, aVar3, 1);
                            Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                            d0VarM = iVar4;
                        }
                        od0.i.Companion.getClass();
                        h0VarF = ue0.e.F(d0VarM, iVar3);
                    }
                    this.v = 1;
                    obj2 = nim.a.b(h0VarF, this);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                NaviCommand naviCommand = (NaviCommand) ((od0.i) obj2).f224257a;
                if (!(gVar2.f284275a instanceof TopUpTarget.Invest) && naviCommand != null) {
                    iVar2.C1(u0.b(naviCommand));
                }
                oki.h.D2(iVar2.i0);
                return Unit.f186387a;
        }
    }
}
