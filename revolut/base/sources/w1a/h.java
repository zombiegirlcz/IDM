package w1a;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.payments.splitbill.impl.ui_new.manage_split.RecurringPaymentsManageSplitContract$ModalStep;
import com.revolut.feature.payments.splitbill.impl.ui_new.manage_split.RecurringPaymentsManageSplitContract$ParticipantRowData;
import com.revolut.feature.payments.splitbill.impl.ui_new.manage_split.RecurringPaymentsManageSplitScreen;
import com.revolut.feature.payments.splitbill.models.recurringsplit.RecurringSplit;
import com.revolut.kompot.common.ModalDestination;
import gim.i;
import hx7.q;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes5.dex */
public final class h extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ RecurringPaymentsManageSplitScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(RecurringPaymentsManageSplitScreen recurringPaymentsManageSplitScreen, Continuation continuation) {
        super(2, continuation);
        this.v = recurringPaymentsManageSplitScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        h hVar = new h(this.v, continuation);
        hVar.u = obj2;
        return hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        b bVar = (b) this.v.R.getValue();
        Intrinsics.h(model);
        com.revolut.feature.payments.splitbill.impl.ui_new.manage_split.b bVar2 = (com.revolut.feature.payments.splitbill.impl.ui_new.manage_split.b) bVar;
        bVar2.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.u;
        RecurringPaymentsManageSplitContract$ParticipantRowData recurringPaymentsManageSplitContract$ParticipantRowData = obj3 instanceof RecurringPaymentsManageSplitContract$ParticipantRowData ? (RecurringPaymentsManageSplitContract$ParticipantRowData) obj3 : null;
        if (recurringPaymentsManageSplitContract$ParticipantRowData == null) {
            r6.b.r("Parcel type is invalid");
        } else {
            a2a.a aVar2 = (a2a.a) ((a) ((j2) bVar2.f79889q.f22677a).getValue()).f293812a.getContent();
            if (aVar2 == null) {
                r6.b.r("Status should not be null");
            } else {
                RecurringSplit recurringSplit = aVar2.f713a;
                oki.h.v2(bVar2.f79890r, aVar2.f714b.size() <= 1 ? new RecurringPaymentsManageSplitContract$ModalStep.CancelSplit(recurringSplit) : new RecurringPaymentsManageSplitContract$ModalStep.RemoveParticipant(recurringSplit.f79920a, recurringPaymentsManageSplitContract$ParticipantRowData.f79886b, q.v(recurringPaymentsManageSplitContract$ParticipantRowData.f79885a)), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
            }
        }
        return Unit.f186387a;
    }
}
