package h8f;

import aw0.a5;
import aw0.b5;
import aw0.c5;
import aw0.e5;
import aw0.f5;
import aw0.h4;
import aw0.i4;
import aw0.i5;
import aw0.j4;
import aw0.j5;
import aw0.m5;
import aw0.n4;
import aw0.o4;
import aw0.o9;
import aw0.t5;
import aw0.x0;
import aw0.z4;
import ch.qos.logback.core.net.SyslogConstants;
import cli.n;
import cli.o;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.PercentageClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.trading.managed_portfolios.impl.domain.template.model.TemplateIntroPieChartItem;
import com.youTransactor.uCube.rpc.Constants;
import ip0.bk0;
import ip0.ck0;
import ip0.ed0;
import ip0.uc;
import ip0.ui;
import ip0.xc;
import ip0.yj0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yhm.m;
import zhm.d0;
import zhm.f0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes8.dex */
public final class m implements n {

    @NotNull
    private static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static e5 a(float f, int i, String str) {
        String strConcat = "portfolio-allocation-bar-".concat(str);
        i5 i5Var = j5.Companion;
        ResourceImage resourceImage = new ResourceImage(i, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, new ImageTransformations(null, null, null, gz0.b.CenterInside, null, 16, 16, 23), (Clause) null, 182);
        i5Var.getClass();
        j5 j5Var = new j5(resourceImage);
        b5 b5Var = c5.Companion;
        List listC = u.c(new f5(f, x0.f10593a));
        b5Var.getClass();
        return new e5(strConcat, j5Var, u.c(b5.a(listC)), false, null, SyslogConstants.LOG_CLOCK);
    }

    @Override // cli.n
    public final o c(cli.j jVar) throws Throwable {
        Pair pair;
        Object next;
        Object objA;
        g domainState = (g) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        f fVar = domainState.f150036c;
        if (fVar instanceof d) {
            d dVar = (d) fVar;
            ui uiVar = new ui("animated-bar-chart", v.k(a(dVar.f150030a, R$drawable.uikit_icn_24_wealth, "stocks"), a(dVar.f150031b, R$drawable.uikit_icn_24_bank, "bonds"), a(dVar.f150032c, R$drawable.uikit_icn_24_commodities, "commodities"), a(dVar.d, R$drawable.uikit_icn_24_cash, "cash")), m5.FIXED, null, new t5(u.c(new a5(BitmapDescriptorFactory.HUE_RED, null, z4.SOLID))), Float.valueOf(216.0f), Float.valueOf(40.0f), false, null, null, null, null, 0, 0, 0, 0, 515856);
            int i = R$attr.uikit_dp0;
            yp0.b.p(uiVar, i, i, i, i);
            pair = new Pair(uiVar, null);
        } else if (fVar instanceof e) {
            ArrayList<TemplateIntroPieChartItem> arrayList = ((e) fVar).f150033a.f91258a;
            if (arrayList.isEmpty()) {
                pair = new Pair(null, null);
            } else {
                ArrayList segments = new ArrayList(w.t(arrayList, 10));
                for (TemplateIntroPieChartItem templateIntroPieChartItem : arrayList) {
                    String str = templateIntroPieChartItem.f91251a;
                    segments.add(new i4(str, new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), (long) (templateIntroPieChartItem.f91252b * ((double) 10000)), new Color.Solid(R$attr.uikit_colorWhite), f0.f322471a));
                }
                h4 legendLabelPlacement = h4.PERCENT_THEN_LABEL;
                Iterator it8 = arrayList.iterator();
                while (true) {
                    if (!it8.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it8.next();
                    if (((TemplateIntroPieChartItem) next).f91253c) {
                        break;
                    }
                }
                TemplateIntroPieChartItem templateIntroPieChartItem2 = (TemplateIntroPieChartItem) next;
                String str2 = templateIntroPieChartItem2 != null ? templateIntroPieChartItem2.f91251a : null;
                n4 sortMode = n4.NO_SORT;
                Intrinsics.checkNotNullParameter(segments, "segments");
                PercentageClause.Format.Default legendPercentageFormat = PercentageClause.Format.Default.f57910a;
                Intrinsics.checkNotNullParameter(legendPercentageFormat, "legendPercentageFormat");
                Intrinsics.checkNotNullParameter(legendLabelPlacement, "legendLabelPlacement");
                Intrinsics.checkNotNullParameter(sortMode, "sortMode");
                try {
                    m.Companion companion = yhm.m.INSTANCE;
                } catch (CancellationException e) {
                    throw e;
                } catch (Throwable th10) {
                    m.Companion companion2 = yhm.m.INSTANCE;
                    objA = yhm.o.a(th10);
                }
                if (segments.size() > 5) {
                    throw new IllegalArgumentException(("InternalLegendView supports a maximum of 5 segments, but received " + segments.size() + ". Please cap segments before rendering.").toString());
                }
                objA = Unit.f186387a;
                Throwable thA = yhm.m.a(objA);
                if (thA != null) {
                    hx7.e.n(thA);
                }
                Iterator it9 = segments.iterator();
                long jD = 0;
                while (it9.hasNext()) {
                    jD += ((j4) it9.next()).d();
                }
                ed0 ed0Var = new ed0("portfolio_reveal_intro_gauge_chart", new com.revolut.core.ui_kit.models.g(segments, jD, str2, legendPercentageFormat, legendLabelPlacement, sortMode, o4.FULL_CIRCLE), null);
                int i2 = R$attr.uikit_dp0;
                yp0.b.p(ed0Var, i2, i2, i2, i2);
                pair = new Pair(ed0Var, d0.k0(arrayList, ", ", null, null, 0, new h56.a(this, 8), 30));
            }
        } else {
            if (fVar != null) {
                throw new NoWhenBranchMatchedException();
            }
            pair = new Pair(null, null);
        }
        koi.j jVar2 = (koi.j) pair.f186385a;
        String str3 = (String) pair.f186386b;
        aim.e eVarB = u.b();
        if (jVar2 != null) {
            List listC = u.c(jVar2);
            uc ucVar = new uc();
            int i3 = R$attr.uikit_dp32;
            xc xcVar = new xc("portfolio_reveal_intro_chart_container", listC, 0, ucVar, null, 0, i3, i3, Constants.TAG_OS_VERSION);
            int i5 = R$attr.uikit_dp48;
            int i6 = R$attr.uikit_dp0;
            yp0.b.p(xcVar, i5, i6, i6, i6);
            eVarB.add(xcVar);
        }
        TextClause textClause = new TextClause(domainState.f150034a, (Style) new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), (Integer) null, false, (o9) null, (List) null, 124);
        bk0 bk0Var = new bk0(0);
        int i21 = R$attr.uikit_dp48;
        int i22 = R$attr.uikit_dp0;
        int i32 = R$attr.uikit_dp32;
        eVarB.add(new TextDelegate.Model("portfolio_reveal_intro_title", textClause, false, bk0Var, null, null, i21, i22, i32, i32, 116));
        String str4 = domainState.f150035b;
        if (str4 == null) {
            str4 = "";
        }
        TextClause textClause2 = new TextClause(str4, (Style) new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), (Integer) null, false, (o9) null, (List) null, 124);
        ck0 ck0Var = new ck0(yj0.CENTER_HORIZONTAL);
        int i33 = R$attr.uikit_dp12;
        int i43 = R$attr.uikit_dp0;
        int i59 = R$attr.uikit_dp32;
        eVarB.add(new TextDelegate.Model("portfolio_reveal_intro_description", textClause2, false, ck0Var, null, null, i33, i43, i59, i59, 116));
        return new j(u.a(eVarB), str3);
    }
}
