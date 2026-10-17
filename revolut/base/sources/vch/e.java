package vch;

import aw0.f4;
import com.revolut.feature.faq.api.navigation.FaqFeatureConfig;
import com.revolut.feature.wealth.impl.ui.screens.withdraw.WithdrawScreen;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ WithdrawScreen f287700w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(WithdrawScreen withdrawScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f287700w = withdrawScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                e eVar = new e(this.f287700w, continuation, 0);
                eVar.v = obj2;
                return eVar;
            case 1:
                e eVar2 = new e(this.f287700w, continuation, 1);
                eVar2.v = obj2;
                return eVar2;
            case 2:
                e eVar3 = new e(this.f287700w, continuation, 2);
                eVar3.v = obj2;
                return eVar3;
            default:
                e eVar4 = new e(this.f287700w, continuation, 3);
                eVar4.v = obj2;
                return eVar4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((e) create((f4) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((e) create((rp0.z) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((e) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((e) create((CharSequence) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        WithdrawScreen withdrawScreen = this.f287700w;
        switch (i) {
            case 0:
                f4 f4Var = (f4) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                x0 x0Var = (x0) withdrawScreen.T2();
                if (f4Var.f10304b) {
                    x0Var.x2(new v80.a(29));
                } else {
                    x0Var.x2(new h0(0));
                }
                break;
            case 1:
                rp0.z clickData = (rp0.z) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                v vVarI3 = withdrawScreen.T2();
                Intrinsics.h(clickData);
                x0 x0Var2 = (x0) vVarI3;
                x0Var2.getClass();
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                Object obj3 = clickData.f256228b;
                if (obj3 instanceof u) {
                    x0Var2.C1(new BridgeDestination(new FeatureCommand(new FaqFeatureConfig.Starter("question.why-cant-i-withdraw-my-available-funds", 2))));
                } else if (obj3 instanceof t1h.m) {
                    x0Var2.f287749y.Z2((t1h.m) obj3);
                }
                break;
            case 2:
                ty0.a clickData2 = (ty0.a) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                v vVarI32 = withdrawScreen.T2();
                Intrinsics.h(clickData2);
                x0 x0Var3 = (x0) vVarI32;
                x0Var3.getClass();
                Intrinsics.checkNotNullParameter(clickData2, "clickData");
                Object obj4 = clickData2.d;
                if (obj4 instanceof lpc.c) {
                    x0Var3.f287747w.invoke(obj4);
                }
                break;
            default:
                CharSequence charSequence = (CharSequence) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                v vVarI33 = withdrawScreen.T2();
                String amountString = charSequence.toString();
                x0 x0Var4 = (x0) vVarI33;
                x0Var4.getClass();
                Intrinsics.checkNotNullParameter(amountString, "amountString");
                x0Var4.x2(new v73.c(x0Var4, amountString, 8));
                break;
        }
        return Unit.f186387a;
    }
}
