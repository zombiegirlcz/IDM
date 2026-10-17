package kp7;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.delegates.xe;
import com.revolut.core.ui_kit.delegates.ze;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.insurance_car.impl.R$string;
import ip0.m20;
import ip0.pb0;
import ip0.qi;
import ip0.yl;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import org.jetbrains.annotations.NotNull;
import zhm.f0;

/* JADX INFO: loaded from: classes4.dex */
public final class t implements jki.p {

    @NotNull
    public static final r Companion = new r();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sf0.h f188197a;

    public t(sf0.h serverErrorParser) {
        Intrinsics.checkNotNullParameter(serverErrorParser, "serverErrorParser");
        this.f188197a = serverErrorParser;
    }

    public static RowDelegate.Model b(int i, TextLocalisedClause textLocalisedClause, String str) {
        return new RowDelegate.Model(str, xl7.n.i(i, Integer.valueOf(R$attr.uikit_colorForeground)), textLocalisedClause, null, 0, new TextLocalisedClause(R$string.car_insurance_plan_selection_not_available, null, null, 14), null, null, 0, null, false, null, false, RowDelegate.Model.b.a.f53266a, null, null, null, null, null, null, null, 0, 0, 0, 0, 536854488);
    }

    public static o c(boolean z) {
        aim.e eVarB = zhm.u.b();
        eVarB.add(new qi("TAB_LOADING", 2));
        m20 m20Var = new m20("BIG_TILE_LOADING");
        yp0.b.l(m20Var, 0, 0, 0, 0, null, false, 63);
        eVarB.add(m20Var);
        List listK = zhm.v.k(new pb0("ROW_LOADING_0"), new pb0("ROW_LOADING_1"));
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        eVarB.addAll(listK);
        List listK2 = zhm.v.k(new yl("HEADER_LOADING", 0, 30), new pb0("ROW_LOADING_2"), new pb0("ROW_LOADING_3"), new pb0("ROW_LOADING_4"));
        yp0.b.k(listK2, 0, 0, 0, 0, 31);
        eVarB.addAll(listK2);
        aim.e eVarA = zhm.u.a(eVarB);
        f0 f0Var = f0.f322471a;
        t0 t0Var = t0.f186434a;
        m70.a.c(t0Var);
        TextClause textClause = new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        Intrinsics.checkNotNullParameter(t0Var, "<this>");
        return new o(eVarA, f(z), f0Var, null, textClause, null, false, false, new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
    }

    public static RowDelegate.Model d(int i, Clause clause, TextLocalisedClause textLocalisedClause, String str, boolean z) {
        return new RowDelegate.Model(str, xl7.n.i(i, Integer.valueOf(R$attr.uikit_colorForeground)), textLocalisedClause, null, 0, clause, null, null, 0, 0, z ? new tf(6, new ResourceImage(R$drawable.uikit_icn_24_check, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), false) : null, false, z ? ze.f55694a : xe.f55602a, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, 0, 0, null, -5160, 15);
    }

    public static MoneyClause e(dj0.d dVar, boolean z, Custom custom) {
        return z ? MoneyClause.b(new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, null, custom, null, 11) : MoneyClause.b(new MoneyClause(pyd.c.U(dVar, 12L), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, null, custom, null, 11);
    }

    public static CompositeClause f(boolean z) {
        if (z) {
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.car_insurance_plan_selection_subtitle, null, null, 14);
            int i = R$drawable.uikit_icn_24_pencil;
            int i2 = R$attr.uikit_colorAccent;
            m70.a.t(t0.f186434a);
            return xl7.n.m(textLocalisedClause, i, i2, new Click(30, (Integer) null, (Object) null, "EDIT_APPLICATION_BUTTON_ID", false), new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
        }
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.car_insurance_plan_selection_subtitle_view_application, null, null, 14);
        int i3 = R$drawable.uikit_icn_24_search;
        int i5 = R$attr.uikit_colorAccent;
        m70.a.t(t0.f186434a);
        return xl7.n.m(textLocalisedClause2, i3, i5, new Click(30, (Integer) null, (Object) null, "EDIT_APPLICATION_BUTTON_ID", false), new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
    }

    public static o g(List list, boolean z) {
        f0 f0Var = f0.f322471a;
        m70.a.c(t0.f186434a);
        return new o(list, f(z), f0Var, null, new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, false, false, new TextLocalisedClause(R$string.car_insurance_plan_detail_header_further_actions_title, null, null, 14));
    }

    @Override // jki.p
    public final jki.m a(jki.i iVar) {
        j domainState = (j) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (o) iii.c.f(domainState.f188177a, new kog.k(this, domainState), new kp0.m(this, domainState, 1), new kcg.j(this, domainState, 10));
    }
}
