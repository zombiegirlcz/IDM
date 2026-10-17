package fmf;

import cmf.g;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.IconNavBarMenuItem;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.transactions.impl.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class q0 implements cli.n {

    @NotNull
    public static final p0 Companion = new p0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vlf.b f136409a;

    public q0(vlf.b commonUiMapper) {
        Intrinsics.checkNotNullParameter(commonUiMapper, "commonUiMapper");
        this.f136409a = commonUiMapper;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        List listE0;
        List list;
        e0 domainState = (e0) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        cmf.g gVarA = domainState.f136388b;
        IconNavBarMenuItem iconNavBarMenuItem = null;
        if (gVarA == null) {
            gVarA = g.b.f25230a;
        } else if (gVarA instanceof cmf.h) {
            cmf.h hVar = (cmf.h) gVarA;
            Clause clause = hVar.f25232b;
            gVarA = cmf.h.a(hVar, null, clause != null ? new TextLocalisedClause(R$string.transaction_details_screen, zhm.u.c(clause), null, 12) : null, null, null, null, false, false, null, null, null, 2045);
        }
        List list2 = domainState.f136389c;
        if (list2 == null || (list = (List) ue0.e.M(list2)) == null) {
            this.f136409a.getClass();
            listE0 = zhm.d0.E0(vlf.b.g(2, "DEFAULT"), vlf.b.g(2, "DEFAULT"));
        } else {
            listE0 = list;
        }
        List list3 = domainState.d;
        if (list3 == null) {
            list3 = zhm.f0.f322471a;
        }
        IconNavBarMenuItem iconNavBarMenuItemA = IconNavBarMenuItem.Companion.a(IconNavBarMenuItem.INSTANCE, j6.a.q("ID_THREE_DOTS_MENU_", domainState.f136387a.a()), new ResourceImage(R$drawable.uikit_icn_24_more_dots, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, 124);
        List list4 = domainState.e;
        if (list4 != null && !list4.isEmpty()) {
            iconNavBarMenuItem = iconNavBarMenuItemA;
        }
        return new g0(listE0, gVarA, list3, iconNavBarMenuItem);
    }
}
