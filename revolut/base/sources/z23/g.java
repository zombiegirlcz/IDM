package z23;

import aw0.h;
import aw0.n6;
import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.cards_core.R$string;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import z23.d;
import zhm.f0;

/* JADX INFO: loaded from: classes21.dex */
public final class g implements n {
    @Override // cli.n
    public final o c(j jVar) {
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        if (domainState instanceof d.c) {
            return new cii.b(new h(false, new n6(new TextLocalisedClause(R$string.card_personalisation_create_start_over_button_text, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), new n6(new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_cancel, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 1020), null, null, null, 121), f0.f322471a, new lw0.a(new TextLocalisedClause(R$string.card_personalisation_create_start_over_title, null, null, 14), new TextLocalisedClause(R$string.card_personalisation_create_start_over_description, null, null, 14), null, null, false, 28));
        }
        if (domainState instanceof d.a) {
            return new cii.b(new h(false, new n6(new TextLocalisedClause(R$string.card_personalisation_create_go_back_button_text, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), new n6(new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_cancel, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 1020), null, null, null, 121), f0.f322471a, new lw0.a(new TextLocalisedClause(R$string.card_personalisation_create_go_back_title, null, null, 14), new TextLocalisedClause(R$string.card_personalisation_create_go_back_description, null, null, 14), null, null, false, 28));
        }
        if (!(domainState instanceof d.b)) {
            throw new NoWhenBranchMatchedException();
        }
        return new cii.b(new h(false, new n6(new TextLocalisedClause(R$string.card_personalisation_create_skip_button_text, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), new n6(new TextLocalisedClause(R$string.card_personalisation_create_skip_go_back, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 1020), null, null, null, 121), f0.f322471a, new lw0.a(new TextLocalisedClause(R$string.card_personalisation_create_skip_title, null, null, 14), new TextLocalisedClause(R$string.card_personalisation_create_skip_description, null, null, 14), new lw0.c(new GlyphImage(R$drawable.uikit_icn_24_exclamation_triangle, null, null, 6)), null, false, 24));
    }
}
