package pjg;

import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.CircleTransformation;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.cards_core.R$string;
import com.revolut.feature.trusted_merchants.api.model.TrustedMerchant;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jmrtd.cbeff.ISO781611;
import zhm.u;

/* JADX INFO: loaded from: classes9.dex */
public final class g implements b {

    @NotNull
    public static final f Companion = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final thf.c f236755a;

    public g(thf.c transactionCategoryResourcesMapper) {
        Intrinsics.checkNotNullParameter(transactionCategoryResourcesMapper, "transactionCategoryResourcesMapper");
        this.f236755a = transactionCategoryResourcesMapper;
    }

    public final List a(TrustedMerchant.Approved merchant) {
        Intrinsics.checkNotNullParameter(merchant, "merchant");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.trusted_merchants_added_on, null, null, 14);
        long millis = merchant.f94404a.toDateTime().getMillis();
        TimeClause.Format.INSTANCE.getClass();
        List listC = u.c(new CellDetailsDelegate.Model("ADDED_ON_ID", textLocalisedClause, new TimeClause(millis, TimeClause.Format.f57959a, null, null, 12), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552));
        yp0.b.k(listC, 0, 0, 0, 0, 31);
        return listC;
    }

    public final List b() {
        return u.c(new ActionsView.Item("ACTION_REMOVE_ID", null, true, new TextLocalisedClause(R$string.trusted_merchants_action_remove, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_delete, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, 1990));
    }

    public final Image c(TrustedMerchant.Approved merchant) {
        Intrinsics.checkNotNullParameter(merchant, "merchant");
        String str = merchant.e;
        if (str != null) {
            return new UrlImage(str, null, null, null, 0L, null, null, null, null, null, false, new ImageTransformations(null, new CircleTransformation((Float) null, (Integer) null, false, 15), null, null, null, null, null, ISO781611.SMT_TAG), null, null, false, false, 507902);
        }
        return ((wjf.e) this.f236755a).h(merchant.d);
    }
}
