package y63;

import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.card_screen.api.CardScreenApi$Toggles;
import com.revolut.feature.card_screen.common.R$string;
import h93.e0;
import h93.f0;
import h93.r0;
import h93.s0;
import h93.t0;
import h93.u0;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wp5.y;

/* JADX INFO: loaded from: classes21.dex */
public final class s {

    @NotNull
    public static final r Companion = new r();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f311140a;

    public s(gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f311140a = featureToggleInteractor;
    }

    public final List a(f0 card) {
        Intrinsics.checkNotNullParameter(card, "card");
        if (!((jte.d) this.f311140a).c(CardScreenApi$Toggles.EmptyXPayBanner.f65322c) || !card.b0()) {
            return zhm.f0.f322471a;
        }
        u0 u0Var = (u0) card.P.get(e0.ANDROID_PAY);
        if (u0Var == null || u0Var.f150162a) {
            return zhm.f0.f322471a;
        }
        t0 t0Var = u0Var.f150163b;
        if (!(t0Var instanceof r0)) {
            if (Intrinsics.f(t0Var, s0.f150161a) || t0Var == null) {
                return zhm.f0.f322471a;
            }
            throw new NoWhenBranchMatchedException();
        }
        int i = ((r0) t0Var).f150160a;
        RowDelegate.Model model = new RowDelegate.Model("ID_BELOW_MIN_AGE_BANNER", new RowDelegate.Model.MainImage.Image40(y.h(new Color.Solid(R$attr.uikit_colorAccentNeutral), 0.1f, LayeredImage.INSTANCE, R$drawable.uikit_icn_24_info_outline, new Color.Solid(R$attr.uikit_colorForeground)), null, null, false, null, false, 62), new TextLocalisedClause(R$string.card_screen_google_pay_unavailable_title, zhm.u.c(Integer.valueOf(i)), null, 12), null, 0, new TextLocalisedClause(R$string.card_screen_google_pay_unavailable_subtitle, zhm.u.c(Integer.valueOf(i)), null, 12), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return zhm.u.c(model);
    }
}
