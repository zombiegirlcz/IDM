package cbf;

import aii.q;
import com.revolut.core.ui_kit.views.buttons.TwinVerticalButton;
import com.revolut.feature.trading.transfer.investments.impl.ui.transfer_out_create_revamp.screens.disclaimer.TransferOutDisclaimerScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import yhm.o;

/* JADX INFO: loaded from: classes8.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ TransferOutDisclaimerScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(TransferOutDisclaimerScreen transferOutDisclaimerScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = transferOutDisclaimerScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new d(this.v, continuation, 0);
            case 1:
                return new d(this.v, continuation, 1);
            case 2:
                return new d(this.v, continuation, 2);
            default:
                return new d(this.v, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((d) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r5v10, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v20, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        TransferOutDisclaimerScreen transferOutDisclaimerScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                KProperty[] kPropertyArr = TransferOutDisclaimerScreen.S;
                TwinVerticalButton twinVerticalButton = transferOutDisclaimerScreen.d3().d;
                Intrinsics.checkNotNullExpressionValue(twinVerticalButton, "screenRecyclerNavbarTwin…lButtonTwinVerticalButton");
                if (twinVerticalButton.getVisibility() != 0) {
                    TwinVerticalButton twinVerticalButton2 = transferOutDisclaimerScreen.d3().d;
                    Intrinsics.checkNotNullExpressionValue(twinVerticalButton2, "screenRecyclerNavbarTwin…lButtonTwinVerticalButton");
                    twinVerticalButton2.setVisibility(0);
                    transferOutDisclaimerScreen.d3().d.setCollapsed(true, false);
                }
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((j) transferOutDisclaimerScreen.Q.getValue()).B2();
                break;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                KProperty[] kPropertyArr2 = TransferOutDisclaimerScreen.S;
                transferOutDisclaimerScreen.d3().f174570b.setExpanded(false, true);
                transferOutDisclaimerScreen.d3().f174571c.smoothScrollBy(0, transferOutDisclaimerScreen.d3().f174571c.computeVerticalScrollExtent() + transferOutDisclaimerScreen.d3().f174571c.getScrollY());
                break;
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((j) transferOutDisclaimerScreen.Q.getValue()).C2(q.f5292a);
                break;
        }
        return Unit.f186387a;
    }
}
