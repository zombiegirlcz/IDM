package bq2;

import cli.j;
import cli.k;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.bank_account_switching.api.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
public final class f implements n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final o c(j jVar) {
        k domainState = (k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        RowDelegate.Model model = new RowDelegate.Model("ID_FULL_SWITCH", new RowDelegate.Model.MainImage.Image40(new GlyphImage(R$drawable.uikit_icn_24_bank, null, null, 6), null, null, false, null, false, 60), new TextLocalisedClause(R$string.account_switch_switch_preference_elcimai_full_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.account_switch_switch_preference_elcimai_full_description, null, null, 14), null, null, 0, new tf(new yy0.j(new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254))), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536869848);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        RowDelegate.Model model2 = new RowDelegate.Model("ID_PARTIAL_SWITCH", new RowDelegate.Model.MainImage.Image40(new GlyphImage(R$drawable.uikit_icn_24_arrow_shuffle, null, null, 6), null, null, false, null, false, 60), new TextLocalisedClause(R$string.account_switch_switch_preference_elcimai_partial_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.account_switch_switch_preference_elcimai_partial_description, null, null, 14), null, null, 0, new tf(new yy0.j(new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254))), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536869848);
        yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
        return new d(v.k(model, model2));
    }
}
