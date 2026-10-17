package z2a;

import com.revolut.core.ui_kit.delegates.TransferAmountPagePreviewDelegate;
import com.revolut.feature.payments.transfers.personalisation.impl.ui.style.TransferPersonalisationStyleSelector;
import com.revolut.feature.payments.transfers.personalisation.models.P2pPersonalisation;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes5.dex */
public final class h extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TransferPersonalisationStyleSelector v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(TransferPersonalisationStyleSelector transferPersonalisationStyleSelector, Continuation continuation) {
        super(2, continuation);
        this.v = transferPersonalisationStyleSelector;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        h hVar = new h(this.v, continuation);
        hVar.u = obj2;
        return hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((TransferAmountPagePreviewDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        TransferAmountPagePreviewDelegate.Model model = (TransferAmountPagePreviewDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        k kVar = (k) this.v.T.getValue();
        String listId = model.f53557a;
        Object obj3 = model.f53559c;
        kVar.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        if (Intrinsics.f(listId, "REMOVE_PERSONALISATION_LIST_ID")) {
            String str = kVar.o.f79968a.d;
            if (str != null) {
                kVar.C2(new g2a.c(str));
            } else {
                r6.b.r("Cannot remove personalisation without selected personalisation id");
            }
        } else if (obj3 instanceof P2pPersonalisation) {
            kVar.C2(new g2a.e((P2pPersonalisation) obj3));
        } else {
            hx7.e.h(new IllegalStateException("No click handler for listId " + listId + " and parcel " + obj3));
        }
        return Unit.f186387a;
    }
}
