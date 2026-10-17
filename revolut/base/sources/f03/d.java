package f03;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.cards_core.R$string;
import esa.i;
import h93.f0;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import l93.f;
import rp0.t;
import rp0.y;
import u03.j;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
public final class d extends a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final j60.a f130997l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final j f130998m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final f f130999n;

    public d(j60.a bottomDialogExtension, j itemProvider, f cardsInteractor) {
        Intrinsics.checkNotNullParameter(bottomDialogExtension, "bottomDialogExtension");
        Intrinsics.checkNotNullParameter(itemProvider, "itemProvider");
        Intrinsics.checkNotNullParameter(cardsInteractor, "cardsInteractor");
        this.f130997l = bottomDialogExtension;
        this.f130998m = itemProvider;
        this.f130999n = cardsInteractor;
    }

    @Override // f03.a
    public final void Z2(f0 card) {
        Intrinsics.checkNotNullParameter(card, "card");
        this.f130998m.getClass();
        Intrinsics.checkNotNullParameter(card, "card");
        t tVar = new t(new TextLocalisedClause(card.f150112c ? R$string.card_action_unblock_pin_cvv_virtual_prompt_title : R$string.card_action_unblock_pin_cvv_prompt_title, null, null, 14), null, null, 30);
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.card_action_unblock_pin_cvv_prompt_confirmation, null, null, 14);
        LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton = LargeActionButton.ButtonStyle.f58725a;
        int i = R$attr.uikit_dp16;
        LargeActionButtonDelegate.Model model = new LargeActionButtonDelegate.Model("RESET_PIN_TRIES_POSITIVE_BUTTON_ID", defaultFilledButton, null, textLocalisedClause, false, null, card, R$attr.uikit_dp24, R$attr.uikit_dp8, i, i, 368);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_cancel, null, null, 14);
        LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton2 = LargeActionButton.ButtonStyle.f58726b;
        int i2 = R$attr.uikit_dp16;
        this.f130997l.x(new y(v.k(model, new LargeActionButtonDelegate.Model("RESET_PIN_TRIES_NEGATIVE_BUTTON_ID", defaultFilledButton2, null, textLocalisedClause2, false, null, null, R$attr.uikit_dp8, R$attr.uikit_dp24, i2, i2, 496)), tVar, null, null, null, null, 1020));
    }

    @Override // f03.a
    public final Unit b3(f0 f0Var) {
        T2(new i(this, f0Var, null, 14), new yi5.b(27));
        return Unit.f186387a;
    }
}
