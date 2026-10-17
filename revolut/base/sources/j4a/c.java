package j4a;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.payments.who_to_transfer.impl.common.transfer_action.WhoToTransferActionItem;
import com.revolut.feature.payments.who_to_transfer.impl.transfer.add_recipient.AddRecipientController;
import gim.i;
import hx7.e;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes5.dex */
public final class c extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ AddRecipientController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(AddRecipientController addRecipientController, Continuation continuation) {
        super(2, continuation);
        this.v = addRecipientController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        d dVar = (d) this.v.S.getValue();
        Object obj3 = model.u;
        dVar.getClass();
        if (obj3 instanceof WhoToTransferActionItem) {
            dVar.C2(new a((WhoToTransferActionItem) obj3));
        } else {
            e.h(new IllegalStateException(a0.d.m(obj3, "Parcel is not WhoToTransferActionItem: ")));
        }
        return Unit.f186387a;
    }
}
