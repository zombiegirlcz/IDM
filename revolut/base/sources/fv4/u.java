package fv4;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.IconNavBarMenuItem;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.core.R$string;
import com.youTransactor.uCube.rpc.Constants;
import ft4.w;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class u implements cli.n {

    @NotNull
    public static final t Companion = new t();

    public final p a(wi0.b countryCode) {
        TextLocalisedClause textLocalisedClause = null;
        List listC = zhm.u.c(new IconNavBarMenuItem("id_credit_card_statement_details_menu_item_download", new ResourceImage(R$drawable.uikit_icn_24_download, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), new TextLocalisedClause(R$string.credit_card_statement_details_title, null, null, 14), null, Constants.TAG_FULL_SVPP_IDENTIFICATION));
        if (countryCode != null) {
            Intrinsics.checkNotNullParameter(countryCode, "countryCode");
            wi0.b.Companion.getClass();
            textLocalisedClause = countryCode.equals(wi0.b.l2) ? new TextLocalisedClause(R$string.credit_card_statement_details_title_nz, null, null, 14) : new TextLocalisedClause(R$string.credit_card_statement_details_title, null, null, 14);
        }
        return new p(textLocalisedClause, listC);
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        f domainState = (f) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (q) iii.c.f(domainState.f138327c, new w(this, 26), new fb.c(this, domainState, 5), new f0e.i(this, domainState, 25));
    }
}
