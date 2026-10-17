package dcf;

import com.revolut.data.model.Data;
import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerInnerConfiguration;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerNavigationId;
import com.revolut.feature.trading_add_ons.domain.model.TradingAddOnsCloseAction;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import nii.l1;
import nii.n1;

/* JADX INFO: loaded from: classes8.dex */
public final class f0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ i0 f112933w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f0(int i, i0 i0Var, Continuation continuation) {
        super(2, continuation);
        this.u = i;
        this.f112933w = i0Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                f0 f0Var = new f0(0, this.f112933w, continuation);
                f0Var.v = obj2;
                return f0Var;
            case 1:
                f0 f0Var2 = new f0(1, this.f112933w, continuation);
                f0Var2.v = obj2;
                return f0Var2;
            case 2:
                f0 f0Var3 = new f0(2, this.f112933w, continuation);
                f0Var3.v = obj2;
                return f0Var3;
            case 3:
                f0 f0Var4 = new f0(3, this.f112933w, continuation);
                f0Var4.v = obj2;
                return f0Var4;
            case 4:
                f0 f0Var5 = new f0(4, this.f112933w, continuation);
                f0Var5.v = obj2;
                return f0Var5;
            case 5:
                f0 f0Var6 = new f0(5, this.f112933w, continuation);
                f0Var6.v = obj2;
                return f0Var6;
            case 6:
                f0 f0Var7 = new f0(6, this.f112933w, continuation);
                f0Var7.v = obj2;
                return f0Var7;
            default:
                f0 f0Var8 = new f0(7, this.f112933w, continuation);
                f0Var8.v = obj2;
                return f0Var8;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((f0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((f0) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((f0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((f0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((f0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((f0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((f0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((f0) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        int i2 = 6;
        i0 i0Var = this.f112933w;
        switch (i) {
            case 0:
                Data data = (Data) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                i0Var.x2(new czc.b0(data, 29));
                return Unit.f186387a;
            case 1:
                String str = (String) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                i0Var.x2(new d7a.p(str, i2));
                return Unit.f186387a;
            case 2:
                Data data2 = (Data) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                i0Var.x2(new g0(data2, 0));
                return Unit.f186387a;
            case 3:
                Data data3 = (Data) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                i0Var.x2(new g0(data3, 1));
                return Unit.f186387a;
            case 4:
                Data data4 = (Data) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                i0Var.x2(new g0(data4, 2));
                return Unit.f186387a;
            case 5:
                Data data5 = (Data) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                i0Var.x2(new g0(data5, 3));
                return Unit.f186387a;
            case 6:
                Data data6 = (Data) this.v;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                i0Var.x2(new g0(data6, 4));
                return Unit.f186387a;
            default:
                n1 n1Var = (n1) this.v;
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (n1Var instanceof l1) {
                    if (((l1) n1Var).f216190a instanceof nii.j0) {
                        TradingAddOnsCloseAction tradingAddOnsCloseAction = i0Var.f112943p.f91665a;
                        if (Intrinsics.f(tradingAddOnsCloseAction, TradingAddOnsCloseAction.GoBack.f91662a)) {
                            i0Var.u2();
                        } else {
                            if (!Intrinsics.f(tradingAddOnsCloseAction, TradingAddOnsCloseAction.GoToInvest.f91663a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            i0Var.C1(new BridgeDestination(new FeatureCommand(new MainScreenFeatureConfig.WithInnerConfiguration(s49.a.AS_TOP, new MainContainerInnerConfiguration(new MainContainerNavigationId.NewMainScreenContainerTabId(ibb.c.f160141b.f83420a, null), null, null, 6)))));
                        }
                    } else {
                        i0Var.X().a();
                    }
                }
                return Unit.f186387a;
        }
    }
}
