package bt9;

import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.feature.payments.groups.impl.ui_new.details_bill.GroupDetailsBillScreen;
import com.revolut.feature.support.api.navigation.SupportFeatureConfig;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import zhm.h0;

/* JADX INFO: loaded from: classes5.dex */
public final class i extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ GroupDetailsBillScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(GroupDetailsBillScreen groupDetailsBillScreen, Continuation continuation) {
        super(2, continuation);
        this.v = groupDetailsBillScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        i iVar = new i(this.v, continuation);
        iVar.u = obj2;
        return iVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((i) create((CellDetailsChevronDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CellDetailsChevronDelegate.Model model = (CellDetailsChevronDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        m mVarJ3 = this.v.T2();
        Object obj3 = model.e;
        w wVar = (w) mVarJ3;
        wVar.getClass();
        if (obj3 instanceof w0a.b) {
            yji.l.j2(wVar, wVar.e1(new x0a.b(((w0a.b) obj3).f293673a)), ModalDestination.Style.POPUP.f98311a, null, 2);
        } else if (Intrinsics.f(obj3, "ITEM_ID_ISSUE_REPORT")) {
            wVar.C1(new BridgeDestination(new FeatureCommand(SupportFeatureConfig.f89363a)));
        } else {
            IllegalStateException illegalStateException = new IllegalStateException(a0.d.m(obj3, "Unsupported chevron parcel: "));
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
        }
        return Unit.f186387a;
    }
}
