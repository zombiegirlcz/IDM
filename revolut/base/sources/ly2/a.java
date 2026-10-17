package ly2;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.cards_core.R$string;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import rp0.t;
import rp0.y;
import zhm.f0;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
public final class a implements jy2.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f200630a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m93.d f200631b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final im.c f200632c;

    public a(gte.a featureToggleInteractor, m93.d cardThumbnailImageProvider) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(cardThumbnailImageProvider, "cardThumbnailImageProvider");
        this.f200630a = featureToggleInteractor;
        this.f200631b = cardThumbnailImageProvider;
        HashMap map = im.c.f162274c;
        this.f200632c = v13.d.l("[0000] [0000] [0000] [0000]", f0.f322471a);
    }

    public final y a() {
        t tVar = new t(new TextLocalisedClause(R$string.card_link_warning_redesign_title, null, null, 14), new TextLocalisedClause(R$string.card_link_warning_redesign_subtitle, null, null, 14), null, 28);
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.card_link_warning_confirm, null, null, 14);
        LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton = LargeActionButton.ButtonStyle.f58726b;
        int i = R$attr.uikit_dp24;
        int i2 = R$attr.uikit_dp16;
        LargeActionButtonDelegate.Model model = new LargeActionButtonDelegate.Model("LINK_CARD_DIALOG_BUTTON_YES_LIST_ID", defaultFilledButton, null, textLocalisedClause, false, null, null, i, R$attr.uikit_dp8, i2, i2, 496);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.card_link_warning_redesign_cancel, null, null, 14);
        int i3 = R$attr.uikit_dp8;
        int i5 = R$attr.uikit_dp16;
        return new y(v.k(model, new LargeActionButtonDelegate.Model("LINK_CARD_DIALOG_BUTTON_CANCEL_LIST_ID", defaultFilledButton, null, textLocalisedClause2, false, null, null, i3, R$attr.uikit_dp24, i5, i5, 496)), tVar, null, null, null, null, "LINK_CARD_DELEGATES_KEY", null, null, null, 3836);
    }
}
