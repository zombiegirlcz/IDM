package h83;

import aw0.m6;
import aw0.n6;
import cli.j;
import cli.k;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImageTint;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.card_screen.common.R$string;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes21.dex */
public final class f implements n {
    @Override // cli.n
    public final o c(j jVar) {
        k domainState = (k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        lw0.a aVar = new lw0.a(new TextLocalisedClause(R$string.card_already_replaced_bottom_sheet_title, null, null, 14), new TextLocalisedClause(R$string.card_already_replaced_bottom_sheet_subtitle, null, null, 14), new lw0.c(new GlyphImage(R$drawable.uikit_icn_24_check, GlyphImageTint.Custom.ConfirmationOfPayeeWarning.f59928a, null, 4)), null, false, 24);
        return new cii.b(new aw0.e(false, null, null, m6.c(n6.Companion, new TextLocalisedClause(R$string.card_already_replaced_bottom_sheet_button, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, null, 1020), null, null, 55), f0.f322471a, aVar);
    }
}
