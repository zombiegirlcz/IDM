package xv6;

import com.revolut.core.ui_kit.delegates.BannerDelegate;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.b;
import com.revolut.feature.freelancer.impl.R$string;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    @NotNull
    public static final C1714a Companion = new C1714a();

    /* JADX INFO: renamed from: xv6.a$a, reason: collision with other inner class name */
    public static final class C1714a {
        private C1714a() {
        }
    }

    public final BannerDelegate.Model a() {
        BannerDelegate.Model model = new BannerDelegate.Model("ITEM_ID_CARD_BANNER", new ComplexImage.Regular(b.c("3d010", null, null, null, 30)), new TextLocalisedClause(R$string.freelancer_processing_cards_banner_onboarding_title, null, null, 14), new TextLocalisedClause(R$string.freelancer_processing_cards_banner_onboarding_subtitle, null, null, 14), false, true, null, null, null, null, null, 65472);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return model;
    }
}
