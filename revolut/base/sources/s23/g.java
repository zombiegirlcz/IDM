package s23;

import aw0.h;
import aw0.n6;
import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.feature.cards_core.R$string;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes21.dex */
public final class g implements n {
    @Override // cli.n
    public final o c(j jVar) {
        e domainState = (e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new cii.b(new h(false, new n6(new TextLocalisedClause(R$string.card_confirm_different_address_dialog_confirm_button, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), new n6(new TextLocalisedClause(R$string.card_confirm_different_address_dialog_edit_button, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 1020), null, null, null, 121), f0.f322471a, new lw0.a(new TextLocalisedClause(R$string.card_confirm_different_address_dialog_title, null, null, 14), new TextLocalisedClause(R$string.card_confirm_different_address_dialog_subtitle, null, null, 14), null, null, false, 28));
    }
}
