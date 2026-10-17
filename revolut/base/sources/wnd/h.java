package wnd;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.DotDividerClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.spending_analytics.api.AnalyticsFeatureApi$Toggles;
import com.revolut.feature.spending_analytics.api.R$plurals;
import com.revolut.feature.spending_analytics.api.R$string;
import com.youTransactor.uCube.rpc.Constants;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import snd.j;
import snd.k;
import snd.l;
import snd.n;
import snd.o;
import snd.p;
import thf.m;
import tof.a3;
import xnd.k0;
import xnd.o0;
import xnd.p0;
import xnd.q0;
import xnd.v0;
import xnd.w0;
import xnd.x0;
import xnd.y0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
public final class h {

    @NotNull
    public static final f Companion = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f298824a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f298825b;

    public h(gte.a featureToggleInteractor, m transactionTextResourcesMapper) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(transactionTextResourcesMapper, "transactionTextResourcesMapper");
        this.f298824a = featureToggleInteractor;
        this.f298825b = transactionTextResourcesMapper;
    }

    public static TextLocalisedClause a() {
        return new TextLocalisedClause(R$string.analytics_dashboard_section_tools_active, null, new Custom(new Custom.Color.Solid(R$attr.uikit_colorStatusSuccess), false, false, 254), 10);
    }

    public final boolean b() {
        return ((jte.d) this.f298824a).c(AnalyticsFeatureApi$Toggles.AnalyticsRevamp.f87388c);
    }

    public final RowDelegate.Model c(k0 k0Var) {
        Object next;
        nb8.g gVar = k0Var.f307415b;
        Iterator it8 = gVar.f214015a.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (Intrinsics.f(((nb8.b) next).f214010h.f214013a, gVar.f214016b)) {
                break;
            }
        }
        boolean z = ((nb8.b) next) == null && gVar.d;
        RowDelegate.Model modelK = k("JUNIOR_ALLOWANCE_ID", new TextLocalisedClause(R$string.analytics_dashboard_section_tools_allowance_title, null, null, 14), b() ? new TextLocalisedClause(R$string.analytics_dashboard_section_tools_allowance_subtitle, null, null, 14) : null, R$drawable.uikit_icn_24_calendar_recurring, new snd.g(k0Var.f307414a));
        if (z) {
            return modelK;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.revolut.core.ui_kit.delegates.RowDelegate.Model d(xnd.r0 r15) {
        /*
            Method dump skipped, instruction units count: 382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wnd.h.d(xnd.r0):com.revolut.core.ui_kit.delegates.RowDelegate$Model");
    }

    public final RowDelegate.Model e(y0 y0Var) {
        h hVar;
        Clause textLocalisedQuantityClause;
        TextClause textClause;
        TextLocalisedClause textLocalisedClause;
        TextLocalisedClause textLocalisedClause2 = b() ? new TextLocalisedClause(R$string.analytics_dashboard_section_tools_income_sorter_short_title, null, null, 14) : new TextLocalisedClause(R$string.analytics_dashboard_section_tools_income_sorter_title, null, null, 14);
        if (!b()) {
            hVar = this;
            textLocalisedQuantityClause = null;
        } else if (y0Var instanceof v0) {
            int i = g.f298823a[((v0) y0Var).f307463a.ordinal()];
            if (i == 1) {
                textLocalisedClause = new TextLocalisedClause(R$string.analytics_dashboard_section_tools_income_sorter_subtitle, null, null, 14);
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                textLocalisedClause = new TextLocalisedClause(R$string.analytics_dashboard_section_tools_income_sorter_subtitle_savings, null, null, 14);
            }
            textLocalisedQuantityClause = textLocalisedClause;
            hVar = this;
        } else if (y0Var instanceof x0) {
            x0 x0Var = (x0) y0Var;
            a3 a3Var = x0Var.f307467a;
            if (a3Var != null) {
                Map map = x0Var.f307468b.f181795b;
                hVar = this;
                textClause = new TextClause(m.a(hVar.f298825b, a3Var, map, null, null, null, null, null, Constants.TAG_FC_SPEED_MODE), (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            } else {
                hVar = this;
                textClause = null;
            }
            textLocalisedQuantityClause = textClause != null ? new CompositeClause(v.k(a(), textClause), new DotDividerClause((Integer) null), null, null, 12) : a();
        } else {
            hVar = this;
            if (!(y0Var instanceof w0)) {
                throw new NoWhenBranchMatchedException();
            }
            int i2 = R$plurals.analytics_dashboard_section_tools_income_sorter_subtitle_count;
            int i3 = ((w0) y0Var).f307465a;
            textLocalisedQuantityClause = new TextLocalisedQuantityClause(i2, Integer.valueOf(i3), u.c(Integer.valueOf(i3)), new Custom(new Custom.Color.Solid(R$attr.uikit_colorStatusSuccess), false, false, 254), 8);
        }
        int i5 = R$drawable.uikit_icn_24_split;
        if ((y0Var instanceof v0) || (y0Var instanceof x0) || (y0Var instanceof w0)) {
            return hVar.k("INCOME_SORTER_ID", textLocalisedClause2, textLocalisedQuantityClause, i5, new j(null));
        }
        throw new NoWhenBranchMatchedException();
    }

    public final RowDelegate.Model f(boolean z) {
        if (z) {
            return k("MOVE_SUBSCRIPTIONS_ID", new TextLocalisedClause(R$string.analytics_dashboard_section_tools_move_subscriptions_title, null, null, 14), b() ? new TextLocalisedClause(R$string.analytics_dashboard_section_tools_move_subscriptions_subtitle, null, null, 14) : null, R$drawable.uikit_icn_24_calendar_next_event, k.f264543a);
        }
        return null;
    }

    public final RowDelegate.Model g(p0 p0Var) {
        return k("TOOLS_RECURRING_TRANSFERS_ID", new TextLocalisedClause(R$string.analytics_dashboard_section_tools_recurring_transfer_title, null, null, 14), b() ? new TextLocalisedClause(R$string.analytics_dashboard_section_tools_recurring_transfer_subtitle, null, null, 14) : null, R$drawable.uikit_icn_24_calendar_recurring, new snd.m(p0Var.f307433a, p0Var.f307434b, p0Var.f307435c));
    }

    public final RowDelegate.Model h(o0 o0Var) {
        return k("SAVING_GOAL_ID", new TextLocalisedClause(R$string.analytics_dashboard_section_tools_savings_goal_title, null, null, 14), b() ? new TextLocalisedClause(R$string.analytics_dashboard_section_tools_savings_goal_subtitle, null, null, 14) : null, R$drawable.uikit_icn_24_target, new l(o0Var.f307431a));
    }

    public final RowDelegate.Model i() {
        return k("SMART_ESTIMATION_ID", new TextLocalisedClause(R$string.analytics_dashboard_section_tools_smart_estimation_short_title, null, null, 14), new TextLocalisedClause(R$string.analytics_dashboard_section_tools_smart_estimation_subtitle, null, null, 14), R$drawable.uikit_icn_24_line_chart, o.f264551a);
    }

    public final RowDelegate.Model j(q0 q0Var) {
        return k("TOOLS_SPARE_CHANGE_ID", new TextLocalisedClause(R$string.analytics_dashboard_section_tools_spare_change_title, null, null, 14), b() ? new TextLocalisedClause(R$string.analytics_dashboard_section_tools_spare_change_subtitle, null, null, 14) : null, R$drawable.uikit_icn_24_coins, new n(q0Var.f307437a, q0Var.f307438b, q0Var.f307439c));
    }

    public final RowDelegate.Model k(String str, TextLocalisedClause textLocalisedClause, Clause clause, int i, p pVar) {
        return new RowDelegate.Model(str, new RowDelegate.Model.MainImage.Image40(LayeredImage.INSTANCE.i(i, R$attr.uikit_colorAccentNeutral, R$attr.uikit_colorAccentNeutral_10), null, null, false, null, false, 60), textLocalisedClause, null, 0, clause, null, null, 0, new tf(6, new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, Integer.valueOf(b() ? R$attr.uikit_colorGreyTone20 : R$attr.uikit_colorAccentNeutral), (List) null, (ImageTransformations) null, (Clause) null, 246), false), false, null, false, null, null, null, null, null, null, pVar, null, 0, 0, 0, 0, 532675544);
    }
}
