package v44;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.kj;
import com.revolut.core.ui_kit.delegates.lj;
import com.revolut.core.ui_kit.delegates.mj;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.IconNavBarMenuItem;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.application.plugins.api.models.config.DocumentViewerScreenConfig;
import com.revolut.feature.credit.core.R$string;
import com.youTransactor.uCube.rpc.Constants;
import dx4.t0;
import ip0.ak0;
import ip0.ap0;
import ip0.ck0;
import ip0.cp0;
import ip0.xo0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes22.dex */
public final class q implements cli.n {

    @NotNull
    public static final o Companion = new o();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mx4.r f285963a;

    public q(mx4.r checkboxItemContentItemMapper) {
        Intrinsics.checkNotNullParameter(checkboxItemContentItemMapper, "checkboxItemContentItemMapper");
        this.f285963a = checkboxItemContentItemMapper;
    }

    /* JADX WARN: Type inference failed for: r15v8, types: [java.lang.Object, java.util.Map] */
    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        TextDelegate.Model model;
        Integer numValueOf;
        boolean z;
        g domainState = (g) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        DocumentViewerScreenConfig documentViewerScreenConfig = domainState.d;
        boolean z3 = domainState.e;
        List list = domainState.f285946h;
        f fVar = domainState.f285944c;
        aim.e eVarB = u.b();
        l lVar = domainState.i;
        DocumentViewerScreenConfig documentViewerScreenConfig2 = domainState.d;
        IconNavBarMenuItem iconNavBarMenuItemA = null;
        if (lVar != null) {
            String str = domainState.f;
            kj kjVar = new kj("id_web_view", documentViewerScreenConfig2.f66359b ? str != null ? new lj(str, "UTF-8") : new mj(fVar.f285940a, lVar.f285956a) : str != null ? new lj(str, "UTF-8") : new mj(fVar.f285940a, null), new cp0(true, lVar.f285957b, domainState.f285947j ? xo0.MATCH_PARENT : xo0.WRAP_CONTENT, ap0.DEFAULT, 28), Constants.TAG_FULL_SVPP_IDENTIFICATION);
            int i = p.f285962a[documentViewerScreenConfig2.f.ordinal()];
            if (i == 1) {
                yp0.b.l(kjVar, 0, R$attr.uikit_dp0, 0, 0, null, false, 61);
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                int i2 = R$attr.uikit_dp0;
                yp0.b.p(kjVar, i2, i2, i2, i2);
            }
            eVarB.add(kjVar);
            List list2 = list;
            ArrayList arrayList = new ArrayList(w.t(list2, 10));
            Iterator it8 = list2.iterator();
            while (it8.hasNext()) {
                arrayList.add(mx4.r.a(this.f285963a, (t0) it8.next(), null, R$attr.uikit_dp16, R$attr.uikit_dp0, 2));
            }
            eVarB.addAll(w.u(arrayList));
            Clause clause = domainState.f285945g;
            if (clause != null) {
                TextDelegate.Model model2 = new TextDelegate.Model("id_anchor_item_id", clause, false, new ak0(null, null, 3), null, null, 0, 0, 0, 0, 2036);
                yp0.b.r(model2, R$attr.uikit_dp16, 0, 0, 0, 14);
                model = model2;
            } else {
                m70.a.c(kotlin.jvm.internal.t0.f186434a);
                model = new TextDelegate.Model("id_anchor_item_id", new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), false, new ck0(0), null, null, 0, 0, 0, 0, 2036);
                yp0.b.r(model, R$attr.uikit_dp16, 0, 0, 0, 14);
            }
            eVarB.add(model);
        }
        aim.e eVarA = u.a(eVarB);
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.agreements_document_viewer_title, u.c(domainState.f285942a), null, 12);
        Clause clause2 = documentViewerScreenConfig.e;
        int i3 = p.f285962a[documentViewerScreenConfig.f.ordinal()];
        if (i3 == 1) {
            numValueOf = null;
        } else {
            if (i3 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            numValueOf = Integer.valueOf(R$attr.uikit_colorBackground);
        }
        boolean z4 = documentViewerScreenConfig.f66360c == ju3.b.QUICK_READ_ACTION_SUPPORT;
        if (documentViewerScreenConfig.f66358a && fVar.f285941b != null) {
            iconNavBarMenuItemA = IconNavBarMenuItem.Companion.a(IconNavBarMenuItem.INSTANCE, "ID_DOWNLOAD_ACTION", new ResourceImage(R$drawable.uikit_icn_24_download, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, 124);
        }
        List listL = v.l(iconNavBarMenuItemA);
        boolean z6 = documentViewerScreenConfig.e != null;
        boolean z11 = !z3;
        List<t0> list3 = list;
        if ((list3 instanceof Collection) && list3.isEmpty()) {
            z = false;
        } else {
            for (t0 t0Var : list3) {
                if (t0Var.f120772c && !t0Var.d) {
                    z = true;
                    break;
                }
            }
            z = false;
        }
        return new k(eVarA, textLocalisedClause, clause2, z4, listL, numValueOf, z6, z3 && !z, z11);
    }
}
