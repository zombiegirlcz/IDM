package h7k;

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
import nii.h0;
import nii.j0;
import nii.u1;
import nii.y0;
import pfm.r;
import yhm.o;
import zhm.u;

/* JADX INFO: loaded from: classes11.dex */
public final class g extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ i v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ TransferLinkDetails.Active f149913w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(i iVar, TransferLinkDetails.Active active, Continuation continuation) {
        super(1, continuation);
        this.v = iVar;
        this.f149913w = active;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new g(this.v, this.f149913w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((g) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        TransferLinkDetails.Active transferLinkDetails = this.f149913w;
        i iVar = this.v;
        if (i == 0) {
            o.b(obj2);
            r rVarI = ((k61.i) iVar.f149916m).i(transferLinkDetails.f60354b);
            this.u = 1;
            if (nim.a.a(rVarI, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        iVar.f149917n.getClass();
        Intrinsics.checkNotNullParameter(transferLinkDetails, "transferLinkDetails");
        return iVar.L2(new y0(null, new j0((Clause) new TextLocalisedClause(R$string.payments_payment_links_action_decline_success_title, null, null, 14), (Clause) new TextLocalisedClause(R$string.payments_payment_links_action_decline_success_description, u.c(j7k.a.b(transferLinkDetails)), null, 12), (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4092), false, 5));
    }
}
