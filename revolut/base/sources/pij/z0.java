package pij;

import com.revolut.data.model.Data;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.feature.esim.api.model.EsimSubscriptionsEmptyDisplay;
import com.revolut.retail.feature.esim.impl.ui.screens.home.subscriptions.EsimSubscriptionsScreenContract$ModalStep;
import com.revolut.retail.feature.esim.impl.ui.screens.home.subscriptions.EsimSubscriptionsScreenContract$OutputData;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class z0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.esim.impl.ui.screens.home.subscriptions.b f236605w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z0(com.revolut.retail.feature.esim.impl.ui.screens.home.subscriptions.b bVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f236605w = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                z0 z0Var = new z0(this.f236605w, continuation, 0);
                z0Var.v = obj2;
                return z0Var;
            case 1:
                z0 z0Var2 = new z0(this.f236605w, continuation, 1);
                z0Var2.v = obj2;
                return z0Var2;
            case 2:
                z0 z0Var3 = new z0(this.f236605w, continuation, 2);
                z0Var3.v = obj2;
                return z0Var3;
            case 3:
                z0 z0Var4 = new z0(this.f236605w, continuation, 3);
                z0Var4.v = obj2;
                return z0Var4;
            case 4:
                z0 z0Var5 = new z0(this.f236605w, continuation, 4);
                z0Var5.v = obj2;
                return z0Var5;
            case 5:
                z0 z0Var6 = new z0(this.f236605w, continuation, 5);
                z0Var6.v = obj2;
                return z0Var6;
            case 6:
                z0 z0Var7 = new z0(this.f236605w, continuation, 6);
                z0Var7.v = obj2;
                return z0Var7;
            case 7:
                z0 z0Var8 = new z0(this.f236605w, continuation, 7);
                z0Var8.v = obj2;
                return z0Var8;
            case 8:
                z0 z0Var9 = new z0(this.f236605w, continuation, 8);
                z0Var9.v = obj2;
                return z0Var9;
            case 9:
                z0 z0Var10 = new z0(this.f236605w, continuation, 9);
                z0Var10.v = obj2;
                return z0Var10;
            case 10:
                z0 z0Var11 = new z0(this.f236605w, continuation, 10);
                z0Var11.v = obj2;
                return z0Var11;
            case 11:
                z0 z0Var12 = new z0(this.f236605w, continuation, 11);
                z0Var12.v = obj2;
                return z0Var12;
            case 12:
                z0 z0Var13 = new z0(this.f236605w, continuation, 12);
                z0Var13.v = obj2;
                return z0Var13;
            case 13:
                z0 z0Var14 = new z0(this.f236605w, continuation, 13);
                z0Var14.v = obj2;
                return z0Var14;
            case 14:
                z0 z0Var15 = new z0(this.f236605w, continuation, 14);
                z0Var15.v = obj2;
                return z0Var15;
            default:
                z0 z0Var16 = new z0(this.f236605w, continuation, 15);
                z0Var16.v = obj2;
                return z0Var16;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((z0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        int i2 = 29;
        int i3 = 0;
        com.revolut.retail.feature.esim.impl.ui.screens.home.subscriptions.b bVar = this.f236605w;
        switch (i) {
            case 0:
                Data data = (Data) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                bVar.H2(bVar.f101081e0, new pig.u(data, 4));
                return Unit.f186387a;
            case 1:
                Data data2 = (Data) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                bVar.H2(bVar.f101081e0, new pig.u(data2, 5));
                return Unit.f186387a;
            case 2:
                Data data3 = (Data) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                bVar.H2(bVar.f101081e0, new pig.u(data3, 6));
                return Unit.f186387a;
            case 3:
                vf0.k kVar = (vf0.k) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.retail.feature.esim.impl.ui.screens.home.subscriptions.b.K2(bVar, new fmk.j((Data) kVar.f288455b, (Data) kVar.f288456c, (Data) kVar.f288454a, (Data) kVar.d, (Data) kVar.e, 2));
                return Unit.f186387a;
            case 4:
                Data data4 = (Data) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                bVar.H2(bVar.f101081e0, new pig.u(data4, 7));
                return Unit.f186387a;
            case 5:
                Data data5 = (Data) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                cli.y yVar = bVar.f101081e0;
                bVar.H2(yVar, new pig.u(data5, 3));
                Map map = (Map) data5.getContent();
                if (map != null) {
                    bVar.H2(yVar, new p5e.h(bVar, map, i2));
                }
                return Unit.f186387a;
            case 6:
                Data data6 = (Data) this.v;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                cli.y yVar2 = bVar.f101081e0;
                bVar.H2(yVar2, new pig.u(data6, 3));
                Map map2 = (Map) data6.getContent();
                if (map2 != null) {
                    bVar.H2(yVar2, new p5e.h(bVar, map2, i2));
                }
                return Unit.f186387a;
            case 7:
                chj.b0 b0Var = (chj.b0) this.v;
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (b0Var instanceof chj.z) {
                    bVar.T2();
                } else if (b0Var instanceof chj.r) {
                    bVar.C2(EsimSubscriptionsScreenContract$OutputData.InstallationInstructionsClicked.f101051a);
                } else if (b0Var instanceof chj.a0) {
                    com.revolut.retail.feature.esim.impl.ui.screens.home.subscriptions.b.M2(bVar, ((chj.a0) b0Var).f24242a);
                } else if ((b0Var instanceof chj.v) || (b0Var instanceof chj.x)) {
                    bVar.T2();
                } else if (!(b0Var instanceof chj.u) && !(b0Var instanceof chj.t) && !(b0Var instanceof chj.w) && !(b0Var instanceof chj.y) && !(b0Var instanceof chj.s)) {
                    throw new NoWhenBranchMatchedException();
                }
                return Unit.f186387a;
            case 8:
                EsimSubscriptionsEmptyDisplay esimSubscriptionsEmptyDisplay = (EsimSubscriptionsEmptyDisplay) this.v;
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                bVar.H2(bVar.f101081e0, new d1(esimSubscriptionsEmptyDisplay, i3));
                return Unit.f186387a;
            case 9:
                Data data7 = (Data) this.v;
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.retail.feature.esim.impl.ui.screens.home.subscriptions.b.K2(bVar, new pig.u(data7, 8));
                return Unit.f186387a;
            case 10:
                Data data8 = (Data) this.v;
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                bVar.H2(bVar.f101081e0, new pig.u(data8, 9));
                return Unit.f186387a;
            case 11:
                Data data9 = (Data) this.v;
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                bVar.H2(bVar.f101081e0, new pig.u(data9, 10));
                return Unit.f186387a;
            case 12:
                dfj.x0 x0Var = (dfj.x0) this.v;
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                Continuation continuation = null;
                if (x0Var instanceof dfj.s0) {
                    bVar.n2(new o0(bVar, x0Var, continuation, i3), new whi.b(6));
                } else if (x0Var instanceof dfj.r0) {
                    bVar.n2(new o0(bVar, x0Var, continuation, 1), new whi.b(6));
                } else if (x0Var instanceof dfj.q0) {
                    bVar.n2(new o0(bVar, x0Var, continuation, 2), new whi.b(6));
                } else if (x0Var instanceof dfj.t0) {
                    dfj.t0 t0Var = (dfj.t0) x0Var;
                    bVar.C2(new EsimSubscriptionsScreenContract$OutputData.PlanChange(t0Var.f114109a, t0Var.f114110b));
                    Unit unit = Unit.f186387a;
                } else if (x0Var instanceof dfj.u0) {
                    dfj.u0 u0Var = (dfj.u0) x0Var;
                    bVar.C2(new EsimSubscriptionsScreenContract$OutputData.PlanUpgrade(u0Var.f114118a, u0Var.f114119b));
                    Unit unit2 = Unit.f186387a;
                } else if (x0Var instanceof dfj.o0) {
                    oki.h.v2(bVar.f0, new EsimSubscriptionsScreenContract$ModalStep.SubscriptionActivationConfirmation(((dfj.o0) x0Var).f114057a), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                    Unit unit3 = Unit.f186387a;
                } else {
                    if (!(x0Var instanceof dfj.v0) && !Intrinsics.f(x0Var, dfj.p0.f114063a) && !Intrinsics.f(x0Var, dfj.w0.f114140a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    int i5 = jli.h.f175850a;
                    Unit unit4 = Unit.f186387a;
                }
                return Unit.f186387a;
            case 13:
                Data data10 = (Data) this.v;
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                bVar.H2(bVar.f101081e0, new pig.u(data10, 11));
                return Unit.f186387a;
            case 14:
                Data data11 = (Data) this.v;
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                bVar.H2(bVar.f101081e0, new pig.u(data11, 12));
                return Unit.f186387a;
            default:
                Data data12 = (Data) this.v;
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                bVar.H2(bVar.f101081e0, new pig.u(data12, 13));
                return Unit.f186387a;
        }
    }
}
