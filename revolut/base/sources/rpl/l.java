package rpl;

import au0.c2;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.IconNavBarMenuItem;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.sso.api.R$string;
import com.youTransactor.uCube.rpc.Constants;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes12.dex */
public final class l implements n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        c domainState = (c) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new g(u.c(new IconNavBarMenuItem("SHARE_MENU_ITEM", new ResourceImage(R$drawable.uikit_icn_24_share_android, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), new TextLocalisedClause(R$string.revolut_sso_revolut_id_screen_documents_action_share, null, null, 14), null, Constants.TAG_FULL_SVPP_IDENTIFICATION)), u.c(new c2(new UrlImage(domainState.f256420a, null, null, null, 0L, null, null, null, null, null, false, null, null, null, false, false, 524286), "DOCUMENT_IMAGE", false, true)));
    }
}
