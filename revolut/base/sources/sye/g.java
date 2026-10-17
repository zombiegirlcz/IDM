package sye;

import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.feature.topup_screen.impl.flows.topup.fee_bottom_sheet.TopUpFeesBottomSheetContract$ModalStep;
import com.revolut.feature.topup_screen.impl.flows.topup.fee_bottom_sheet.TopUpFeesBottomSheetScreen;
import com.revolut.kompot.common.ModalDestination;
import gim.i;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import yhm.o;
import zhm.h0;

/* JADX INFO: loaded from: classes8.dex */
public final class g extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TopUpFeesBottomSheetScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(TopUpFeesBottomSheetScreen topUpFeesBottomSheetScreen, Continuation continuation) {
        super(2, continuation);
        this.v = topUpFeesBottomSheetScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        g gVar = new g(this.v, continuation);
        gVar.u = obj2;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((CellDetailsDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CellDetailsDelegate.Model model = (CellDetailsDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        d dVar = (d) this.v.T.getValue();
        Intrinsics.h(model);
        com.revolut.feature.topup_screen.impl.flows.topup.fee_bottom_sheet.a aVar2 = (com.revolut.feature.topup_screen.impl.flows.topup.fee_bottom_sheet.a) dVar;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.o;
        b bVar = obj3 instanceof b ? (b) obj3 : null;
        if (bVar == null) {
            IllegalStateException illegalStateException = new IllegalStateException("Unexpected parcel type for fees bottom sheet " + bVar);
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
        } else {
            h.v2(aVar2.f90828q, new TopUpFeesBottomSheetContract$ModalStep.BreakdownInfo(bVar.f266664a, bVar.f266665b), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        }
        return Unit.f186387a;
    }
}
