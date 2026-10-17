package pij;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.feature.slot_manager.api.model.checklist.SlotChecklistPayload;
import com.revolut.kompot.common.ModalDestination;
import grl.k9;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes11.dex */
public final class f1 extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.retail.feature.esim.impl.ui.screens.home.subscriptions.b v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(com.revolut.retail.feature.esim.impl.ui.screens.home.subscriptions.b bVar, Continuation continuation) {
        super(2, continuation);
        this.v = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f1 f1Var = new f1(this.v, continuation);
        f1Var.u = obj2;
        return f1Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f1) create((SlotChecklistPayload) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        SlotChecklistPayload slotChecklistPayload = (SlotChecklistPayload) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        k9 k9Var = k9.ESim;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        jkd.a aVar2 = new jkd.a(slotChecklistPayload, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var));
        com.revolut.retail.feature.esim.impl.ui.screens.home.subscriptions.b bVar = this.v;
        yji.l.j2(bVar, bVar.e1(aVar2), ModalDestination.Style.BOTTOM_DIALOG.f98301a, null, 2);
        return Unit.f186387a;
    }
}
