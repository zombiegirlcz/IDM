package u7k;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.domain.models.moneyrequest.TransferLinkDetails;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import com.revolut.retail.feature.payments.payment_links.core.R$string;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nii.u1;
import nii.y0;

/* JADX INFO: loaded from: classes11.dex */
public final class z extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ com.revolut.retail.feature.payments.payment_links.impl.ui.details.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ TransferLinkDetails.Active f277975w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(com.revolut.retail.feature.payments.payment_links.impl.ui.details.b bVar, TransferLinkDetails.Active active, Continuation continuation) {
        super(1, continuation);
        this.v = bVar;
        this.f277975w = active;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new z(this.v, this.f277975w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((z) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object obj3 = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        TransferLinkDetails.Active transferLinkDetails = this.f277975w;
        com.revolut.retail.feature.payments.payment_links.impl.ui.details.b bVar = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            k kVar = bVar.f102191t;
            this.u = 1;
            Object objA = nim.a.a(k61.a.a(kVar.d, transferLinkDetails.f60354b), this);
            if (objA != obj3) {
                objA = Unit.f186387a;
            }
            if (objA == obj3) {
                return obj3;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        bVar.u.getClass();
        Intrinsics.checkNotNullParameter(transferLinkDetails, "transferLinkDetails");
        return yji.l.a1(bVar, bVar.X1(new y0("PAYMENT_LINK_DIALOG_ID", new nii.j0((Clause) new TextLocalisedClause(R$string.payments_payment_links_action_accept_success_title, zhm.v.k(j7k.a.a(transferLinkDetails), j7k.a.b(transferLinkDetails)), null, 12), (Clause) new TextLocalisedClause(R$string.payments_payment_links_action_accept_success_description, null, null, 14), (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (nii.h0) null, (ResourceImage) null, 4092), false, 4)), null, null, new y(bVar, null, 0), 3);
    }
}
