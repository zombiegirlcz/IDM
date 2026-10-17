package wp4;

import android.os.Parcelable;
import aw0.o9;
import aw0.r2;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.HeaderDelegate;
import com.revolut.core.ui_kit.delegates.LinearProgressWithAmountDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.core.ui_kit.delegates.ReferralContactDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SmallActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.c8;
import com.revolut.core.ui_kit.delegates.sf;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.delegates.widgets.ContactsWidgetDelegate;
import com.revolut.core.ui_kit.internal.views.ProgressStyle;
import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.ImageClauseTint;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.breb.api.R$string;
import com.revolut.feature.apm.core.models.alias.Alias;
import com.revolut.feature.apm.core.models.alias.AliasStatus;
import com.revolut.feature.apm.core.models.recipients.ApmIdentifier;
import com.revolut.feature.apm.core.models.recipients.PixBeneficiary;
import com.revolut.feature.robo.api.model.Benchmark;
import com.revolut.feature.shared_separate_favourites.domain.watchlist.Watchlist;
import com.revolut.feature.subaccount.api.models.SubaccountType;
import com.revolut.feature.topup_screen.api.TopupApi$Toggles;
import com.revolut.feature.topup_screen.api.model.StoredMethod;
import com.revolut.feature.trading.managed_portfolios.impl.ui.details.managed_portfolio_benchmark.ManagedPortfolioBenchmarkScreenContract$BenchmarkDetailsInputData;
import com.revolut.feature.wealth.analytics.domain.models.complex_analytics.PerformanceChart;
import com.revolut.feature.wealth.api.domain.model.WealthAccount;
import com.revolut.retail.feature.esim.api.model.EsimHyperText;
import com.revolut.retail.feature.esim.api.model.EsimIcon;
import com.revolut.retail.trading.core.domain.account_closure.AccountClosureStatus;
import com.youTransactor.uCube.rpc.Constants;
import dej.s2;
import dej.t2;
import dx4.e1;
import dx4.t1;
import ip0.ak0;
import ip0.ej;
import java.time.Instant;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.t0;
import ms0.h4;
import ms0.i4;
import mx0.c7;
import org.jmrtd.lds.LDSFile;
import whf.j;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class j0 implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f299069a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f299070b;

    public /* synthetic */ j0(Object obj2, int i) {
        this.f299069a = i;
        this.f299070b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object a(Object obj2, Object obj3, Object obj4) {
        wv1.b bVar = (wv1.b) this.f299070b;
        av1.d content = (av1.d) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        Alias alias = content.f9873a;
        if (alias == null) {
            bVar.getClass();
            return wv1.b.a();
        }
        AliasStatus aliasStatus = alias.f61880c;
        bVar.getClass();
        if (!Intrinsics.f(aliasStatus, AliasStatus.ACTIVE.f61885b)) {
            IllegalStateException illegalStateException = new IllegalStateException("unsupported area main alias status " + aliasStatus);
            zhm.h0 h0Var = zhm.h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
            return wv1.b.a();
        }
        TextClause textClause = new TextClause(bVar.f300260a.a(alias), (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        List listK = zhm.v.k(new TextLocalisedClause(R$string.bre_b_area_key_title, null, null, 14), new TextLocalisedClause(sv1.b.b(alias), null, null, 14));
        m70.a.a(t0.f186434a);
        HeaderDelegate.Model model = new HeaderDelegate.Model("BREB_KEY_HEADER_ID", null, new r2(textClause, new CompositeClause(listK, new TextClause(" · ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), null, 8)), null, null, null, false, 16378);
        String str = "BREB_KEY_ACTIONS_COPY_ID";
        ActionsView.Item item = new ActionsView.Item(str, mx0.d.ACCENT, false, null, null, new TextLocalisedClause(R$string.bre_b_area_key_actions_copy, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_copy, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, false, null, null, uv1.a.Copy, null, 24476);
        mx0.d dVar = mx0.d.SEMIACCENT;
        String str2 = "BREB_KEY_ACTIONS_SHARE_ID";
        Object[] objArr = 0 == true ? 1 : 0;
        Object[] objArr2 = 0 == true ? 1 : 0;
        Object[] objArr3 = 0 == true ? 1 : 0;
        Object[] objArr4 = 0 == true ? 1 : 0;
        Object[] objArr5 = 0 == true ? 1 : 0;
        Object[] objArr6 = 0 == true ? 1 : 0;
        List listK2 = zhm.v.k(model, new ip0.z("BREB_KEY_ACTIONS_ID", zhm.v.k(item, new ActionsView.Item(str2, dVar, false, objArr3, null, new TextLocalisedClause(R$string.bre_b_area_key_actions_share, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_share_ios, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, objArr, null, false, objArr2, null, uv1.a.Share, null, 24476), new ActionsView.Item("BREB_KEY_ACTIONS_MORE_ID", dVar, false, 0 == true ? 1 : 0, null, null, new ResourceImage(R$drawable.uikit_icn_24_more_ios, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), objArr4, objArr5, null, false, objArr6, null, uv1.a.More, null, 24476)), null, null, R$attr.uikit_dp32, 0, LDSFile.EF_DG12_TAG));
        yp0.b.k(listK2, 0, 0, 0, 0, 31);
        return listK2;
    }

    private final Object b(Object obj2, Object obj3, Object obj4) {
        wv1.f fVar = (wv1.f) this.f299070b;
        a12.l content = (a12.l) obj2;
        ((Boolean) obj3).booleanValue();
        Intrinsics.checkNotNullParameter(content, "content");
        return zhm.u.c(((s12.f) fVar.f300266a).e(content));
    }

    private final Object c(Object obj2, Object obj3, Object obj4) {
        wv1.g gVar = (wv1.g) this.f299070b;
        a12.m content = (a12.m) obj2;
        ((Boolean) obj3).booleanValue();
        Intrinsics.checkNotNullParameter(content, "content");
        return ((s12.i) gVar.f300267a).a(content);
    }

    private final Object d(Object obj2, Object obj3, Object obj4) {
        int i;
        wv4.l lVar = (wv4.l) this.f299070b;
        wv4.e data = (wv4.e) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(data, "data");
        um4.a aVar = data.f300290b;
        zm4.a aVar2 = data.f300289a;
        aim.e eVarB = zhm.u.b();
        MoneyClause moneyClauseB = sx4.f.b(3, null, null, aVar.f281222a);
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_statement_bottom_sheet_header_total_limit, null, null, 14);
        c8 c8Var = new c8(aVar.f281224c);
        CompositeClause compositeClause = new CompositeClause(zhm.v.k(new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_statement_bottom_sheet_header_spent, zhm.u.c(sx4.f.b(3, null, null, aVar.f281225g)), null, 12), new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_statement_bottom_sheet_header_available, zhm.u.c(sx4.f.b(3, null, null, aVar.f281226h)), new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 8)), new TextClause(" / ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), null, 8);
        int i2 = wv4.k.f300298a[aVar.i.ordinal()];
        if (i2 == 1) {
            i = R$attr.uikit_colorRed;
        } else {
            if (i2 != 2 && i2 != 3 && i2 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            i = R$attr.uikit_colorBlue;
        }
        LinearProgressWithAmountDelegate.Model.b.C0410b c0410b = new LinearProgressWithAmountDelegate.Model.b.C0410b(i);
        LinearProgressWithAmountDelegate.Model model = new LinearProgressWithAmountDelegate.Model("statement_bottom_sheet_header", moneyClauseB, textLocalisedClause, compositeClause, c8Var, new LinearProgressWithAmountDelegate.Model.e(c0410b, c0410b), null, 1984);
        yp0.b.l(model, R$attr.uikit_dp32, 0, 0, 0, null, false, 62);
        eVarB.add(model);
        Iterator it8 = aVar2.f323379a.iterator();
        while (it8.hasNext()) {
            eVarB.addAll(lVar.f300299a.b((e1) it8.next(), new ax4.b(0)));
        }
        aim.e eVarA = zhm.u.a(eVarB);
        t1 t1Var = aVar2.f323380b;
        return new wv4.h(eVarA, t1Var != null ? lVar.f300300b.b(t1Var) : null);
    }

    private final Object e(Object obj2, Object obj3, Object obj4) {
        wwi.t tVar = (wwi.t) this.f299070b;
        List recentlyViewedAirports = (List) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(recentlyViewedAirports, "recentlyViewedAirports");
        ArrayList arrayListG = recentlyViewedAirports.isEmpty() ? null : yp0.b.g(tVar.f300694a.a("ID_AIRPORT_", "_r", recentlyViewedAirports), new ListSubheaderDelegate.Model("ID_HEADER_RECENT_AIRPORTS", (Image) null, (Clause) new TextLocalisedClause(com.revolut.retail.feature.airportlounges.impl.R$string.airport_lounges_airport_search_recent_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126);
        return arrayListG == null ? zhm.f0.f322471a : arrayListG;
    }

    private final Object g(Object obj2, Object obj3, Object obj4) {
        wxe.a0 a0Var;
        List listB;
        wxe.h0 h0Var = (wxe.h0) this.f299070b;
        StoredMethod content = (StoredMethod) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        Throwable th10 = (Throwable) obj4;
        Intrinsics.checkNotNullParameter(content, "content");
        je6.h hVar = h0Var.f300909b;
        StoredMethod.Mandate mandate = content.f;
        StoredMethod.AccountDetails accountDetails = content.f90530b;
        StoredMethod.Institution institution = content.f90529a;
        if (mandate instanceof StoredMethod.Mandate.PayTo) {
            int i = R$drawable.uikit_icn_24_back_button_arrow;
            TextClause textClause = new TextClause(institution.f90539b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            Image imageB = ((di6.a) hVar).b(institution.f90540c);
            if (imageB == null) {
                imageB = sze.d.a(R$drawable.uikit_icn_24_bank);
            }
            a0Var = new wxe.a0(textClause, new CurrencyClause(accountDetails.d, CurrencyClause.Format.Ticker.f57756a, null, 4), imageB, i, au0.c0.NONE, R$attr.uikit_colorForeground);
        } else {
            Float fValueOf = Float.valueOf(16.0f);
            int i2 = R$drawable.uikit_icn_24_back_button_arrow;
            TextClause textClause2 = new TextClause(institution.f90539b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            Image imageB2 = ((di6.a) hVar).b(institution.f90540c);
            if (imageB2 == null) {
                imageB2 = sze.d.a(R$drawable.uikit_icn_24_bank);
            }
            a0Var = new wxe.a0(textClause2, new CompositeClause(zhm.v.k(new TextClause(accountDetails.f90533b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new ImageClause(R$drawable.uikit_icn_24_edit, new ImageClauseTint.Color(R$attr.uikit_colorAccent), fValueOf, fValueOf, 16)), new TextClause("  ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12), imageB2, i2, au0.c0.TEXT_AND_ICON, R$attr.uikit_colorAccent);
        }
        if (th10 == null) {
            aim.e eVarB = zhm.u.b();
            if (zBooleanValue && accountDetails.e == null) {
                eVarB.addAll(wxe.h0.b());
            } else {
                eVarB.addAll(h0Var.a(content));
            }
            listB = zhm.u.a(eVarB);
        } else {
            listB = iii.c.b(null, null, 6, false);
        }
        return new wxe.e0(a0Var, listB);
    }

    private final Object h(Object obj2, Object obj3, Object obj4) {
        PerformanceChart performanceChart = (PerformanceChart) this.f299070b;
        Optional benchmarkOptional = (Optional) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(benchmarkOptional, "benchmarkOptional");
        vyg.h hVar = (vyg.h) gj7.b.m(benchmarkOptional);
        if (hVar == null) {
            return null;
        }
        ResourceImage resourceImage = new ResourceImage(hVar.f293319a ? R$drawable.uikit_icn_24_eye_hide : R$drawable.uikit_icn_24_eye_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246);
        Object[] elements = {new TextClause(hVar.d, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), wyg.u.a(performanceChart, R$attr.uikit_colorAccent)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return new TagViewData(resourceImage, yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), kotlin.collections.d.L(elements)), new TagViewData.TagBackground.Solid(new Color.ModifiedColor(new Color.Solid(R$attr.uikit_colorAccent), 0.2f)), null, new TagViewData.TagOutline.Solid(R$attr.uikit_colorTransparent), false, null, null, null, R$attr.uikit_colorAccent, new wyg.d(hVar), 488);
    }

    private final Object i(Object obj2, Object obj3, Object obj4) {
        x0f.b0 b0Var = (x0f.b0) this.f299070b;
        Pair pair = (Pair) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(pair, "<destruct>");
        t61.g gVar = (t61.g) pair.f186385a;
        wi0.b bVar = (wi0.b) pair.f186386b;
        boolean zC = ((jte.d) b0Var.f301582c).c(TopupApi$Toggles.ExternalCardDetailsRevamp.f90463c);
        n3i.b bVar2 = b0Var.f301581b;
        t61.j jVar = gVar.f268142j;
        Image imageC = bVar2.c(jVar != null ? jVar.f268160c : null);
        wi0.b.Companion.getClass();
        boolean zF = Intrinsics.f(bVar, wi0.b.f297770q3);
        boolean z = gVar.i;
        Boolean boolValueOf = Boolean.valueOf(gVar.o);
        if (!zF) {
            boolValueOf = null;
        }
        LayeredImage layeredImageB = (z || !((jVar != null ? jVar.f268168q : null) == null) || !(boolValueOf != null ? boolValueOf.booleanValue() : true) || gVar.f268141h) ? LayeredImage.Companion.b(LayeredImage.INSTANCE, R$drawable.uikit_icn_16_exclamation_mark, Integer.valueOf(R$attr.uikit_colorStatusDanger), R$attr.uikit_colorBackground, 2.0f, Float.valueOf(16.0f), null, 32) : null;
        String strL = zC ? tz4.d.l(jVar) : jli.g.c(tz4.d.l(jVar));
        String str = gVar.d;
        String upperCase = gVar.e.toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        return new x0f.q(new TextClause(strL, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause(upperCase + " ··" + str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), imageC, layeredImageB);
    }

    private final Object j(Object obj2, Object obj3, Object obj4) {
        x18.x xVar = (x18.x) this.f299070b;
        rzj.k news = (rzj.k) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(news, "news");
        ArrayList arrayListA = xVar.f302348a.a(zhm.d0.V0(news.f258697a, 4));
        return arrayListA.isEmpty() ? zhm.f0.f322471a : yp0.b.g(arrayListA, x18.x.a(), null, 0, 0, 126);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x013e  */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v31 */
    /* JADX WARN: Type inference failed for: r13v10, types: [com.revolut.core.ui_kit.models.Style, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8, types: [com.revolut.core.ui_kit.models.Clause, com.revolut.core.ui_kit.models.Style, java.util.List] */
    /* JADX WARN: Type inference failed for: r13v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object k(java.lang.Object r46, java.lang.Object r47, java.lang.Object r48) {
        /*
            Method dump skipped, instruction units count: 1267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wp4.j0.k(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    private final Object l(Object obj2, Object obj3, Object obj4) {
        x6e.g gVar = (x6e.g) this.f299070b;
        List content = (List) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        List<pcd.v> list = content;
        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
        for (pcd.v vVar : list) {
            String strQ = j6.a.q("SUB_ACCOUNT_PENDING_ACTION", vVar.f234899a);
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.feature.subaccount.impl.R$string.group_pockets_invitation_action_title, zhm.u.c(new TextClause(vVar.f234900b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
            int i = com.revolut.feature.subaccount.impl.R$string.group_pockets_invitation_action_subtitle;
            pcd.x xVar = vVar.d;
            TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(i, zhm.u.c(new TextClause(com.google.android.gms.internal.mlkit_vision_face.a.o(xVar.d, " ", xVar.e), (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
            s6e.d dVar = (s6e.d) gVar.f303067b;
            ActionWidgetDelegate.Model model = new ActionWidgetDelegate.Model(strQ, textLocalisedClause, textLocalisedClause2, new com.revolut.core.ui_kit.delegates.m(dVar.c(SubaccountType.Group.f88960a), (LayeredImage) null, (ProgressStyle) null, 6), null, new com.revolut.core.ui_kit.delegates.k(new TextLocalisedClause(com.revolut.feature.subaccount.impl.R$string.group_pockets_invitation_action_review, null, null, 14), new TextLocalisedClause(com.revolut.feature.subaccount.impl.R$string.group_pockets_invitation_action_decline, null, null, 14), null, null, Constants.TAG_FC_SPEED_MODE), null, vVar, null, false, 8016);
            yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
            arrayList.add(model);
        }
        return arrayList;
    }

    private final Object m(Object obj2, Object obj3, Object obj4) {
        x6f.f fVar = (x6f.f) this.f299070b;
        List content = (List) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        Benchmark benchmark = fVar.f303089a;
        s0 s0Var = new s0(2);
        s0Var.a(new RowDelegate.Model("benchmarks_hide", new RowDelegate.Model.MainImage.Image40(LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_eye_hide, R$attr.uikit_colorAccentNeutral, R$attr.uikit_colorAccentNeutral_10), null, null, false, null, false, 62), new TextLocalisedClause(com.revolut.feature.trading.managed_portfolios.impl.R$string.managed_portfolios_template_details_benchmarks_hide_benchmark_item, null, null, 14), null, 0, null, null, null, 0, null, false, null, benchmark == null, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 532668408));
        List<Benchmark> list = content;
        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
        for (Benchmark benchmark2 : list) {
            arrayList.add(new RowDelegate.Model(j6.a.q("benchmarks_", benchmark2.e), new RowDelegate.Model.MainImage.Image40(LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_invest, R$attr.uikit_colorAccentNeutral, R$attr.uikit_colorAccentNeutral_10), null, null, false, null, false, 62), new TextClause(benchmark2.d, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, new TextClause(benchmark2.f85027a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 0, null, false, null, benchmark2.equals(benchmark), null, null, null, null, null, null, benchmark2, null, 0, 0, 0, 0, 532668376));
        }
        s0Var.b(arrayList.toArray(new RowDelegate.Model[0]));
        ArrayList arrayList2 = s0Var.f186433a;
        List listM = zhm.v.m(arrayList2.toArray(new RowDelegate.Model[arrayList2.size()]));
        yp0.b.k(listM, 0, 0, 0, 0, 31);
        if (benchmark != null || (benchmark = (Benchmark) zhm.d0.d0(content)) != null) {
            String str = benchmark.f85028b;
            TextClause textClause = str != null ? new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null;
            String str2 = benchmark.f85029c;
            Object[] elements = {textClause, str2 != null ? new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_robo_benchmark_selection_footer_learn_more, null, new Click(28, (Integer) null, (Object) new ManagedPortfolioBenchmarkScreenContract$BenchmarkDetailsInputData(benchmark.d, str2), "MARKET_AVERAGE_LEARN_MORE_CLICK_ID", false), 10) : null};
            Intrinsics.checkNotNullParameter(elements, "elements");
            List listL = kotlin.collections.d.L(elements);
            if (!((ArrayList) listL).isEmpty()) {
                return zhm.d0.F0(new TextDelegate.Model("benchmark_description", new CompositeClause(listL, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12), false, new ak0(null, null, 3), null, null, R$attr.uikit_dp8, 0, 0, 0, 1908), listM);
            }
        }
        return listM;
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, kotlin.Lazy] */
    private final Object n(Object obj2, Object obj3, Object obj4) {
        x6h.f fVar = (x6h.f) this.f299070b;
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        ((Boolean) obj3).getClass();
        return zBooleanValue ? (List) fVar.f303104a.getValue() : zhm.f0.f322471a;
    }

    private final Object o(Object obj2, Object obj3, Object obj4) {
        xaa.b bVar = (xaa.b) this.f299070b;
        List beneficiaries = (List) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(beneficiaries, "beneficiaries");
        List<f5j.a> list = beneficiaries;
        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
        for (f5j.a aVar : list) {
            arrayList.add(((fy1.q) bVar.f303794a).h(new PixBeneficiary(new ApmIdentifier.Uuid(aVar.f132329a), n61.j.e(aVar), aVar)));
        }
        boolean zIsEmpty = arrayList.isEmpty();
        List listC = arrayList;
        if (zIsEmpty) {
            listC = zhm.u.c(new ReferralContactDelegate.Model("PIX_AREA_BENEFICIARY_PLACEHOLDER_ITEM_ID", xaa.b.f303793b, new TextLocalisedClause(com.revolut.feature.pix.impl.R$string.pix_area_contacts_placeholder, null, null, 14), null, null, null, null, null, null, null, null, 524280));
        }
        return zhm.u.c(new ContactsWidgetDelegate.Model("PIX_AREA_BENEFICIARY_WIDGET_ID", listC, new TextLocalisedClause(com.revolut.feature.pix.impl.R$string.pix_area_contacts_title, null, null, 14), false, null, null, 56));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02de  */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object p(java.lang.Object r40, java.lang.Object r41, java.lang.Object r42) {
        /*
            Method dump skipped, instruction units count: 757
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wp4.j0.p(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    private final Object q(Object obj2, Object obj3, Object obj4) {
        xaa.h hVar = (xaa.h) this.f299070b;
        a12.m content = (a12.m) obj2;
        ((Boolean) obj3).booleanValue();
        Intrinsics.checkNotNullParameter(content, "content");
        return ((s12.i) hVar.f303800a).a(content);
    }

    private final Object r(Object obj2, Object obj3, Object obj4) {
        xg7.k kVar = (xg7.k) this.f299070b;
        kf7.r lotteryEnrollmentDetails = (kf7.r) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(lotteryEnrollmentDetails, "lotteryEnrollmentDetails");
        TextClause textClause = new TextClause(lotteryEnrollmentDetails.f183309b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        TextClause textClause2 = new TextClause(lotteryEnrollmentDetails.f183310c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        PromptMarketingContentDelegate.Model.Button button = new PromptMarketingContentDelegate.Model.Button((Clause) new TextClause(lotteryEnrollmentDetails.e, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), (ResourceImage) null, (LargeActionButton.ButtonStyle) LargeActionButton.ButtonStyle.f58725a, false, "LOTTERY_ENROLLMENT_BUTTON_LOADING_TAG", 22);
        PromptMarketingContentDelegate.Model.Footer footer = null;
        Parcelable parcelable = null;
        String str = null;
        String str2 = null;
        return new xg7.f(zhm.u.c(new PromptMarketingContentDelegate.Model("LOTTERY_PROMPT_ITEM_ID", textClause, textClause2, new PromptMarketingContentDelegate.Model.Content.MediaContent(new GlyphImage(kVar.f305623a.a(lotteryEnrollmentDetails.d), null, null, 6), null), null, null, new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, button, null, null, footer, "LOTTERY_ENROLLMENT_ACTION_UPDATE_ENROLLMENT_STATE", parcelable, str, str2, null, null, null, null, 2088368)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v9, types: [zhm.f0] */
    private final Object s(Object obj2, Object obj3, Object obj4) {
        ?? arrayList;
        xgd.m mVar = (xgd.m) this.f299070b;
        Map watchlistsActionsInfo = (Map) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(watchlistsActionsInfo, "watchlistsActionsInfo");
        List list = mVar.f305684b;
        if (list != null) {
            arrayList = new ArrayList();
            Iterator it8 = list.iterator();
            while (it8.hasNext()) {
                xgd.l lVar = (xgd.l) watchlistsActionsInfo.get((String) it8.next());
                if (lVar != null) {
                    arrayList.add(lVar);
                }
            }
        } else {
            arrayList = 0;
        }
        if (arrayList == 0) {
            arrayList = zhm.f0.f322471a;
        }
        Iterable<xgd.l> iterable = (Iterable) arrayList;
        ArrayList arrayList2 = new ArrayList(zhm.w.t(iterable, 10));
        for (xgd.l watchlistActionsInfo : iterable) {
            Intrinsics.checkNotNullParameter(watchlistActionsInfo, "watchlistActionsInfo");
            String strQ = j6.a.q("watchlist-row-", watchlistActionsInfo.f305681a.f86895a);
            Watchlist watchlist = watchlistActionsInfo.f305681a;
            TextClause textClause = new TextClause(watchlist.f86896b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            arrayList2.add(new RowDelegate.Model(strQ, watchlistActionsInfo.f305682b ? new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_delete, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorRed), (List) null, (ImageTransformations) null, new TextLocalisedClause(com.revolut.feature.shared_separate_favourites.api.R$string.watchlists_remove_watchlist_action_icon_accessibility_label, zhm.u.c(new TextClause(watchlist.f86896b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), LDSFile.EF_DG4_TAG), true, false, 4) : null, textClause, null, 0, null, null, null, 0, new tf(new yy0.h(new TextLocalisedClause(com.revolut.feature.shared_separate_favourites.api.R$string.watchlists_rename_watchlist_action_icon_accessibility_label, zhm.u.c(new TextClause(watchlist.f86896b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), new ResourceImage(R$drawable.uikit_icn_24_pencil, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246))), false, null, false, null, null, null, null, null, null, watchlistActionsInfo, null, 0, 0, 0, 0, 532675576));
        }
        yp0.b.k(arrayList2, 0, 0, 0, 0, 31);
        SmallActionButtonDelegate.Model model = new SmallActionButtonDelegate.Model("add-new-watchlist-button", h4.SEMIACCENT, new ResourceImage(R$drawable.uikit_icn_24_plus, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, new TextLocalisedClause(com.revolut.feature.shared_separate_favourites.api.R$string.watchlists_edit_watchlists_add_new_button_label, null, null, 14), null, new i4(), null, null, 0, 0, 0, 0, 32600);
        yp0.b.r(model, 0, 0, 0, 0, 15);
        return zhm.d0.F0(model, arrayList2);
    }

    private final Object t(Object obj2, Object obj3, Object obj4) {
        RowDelegate.Model.MainImage.Image24 image24;
        Image urlImage;
        int i;
        qee.s sVar = (qee.s) this.f299070b;
        dej.b0 content = (dej.b0) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        zhj.b bVar = (zhj.b) sVar.f245144b;
        Intrinsics.checkNotNullParameter(content, "content");
        ArrayList arrayList = content.f113493a;
        ArrayList arrayList2 = new ArrayList();
        Iterator it8 = arrayList.iterator();
        boolean z = false;
        int i2 = 0;
        while (true) {
            ej ejVar = null;
            if (!it8.hasNext()) {
                EsimHyperText esimHyperText = content.f113494b;
                if (esimHyperText != null) {
                    ej ejVar2 = new ej("ID_FOOTER_ITEM", new c7(wnj.a.d(bVar.f322426b, esimHyperText.f100276a, esimHyperText.f100277b, null, 12), false, null, 6));
                    int i3 = R$attr.uikit_dp16;
                    ejVar2.f = i3;
                    ejVar2.f164110g = i3;
                    ejVar = ejVar2;
                }
                return zhm.d0.E0(zhm.v.l(ejVar), arrayList2);
            }
            ArrayList<dej.d0> arrayList3 = ((dej.e0) it8.next()).f113526a;
            ArrayList arrayList4 = new ArrayList(zhm.w.t(arrayList3, 10));
            for (dej.d0 item : arrayList3) {
                zhj.d dVar = bVar.f322425a;
                int i5 = i2 + 1;
                String listId = "ID_MAIN_ITEM_" + i2;
                Intrinsics.checkNotNullParameter(listId, "listId");
                Intrinsics.checkNotNullParameter(item, "item");
                EsimIcon esimIcon = item.f113516a;
                if (esimIcon != null) {
                    dej.c0 c0Var = item.d;
                    if (esimIcon instanceof EsimIcon.Id) {
                        ResourceImage resourceImageM = dVar.f322428a.m(((EsimIcon.Id) esimIcon).f100281a);
                        int i6 = zhj.c.f322427a[c0Var.ordinal()];
                        if (i6 == 1) {
                            i = R$attr.uikit_colorPerformanceNegative;
                        } else {
                            if (i6 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            i = R$attr.uikit_colorAccentNeutral;
                        }
                        urlImage = ResourceImage.a(resourceImageM, 0, Integer.valueOf(i), null, Constants.TAG_BLE_FIRMWARE_VERSION);
                    } else {
                        if (!(esimIcon instanceof EsimIcon.Url)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        urlImage = new UrlImage(((EsimIcon.Url) esimIcon).f100282a, null, null, null, 0L, null, null, null, null, null, false, null, null, null, false, false, 524286);
                    }
                    image24 = new RowDelegate.Model.MainImage.Image24(urlImage, z, z, 6);
                } else {
                    image24 = null;
                }
                arrayList4.add(new RowDelegate.Model(listId, image24, new TextClause(item.f113517b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, null, null, null, 0, new tf(new yy0.j(new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254)), sf.TOP), false, null, false, null, null, null, null, null, null, item.f113518c, null, 0, 0, 0, 0, 532675576));
                i2 = i5;
            }
            yp0.b.k(arrayList4, 0, 0, 0, 0, 31);
            zhm.a0.x(arrayList4, arrayList2);
        }
    }

    private final Object u(Object obj2, Object obj3, Object obj4) {
        whh.s pVar;
        List listL;
        xih.g gVar = (xih.g) this.f299070b;
        List accountsClosures = (List) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(accountsClosures, "accountsClosures");
        List<whh.f> list = accountsClosures;
        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
        for (whh.f fVar : list) {
            if (fVar instanceof whh.d) {
                listL = zhm.v.l(gVar.f306410a.a(((whh.d) fVar).f297662b, whh.n.f297668a));
            } else if (fVar instanceof whh.c) {
                ArrayList<whh.b> arrayList2 = ((whh.c) fVar).f297660a;
                ArrayList arrayList3 = new ArrayList();
                for (whh.b bVar : arrayList2) {
                    ActionWidgetDelegate.Model modelA = gVar.f306410a.a(bVar.f297659b, new whh.m(bVar.f297658a));
                    if (modelA != null) {
                        arrayList3.add(modelA);
                    }
                }
                listL = arrayList3;
            } else if (fVar instanceof whh.a) {
                listL = zhm.v.l(gVar.f306410a.a(((whh.a) fVar).f297657b, whh.l.f297666a));
            } else {
                if (!(fVar instanceof whh.e)) {
                    throw new NoWhenBranchMatchedException();
                }
                xih.f fVar2 = gVar.f306410a;
                whh.e eVar = (whh.e) fVar;
                WealthAccount.TaxAdvantageWealthAccount taxAdvantageWealthAccount = eVar.f297663a;
                AccountClosureStatus accountClosureStatus = eVar.f297664b;
                if (taxAdvantageWealthAccount instanceof WealthAccount.TaxAdvantageWealthAccount.Isa) {
                    pVar = new whh.o(((WealthAccount.TaxAdvantageWealthAccount.Isa) taxAdvantageWealthAccount).f95241a);
                } else if (taxAdvantageWealthAccount instanceof WealthAccount.TaxAdvantageWealthAccount.Pea) {
                    pVar = new whh.q(((WealthAccount.TaxAdvantageWealthAccount.Pea) taxAdvantageWealthAccount).f95253a);
                } else {
                    if (!(taxAdvantageWealthAccount instanceof WealthAccount.TaxAdvantageWealthAccount.JIsa)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    pVar = new whh.p(taxAdvantageWealthAccount.getF95253a(), taxAdvantageWealthAccount.getF().f105176b);
                }
                listL = zhm.v.l(fVar2.a(accountClosureStatus, pVar));
            }
            arrayList.add(listL);
        }
        return arrayList;
    }

    private final Object v(Object obj2, Object obj3, Object obj4) {
        Iterable iterableG;
        qv0.i iVar;
        xlj.i iVar2 = (xlj.i) this.f299070b;
        List payments = (List) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(payments, "payments");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj5 : payments) {
            Instant instantOfEpochMilli = Instant.ofEpochMilli(((t2) obj5).a());
            Intrinsics.checkNotNullExpressionValue(instantOfEpochMilli, "ofEpochMilli(...)");
            LocalDate localDateW = oi0.d.W(instantOfEpochMilli);
            Object objU = linkedHashMap.get(localDateW);
            if (objU == null) {
                objU = h30.l.u(linkedHashMap, localDateW);
            }
            ((List) objU).add(obj5);
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            LocalDate localDate = (LocalDate) entry.getKey();
            List<t2> list = (List) entry.getValue();
            ArrayList arrayList2 = new ArrayList();
            for (t2 t2Var : list) {
                if (t2Var instanceof dej.r2) {
                    dej.r2 r2Var = (dej.r2) t2Var;
                    whf.p pVar = new whf.p(zhm.u.c(r2Var.f113640a), r2Var.f113641b, r2Var.f113642c);
                    iVar = (qv0.i) zhm.d0.d0(((anf.w) iVar2.f307028a).c(pVar, new whf.l(0), j.a.f297643a));
                } else {
                    if (!(t2Var instanceof s2)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    iVar = null;
                }
                if (iVar != null) {
                    arrayList2.add(iVar);
                }
            }
            if (arrayList2.isEmpty()) {
                iterableG = zhm.f0.f322471a;
            } else {
                String strS = h30.l.s("subheaderItemId_", localDate);
                long jF = oc.c.F(localDate);
                TimeClause.Format.INSTANCE.getClass();
                iterableG = yp0.b.g(arrayList2, new ListSubheaderDelegate.Model(strS, (Image) null, (Clause) new TimeClause(jF, TimeClause.Format.f57959a, null, null, 12), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, R$attr.uikit_dp16, LDSFile.EF_DG4_TAG);
            }
            zhm.a0.x(iterableG, arrayList);
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:347:0x0b45  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x0b5f  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x0b62  */
    /* JADX WARN: Type inference failed for: r10v50 */
    /* JADX WARN: Type inference failed for: r10v51 */
    /* JADX WARN: Type inference failed for: r10v52, types: [com.revolut.core.ui_kit.models.Style, java.util.List] */
    /* JADX WARN: Type inference failed for: r10v60 */
    /* JADX WARN: Type inference failed for: r10v61 */
    /* JADX WARN: Type inference failed for: r1v103 */
    /* JADX WARN: Type inference failed for: r1v104, types: [com.revolut.core.ui_kit.models.Clause, com.revolut.core.ui_kit.models.Custom] */
    /* JADX WARN: Type inference failed for: r1v111 */
    /* JADX WARN: Type inference failed for: r1v140, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v95 */
    /* JADX WARN: Type inference failed for: r1v96, types: [com.revolut.core.ui_kit.models.Clause, com.revolut.core.ui_kit.models.Custom] */
    /* JADX WARN: Type inference failed for: r1v98 */
    @Override // kotlin.jvm.functions.Function3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r53, java.lang.Object r54, java.lang.Object r55) {
        /*
            Method dump skipped, instruction units count: 3702
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wp4.j0.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public /* synthetic */ j0(Object obj2, Object obj3, int i) {
        this.f299069a = i;
        this.f299070b = obj3;
    }
}
