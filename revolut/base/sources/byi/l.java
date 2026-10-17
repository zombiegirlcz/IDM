package byi;

import bw4.t;
import cli.n;
import cli.o;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.IconNavBarMenuItem;
import com.revolut.core.ui_kit_core.displayers.image.models.CdnImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.retail.feature.airportlounges.impl.R$string;
import com.youTransactor.uCube.rpc.Constants;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.f0;
import zhm.u;

/* JADX INFO: loaded from: classes10.dex */
public final class l implements n {

    @NotNull
    public static final k Companion = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c90.c f19839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dyi.c f19840b;

    public l(c90.c uiResources, dyi.c qrCodeImageMapper, dyi.a detailsMapper) {
        Intrinsics.checkNotNullParameter(uiResources, "uiResources");
        Intrinsics.checkNotNullParameter(qrCodeImageMapper, "qrCodeImageMapper");
        Intrinsics.checkNotNullParameter(detailsMapper, "detailsMapper");
        this.f19839a = uiResources;
        this.f19840b = qrCodeImageMapper;
    }

    public final CdnImage a() {
        return CdnImage.a(this.f19839a.d() ? czi.a.f110261c : czi.a.f110260b, new ImageTransformations(null, null, null, null, null, 220, null, 95));
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new g((domainState.f19827c.getContent() == null || domainState.f.getContent() == null) ? f0.f322471a : u.c(new IconNavBarMenuItem("ID_MENU_ITEM_SETTINGS", new ResourceImage(R$drawable.uikit_icn_24_settings, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), new TextLocalisedClause(R$string.airport_lounges_pass_details_get_help, null, null, 14), null, Constants.TAG_FULL_SVPP_IDENTIFICATION)), (List) iii.c.f(t1.u(domainState.f19827c, domainState.d, domainState.f19825a), new bq7.j(this, 28), new t(18), new b88.o(this, 26)));
    }
}
