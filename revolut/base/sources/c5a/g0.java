package c5a;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.feature.slot_manager.api.model.checklist.SlotChecklistPayload;
import com.revolut.feature.slot_manager.impl.ui.screen.checklist.SlotChecklistController;
import com.revolut.feature.slot_manager.impl.ui.screen.checklist.SlotChecklistControllerContract$InputData;
import com.revolut.kompot.common.ModalDestination;
import grl.k9;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class g0 extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.payments.who_to_transfer.impl.ui.chats.f v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(com.revolut.feature.payments.who_to_transfer.impl.ui.chats.f fVar, Continuation continuation) {
        super(2, continuation);
        this.v = fVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        g0 g0Var = new g0(this.v, continuation);
        g0Var.u = obj2;
        return g0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g0) create((SlotChecklistPayload) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        SlotChecklistPayload payload = (SlotChecklistPayload) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        com.revolut.feature.payments.who_to_transfer.impl.ui.chats.f fVar = this.v;
        f5a.e eVar = fVar.O;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(payload, "payload");
        k9 k9Var = k9.Payments;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        AnalyticsProduct.Retail analyticsProduct = com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var);
        f5a.b eventHandler = eVar.f132292a;
        Intrinsics.checkNotNullParameter(payload, "payload");
        Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
        Intrinsics.checkNotNullParameter(eventHandler, "eventHandler");
        fVar.f2(new SlotChecklistController(new SlotChecklistControllerContract$InputData(payload, analyticsProduct), eventHandler), ModalDestination.Style.BOTTOM_DIALOG.f98301a, new w(fVar, 2));
        return Unit.f186387a;
    }
}
