package xyb;

import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.CdnImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.rev_points.api.R$string;
import com.youTransactor.uCube.rpc.Constants;
import ip0.qe0;
import ip0.we0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xo8.j0;

/* JADX INFO: loaded from: classes6.dex */
public final class j implements n {

    @NotNull
    public static final i Companion = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yik.h f309706a;

    public j(yik.h pricingPlanStringMapper, c90.c uiResources) {
        Intrinsics.checkNotNullParameter(pricingPlanStringMapper, "pricingPlanStringMapper");
        Intrinsics.checkNotNullParameter(uiResources, "uiResources");
        this.f309706a = pricingPlanStringMapper;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        TextLocalisedClause textLocalisedClause = (TextLocalisedClause) iii.c.f(domainState.f309699a, new xx9.f(11), new xx9.e(21), new j0(this, 12));
        we0 we0Var = new we0("IMAGE_ITEM_ID", new qe0(Constants.TAG_SUPPORTED_LOCALE_LIST, new CdnImage("rev_points_token_hero", "mobile/rev_points", null, null, null, null, Constants.TAG_OS_VERSION)));
        qv0.i[] elements = {(qv0.i) iii.c.f(domainState.f309700b, new xx9.f(12), new xx9.e(22), new x0b.h(19)), new RowDelegate.Model("CHALLENGES_ITEM_ID", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_present, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, false, 6), new TextLocalisedClause(R$string.rev_points_unlock_benefits_challenges, null, null, 14), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868856)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        yp0.b.k(listL, 0, 0, 0, 0, 31);
        return new f(textLocalisedClause, ue0.e.J(we0Var, listL));
    }
}
