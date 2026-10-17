package fn6;

import aw0.e;
import aw0.n6;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.external_accounts.impl.R$plurals;
import com.revolut.feature.external_accounts.impl.R$string;
import kotlin.jvm.internal.Intrinsics;
import le6.c;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements c {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public final dii.a a(String institutionName, AnalyticsProduct analyticsProduct) {
        Intrinsics.checkNotNullParameter(institutionName, "institutionName");
        Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
        return new dii.a(new lw0.a(new TextLocalisedClause(R$string.external_institutions_bank_already_linked_error_title, null, null, 14), new TextLocalisedClause(R$string.external_institutions_bank_already_linked_error_description, u.c(institutionName), null, 12), new lw0.b(LayeredImage.Companion.b(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_time, Integer.valueOf(R$attr.uikit_colorAccent), R$attr.uikit_colorAccent_10, 12.0f, Float.valueOf(40.0f), null, 32), null), null, false, 24), new e(false, null, null, new n6(new TextLocalisedClause(R$string.external_institutions_action_okay, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55), analyticsProduct, null, null, 24);
    }

    public final dii.a b(int i, AnalyticsProduct analyticsProduct) {
        Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
        return new dii.a(new lw0.a(new TextLocalisedQuantityClause(R$plurals.external_institutions_account_number_limit_error_title, Integer.valueOf(i), u.c(Integer.valueOf(i)), (Style) null, 24), new TextLocalisedClause(R$string.external_institutions_account_number_limit_error_description, null, null, 14), null, null, false, 28), new e(false, null, null, new n6(new TextLocalisedClause(R$string.external_institutions_account_number_limit_error_button, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55), analyticsProduct, null, null, 24);
    }

    public final dii.a c(AnalyticsProduct analyticsProduct) {
        Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
        return new dii.a(new lw0.a(new TextLocalisedClause(R$string.external_institutions_bank_offline_error_title, null, null, 14), new TextLocalisedClause(R$string.external_institutions_bank_offline_error_description, null, null, 14), new lw0.b(LayeredImage.Companion.b(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_exclamation_triangle, Integer.valueOf(R$attr.uikit_colorAccent), R$attr.uikit_colorAccent_10, 12.0f, Float.valueOf(40.0f), null, 32), null), null, false, 24), new e(false, null, null, new n6(new TextLocalisedClause(R$string.external_institutions_bank_offline_error_button, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55), analyticsProduct, null, null, 24);
    }
}
