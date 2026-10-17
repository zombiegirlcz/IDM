package ijj;

import android.os.Parcelable;
import aw0.m6;
import aw0.n6;
import aw0.o9;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController;
import com.revolut.retail.feature.esim.api.model.EsimSubscriptionCancellationConfirmation;
import com.revolut.retail.feature.esim.impl.R$string;
import grl.k9;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wnj.a f161828a;

    public u(wnj.a descriptorApplier) {
        Intrinsics.checkNotNullParameter(descriptorApplier, "descriptorApplier");
        this.f161828a = descriptorApplier;
    }

    public final ActionsBottomSheetController a(EsimSubscriptionCancellationConfirmation confirmation) {
        Intrinsics.checkNotNullParameter(confirmation, "confirmation");
        lw0.a aVar = new lw0.a(new TextLocalisedClause(R$string.esim_mobile_plans_cancellation_when_porting_underway_title_placeholder, zhm.u.c(new TextClause(confirmation.f100459a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), wnj.a.c(this.f161828a, confirmation.f100460b, null, 6), null, null, false, 28);
        m6 m6Var = n6.Companion;
        aw0.h hVar = new aw0.h(false, m6.c(m6Var, new TextLocalisedClause(R$string.esim_mobile_plans_cancellation_when_porting_underway_cta_primary_placeholder, zhm.u.c(new TextClause(confirmation.f100461c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, null, 1020), m6.c(m6Var, new TextLocalisedClause(R$string.esim_mobile_plans_cancellation_when_porting_underway_cta_secondary_placeholder, zhm.u.c(new TextClause(confirmation.d, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, null, 1020), null, null, null, 121);
        k9 k9Var = k9.ESim;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        return new ActionsBottomSheetController(new dii.a(aVar, hVar, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, null, 24));
    }
}
