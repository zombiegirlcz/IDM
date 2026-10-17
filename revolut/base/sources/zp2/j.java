package zp2;

import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.bank_account_switching.api.R$plurals;
import com.revolut.feature.bank_account_switching.api.R$string;
import ip0.ak0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
public final class j implements n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        List listK = v.k(new RowDelegate.Model("ID_DESCRIPTION_1", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_warning, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorStatusWarning), (List) null, (ImageTransformations) null, (Clause) null, 246), false, false, 6), new TextLocalisedClause(R$string.account_switch_request_review_out_obligated_products_description1_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.account_switch_request_review_out_obligated_products_description1_subtitle, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824), new RowDelegate.Model("ID_DESCRIPTION_2", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_check, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, false, 6), new TextLocalisedQuantityClause(R$plurals.account_switch_request_review_out_obligated_products_description2_title, Integer.valueOf(domainState.f324163a.f64070c.size()), u.c(d0.k0(domainState.f324163a.f64070c, ", ", null, null, 0, null, 62)), (Style) null, 24), null, 0, new TextLocalisedClause(R$string.account_switch_request_review_out_obligated_products_description2_subtitle, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824));
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        return new h(d0.F0(new TextDelegate.Model("ID_DISCLAIMER", new TextLocalisedClause(R$string.account_switch_request_review_out_obligated_products_disclaimer, null, null, 14), false, new ak0(null, null, 3), null, null, 0, 0, 0, 0, 2036), listK));
    }
}
