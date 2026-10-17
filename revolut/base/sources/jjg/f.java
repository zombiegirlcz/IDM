package jjg;

import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.feature.trusted_merchants.impl.ui.kompot.details.TrustedMerchantDetailsContract$ModalStep;
import com.revolut.feature.trusted_merchants.impl.ui.kompot.details.TrustedMerchantDetailsController;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes9.dex */
public final class f extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TrustedMerchantDetailsController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(TrustedMerchantDetailsController trustedMerchantDetailsController, Continuation continuation) {
        super(2, continuation);
        this.v = trustedMerchantDetailsController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f fVar = new f(this.v, continuation);
        fVar.u = obj2;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((ActionsView.Item) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ActionsView.Item item = (ActionsView.Item) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        if (Intrinsics.f(item.f58316a, "ACTION_REMOVE_ID")) {
            com.revolut.feature.trusted_merchants.impl.ui.kompot.details.a aVar2 = (com.revolut.feature.trusted_merchants.impl.ui.kompot.details.a) ((a) this.v.Q.getValue());
            oki.h.v2(aVar2.f94426q, new TrustedMerchantDetailsContract$ModalStep.RemoveConfirmation(((b) ((j2) aVar2.f94425p.f22677a).getValue()).f174942a), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        }
        return Unit.f186387a;
    }
}
