package bt4;

import cli.k;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.core.R$string;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.v;

/* JADX INFO: loaded from: classes22.dex */
public final class j implements n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static RowDelegate.Model a(TextLocalisedClause textLocalisedClause, TextLocalisedClause textLocalisedClause2, GlyphImage glyphImage, String str) {
        return new RowDelegate.Model(str, new RowDelegate.Model.MainImage.Image40(glyphImage, null, null, false, null, false, 60), textLocalisedClause, null, 0, textLocalisedClause2, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870872);
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        k domainState = (k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        RowDelegate.Model modelA = a(new TextLocalisedClause(R$string.credit_card_instalment_repay_method_custom_amount_title, null, null, 14), new TextLocalisedClause(R$string.credit_card_instalment_repay_method_custom_amount_subtitle, null, null, 14), new GlyphImage(R$drawable.uikit_icn_24_coins, null, null, 6), "id_credit_card_instalment_repay_custom_amount");
        yp0.b.l(modelA, 0, 0, 0, 0, null, false, 63);
        RowDelegate.Model modelA2 = a(new TextLocalisedClause(R$string.credit_card_instalment_repay_method_future_instalments_title, null, null, 14), new TextLocalisedClause(R$string.credit_card_instalment_repay_method_future_instalments_subtitle, null, null, 14), new GlyphImage(R$drawable.uikit_icn_24_calendar_week, null, null, 6), "id_credit_card_instalment_repay_future_instalments");
        yp0.b.l(modelA2, 0, 0, 0, 0, null, false, 63);
        return new g(v.k(modelA, modelA2));
    }
}
