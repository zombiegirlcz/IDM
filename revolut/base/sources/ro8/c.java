package ro8;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.feature.junior_settings.impl.ui_kompot.phone_removal_confirmation.PhoneRemovalConfirmationController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ PhoneRemovalConfirmationController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(PhoneRemovalConfirmationController phoneRemovalConfirmationController, Continuation continuation) {
        super(2, continuation);
        this.v = phoneRemovalConfirmationController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((LargeActionButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        LargeActionButtonDelegate.Model model = (LargeActionButtonDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        j jVar = (j) this.v.O.getValue();
        String itemId = model.f52613a;
        jVar.getClass();
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        if (Intrinsics.f(itemId, "CONFIRM_ACTION")) {
            jVar.l2(new rbh.k(jVar, null, 13), new yi5.b(26));
        } else if (Intrinsics.f(itemId, "ID_CANCEL_ACTION")) {
            jVar.B2();
        }
        return Unit.f186387a;
    }
}
