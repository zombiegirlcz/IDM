package auj;

import aqd.h1;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.IconNavBarMenuItem;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.retail.feature.api.rewards_hub.R$string;
import com.youTransactor.uCube.rpc.Constants;
import ip0.z9;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.f0;
import zhm.u;

/* JADX INFO: loaded from: classes11.dex */
public final class q implements cli.n {

    @NotNull
    public static final p Companion = new p();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vtj.c f9859a;

    public q(vtj.c challengeMapper) {
        Intrinsics.checkNotNullParameter(challengeMapper, "challengeMapper");
        this.f9859a = challengeMapper;
    }

    public final ArrayList a(int i, int i2) {
        ArrayList arrayList = new ArrayList(i);
        for (int i3 = 0; i3 < i; i3++) {
            z9 z9Var = new z9(a0.d.n("CHALLENGE_SLOT_", i2 + i3));
            int i5 = R$attr.uikit_dp0;
            yp0.b.l(z9Var, i5, i5, i5, i5, null, false, 48);
            arrayList.add(z9Var);
        }
        return arrayList;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        g domainState = (g) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new k((List) iii.c.f(domainState.f9843b, new o(this, 0), new h1(18), new a15.n(this, domainState, 25)), (domainState.f9842a == d0j.m.PAST && domainState.d) ? u.c(new IconNavBarMenuItem("ARCHIVE_MENU_ITEM_ID", new ResourceImage(R$drawable.uikit_icn_24_archive, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), new TextLocalisedClause(R$string.rewards_hub_expired_challenges_title, null, null, 14), null, Constants.TAG_FULL_SVPP_IDENTIFICATION)) : f0.f322471a);
    }
}
