package d8d;

import aah.m;
import android.os.Parcelable;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.text.TextFieldScrollKt;
import androidx.compose.foundation.text.TextFieldScrollerPosition;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.unit.Dp;
import androidx.glance.GlanceModifier;
import androidx.glance.layout.RowScope;
import androidx.glance.layout.SizeModifiersKt;
import androidx.glance.layout.SpacerKt;
import aw0.k1;
import aw0.m7;
import aw0.o7;
import aw0.o9;
import aw0.p7;
import aw0.q7;
import aw0.s7;
import aw0.v1;
import aw0.x8;
import aw0.y4;
import b8d.l;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.BigTileDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.SmallActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.SmallCardDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.hg;
import com.revolut.core.ui_kit.delegates.p1;
import com.revolut.core.ui_kit.delegates.widgets.CardWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.p;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.DotDividerClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.NavBarCenterViewModel;
import com.revolut.core.ui_kit.models.NumberClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.models.q0;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.backgroundpicker.api.model.ChosenBackground;
import com.revolut.retail.feature.cryptocommoditydetails.api.ui.delegates.PriceTargetsWidgetContract$Parcel$SeeAllParcel;
import com.revolut.retail.wealth.resources.R$string;
import com.revolut.revolut.feature_fourthline_impl.R;
import d7j.p0;
import emh.f;
import emh.g;
import fme.i;
import h93.f0;
import ia3.r;
import ia3.t;
import ip0.ak0;
import ip0.n4;
import ip0.px;
import ip0.zj;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import ms0.e4;
import ms0.h4;
import ms0.i4;
import ms0.s4;
import n09.x;
import n09.y;
import n09.z;
import nel.a0;
import op0.q;
import p01.o;
import p09.e;
import u09.h;
import v20.d1;
import zhm.d0;
import zhm.u;
import zhm.v;
import zhm.w;
import zhm.y0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class a implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f112212a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f112213b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f112214c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;

    public /* synthetic */ a(TextFieldScrollerPosition textFieldScrollerPosition, boolean z, OverscrollEffect overscrollEffect, MutableInteractionSource mutableInteractionSource) {
        this.f112212a = 5;
        this.f112213b = textFieldScrollerPosition;
        this.d = z;
        this.f112214c = overscrollEffect;
        this.e = mutableInteractionSource;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v106, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v77, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v78 */
    /* JADX WARN: Type inference failed for: r3v83, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v31 */
    /* JADX WARN: Type inference failed for: r6v32, types: [int] */
    /* JADX WARN: Type inference failed for: r6v34 */
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        int i;
        Object next;
        Iterable iterableC;
        Iterator it8;
        ?? C;
        s4 s4Var;
        n4 n4Var;
        p1 p1Var;
        h hVar;
        qta.c cVar;
        Clause textLocalisedClause;
        int i2;
        ncj.b bVar;
        List list;
        int i3 = this.f112212a;
        int i5 = 10;
        boolean z = this.d;
        Object obj5 = this.e;
        Object obj6 = this.f112214c;
        Object obj7 = this.f112213b;
        switch (i3) {
            case 0:
                final c cVar2 = (c) obj7;
                final aj0.c cVar3 = (aj0.c) obj6;
                final l actions = (l) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(actions, "actions");
                p0 p0Var = new p0(cVar2, 25);
                final boolean z3 = this.d;
                return (List) iii.c.f((Data) obj5, p0Var, new Function2() { // from class: d8d.b
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj8, Object obj9) {
                        Intrinsics.checkNotNullParameter((Function1) obj9, "<unused var>");
                        return cVar2.a(cVar3, actions, z3, null);
                    }
                }, new a(cVar2, cVar3, actions, z3, 1));
            case 1:
                d1 nextTicket = (d1) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(nextTicket, "nextTicket");
                return ((c) obj7).a((aj0.c) obj6, (l) obj5, z, nextTicket);
            case 2:
                return ClickableKt.clickable_XHw0xAI$lambda$1(this.d, (String) obj7, (Role) obj6, (Function0) obj5, (Modifier) obj2, (Composer) obj3, ((Integer) obj4).intValue());
            case 3:
                g gVar = (g) obj7;
                elb.a aVar = (elb.a) obj6;
                emh.c cVar4 = (emh.c) obj5;
                List instruments = (List) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(instruments, "instruments");
                List<a0> list2 = instruments;
                ArrayList arrayList = new ArrayList(w.t(list2, 10));
                for (a0 a0Var : list2) {
                    arrayList.add(gVar.f127660a.b(a0Var, "INSTRUMENT_", aVar.invoke(a0Var.f214560a)));
                }
                int size = instruments.size();
                gVar.getClass();
                switch (f.f127659a[cVar4.ordinal()]) {
                    case 1:
                        i = R$string.wealth_trading_discovery_all_bonds;
                        break;
                    case 2:
                        i = R$string.wealth_trading_discovery_all_stocks;
                        break;
                    case 3:
                        i = R$string.wealth_trading_discovery_all_cfds;
                        break;
                    case 4:
                        i = z ? R$string.wealth_trading_discovery_all_etps : R$string.wealth_trading_discovery_all_etfs;
                        break;
                    case 5:
                        i = R$string.wealth_trading_discovery_all_funds;
                        break;
                    case 6:
                        i = R$string.invest_discover_section_all_structured_notes_header_title;
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                return yp0.b.g(arrayList, new ListSubheaderDelegate.Model("INSTRUMENT_HEADER", (Image) null, yoj.b.w(new TextLocalisedClause(i, null, null, 14), yoj.b.w(new DotDividerClause((Integer) null), new NumberClause(size, (NumberClause.Format.Compact) null, (Custom) null, 6))), (Image) null, (Clause) null, p.a.p("all-assets-", cVar4.name(), "-see-all"), (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65434), null, 0, 0, 126);
            case 4:
                ChosenBackground chosenBackground = (ChosenBackground) obj6;
                ld6.b bVar2 = (ld6.b) obj5;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter((w19.g) obj2, "<unused var>");
                ((i) obj7).getClass();
                return new tx0.g(null, new NavBarCenterViewModel((NavBarCenterViewModel.MainText) new NavBarCenterViewModel.MainText.Static(new TextLocalisedClause(com.revolut.feature.tab.lifestyle.impl.R$string.rev_points_home_pre_onboarding_intro_v2_title, null, null, 14), NavBarCenterViewModel.MainTextStyle.Marketing.f57863a), (Clause) null, (NavBarCenterViewModel.Subtitle) new NavBarCenterViewModel.Subtitle.Secondary(new TextLocalisedClause(com.revolut.feature.tab.lifestyle.impl.R$string.rev_points_home_pre_onboarding_intro_v2_subtitle, null, null, 14)), (NavBarCenterViewModel.Button) null, false, false, false, false, (Image) null, (NavBarCenterViewModel.MainTextEndIcon) null, (AnalyticsContext) null, 4088), new tx0.d(u.c(u.c(new ActionsView.Item("LIFESTYLE_HOME_EARN_POINTS_HEADER_ACTION_BUTTON_ID", mx0.d.CONTEXTUAL, false, e4.EnabledClickable, null, new TextLocalisedClause(com.revolut.feature.tab.lifestyle.impl.R$string.tab_lifestyle_points_onboarding_bottom_button, null, null, 14), null, null, null, null, false, "LIFESTYLE_HOME_EARN_POINTS_HEADER_ACTION_BUTTON_TAG", null, null, null, 30612)))), chosenBackground.f63742b, null, null, null, bVar2 != null ? bVar2.c() : null, z ? new tx0.i(ola.d.LIFESTYLE_REVPOINTS, y0.b("LIFESTYLE_HOME_EARN_POINTS_HEADER_ACTION_BUTTON_ID")) : null, null, 2257);
            case 5:
                return TextFieldScrollKt.textFieldScrollable$lambda$1((TextFieldScrollerPosition) obj7, this.d, (OverscrollEffect) obj6, (MutableInteractionSource) obj5, (Modifier) obj2, (Composer) obj3, ((Integer) obj4).intValue());
            case 6:
                os5.d dVar = (os5.d) obj7;
                String str = (String) obj6;
                String str2 = (String) obj5;
                Pair pair = (Pair) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                List list3 = (List) pair.f186385a;
                yt8.c cVar5 = (yt8.c) pair.f186386b;
                Iterator it9 = list3.iterator();
                while (true) {
                    if (it9.hasNext()) {
                        next = it9.next();
                        if (Intrinsics.f(((f0) next).f150110a, str2)) {
                        }
                    } else {
                        next = null;
                    }
                }
                f0 f0Var = (f0) next;
                if (f0Var == null) {
                    f0Var = (f0) d0.d0(list3);
                }
                f0 f0Var2 = f0Var;
                if (f0Var2 == null) {
                    return dVar.i(str, q.SMALL, d0.V0(dVar.f229232g.a(), 3), z);
                }
                r rVar = dVar.f229231c;
                Clause clauseA = m93.f.a(rVar, f0Var2, null, 30);
                Clause clauseQ = rVar.q(f0Var2);
                m93.g gVar2 = dVar.d;
                yt8.i iVar = cVar5.f316662a;
                Image imageE = ((t) gVar2).e(true, f0Var2, iVar);
                LayeredImage layeredImageO = rVar.o(f0Var2, iVar);
                n93.a aVarP = rVar.p(f0Var2, iVar);
                return new CardWidgetDelegate.Model(str, imageE, layeredImageO, clauseA, clauseQ, aVarP != null ? new p(aVarP.f213546a) : null, f0Var2, 128);
            case 7:
                p01.l lVar = (p01.l) obj7;
                x8 x8Var = (x8) obj6;
                p01.l lVar2 = (p01.l) obj5;
                RowScope Row = (RowScope) obj2;
                Composer composer = (Composer) obj3;
                int iIntValue = ((Integer) obj4).intValue();
                Intrinsics.checkNotNullParameter(Row, "$this$Row");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1423716361, iIntValue, -1, "com.revolut.core.ui_kit_remote.widget.models.HorizontalCircleActions.<anonymous> (CircleAction.kt:77)");
                }
                if (lVar != null) {
                    composer.startReplaceGroup(1132105426);
                    o.a(lVar, x8Var, !z || lVar2 == null, composer, 0, 0);
                } else {
                    composer.startReplaceGroup(1129239321);
                }
                composer.endReplaceGroup();
                if (!z || lVar2 == null) {
                    composer.startReplaceGroup(1129239321);
                } else {
                    composer.startReplaceGroup(1132364834);
                    SpacerKt.Spacer(SizeModifiersKt.m3572width3ABfNKs(GlanceModifier.INSTANCE, Dp.m3297constructorimpl(16)), composer, 0, 0);
                    o.a(lVar2, x8Var, false, composer, 0, 4);
                    composer = composer;
                }
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return Unit.f186387a;
            case 8:
                boolean z4 = false;
                int i6 = 3;
                e eVar = (e) obj7;
                n09.a0 a0Var2 = (n09.a0) obj6;
                String str3 = (String) obj5;
                List categories = (List) obj2;
                boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                Throwable th10 = (Throwable) obj4;
                Intrinsics.checkNotNullParameter(categories, "categories");
                if (categories.isEmpty() && zBooleanValue) {
                    return eVar.f231487c;
                }
                if (categories.isEmpty() && th10 != null) {
                    return eVar.d;
                }
                List list4 = categories;
                ArrayList arrayList2 = new ArrayList(w.t(list4, 10));
                Iterator it10 = list4.iterator();
                while (it10.hasNext()) {
                    u09.i iVar2 = (u09.i) it10.next();
                    h09.d dVar2 = eVar.f231485a;
                    String str4 = iVar2.f276126a;
                    ArrayList arrayList3 = iVar2.d;
                    ListSubheaderDelegate.Model model = new ListSubheaderDelegate.Model(a0.d.r(str4, "_HEADER"), (Image) null, (Clause) new TextClause(iVar2.f276127b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, R$attr.uikit_dp12, 0, 0, 57338);
                    int i21 = p09.d.f231483a[iVar2.f276128c.ordinal()];
                    if (i21 == 1) {
                        it8 = it10;
                        String str5 = iVar2.f276126a;
                        ArrayList arrayList4 = new ArrayList(w.t(arrayList3, 10));
                        Iterator it11 = arrayList3.iterator();
                        while (it11.hasNext()) {
                            arrayList4.add(dVar2.a((u09.f) it11.next(), false));
                        }
                        SmallCardDelegate.INSTANCE.getClass();
                        C = u.c(new hg(str5, arrayList4, 2, new y4(SmallCardDelegate.f53351j), null, null, false, true, null, null, 0, 0, 0, 0, 32496));
                    } else if (i21 == 2) {
                        String str6 = iVar2.f276126a;
                        ArrayList arrayList5 = new ArrayList(w.t(arrayList3, i5));
                        Iterator it12 = arrayList3.iterator();
                        while (it12.hasNext()) {
                            u09.f course = (u09.f) it12.next();
                            Intrinsics.checkNotNullParameter(course, "course");
                            h09.e eVarC = h09.f.c(course.f276111c, course.b(), course.f276115l, course.f276119q, false);
                            Clause clause = eVarC.f148334a;
                            Integer num = eVarC.f148335b;
                            Integer num2 = eVarC.f148336c;
                            String strQ = j6.a.q("CourseRedesignedMapper_LARGE_COURSE_ITEM_ID", course.f276109a);
                            String str7 = course.f276117n;
                            if (str7 == null) {
                                str7 = course.d;
                            }
                            UrlImage urlImage = new UrlImage(str7, null, null, null, 0L, null, null, null, null, null, false, null, null, null, false, false, 524286);
                            v1 v1Var = v1.DARK;
                            Iterator it13 = it10;
                            TextClause textClause = new TextClause(course.f276110b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                            String str8 = str6;
                            Iterator it14 = it12;
                            n4 n4Var2 = new n4(new TextClause(course.f276113h, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), false);
                            if (clause != null) {
                                List listC = num != null ? u.c(new ResourceImage(num.intValue(), (Integer) null, (Integer) null, num2, (List) null, (ImageTransformations) null, (Clause) null, 246)) : null;
                                if (listC == null) {
                                    listC = zhm.f0.f322471a;
                                }
                                s4Var = new s4(listC, clause, 0, 28);
                            } else {
                                s4Var = null;
                            }
                            List list5 = course.f276118p;
                            if (list5 == null || (hVar = (h) d0.d0(list5)) == null) {
                                n4Var = n4Var2;
                                p1Var = null;
                            } else {
                                int i22 = h09.c.f148332a[hVar.f276125a.ordinal()];
                                if (i22 == 1) {
                                    n4Var = n4Var2;
                                    p1Var = new p1(new TagViewData(null, new TextLocalisedClause(com.revolut.feature.learn.shared.impl.R$string.investmentlearn_course_collection_card_badge_new, null, null, 14), R$attr.uikit_colorRed, null, R$attr.uikit_colorTransparent, null, 1000));
                                } else {
                                    if (i22 != 2) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    n4Var = n4Var2;
                                    p1Var = new p1(new TagViewData(new ResourceImage(R$drawable.uikit_icn_24_lightning, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorBlack), (List) null, (ImageTransformations) null, (Clause) null, 246), new TextLocalisedClause(com.revolut.feature.learn.shared.impl.R$string.investmentlearn_course_collection_card_badge_trending, null, new Custom(Integer.valueOf(R$attr.uikit_colorBlack), false, null, false, null, 254), 10), R$attr.uikit_colorWhite_70, null, R$attr.uikit_colorTransparent, null, 1000));
                                }
                            }
                            BigTileDelegate.b bVar3 = p1Var != null ? new BigTileDelegate.b(null, p1Var, 1) : null;
                            int iA = course.a();
                            Integer numValueOf = Integer.valueOf(iA);
                            if (iA >= 100) {
                                numValueOf = null;
                            }
                            BigTileDelegate.Model model2 = new BigTileDelegate.Model(strQ, textClause, urlImage, s4Var, n4Var, true, null, bVar3, null, null, course, null, null, v1Var, numValueOf != null ? Float.valueOf(course.a() / 100.0f) : null, 31913540);
                            yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
                            arrayList5.add(model2);
                            it10 = it13;
                            it12 = it14;
                            str6 = str8;
                        }
                        it8 = it10;
                        C = u.c(new hg(str6, arrayList5, 1, new y4(new aw0.d0(12, 10)), null, null, false, true, null, null, 0, 0, 0, 0, 32496));
                    } else {
                        if (i21 != i6) {
                            throw new NoWhenBranchMatchedException();
                        }
                        C = new ArrayList(w.t(arrayList3, i5));
                        ?? r62 = z4;
                        for (Object obj8 : arrayList3) {
                            int i32 = r62 + 1;
                            if (r62 < 0) {
                                v.s();
                                throw null;
                            }
                            SmallCardDelegate.Model modelA = dVar2.a((u09.f) obj8, z4);
                            yp0.b.m(modelA);
                            C.add(modelA);
                            r62 = i32;
                            z4 = false;
                        }
                        it8 = it10;
                    }
                    arrayList2.add(d0.E0((Iterable) C, u.c(model)));
                    it10 = it8;
                    i5 = 10;
                    i6 = 3;
                    z4 = false;
                }
                ArrayList arrayListU = w.u(arrayList2);
                z tab2 = a0Var2.f210923a;
                Intrinsics.checkNotNullParameter(tab2, "tab");
                wi0.b.Companion.getClass();
                if (Intrinsics.f(str3, "AE") && ((tab2 instanceof x) || ((tab2 instanceof y) && ((y) tab2).f210971a == u09.v.CRYPTO))) {
                    iterableC = u.c(new TextDelegate.Model("CLICK_ID_UAE_DISCLAIMER", new TextLocalisedClause(com.revolut.feature.learn.shared.impl.R$string.wealth_investmentlearn_crypto_tab_disclaimer_uae_footer, u.c(new TextLocalisedClause(com.revolut.feature.learn.shared.impl.R$string.wealth_investmentlearn_crypto_tab_disclaimer_uae_footer_risk, null, new Click(30, (Integer) null, (Object) null, "CLICK_ID_UAE_RISK_DISCLOSURE", false), 10)), null, 12), false, new ak0(null, null, 3), null, null, 0, 0, 0, 0, 2036));
                } else if (Intrinsics.f(str3, "BR") && z && (tab2 instanceof y) && ((y) tab2).f210971a == u09.v.CRYPTO) {
                    iterableC = u.c(new TextDelegate.Model("CLICK_ID_CRYPTO_FOOTER", new TextLocalisedClause(com.revolut.feature.learn.shared.impl.R$string.wealth_investmentlearn_crypto_tab_disclaimer_br_footer, v.k(new TextLocalisedClause(com.revolut.feature.learn.shared.impl.R$string.wealth_investmentlearn_crypto_tab_disclaimer_br_footer_terms, null, new Click(30, (Integer) null, (Object) null, "CLICK_ID_BR_TERMS", false), 10), new TextLocalisedClause(com.revolut.feature.learn.shared.impl.R$string.wealth_investmentlearn_crypto_tab_disclaimer_br_footer_risk, null, new Click(30, (Integer) null, (Object) null, "CLICK_ID_BR_RISK_DISCLOSURE", false), 10)), null, 12), false, new ak0(null, null, 3), null, null, 0, 0, 0, 0, 2036));
                } else if (tab2 instanceof x) {
                    iterableC = zhm.f0.f322471a;
                } else {
                    if (!(tab2 instanceof y)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    switch (p09.a.f231482a[((y) tab2).f210971a.ordinal()]) {
                        case 1:
                            iterableC = u.c(new TextDelegate.Model("CLICK_ID_CRYPTO_FOOTER", new TextLocalisedClause(com.revolut.feature.learn.shared.impl.R$string.wealth_investmentlearn_crypto_tab_disclaimer_footer, null, null, 14), false, new ak0(null, null, 3), null, null, 0, 0, 0, 0, 2036));
                            break;
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                            iterableC = zhm.f0.f322471a;
                            break;
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                }
                return d0.E0(iterableC, arrayListU);
            case 9:
                ncj.g gVar3 = (ncj.g) obj7;
                rdj.c cVar6 = (rdj.c) obj6;
                z0h.c cVar7 = (z0h.c) obj5;
                ncj.c content = (ncj.c) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(content, "content");
                ncj.c cVar8 = (ncj.c) gVar3.f214230a.getContent();
                boolean z6 = (cVar8 == null || (bVar = cVar8.f214224a) == null || (list = bVar.f214223c) == null) ? false : !list.isEmpty();
                ncj.d chartType = gVar3.f214231b;
                if (!z6) {
                    return zhm.f0.f322471a;
                }
                qta.c cVar9 = content.f214225b;
                ListSubheaderDelegate.Model model3 = new ListSubheaderDelegate.Model("PRICE_TARGETS_WIDGET_HEADER_LIST_ID", (Image) null, (Clause) new TextLocalisedClause(com.revolut.retail.feature.cryptocommoditydetails.impl.R$string.commodity_price_targets_widget_title_start_text, null, null, 14), (Image) new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), (Clause) new TextLocalisedClause(R.string.common_action_see_all, null, new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), 10), (String) null, (ListSubheaderDelegate.Model.a) new ListSubheaderDelegate.Model.a.b(true, false, true, 2), false, false, (Object) new PriceTargetsWidgetContract$Parcel$SeeAllParcel(cVar9.f249046a, cVar9.f249047b, chartType), (Parcelable) null, 0, 0, 0, 0, 64418);
                if (!z) {
                    model3 = null;
                }
                Data data = gVar3.f214230a;
                ncj.e eVar2 = gVar3.f214234h;
                ncj.c cVar10 = (ncj.c) data.getContent();
                xi0.b bVar4 = gVar3.f214233g;
                List list6 = gVar3.d;
                List list7 = gVar3.e;
                List list8 = gVar3.f;
                if (cVar10 == null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                qta.c cVar11 = cVar10.f214225b;
                if (bVar4 == null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                if (list6 == null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                if (list7 == null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                if (list8 == null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                Float fValueOf = eVar2 != null ? Float.valueOf(eVar2.f214226a) : null;
                Clause clause2 = fValueOf != null ? ((q7) list6.get(rim.d.c(fValueOf.floatValue()))).f10493b : ((q7) d0.m0(list6)).f10493b;
                if ((eVar2 != null ? Float.valueOf(eVar2.f214227b) : null) != null) {
                    cVar = cVar11;
                    LocalDate localDate = ((l80.f) cVar6.f253462a).e().plusDays(rim.d.d(r2.floatValue()));
                    Intrinsics.checkNotNullExpressionValue(localDate, "plusDays(...)");
                    Intrinsics.checkNotNullParameter(localDate, "localDate");
                    long epochMilli = localDate.atStartOfDay(ZoneId.systemDefault()).toInstant().toEpochMilli();
                    TimeClause.Format.INSTANCE.getClass();
                    textLocalisedClause = new TimeClause(epochMilli, TimeClause.Format.f57959a, null, null, 12);
                } else {
                    cVar = cVar11;
                    textLocalisedClause = new TextLocalisedClause(com.revolut.retail.feature.cryptocommoditydetails.impl.R$string.commodity_price_targets_chart_header_subtitle, u.c(3), null, 12);
                }
                Intrinsics.checkNotNullParameter(chartType, "chartType");
                LayeredImage.Layer.Drawable drawable = new LayeredImage.Layer.Drawable(R$drawable.uikit_icn_bubble_background, Integer.valueOf(R$attr.uikit_colorAccent_10), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 2.0f, 2.0f, (com.revolut.core.ui_kit_core.displayers.image.models.c) null, 76);
                int i33 = rdj.b.f253461a[chartType.ordinal()];
                if (i33 == 1) {
                    i2 = R$drawable.uikit_icn_24_percent;
                } else {
                    if (i33 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i2 = R$drawable.uikit_icn_24_fees;
                }
                qta.c cVar12 = cVar;
                px pxVar = new px(new k1(clause2, textLocalisedClause, new LayeredImage(v.k(drawable, new LayeredImage.Layer.Drawable(i2, Integer.valueOf(R$attr.uikit_colorAccent), 6.0f, 6.0f, 6.0f, 6.0f, (com.revolut.core.ui_kit_core.displayers.image.models.c) null, 64)), (Float) null, (Float) null, 14), 24), new s7(list8, list7, new p7(new TextLocalisedClause(com.revolut.retail.feature.cryptocommoditydetails.impl.R$string.commodity_price_targets_chart_tooltip_high, null, null, 14), new TextLocalisedClause(com.revolut.retail.feature.cryptocommoditydetails.impl.R$string.commodity_price_targets_chart_tooltip_avg, null, null, 14), new TextLocalisedClause(com.revolut.retail.feature.cryptocommoditydetails.impl.R$string.commodity_price_targets_chart_tooltip_low, null, null, 14), list6), new m7(cVar12.f249048c.floatValue(), new MoneyClause(mif.a.Q(new ej0.b(cVar12.f249048c, bVar4)), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, o9.NON_SENSITIVE, 4)), o7.DEFAULT), new TextLocalisedClause((cVar7 != null ? cVar7.f318484a : null) != z0h.b.RL_UK ? com.revolut.retail.feature.cryptocommoditydetails.impl.R$string.trading_commodity_asset_details_price_targets_widget_chart_legend : com.revolut.retail.feature.cryptocommoditydetails.impl.R$string.commodity_price_targets_chart_legend, u.c(new TimeClause(cVar10.f214224a.f214222b.toEpochMilli(), new TimeClause.Format.Pretty(q0.DATETIME), null, ZoneOffset.UTC, 4)), null, 12), chartType);
                yp0.b.l(pxVar, 0, 0, 0, 0, null, false, 63);
                qv0.i[] elements = {model3, pxVar};
                Intrinsics.checkNotNullParameter(elements, "elements");
                return kotlin.collections.d.L(elements);
            default:
                uqh.d0 d0Var = (uqh.d0) obj7;
                String searchQuery = (String) obj6;
                Data data2 = (Data) obj5;
                List content2 = (List) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(content2, "content");
                if (content2.isEmpty()) {
                    if (searchQuery == null) {
                        searchQuery = "";
                    }
                    Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
                    FullScreenStateDelegate.Model emptyState = new FullScreenStateDelegate.Model("empty-screener-result-state", new TextLocalisedClause(R$string.screener_results_empty_state_search_title, null, null, 14), new TextLocalisedClause(R$string.screener_results_empty_state_search_subtitle, u.c(searchQuery), null, 12), new ComplexImage.Regular(new GlyphImage(R$drawable.uikit_icn_24_bar_chart_search, null, null, 6)), null, zj.REGULAR, false, null, null, null, 1984);
                    SmallActionButtonDelegate.Model clearSearchButton = new SmallActionButtonDelegate.Model("empty-screener-result-clear", h4.SEMIACCENT, null, null, new TextLocalisedClause(R$string.screener_action_clear_search, null, null, 14), null, new i4(), uqh.v.f282178a, null, 0, R$attr.uikit_dp24, 0, 0, 27992);
                    Intrinsics.checkNotNullParameter(emptyState, "emptyState");
                    Intrinsics.checkNotNullParameter(clearSearchButton, "clearSearchButton");
                    List listK = v.k(emptyState, clearSearchButton);
                    yp0.b.k(listK, 0, 0, 0, 0, 31);
                    return listK;
                }
                List<g0h.a> list9 = content2;
                ArrayList arrayList6 = new ArrayList(w.t(list9, 10));
                for (g0h.a aVar2 : list9) {
                    arrayList6.add(d0Var.f282138a.a(aVar2.f139492a, aVar2.f139493b, z));
                }
                yp0.b.k(arrayList6, 0, 0, 0, 0, 31);
                List listB = data2 != null ? ((m) d0Var.f282139b).b(data2) : null;
                if (listB == null) {
                    listB = zhm.f0.f322471a;
                }
                return d0.E0(listB, arrayList6);
        }
    }

    public /* synthetic */ a(g gVar, elb.a aVar, Set set, emh.c cVar, boolean z) {
        this.f112212a = 3;
        this.f112213b = gVar;
        this.f112214c = aVar;
        this.e = cVar;
        this.d = z;
    }

    public /* synthetic */ a(Object obj2, Object obj3, Object obj4, boolean z, int i) {
        this.f112212a = i;
        this.f112213b = obj2;
        this.f112214c = obj3;
        this.e = obj4;
        this.d = z;
    }

    public /* synthetic */ a(Object obj2, Object obj3, boolean z, Object obj4, int i) {
        this.f112212a = i;
        this.f112213b = obj2;
        this.f112214c = obj3;
        this.d = z;
        this.e = obj4;
    }

    public /* synthetic */ a(boolean z, String str, Role role, Function0 function0) {
        this.f112212a = 2;
        this.d = z;
        this.f112213b = str;
        this.f112214c = role;
        this.e = function0;
    }
}
