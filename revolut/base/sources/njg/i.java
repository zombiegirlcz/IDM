package njg;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.trusted_merchants.api.model.TrustedMerchant;
import com.revolut.feature.trusted_merchants.impl.ui.kompot.list.TrustedMerchantsListContract$ModalStep;
import com.revolut.feature.trusted_merchants.impl.ui.kompot.list.TrustedMerchantsListController;
import com.revolut.kompot.common.ModalDestination;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes9.dex */
public final class i extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TrustedMerchantsListController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(TrustedMerchantsListController trustedMerchantsListController, Continuation continuation) {
        super(2, continuation);
        this.v = trustedMerchantsListController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        i iVar = new i(this.v, continuation);
        iVar.u = obj2;
        return iVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((i) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        Object obj3 = model.u;
        TrustedMerchant merchant = obj3 instanceof TrustedMerchant ? (TrustedMerchant) obj3 : null;
        if (merchant != null) {
            com.revolut.feature.trusted_merchants.impl.ui.kompot.list.a aVar2 = (com.revolut.feature.trusted_merchants.impl.ui.kompot.list.a) ((a) this.v.T.getValue());
            aVar2.getClass();
            Intrinsics.checkNotNullParameter(merchant, "merchant");
            if (merchant instanceof TrustedMerchant.Approved) {
                aVar2.C2(new d((TrustedMerchant.Approved) merchant));
            } else if (merchant instanceof TrustedMerchant.ToReview) {
                oki.h.v2(aVar2.f94433q, new TrustedMerchantsListContract$ModalStep.ApproveConfirmation((TrustedMerchant.ToReview) merchant), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
            } else if (!(merchant instanceof TrustedMerchant.Reviewed)) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return Unit.f186387a;
    }
}
