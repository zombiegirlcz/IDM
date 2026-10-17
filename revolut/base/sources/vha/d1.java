package vha;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.badge.CircleBadgeModel;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.pro.accounts.impl.R$string;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class d1 {

    @NotNull
    public static final z0 Companion = new z0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gr6.h f289359a;

    public d1(gr6.h freelancerCashbackInteractor) {
        Intrinsics.checkNotNullParameter(freelancerCashbackInteractor, "freelancerCashbackInteractor");
        this.f289359a = freelancerCashbackInteractor;
    }

    public static final RowDelegate.Model a() {
        return new RowDelegate.Model("LIST_ID_DISCOVER_ACCEPT_PAYMENTS", new RowDelegate.Model.MainImage.Image56((Image) LayeredImage.INSTANCE.k(R$drawable.uikit_icn_24_card_terminal, R$attr.uikit_colorAccentNeutral, R$attr.uikit_colorAccentNeutral_10), (CircleBadgeModel) null, false, 12), new TextLocalisedClause(R$string.freelancer_home_discover_cells_accept_payments_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.freelancer_home_discover_cells_accept_payments_subtitle, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824);
    }

    public static final RowDelegate.Model b() {
        return new RowDelegate.Model("LIST_ID_DISCOVER_AUTOMATE_TAXES", new RowDelegate.Model.MainImage.Image56((Image) LayeredImage.INSTANCE.k(R$drawable.uikit_icn_24_calendar_recurring, R$attr.uikit_colorAccentNeutral, R$attr.uikit_colorAccentNeutral_10), (CircleBadgeModel) null, false, 12), new TextLocalisedClause(R$string.freelancer_home_discover_cells_automate_taxes_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.freelancer_home_discover_cells_automate_taxes_subtitle, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824);
    }
}
