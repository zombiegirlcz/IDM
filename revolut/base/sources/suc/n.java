package suc;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImageTint;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.security_hub.api.R$string;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
public final class n implements cli.n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        int i;
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.security_hub_linked_wallet_details_dont_recognize_dialog_freeze_title, null, null, 14);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.security_hub_linked_wallet_details_dont_recognize_dialog_freeze_subtitle, null, null, 14);
        List listK = v.k(new RowDelegate.Model("FREEZE_CARD_BUTTON_ID", new RowDelegate.Model.MainImage.Image40(new GlyphImage(R$drawable.uikit_icn_24_snowflake, null, null, 6), null, null, false, null, false, 62), textLocalisedClause, null, 0, textLocalisedClause2, null, null, 0, null, false, null, false, null, null, null, null, null, null, h.f265708a, null, 0, 0, 0, 0, 532676568), new RowDelegate.Model("TERMINATE_CARD_BUTTON_ID", new RowDelegate.Model.MainImage.Image40(new GlyphImage(R$drawable.uikit_icn_24_trash, GlyphImageTint.DANGER.f59929a, null, 4), null, null, false, null, false, 62), new TextLocalisedClause(R$string.security_hub_linked_wallet_details_dont_recognize_dialog_terminate_title, null, new Custom(Integer.valueOf(R$attr.uikit_colorStatusDanger), false, null, false, null, 254), 10), null, 0, new TextLocalisedClause(R$string.security_hub_linked_wallet_details_dont_recognize_dialog_terminate_subtitle, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, i.f265709a, null, 0, 0, 0, 0, 532676568));
        yp0.b.k(listK, 0, R$attr.uikit_dp24, 0, 0, 29);
        int i2 = o.f265716a[domainState.f265705a.ordinal()];
        if (i2 == 1) {
            i = R$string.security_hub_card_connections_details_merchant_dont_recognize_dialog_title;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = R$string.security_hub_linked_wallet_details_dont_recognize_dialog_title;
        }
        return new cii.b(null, listK, new lw0.a(new TextLocalisedClause(i, null, null, 14), new TextLocalisedClause(R$string.security_hub_linked_wallet_details_dont_recognize_dialog_subtitle, null, null, 14), null, null, false, 28));
    }
}
