package x57;

import com.revolut.core.ui_kit.delegates.widgets.AvatarWidgetDelegate;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.freelancer.impl.R$string;
import com.revolut.feature.freelancer_widgets.api.model.FreelancerWidgetClickData;
import ct6.w;
import ft6.n;
import kotlin.jvm.internal.Intrinsics;
import op0.q;
import org.jetbrains.annotations.NotNull;
import pcd.l0;
import pcd.s;

/* JADX INFO: loaded from: classes3.dex */
public final class g {

    @NotNull
    public static final e Companion = new e();

    public g(w freelancerClauseFactory, n freelancerPocketMapper) {
        Intrinsics.checkNotNullParameter(freelancerClauseFactory, "freelancerClauseFactory");
        Intrinsics.checkNotNullParameter(freelancerPocketMapper, "freelancerPocketMapper");
    }

    public static MoneyClause a(s sVar) {
        return new MoneyClause(new dj0.d(sVar.f234885h.f234861c, kii.e.u(sVar, xi0.b.Companion)), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12);
    }

    public static FreelancerWidgetClickData.Pockets c(s sVar) {
        l0 l0Var = sVar.e;
        String str = sVar.f234881a;
        int i = f.f302917a[l0Var.ordinal()];
        if (i == 1) {
            return new FreelancerWidgetClickData.Pockets.RegularPocket(str);
        }
        if (i != 2) {
            return null;
        }
        return new FreelancerWidgetClickData.Pockets.TaxPocket(str);
    }

    public final AvatarWidgetDelegate.Model b(String str, q qVar) {
        return AvatarWidgetDelegate.Model.E(new AvatarWidgetDelegate.Model(str, LayeredImage.Companion.b(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_plus, Integer.valueOf(R$attr.uikit_colorAccentNeutral), R$attr.uikit_colorAccentNeutral_10, 8.0f, null, null, 48), null, new TextLocalisedClause(R$string.freelancer_widget_pockets_action_new_pro_pocket, null, new Custom(Integer.valueOf(R$attr.uikit_colorAccentNeutral), false, null, false, null, 254), 10), null, null, null, null, null, FreelancerWidgetClickData.Pockets.NewPocket.f74450a, null, 12272), qVar);
    }
}
