package tpl;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.IconNavBarMenuItem;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.sso.api.R$string;
import com.youTransactor.uCube.rpc.Constants;
import ip0.t5;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class u implements cli.n {

    @NotNull
    public static final t Companion = new t();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Custom f273437b = new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wpl.j f273438a;

    public u(wpl.j identityDocumentItemsDataMapper) {
        Intrinsics.checkNotNullParameter(identityDocumentItemsDataMapper, "identityDocumentItemsDataMapper");
        this.f273438a = identityDocumentItemsDataMapper;
    }

    public static t5 a(Clause clause, Clause clause2, String str) {
        return new t5("BOTTOM_SHEET_ITEM_".concat(str), clause2, clause, null, Integer.valueOf(R$attr.uikit_colorGreyTone50_70), Integer.valueOf(R$drawable.uikit_icn_24_copy), 0, 0, 0, 0, 1944);
    }

    public static IconNavBarMenuItem b() {
        return new IconNavBarMenuItem("MENU_ITEM_HELP", new ResourceImage(R$drawable.uikit_icn_24_question_sign, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), new TextLocalisedClause(R$string.revolut_sso_revolut_id_screen_identity_documents_help_title, null, null, 14), null, Constants.TAG_FULL_SVPP_IDENTIFICATION);
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        j domainState = (j) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (n) iii.c.f(domainState.f273421a, new o(this, 1), new tp8.l(this, 3), new si5.c(this, domainState, 23));
    }
}
