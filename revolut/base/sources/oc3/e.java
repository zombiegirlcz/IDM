package oc3;

import com.revolut.feature.cash_topup.impl.ui.map.CashTopUpLocationsMapScreen;
import com.revolut.feature.cash_topup.impl.ui.search.CashTopUpSearchLocationScreen;
import com.revolut.feature.cash_topup.impl.ui.search.CashTopUpSearchLocationScreenContract$InputData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ CashTopUpLocationsMapScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(CashTopUpLocationsMapScreen cashTopUpLocationsMapScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = cashTopUpLocationsMapScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new e(this.v, continuation, 0);
            case 1:
                return new e(this.v, continuation, 1);
            case 2:
                return new e(this.v, continuation, 2);
            default:
                return new e(this.v, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((e) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        co3.a aVar;
        int i = this.u;
        final int i2 = 0;
        Continuation continuation = null;
        final int i3 = 1;
        CashTopUpLocationsMapScreen cashTopUpLocationsMapScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                cashTopUpLocationsMapScreen.m2().onBackPressed();
                break;
            case 1:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                final a0 a0Var = (a0) cashTopUpLocationsMapScreen.T2();
                h hVar = (h) a0Var.t2();
                co3.a aVar4 = hVar.f224065c;
                if (aVar4 != null && (aVar = hVar.f224067h) != null) {
                    yji.l.g2(a0Var, new CashTopUpSearchLocationScreen(new CashTopUpSearchLocationScreenContract$InputData(aVar, aVar4, a0Var.f224054s.f65678a)), null, new Function1() { // from class: oc3.s
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj3) {
                            switch (i2) {
                                case 0:
                                    pc3.e outputData = (pc3.e) obj3;
                                    Intrinsics.checkNotNullParameter(outputData, "outputData");
                                    a0Var.v2(new j(outputData.f234814a));
                                    return Unit.f186387a;
                                default:
                                    h updateState = (h) obj3;
                                    Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                                    return h.a((h) a0Var.t2(), false, null, null, null, true, true, null, null, false, 463);
                            }
                        }
                    }, 1);
                }
                break;
            case 2:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ah0.a aVar6 = cashTopUpLocationsMapScreen.O;
                if (aVar6 != null) {
                    cashTopUpLocationsMapScreen.c3().g0(aVar6, 15.0f, true);
                }
                final a0 a0Var2 = (a0) cashTopUpLocationsMapScreen.T2();
                a0Var2.getClass();
                a0Var2.x2(new Function1() { // from class: oc3.s
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        switch (i3) {
                            case 0:
                                pc3.e outputData = (pc3.e) obj3;
                                Intrinsics.checkNotNullParameter(outputData, "outputData");
                                a0Var2.v2(new j(outputData.f234814a));
                                return Unit.f186387a;
                            default:
                                h updateState = (h) obj3;
                                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                                return h.a((h) a0Var2.t2(), false, null, null, null, true, true, null, null, false, 463);
                        }
                    }
                });
                break;
            default:
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                a0 a0Var3 = (a0) cashTopUpLocationsMapScreen.T2();
                a0Var3.getClass();
                a0Var3.n2(new x(a0Var3, continuation, i2), new whi.b(6));
                break;
        }
        return Unit.f186387a;
    }
}
