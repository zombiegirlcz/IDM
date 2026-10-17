package lxi;

import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.avatar.AvatarModel;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.retail.feature.airportlounges.impl.R$string;
import kl.c0;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;

/* JADX INFO: loaded from: classes10.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c0 f200588a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f90.b f200589b;

    public j(c0 pricingPlanMapper, k walletStyleMapper, f90.b pluralFormatter) {
        Intrinsics.checkNotNullParameter(pricingPlanMapper, "pricingPlanMapper");
        Intrinsics.checkNotNullParameter(walletStyleMapper, "walletStyleMapper");
        Intrinsics.checkNotNullParameter(pluralFormatter, "pluralFormatter");
        this.f200588a = pricingPlanMapper;
        this.f200589b = pluralFormatter;
    }

    public static AvatarModel.Default a(int i) {
        return new AvatarModel.Default(LayeredImage.Companion.a(LayeredImage.INSTANCE, i, new Color.Solid(R$attr.uikit_colorWhite), new Color.ModifiedColor(new Color.Solid(R$attr.uikit_colorAccentNeutral), 0.1f), 6.0f, Float.valueOf(24.0f), 32), null, null, null, null, null, 126);
    }

    public static TextLocalisedClause b(Clause clause) {
        return clause != null ? new TextLocalisedClause(R$string.airport_lounges_home_wallet_your_plan_pass, u.c(clause), null, 12) : new TextLocalisedClause(R$string.airport_lounges_checkout_your_pass_title, null, null, 14);
    }
}
