package vec;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.revolutpay.shipping.shared.ui.shipping_contact_options.ShippingContactOptionsScreen;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes6.dex */
public final class f extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ ShippingContactOptionsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(ShippingContactOptionsScreen shippingContactOptionsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = shippingContactOptionsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f fVar = new f(this.v, continuation);
        fVar.u = obj2;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        h hVar = (h) this.v.N.getValue();
        String listId = model.f53228a;
        hVar.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        if (Intrinsics.f(listId, "EDIT_SHIPPING_CONTACT_OPTION_LIST_ID")) {
            hVar.C2(b.f288260a);
        } else if (Intrinsics.f(listId, "DELETE_SHIPPING_CONTACT_OPTION_LIST_ID")) {
            hVar.C2(a.f288259a);
        }
        return Unit.f186387a;
    }
}
