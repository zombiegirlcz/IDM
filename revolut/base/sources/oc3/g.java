package oc3;

import com.revolut.core.ui_kit.delegates.NotificationCentreItemDelegate;
import com.revolut.feature.cash_topup.api.models.CashTopUpLocationInfo;
import com.revolut.feature.cash_topup.impl.ui.map.CashTopUpLocationsMapScreen;
import ip0.az;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import mx0.q9;
import mx0.u9;

/* JADX INFO: loaded from: classes21.dex */
public final class g extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ CashTopUpLocationsMapScreen f224062w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(CashTopUpLocationsMapScreen cashTopUpLocationsMapScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f224062w = cashTopUpLocationsMapScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                g gVar = new g(this.f224062w, continuation, 0);
                gVar.v = obj2;
                return gVar;
            case 1:
                g gVar2 = new g(this.f224062w, continuation, 1);
                gVar2.v = obj2;
                return gVar2;
            case 2:
                g gVar3 = new g(this.f224062w, continuation, 2);
                gVar3.v = obj2;
                return gVar3;
            case 3:
                g gVar4 = new g(this.f224062w, continuation, 3);
                gVar4.v = obj2;
                return gVar4;
            default:
                g gVar5 = new g(this.f224062w, continuation, 4);
                gVar5.v = obj2;
                return gVar5;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((g) create((cr0.h) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((g) create((yv0.k) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((g) create((q9) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((g) create((az) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((g) create((koi.j) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        char c2 = 1;
        CashTopUpLocationsMapScreen cashTopUpLocationsMapScreen = this.f224062w;
        switch (i) {
            case 0:
                cr0.h hVar = (cr0.h) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                tri.c cVarA = ue8.c.A(cashTopUpLocationsMapScreen.m2());
                if ((hVar == null ? -1 : f.f224061a[hVar.ordinal()]) == 1) {
                    if (cVarA != null) {
                        cVarA.b(cashTopUpLocationsMapScreen);
                    }
                } else if (cVarA != null) {
                    cVarA.a(cashTopUpLocationsMapScreen, new a(cashTopUpLocationsMapScreen, c2 == true ? 1 : 0));
                }
                return Unit.f186387a;
            case 1:
                yv0.k kVar = (yv0.k) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                n nVarD3 = cashTopUpLocationsMapScreen.T2();
                Object objA = kVar.a();
                Intrinsics.i(objA, "null cannot be cast to non-null type kotlin.String");
                String id10 = (String) objA;
                a0 a0Var = (a0) nVarD3;
                a0Var.getClass();
                Intrinsics.checkNotNullParameter(id10, "id");
                a0Var.x2(new o23.l(id10, 15));
                return Unit.f186387a;
            case 2:
                q9 update = (q9) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                n nVarD32 = cashTopUpLocationsMapScreen.T2();
                Intrinsics.h(update);
                a0 a0Var2 = (a0) nVarD32;
                a0Var2.getClass();
                Intrinsics.checkNotNullParameter(update, "update");
                ah0.a aVarA = update.f209962a.a();
                a0Var2.x2(new l1.e(update.f209963b == u9.REASON_GESTURE, a0Var2, new co3.a(aVarA.f4847a, aVarA.f4848b), 22));
                return Unit.f186387a;
            case 3:
                az azVar = (az) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                Intrinsics.h(azVar);
                KProperty[] kPropertyArr = CashTopUpLocationsMapScreen.f65677a0;
                Object obj3 = azVar.f163509c;
                if (obj3 instanceof ub3.c) {
                    int i2 = b.f224057b[azVar.f163508b.ordinal()];
                    if (i2 == 1) {
                        n nVarD33 = cashTopUpLocationsMapScreen.T2();
                        CashTopUpLocationInfo location = ((ub3.c) obj3).f278731a;
                        a0 a0Var3 = (a0) nVarD33;
                        a0Var3.getClass();
                        Intrinsics.checkNotNullParameter(location, "location");
                        a0Var3.v2(new j(location));
                    } else if (i2 == 2) {
                        ub3.c cVar = (ub3.c) obj3;
                        ((a0) cashTopUpLocationsMapScreen.T2()).y2(cVar.f278731a, cVar.f278732b);
                    } else {
                        if (i2 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        ub3.c cVar2 = (ub3.c) obj3;
                        ((a0) cashTopUpLocationsMapScreen.T2()).y2(cVar2.f278731a, cVar2.f278733c);
                    }
                }
                return Unit.f186387a;
            default:
                koi.j jVar = (koi.j) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                KProperty[] kPropertyArr2 = CashTopUpLocationsMapScreen.f65677a0;
                if (jVar instanceof NotificationCentreItemDelegate.Model) {
                    Object obj4 = ((NotificationCentreItemDelegate.Model) jVar).f52872l;
                    if (obj4 instanceof ub3.c) {
                        n nVarD34 = cashTopUpLocationsMapScreen.T2();
                        String id11 = ((ub3.c) obj4).f278731a.f;
                        a0 a0Var4 = (a0) nVarD34;
                        a0Var4.getClass();
                        Intrinsics.checkNotNullParameter(id11, "id");
                        a0Var4.x2(new o23.l(id11, 15));
                    }
                }
                return Unit.f186387a;
        }
    }
}
