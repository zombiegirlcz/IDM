package rzh;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.feature.exchange.models.ExchangeOrder;
import com.revolut.feature_crypto_order_flow.api.R$string;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import com.revolut.revolut.feature_fourthline_impl.R;
import k7i.i;
import kotlin.jvm.internal.Intrinsics;
import nii.h0;
import nii.j0;
import nii.u1;
import nii.z;
import org.jetbrains.annotations.NotNull;
import sf0.h;

/* JADX INFO: loaded from: classes10.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f258680a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v60.e f258681b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f258682c;

    public b(h serverErrorParser, v60.e serverErrorsProvider, i firmPriceDevianceChecker) {
        Intrinsics.checkNotNullParameter(serverErrorParser, "serverErrorParser");
        Intrinsics.checkNotNullParameter(serverErrorsProvider, "serverErrorsProvider");
        Intrinsics.checkNotNullParameter(firmPriceDevianceChecker, "firmPriceDevianceChecker");
        this.f258680a = serverErrorParser;
        this.f258681b = serverErrorsProvider;
        this.f258682c = firmPriceDevianceChecker;
    }

    public static z a(TextLocalisedClause textLocalisedClause) {
        return new z(textLocalisedClause, null, null, new TextLocalisedClause(R.string.common_action_retry, null, null, 14), null, null, false, null, null, null, null, null, null, 32734);
    }

    public final j0 b(ExchangeOrder.Active order) {
        Intrinsics.checkNotNullParameter(order, "order");
        return new j0((Clause) new TextLocalisedClause(R$string.cryptobuysell_order_creation_success_title, null, null, 14), (Clause) null, (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4094);
    }
}
