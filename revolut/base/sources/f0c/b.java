package f0c;

import android.text.SpannableStringBuilder;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.unit.Dp;
import androidx.glance.ColorFilter;
import androidx.glance.GlanceModifier;
import androidx.glance.ImageKt;
import androidx.glance.ImageProvider;
import androidx.glance.layout.RowScope;
import androidx.glance.layout.SizeModifiersKt;
import androidx.glance.unit.ColorProviderKt;
import aw0.o9;
import aw0.v1;
import aw0.x8;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.VoucherSmallTileDelegate;
import com.revolut.core.ui_kit.delegates.gj;
import com.revolut.core.ui_kit.delegates.widgets.NewsWidgetDelegate;
import com.revolut.core.ui_kit.delegates.zi;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.retail.wealth.resources.R$string;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import m1c.q0;
import p01.p;
import p01.r;
import zhm.d0;
import zhm.f0;
import zhm.h0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class b implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f131071a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f131072b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f131073c;
    public final /* synthetic */ Object d;

    public /* synthetic */ b(Object obj2, Object obj3, int i, int i2) {
        this.f131071a = i2;
        this.f131073c = obj2;
        this.d = obj3;
        this.f131072b = i;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        ColorFilter colorFilterTint;
        int i = this.f131071a;
        String str = null;
        int i2 = this.f131072b;
        Object obj5 = this.d;
        Object obj6 = this.f131073c;
        switch (i) {
            case 0:
                d dVar = (d) obj6;
                Clause clause = (Clause) obj5;
                List featuredRewards = (List) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(featuredRewards, "featuredRewards");
                int i3 = 2;
                if (featuredRewards.size() < 2) {
                    return f0.f322471a;
                }
                ListSubheaderDelegate.Model modelB = d.b(clause);
                List<q0> list = featuredRewards;
                ArrayList arrayList = new ArrayList(w.t(list, 10));
                for (q0 q0Var : list) {
                    String strQ = j6.a.q("FEATURED_REWARDS_VOUCHER_PREFIX", q0Var.f201440a);
                    zi ziVar = new zi(new UrlImage(q0Var.e, null, null, null, 0L, null, null, null, null, null, false, null, null, null, false, false, 524286));
                    LayeredImage.Companion companion = LayeredImage.INSTANCE;
                    String str2 = q0Var.f;
                    int iA = dVar.f131074a.a(str2);
                    if (iA == 0) {
                        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(p.a.p("Icon ", str2, " not found"));
                        h0 h0Var = h0.f322473a;
                        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                        rd0.d.a(rd0.c.ERROR, str, str, illegalArgumentException, h0Var);
                        iA = R$drawable.uikit_icn_24_rev_points;
                    }
                    LayeredImage layeredImageI = companion.i(iA, R$attr.uikit_colorForeground, i2);
                    TextClause textClause = new TextClause(q0Var.f201441b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                    gj gjVar = new gj(i3);
                    String str3 = q0Var.f201442c;
                    String str4 = q0Var.d;
                    VoucherSmallTileDelegate.Model model = new VoucherSmallTileDelegate.Model(strQ, ziVar, textClause, gjVar, null, new TextClause(a0.D(str3, str4, "%s", false), (Style) null, (Integer) null, false, (o9) null, u.c(nub.a.m(str4, o9.NON_SENSITIVE, new TextClause(str3, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), Integer.valueOf(R$attr.uikit_colorForeground))), 94), layeredImageI, null, null, null, null, false, null, null, q0Var, 261968);
                    yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
                    arrayList.add(model);
                    str = null;
                    i3 = 2;
                }
                return v.k(modelB, d.a(arrayList));
            case 1:
                x8 x8Var = (x8) obj6;
                r rVar = (r) obj5;
                RowScope Row = (RowScope) obj2;
                Composer composer = (Composer) obj3;
                int iIntValue = ((Integer) obj4).intValue();
                Intrinsics.checkNotNullParameter(Row, "$this$Row");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-826233182, iIntValue, -1, "com.revolut.core.ui_kit_remote.widget.models.TileHeader.<anonymous> (TileHeader.kt:145)");
                }
                if (x8Var != null) {
                    ColorFilter.Companion companion2 = ColorFilter.INSTANCE;
                    v1 v1Var = x8Var.f10609a;
                    Intrinsics.checkNotNullParameter(v1Var, "<this>");
                    colorFilterTint = companion2.tint(ColorProviderKt.m3584ColorProvider8_81llA(v1Var == v1.LIGHT ? Color.INSTANCE.m1987getBlack0d7_KjU() : Color.INSTANCE.m1995getWhite0d7_KjU()));
                } else {
                    colorFilterTint = ColorFilter.INSTANCE.tint(ColorProviderKt.m3584ColorProvider8_81llA(ColorKt.Color(((p) rVar).f231449c)));
                }
                ColorFilter colorFilter = colorFilterTint;
                p pVar = (p) rVar;
                ImageProvider ImageProvider = ImageKt.ImageProvider(pVar.f231447a);
                GlanceModifier.Companion companion3 = GlanceModifier.INSTANCE;
                ImageKt.m3485ImageGCr5PR4(ImageProvider, null, SizeModifiersKt.wrapContentSize(companion3), 0, colorFilter, composer, (ColorFilter.$stable << 12) | 48, 8);
                SpannableStringBuilder spannableStringBuilder = pVar.f231448b;
                n01.h hVar = n01.h.MEDIUM;
                float fM3297constructorimpl = Dp.m3297constructorimpl(14);
                if (x8Var == null) {
                    i2 = pVar.f231449c;
                }
                n01.d.a(spannableStringBuilder, hVar, i2, null, new n01.f(fM3297constructorimpl), 1, false, Row.defaultWeight(companion3), composer, 221232, 72);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return Unit.f186387a;
            default:
                String str5 = (String) obj6;
                s28.h hVar2 = (s28.h) obj5;
                s28.c news = (s28.c) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(news, "news");
                if (news instanceof s28.a) {
                    rzj.k kVar = ((s28.a) news).f259255a;
                    return NewsWidgetDelegate.Model.Companion.a(NewsWidgetDelegate.Model.INSTANCE, str5, new TextLocalisedClause(R$string.wealth_invest_widget_feed_header_title, null, null, 14), hVar2.f259267c.a(d0.V0(kVar.f258697a, i2)), kVar.f258697a.size() > i2 ? new TextLocalisedClause(R$string.wealth_invest_widget_news_action_see_all, null, null, 14) : null);
                }
                if (!(news instanceof s28.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                NewsWidgetDelegate.Model.Companion aVar = NewsWidgetDelegate.Model.INSTANCE;
                TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.wealth_invest_widget_feed_header_title, null, null, 14);
                List listV0 = d0.V0(((s28.b) news).f259256a, i2);
                ArrayList arrayList2 = new ArrayList(w.t(listV0, 10));
                Iterator it8 = listV0.iterator();
                while (it8.hasNext()) {
                    arrayList2.add(hVar2.f259266b.a((x08.f) it8.next()));
                }
                return NewsWidgetDelegate.Model.Companion.a(aVar, str5, textLocalisedClause, arrayList2, new TextLocalisedClause(R$string.wealth_invest_widget_news_action_see_all, null, null, 14));
        }
    }
}
