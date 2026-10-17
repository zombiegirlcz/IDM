package vh2;

import android.os.Parcelable;
import aw0.c7;
import aw0.ka;
import aw0.o9;
import aw0.t0;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.android.bug_report.api.BugReportApi$Toggles$InAppBugReporting;
import com.revolut.core.model.money.ScaleMode;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CounterTextDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListingCardBasicDelegate;
import com.revolut.core.ui_kit.delegates.NewRevolutCardDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.delegates.SmallActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.l6;
import com.revolut.core.ui_kit.delegates.l9;
import com.revolut.core.ui_kit.delegates.pf;
import com.revolut.core.ui_kit.delegates.sa;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.LocalDateClause$DateFormat;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.PercentageClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.models.badge.DangerCircleBadge;
import com.revolut.core.ui_kit.views.FixedTabs;
import com.revolut.core.ui_kit.views.navbar.TextNavBarMenuItem;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.CountryImage;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.card.view_pin.api.R$plurals;
import com.revolut.feature.card.view_pin.ui.screen.show_card_pin_screen.ShowCardPinScreenContract$InputData;
import com.revolut.feature.crypto.withdraw.api.models.CryptoAddress;
import com.revolut.feature.defi.common.models.domain.DeFiAssetAmount;
import com.revolut.feature.defi.common.models.domain.DeFiAssetAmountWithFiat;
import com.revolut.feature.defi.common.models.domain.DeFiFiatAmount;
import com.revolut.feature.defi.remittances.impl.domain.model.DeFiTransferQuoteRequest;
import com.revolut.feature.profile.api.ProfileApi$Toggles$RevampedProfileScreen;
import com.revolut.feature.staking.api.StakingApi$FeatureToggles;
import com.revolut.feature.tax_residency.api.exemption.model.TaxExemptionAggregate;
import com.revolut.feature.tax_residency.impl.R$string;
import com.revolut.feature_travel_hotels_models.property.HotelsProperty;
import com.revolut.feature_travel_hotels_models.property.search.LocationData;
import com.revolut.retail.feature.trading_onboarding.impl.ui.kyc_details_nationality.model.NationalitiesInput;
import com.revolut.retail.feature.trading_onboarding.impl.ui.kyc_details_nationality.model.NationalityInput;
import com.revolut.revolut.feature_fourthline_impl.R;
import com.revolut.shared.cards.model.Card;
import com.revolut.shared.cards.model.card_config.domain.CardDetailsConfigBackground;
import com.revolut.shared.cards.model.card_config.domain.CardDetailsDesignConfig;
import com.revolut.shared.feature.wealth.models.config.TradingLegalEntityInformation;
import com.revolut.shared.feature.wealth.ui_kit.models.image.InstrumentImage;
import com.youTransactor.uCube.rpc.Constants;
import igh.b0;
import ip0.ak0;
import ip0.ck0;
import ip0.dy;
import ip0.fe0;
import ip0.nb0;
import ip0.pb0;
import ip0.t5;
import ip0.y10;
import ip0.yj0;
import ip0.zj;
import java.io.IOException;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import ms0.h4;
import ms0.j4;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import ueg.c0;
import vzk.x;
import wp4.j0;
import wvg.r1;
import wwi.f;
import wwi.t;
import yp0.e0;
import yp0.r;
import zhm.a0;
import zhm.d0;
import zhm.f0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class o implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f289292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f289293b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f289294c;

    public /* synthetic */ o(Object obj2, Object obj3, int i) {
        this.f289292a = i;
        this.f289293b = obj2;
        this.f289294c = obj3;
    }

    private final Object a(Object obj2, Object obj3, Object obj4) {
        Object next;
        RowDelegate.Model.MainImage.Image40 image40;
        RowDelegate.Model model;
        TextLocalisedClause textLocalisedClause = (TextLocalisedClause) this.f289293b;
        vne.c cVar = (vne.c) this.f289294c;
        List exemptionDetails = (List) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(exemptionDetails, "exemptionDetails");
        Iterator it8 = exemptionDetails.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (Intrinsics.f(s.k((TaxExemptionAggregate) next), cVar.f290798b)) {
                break;
            }
        }
        TaxExemptionAggregate taxExemptionAggregate = (TaxExemptionAggregate) next;
        boolean z = exemptionDetails.size() > 1;
        aim.e eVarB = u.b();
        if (taxExemptionAggregate != null) {
            dj0.d dVar = taxExemptionAggregate.d;
            boolean z3 = dVar != null;
            boolean z4 = taxExemptionAggregate.f89974h == null;
            if (z) {
                InputTextDelegate.Model modelA = r.a(new InputTextDelegate.Model("YEAR_SELECTION_ID", new TextClause(taxExemptionAggregate.f89971b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, false, null, false, null, null, null, null, null, null, false, null, null, false, false, false, false, null, 0, null, null, false, false, null, null, false, null, false, false, null, false, false, 0, false, false, null, null, null, null, 0, 0, 0, 0, -4, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH));
                yp0.b.r(modelA, 0, 0, 0, 0, 15);
                eVarB.add(modelA);
            }
            ListSubheaderDelegate.Model model2 = new ListSubheaderDelegate.Model("ITEM_HEADER_ROW", (Image) null, (Clause) new TextLocalisedClause(z3 ? R$string.tax_exemption_exempt_via : R$string.tax_exemption_exempt_from, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530);
            TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause((z3 && z4) ? R$string.tax_exemption_order_individual : (!z3 || z4) ? R$string.tax_exemption_witholding_tax : R$string.tax_exemption_order_joint, null, null, 14);
            if (z3) {
                image40 = new RowDelegate.Model.MainImage.Image40(LayeredImage.INSTANCE.i(z4 ? R$drawable.uikit_icn_24_profile : R$drawable.uikit_icn_24_people, R$attr.uikit_colorAccentNeutral, R$attr.uikit_colorAccentNeutral_10), null, null, false, null, false, 62);
            } else {
                image40 = new RowDelegate.Model.MainImage.Image40(LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_form, R$attr.uikit_colorAccentNeutral, R$attr.uikit_colorAccentNeutral_10), null, null, false, null, false, 62);
            }
            RowDelegate.Model model3 = new RowDelegate.Model("EXEMPTION_DETAIL_ROW", image40, textLocalisedClause2, null, 0, null, null, null, 0, !z3 ? new pf(new TextLocalisedClause(R$string.common_action_add, null, null, 14), null, null, false, null, null, 510) : null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536867832);
            if (z3 && z4) {
                model = new RowDelegate.Model("EXEMPTION_EDIT_ROW", null, new TextLocalisedClause(R$string.tax_exemption_limit_order_amount_to_exempt, null, null, 14), null, 0, dVar != null ? new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12) : null, null, null, 0, new tf(4, new ResourceImage(R$drawable.uikit_icn_24_pencil, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), true), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536867802);
            } else {
                model = null;
            }
            Object[] elements = {model2, model3, model};
            Intrinsics.checkNotNullParameter(elements, "elements");
            List listL = kotlin.collections.d.L(elements);
            yp0.b.k(listL, 0, 0, 0, 0, 31);
            eVarB.addAll(listL);
            if (z3) {
                ak0 ak0Var = new ak0(yj0.CENTER_HORIZONTAL, null, 2);
                int i = R$string.tax_exemption_limit_order_footer;
                MoneyClause moneyClause = new MoneyClause(taxExemptionAggregate.e, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12);
                long j2 = taxExemptionAggregate.f89970a;
                TimeClause.Format.INSTANCE.getClass();
                eVarB.add(new TextDelegate.Model("FOOTER_ID", new TextLocalisedClause(i, v.k(moneyClause, new TimeClause(j2, TimeClause.Format.f57959a, null, null, 12)), null, 12), false, ak0Var, null, null, 0, 0, 0, 0, 2036));
            }
        }
        return new vne.g(textLocalisedClause, u.a(eVarB));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0120  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object b(java.lang.Object r76, java.lang.Object r77, java.lang.Object r78) {
        /*
            Method dump skipped, instruction units count: 1263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vh2.o.b(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:79:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0272  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object c(java.lang.Object r38, java.lang.Object r39, java.lang.Object r40) {
        /*
            Method dump skipped, instruction units count: 852
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vh2.o.c(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object d(java.lang.Object r3, java.lang.Object r4, java.lang.Object r5) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f289293b
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r1 = r2.f289294c
            com.revolut.feature.card_label.ui.screen.card_label_screen.e r1 = (com.revolut.feature.card_label.ui.screen.card_label_screen.e) r1
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            r4.getClass()
            java.lang.Throwable r5 = (java.lang.Throwable) r5
            java.lang.String r4 = "content"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r4)
            boolean r3 = kotlin.jvm.internal.Intrinsics.f(r3, r0)
            if (r3 != 0) goto L4a
            int r3 = r0.length()
            com.revolut.feature.card_label.ui.screen.card_label_screen.CardLabelScreenContract$InputData r4 = r1.f64772a
            int r4 = r4.f64761b
            r5 = 0
            if (r3 <= r4) goto L31
            com.revolut.core.ui_kit.models.TextLocalisedClause r3 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r4 = com.revolut.feature.card_label.api.R$string.label_card_input_helper_max_limit
            r1 = 14
            r3.<init>(r4, r5, r5, r1)
            r5 = r3
        L31:
            if (r5 != 0) goto L4a
            java.lang.CharSequence r3 = kotlin.text.d0.F0(r0)
            java.lang.String r3 = r3.toString()
            int r3 = r3.length()
            if (r3 <= 0) goto L42
            goto L48
        L42:
            int r3 = r0.length()
            if (r3 != 0) goto L4a
        L48:
            r3 = 1
            goto L4b
        L4a:
            r3 = 0
        L4b:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: vh2.o.d(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    private final Object e(Object obj2, Object obj3, Object obj4) {
        hxi.d dVar;
        vyi.s sVar = (vyi.s) this.f289293b;
        vyi.i iVar = (vyi.i) this.f289294c;
        List lounges = (List) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(lounges, "lounges");
        List list = (List) iii.c.f(iVar.f293336b, new vw4.j(27), new vv7.l(17), new uw2.n(28));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj5 : lounges) {
            String str = ((svi.b) obj5).f265876c;
            Object objO = linkedHashMap.get(str);
            if (objO == null) {
                objO = v0.a.o(linkedHashMap, str);
            }
            ((List) objO).add(obj5);
        }
        ArrayList arrayList = new ArrayList();
        Iterator it8 = linkedHashMap.entrySet().iterator();
        while (it8.hasNext()) {
            List list2 = (List) ((Map.Entry) it8.next()).getValue();
            svi.b bVar = (svi.b) d0.b0(list2);
            ListSubheaderDelegate.Model model = new ListSubheaderDelegate.Model(j6.a.q("ID_SUBHEADER_", bVar.e), (Image) null, (Clause) new TextClause(j6.a.r(bVar.d, " (", bVar.e, ")"), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530);
            List<svi.b> list3 = list2;
            ArrayList arrayList2 = new ArrayList(w.t(list3, 10));
            for (svi.b bVar2 : list3) {
                if (list == null) {
                    dVar = hxi.d.UNKNOWN;
                } else {
                    List list4 = list;
                    boolean z = false;
                    if (!(list4 instanceof Collection) || !list4.isEmpty()) {
                        Iterator it9 = list4.iterator();
                        while (true) {
                            if (!it9.hasNext()) {
                                break;
                            }
                            if (Intrinsics.f((String) it9.next(), bVar2.f265874a)) {
                                z = true;
                                break;
                            }
                        }
                    }
                    if (z) {
                        dVar = hxi.d.SAVED;
                    } else {
                        if (z) {
                            throw new NoWhenBranchMatchedException();
                        }
                        dVar = hxi.d.NOT_SAVED;
                    }
                }
                ListingCardBasicDelegate.Model modelB = sVar.f293347a.b(bVar2, dVar);
                yp0.b.l(modelB, 0, 0, 0, 0, null, false, 63);
                arrayList2.add(modelB);
            }
            a0.x(i2b.a.q(model, arrayList2), arrayList);
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r16v5, types: [com.revolut.core.ui_kit.models.badge.CircleBadgeModel] */
    /* JADX WARN: Type inference failed for: r16v8 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v4, types: [ez0.e, java.lang.Integer] */
    private final Object g(Object obj2, Object obj3, Object obj4) {
        List listC;
        vzk.g gVar = (vzk.g) this.f289293b;
        x xVar = (x) this.f289294c;
        NationalitiesInput nationalitiesInput = (NationalitiesInput) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        Intrinsics.checkNotNullParameter(nationalitiesInput, "nationalitiesInput");
        if (!zBooleanValue) {
            boolean z = gVar.f293549c;
            Data data = gVar.d;
            if (!z) {
                List list = nationalitiesInput.f104193a;
                int i = 14;
                ?? r92 = 0;
                if (list.isEmpty()) {
                    return new vzk.n(x.c(false), x.d(data), yp0.b.g(u.c(new RowDelegate.Model("TRADING_KYC_NO_NATIONALITY_ITEM_ID", new RowDelegate.Model.MainImage.Image40(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D021", null, null, null, 30), null, null, false, null, false, 62), new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_trading_onboarding_kyc_nationalities_empty_nationality, null, null, 14), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870904)), xVar.b(true), e0.OUTSIDE_BOX, 0, 0, 124));
                }
                vzk.k kVarC = x.c(nationalitiesInput.f104194b);
                Clause clauseD = x.d(data);
                List<NationalityInput> list2 = list;
                ArrayList arrayList = new ArrayList(w.t(list2, 10));
                for (NationalityInput nationalityInput : list2) {
                    String str = nationalityInput.f104195a.f297794a;
                    RowDelegate.Model.MainImage.Image40 image40 = new RowDelegate.Model.MainImage.Image40(new CountryImage(str, (Integer) r92, (ez0.e) r92, i), !nationalityInput.f104197c ? new DangerCircleBadge(dw0.a.Error) : r92, null, false, null, false, 60);
                    qd0.b.Companion.getClass();
                    String lowerCase = str.toLowerCase(qd0.a.f244819b);
                    arrayList.add(new RowDelegate.Model("TRADING_KYC_NATIONALITY_ITEM_ID", image40, new TextLocalisedClause(t61.a.p(lowerCase, "toLowerCase(...)", "nationality.", lowerCase), (List) null, (Clause) new TextClause(((o8b.c) xVar.f293574a).b(str), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), false, 22), null, 0, null, null, null, 0, nationalityInput.f104196b ? new tf(6, new ResourceImage(R$drawable.uikit_icn_24_pencil, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), false) : null, false, null, false, null, null, null, null, null, null, nationalityInput.f104195a, null, 0, 0, 0, 0, 532675576));
                    i = 14;
                    r92 = 0;
                }
                ArrayList arrayListG = yp0.b.g(arrayList, xVar.b(list.size() <= 4 || xVar.f293575b.f104204b), e0.OUTSIDE_BOX, 0, 0, 124);
                List list3 = list;
                if ((list3 instanceof Collection) && list3.isEmpty()) {
                    listC = null;
                } else {
                    Iterator it8 = list3.iterator();
                    while (it8.hasNext()) {
                        if (!((NationalityInput) it8.next()).f104197c) {
                            listC = u.c(new TextDelegate.Model("NATIONALITY_ERROR_LIST_ID", new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_trading_onboarding_kyc_nationality_error_usPerson, null, new Custom(Integer.valueOf(R$attr.uikit_colorRed), false, null, false, null, 254), 10), false, new ak0(null, null, 3), null, null, 0, 0, 0, 0, 2036));
                            break;
                        }
                    }
                    listC = null;
                }
                List[] elements = {arrayListG, listC};
                Intrinsics.checkNotNullParameter(elements, "elements");
                return new vzk.n(kVarC, clauseD, w.u(kotlin.collections.d.L(elements)));
            }
        }
        return (vzk.n) xVar.f293576c.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object h(java.lang.Object r40, java.lang.Object r41, java.lang.Object r42) {
        /*
            Method dump skipped, instruction units count: 481
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vh2.o.h(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    private final Object i(Object obj2, Object obj3, Object obj4) {
        w4b.b bVar = (w4b.b) this.f289293b;
        Data data = (Data) this.f289294c;
        dj0.d content = (dj0.d) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        int i = com.revolut.feature.retail.cfd.impl.R$string.wealth_margin_withdraw_amount_available;
        List listC = u.c(new MoneyClause(content, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12));
        Custom custom = new Custom(Integer.valueOf(R$attr.uikit_colorRed), false, null, false, null, 254);
        bVar.getClass();
        if (!((Boolean) iii.c.f(data, new w29.a(19), new w2.d(20), new w2a.o(2))).booleanValue()) {
            custom = null;
        }
        return new TextLocalisedClause(i, listC, custom, 8);
    }

    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [com.revolut.core.ui_kit.models.Custom, com.revolut.core.ui_kit.models.Style, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v6 */
    private final Object j(Object obj2, Object obj3, Object obj4) {
        ?? r56;
        ?? r72;
        char c2;
        qv0.i iVarB;
        w56.r rVar = (w56.r) this.f289293b;
        w56.g gVar = (w56.g) this.f289294c;
        i56.e quote = (i56.e) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(quote, "quote");
        Data data = gVar.f294703c;
        DeFiTransferQuoteRequest deFiTransferQuoteRequest = gVar.f294701a;
        boolean z = rVar.f294717a.f71852b;
        aim.e eVarB = u.b();
        CounterTextDelegate.Model.Companion companion = CounterTextDelegate.Model.INSTANCE;
        String string = quote.d.a().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        TextClause textClause = new TextClause(string, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        DeFiAssetAmount deFiAssetAmount = quote.d;
        CounterTextDelegate.Model modelA = CounterTextDelegate.Model.Companion.a(companion, "DeFiSendReviewScreen_Header", null, yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), v.k(textClause, new TextClause(deFiAssetAmount.f71681b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126))), null, null, null, 0, 0, 4090);
        yp0.b.r(modelA, 0, 0, 0, 0, 15);
        eVarB.add(modelA);
        p56.a aVar = rVar.f294719c;
        CryptoAddress wallet = (CryptoAddress) data.getContent();
        if (wallet != null) {
            ko5.a aVarE = CryptoAddress.e(wallet, 8, 2);
            Image imageN = p56.a.n(wallet, z, 8);
            Intrinsics.checkNotNullParameter(wallet, "wallet");
            RowDelegate.Model.MainImage.Image40 image40 = new RowDelegate.Model.MainImage.Image40(imageN, !z ? ((bp5.b) ((io5.b) aVar.f233024b)).b(wallet) : null, null, false, 28);
            TextClause textClause2 = new TextClause(aVarE.f186223a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            String str = aVarE.f186224b;
            TextClause textClause3 = str != null ? new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null;
            tf tfVar = !z ? new tf(new yy0.j(new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone20), (List) null, (ImageTransformations) null, (Clause) null, 246))) : null;
            boolean z3 = !z;
            r56 = 0;
            r72 = 1;
            c2 = 2;
            iVarB = new RowDelegate.Model("DeFiSendReviewScreen_Wallet", image40, textClause2, null, 0, textClause3, null, null, 0, tfVar, z3, null, false, null, null, null, null, null, null, wallet, null, 0, 0, 0, 0, 532673496);
        } else {
            r56 = 0;
            r72 = 1;
            c2 = 2;
            iVarB = nb0.b(pb0.Companion, "DeFiSendReviewScreen_Wallet", false, 0, false, 30);
        }
        qv0.i iVar = iVarB;
        yp0.b.l(iVar, 0, 0, 0, 0, null, false, 63);
        eVarB.add(iVar);
        CellDetailsDelegate.Model model = new CellDetailsDelegate.Model("DeFiSendReviewScreen_Chain", new t0((Clause) new TextLocalisedClause(com.revolut.feature.defi.remittances.impl.R$string.crypto_defi_send_review_transfer_recipient_network, r56, r56, 14), (Image) null, 0, false, 30), ((ik5.a) rVar.f294718b).b(deFiTransferQuoteRequest.i, r72, null), null, null, null, null, 0, null, false, false, null, null, 32760);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        eVarB.add(model);
        t0 t0Var = new t0((Clause) new TextLocalisedClause(com.revolut.feature.defi.remittances.impl.R$string.crypto_defi_send_review_transfer_amount_recipient_gets, r56, r56, 14), (Image) null, 0, false, 30);
        String string2 = deFiAssetAmount.a().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        CellDetailsDelegate.Model model2 = new CellDetailsDelegate.Model("DeFiSendReviewScreen_RecipientGets", t0Var, yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), v.k(new TextClause(string2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause(deFiAssetAmount.f71681b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126))), null, null, null, null, 0, null, false, false, null, null, 32760);
        DeFiAssetAmountWithFiat deFiAssetAmountWithFiat = quote.f158771h.f71691a;
        t0 t0Var2 = new t0((Clause) new TextLocalisedClause(com.revolut.feature.defi.remittances.impl.R$string.crypto_defi_send_review_transfer_amount_fees, r56, r56, 14), (Image) new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246), 0, false, 20);
        MoneyClause moneyClause = new MoneyClause(u80.q.a(deFiAssetAmountWithFiat.f71683a.a(), (xi0.b) deFiAssetAmountWithFiat.f71683a.f.getValue()), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12);
        DeFiFiatAmount deFiFiatAmount = deFiAssetAmountWithFiat.f71684b;
        CellDetailsDelegate.Model model3 = new CellDetailsDelegate.Model("DeFiSendReviewScreen_Fees", t0Var2, moneyClause, u5l.a.d(deFiFiatAmount.f71694a, deFiFiatAmount.f71695b, null, null, o9.NON_SENSITIVE, 14), null, null, null, 0, null, false, false, null, null, 32752);
        DeFiAssetAmount deFiAssetAmount2 = quote.f158768b;
        CellDetailsDelegate.Model model4 = new CellDetailsDelegate.Model("DeFiSendReviewScreen_EstimatedTotal", new t0((Clause) new TextLocalisedClause(com.revolut.feature.defi.remittances.impl.R$string.crypto_defi_send_review_transfer_amount_estimated_total, r56, r56, 14), (Image) null, 0, false, 30), u5l.a.e(new ej0.b(deFiAssetAmount2.a(), (xi0.b) deFiAssetAmount2.f.getValue()), r56), null, null, null, null, 0, null, false, false, null, null, 32760);
        qv0.i[] iVarArr = new qv0.i[3];
        iVarArr[0] = model2;
        iVarArr[r72] = model3;
        iVarArr[c2] = model4;
        List listK = v.k(iVarArr);
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        eVarB.addAll(listK);
        return u.a(eVarB);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0481 A[LOOP:6: B:138:0x047b->B:140:0x0481, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x04a8  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x052f  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0548  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0555  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x05de  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x05f9 A[LOOP:8: B:181:0x05f3->B:183:0x05f9, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0620  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0651 A[LOOP:10: B:196:0x064b->B:198:0x0651, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0678  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x075c  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0802  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0804  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0810  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0824  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0889  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0a1f  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0a26  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0a31  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0ae0  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0b35  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0b3f  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0b49  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0b67  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0b72  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x0b82  */
    /* JADX WARN: Type inference failed for: r10v19, types: [com.revolut.core.ui_kit.models.Style] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r6v16, types: [mag.g] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object k(java.lang.Object r61, java.lang.Object r62, java.lang.Object r63) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 3016
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vh2.o.k(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    private final Object l(Object obj2, Object obj3, Object obj4) {
        c0 c0Var = (c0) this.f289293b;
        weg.p pVar = (weg.p) this.f289294c;
        Pair pair = (Pair) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(pair, "<destruct>");
        Set favoritesPropertiesIds = (Set) pair.f186385a;
        List list = (List) pair.f186386b;
        ArrayList arrayList = new ArrayList();
        boolean z = c0Var.f279374b;
        boolean z3 = c0Var.d;
        boolean z4 = c0Var.f279375c;
        if (z) {
            rag.e eVar = pVar.f296789a;
            pag.a aVar = pVar.f296790b;
            ArrayList properties = c0Var.f279373a;
            LocationData locationData = c0Var.e;
            rag.g gVar = (rag.g) eVar;
            gVar.getClass();
            Intrinsics.checkNotNullParameter(properties, "properties");
            Intrinsics.checkNotNullParameter(favoritesPropertiesIds, "favoritesPropertiesIds");
            ArrayList arrayListY = com.google.android.gms.internal.mlkit_vision_face.a.y("visibleInventoryProvidersList", list);
            for (Object obj5 : properties) {
                if (((HotelsProperty) obj5).A == ufi.h.EXACT) {
                    arrayListY.add(obj5);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj6 : properties) {
                ufi.h hVar = ((HotelsProperty) obj6).A;
                if (hVar == ufi.h.NEARBY || hVar == ufi.h.EXTENDED) {
                    arrayList2.add(obj6);
                }
            }
            List listB = (arrayListY.isEmpty() && arrayList2.isEmpty()) ? gVar.b(properties, favoritesPropertiesIds, list, locationData, null) : d0.E0(gVar.b(arrayList2, favoritesPropertiesIds, list, locationData, !arrayListY.isEmpty() ? new ListSubheaderDelegate.Model("NEARBY_PROPERTIES_SECTION_SUBHEADER_ITEM_ID", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.travel.hotels.api.R$string.hotels_search_section_nearby_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530) : null), gVar.b(arrayListY, favoritesPropertiesIds, list, locationData, null));
            a0.x(listB, arrayList);
            if (z4) {
                a0.x(((pag.b) aVar).a(), arrayList);
            }
            if (!z3 && listB.isEmpty() && !z4 && !c0Var.f) {
                ((pag.b) aVar).getClass();
                a0.x(u.c(new FullScreenStateDelegate.Model("SEARCH_RESULT_EMPTY_STATE_ITEM_ID", new TextLocalisedClause(com.revolut.feature.travel.hotels.api.R$string.hotels_search_results_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.travel.hotels.api.R$string.hotels_map_results_subtitle, null, null, 14), new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D086", null, null, null, 30)), null, null, false, null, null, false, R$attr.uikit_dp48, 0, 30704)), arrayList);
            }
            if (z3) {
                a0.x(weg.p.a("ERROR_STATE_SEARCH_RESULTS_PAGE_ITEM_ID"), arrayList);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r22v0, types: [com.revolut.core.ui_kit.models.Style, java.util.List] */
    private final Object m(Object obj2, Object obj3, Object obj4) {
        Object obj5;
        List list;
        TextNavBarMenuItem textNavBarMenuItem;
        qee.s sVar = (qee.s) this.f289293b;
        wi6.h hVar = (wi6.h) this.f289294c;
        fi6.d accounts = (fi6.d) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(accounts, "accounts");
        hi6.o oVar = (hi6.o) sVar.f245144b;
        ei6.d dVar = hVar.f297807a;
        List list2 = (List) accounts.f135297a.getContent();
        List list3 = (List) accounts.f135298b.getContent();
        List list4 = (List) accounts.f135299c.getContent();
        hi6.m mVar = list4 != null ? new hi6.m(list4, null) : null;
        List list5 = accounts.d;
        Set set = hVar.e;
        Data data = accounts.e;
        if (data != null) {
            list = (List) data.getContent();
            obj5 = null;
        } else {
            obj5 = null;
            list = null;
        }
        ?? r222 = obj5;
        hi6.n nVarA = ((hi6.p) oVar).a(dVar, list2, list3, mVar, hVar.f297809c, list5, set, list, null, null, null, null, null, (List) accounts.f135301h.getContent(), (List) accounts.i.getContent(), hVar.d, (Map) accounts.f135302j.getContent(), hVar.f, null, hVar.f297810g, hVar.f297811h, true);
        ArrayList arrayList = nVarA.f152523a;
        Clause clause = nVarA.f152524b;
        boolean z = (hVar.f297809c.isEmpty() && hVar.e.isEmpty() && hVar.d.isEmpty() && hVar.f.isEmpty()) ? false : true;
        boolean zC = hVar.c();
        if (arrayList.isEmpty()) {
            textNavBarMenuItem = r222;
        } else {
            Iterator it8 = arrayList.iterator();
            while (it8.hasNext()) {
                if (((koi.j) it8.next()) instanceof SelectableDelegate.Model) {
                    textNavBarMenuItem = new TextNavBarMenuItem("open_banking_select_all_menu_item_id", zC ? new TextLocalisedClause(R.string.common_action_clear, r222, r222, 14) : new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_select_all, r222, r222, 14), null, null, 12);
                }
            }
            textNavBarMenuItem = r222;
        }
        return new wi6.o(arrayList, clause, z, textNavBarMenuItem);
    }

    private final Object n(Object obj2, Object obj3, Object obj4) {
        Collection collection;
        Collection collectionE0;
        wl8.p pVar = (wl8.p) this.f289293b;
        wl8.g gVar = (wl8.g) this.f289294c;
        Pair pair = (Pair) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(pair, "<destruct>");
        List list = (List) pair.f186385a;
        List list2 = (List) pair.f186386b;
        zm3.f fVar = gVar.d;
        String str = gVar.f298446a;
        if (list2.isEmpty()) {
            collection = f0.f322471a;
        } else {
            List<zm3.f> list3 = list2;
            ArrayList arrayList = new ArrayList(w.t(list3, 10));
            for (zm3.f fVar2 : list3) {
                arrayList.add(pVar.a(p.a.m(fVar2.f323346b, "SEARCH_CONTACT_ITEM_"), fVar2, fVar));
            }
            collection = arrayList;
        }
        if (str.length() > 0) {
            List listC = (List) ue0.e.M(collection);
            if (listC == null) {
                listC = u.c(new FullScreenStateDelegate.Model("NO_CONTACTS_STATE_ID", new TextLocalisedClause(com.revolut.feature.junior_remote_login.impl.R$string.junior_child_phone_picker_state_empty_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.junior_remote_login.impl.R$string.junior_child_phone_picker_state_empty_subtitle, u.c(str), null, 12), new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D086", null, null, null, 30)), new l6(12, new TextLocalisedClause(com.revolut.feature.junior_remote_login.impl.R$string.junior_child_phone_picker_state_empty_action, null, null, 14), null, h4.ACCENT), zj.REGULAR, false, null, null, null, 1984));
            }
            List list4 = listC;
            yp0.b.k(list4, 0, 0, 0, 0, 31);
            return list4;
        }
        List listB = (List) ue0.e.M(collection);
        if (listB == null) {
            listB = iii.c.b(null, null, 6, true);
        }
        List list5 = listB;
        yp0.b.k(list5, R$attr.uikit_dp0, 0, 0, 0, 30);
        if (list.isEmpty()) {
            return d0.E0(list5, wl8.p.b(true));
        }
        zm3.f fVar3 = gVar.d;
        if (list.isEmpty()) {
            collectionE0 = f0.f322471a;
        } else {
            ListSubheaderDelegate.Model model = new ListSubheaderDelegate.Model("SUGGESTED_CONTACTS_ITEMS_HEADER", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.junior_remote_login.impl.R$string.junior_child_phone_picker_section_suggested, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530);
            model.u = R$attr.uikit_dp0;
            model.v = R$attr.uikit_dp12;
            List listC2 = u.c(model);
            List<zm3.f> list6 = list;
            ArrayList arrayList2 = new ArrayList(w.t(list6, 10));
            for (zm3.f fVar4 : list6) {
                arrayList2.add(pVar.a(p.a.m(fVar4.f323346b, "SUGGESTED_CONTACT_ITEM_"), fVar4, fVar3));
            }
            yp0.b.k(arrayList2, R$attr.uikit_dp0, 0, 0, 0, 30);
            collectionE0 = d0.E0(arrayList2, listC2);
        }
        return d0.E0(list5, d0.E0(wl8.p.b(false), collectionE0));
    }

    private final Object o(Object obj2, Object obj3, Object obj4) {
        wlh.f fVar = (wlh.f) this.f289293b;
        n2l.j jVar = (n2l.j) this.f289294c;
        TradingLegalEntityInformation content = (TradingLegalEntityInformation) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        return fVar.f298490b.h(jVar, content.f105106a, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x035a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object p(java.lang.Object r49, java.lang.Object r50, java.lang.Object r51) {
        /*
            Method dump skipped, instruction units count: 1085
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vh2.o.p(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    private final Object q(Object obj2, Object obj3, Object obj4) {
        Iterator it8;
        Iterator it9;
        wna.m mVar;
        RowDelegate.Model modelA;
        wna.v vVar = (wna.v) this.f289293b;
        wna.c cVar = (wna.c) this.f289294c;
        qla.a profileTypeData = (qla.a) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(profileTypeData, "profileTypeData");
        gte.a aVar = vVar.f298768a;
        boolean z = profileTypeData == qla.a.REVOLUT_X && ((jte.d) aVar).c(ProfileApi$Toggles$RevampedProfileScreen.f81321c);
        boolean z3 = z && ((jte.d) aVar).c(StakingApi$FeatureToggles.FlexibleStaking.f88055c) && cVar.f298742b.getContent() != null;
        wna.l lVar = wna.l.f298755b;
        wna.l lVar2 = z ? lVar : null;
        wna.i iVar = wna.i.f298752b;
        wna.i iVar2 = z3 ? iVar : null;
        wna.o oVar = wna.o.f298758b;
        wna.o oVar2 = (z && cVar.f298743c) ? oVar : null;
        boolean zC = ((jte.d) aVar).c(BugReportApi$Toggles$InAppBugReporting.f50349c);
        wna.j jVar = wna.j.f298753b;
        wna.j jVar2 = zC ? jVar : null;
        wna.m mVar2 = wna.m.f298756b;
        wna.h hVar = wna.h.f298751b;
        wna.g gVar = wna.g.f298750b;
        wna.n nVar = wna.n.f298757b;
        wna.f fVar = wna.f.f298749b;
        wna.p[] elements = {lVar2, mVar2, hVar, iVar2, oVar2, gVar, jVar2, nVar, fVar};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        wna.k kVar = wna.k.f298754b;
        List listK = v.k(listL, u.c(kVar));
        ArrayList arrayList = new ArrayList();
        Iterator it10 = listK.iterator();
        while (it10.hasNext()) {
            List list = (List) it10.next();
            ArrayList arrayList2 = new ArrayList(w.t(list, 10));
            Iterator it11 = list.iterator();
            while (it11.hasNext()) {
                wna.p section = (wna.p) it11.next();
                Intrinsics.checkNotNullParameter(section, "section");
                if (Intrinsics.f(section, mVar2)) {
                    it8 = it10;
                    it9 = it11;
                    mVar = mVar2;
                    modelA = wna.u.a(R$drawable.uikit_icn_24_bell, new TextLocalisedClause(com.revolut.feature.profile.impl.R$string.profile_notifications_title, null, null, 14), null, section.f298759a);
                } else {
                    it8 = it10;
                    it9 = it11;
                    mVar = mVar2;
                    if (Intrinsics.f(section, hVar)) {
                        modelA = wna.u.a(R$drawable.uikit_icn_24_palette, new TextLocalisedClause(com.revolut.feature.profile.impl.R$string.profile_appearance_title, null, null, 14), null, section.f298759a);
                    } else if (Intrinsics.f(section, iVar)) {
                        modelA = wna.u.a(R$drawable.uikit_icn_24_trophy, new TextLocalisedClause(com.revolut.feature.profile.impl.R$string.profile_auto_earn_rewards_title, null, null, 14), null, section.f298759a);
                    } else if (Intrinsics.f(section, oVar)) {
                        modelA = wna.u.a(R$drawable.uikit_icn_24_candlestick_chart, new TextLocalisedClause(com.revolut.feature.profile.impl.R$string.profileHome_trading_mode_title, null, null, 14), null, section.f298759a);
                    } else if (Intrinsics.f(section, gVar)) {
                        modelA = wna.u.a(R$drawable.uikit_icn_24_accessibility, new TextLocalisedClause(com.revolut.feature.accessibility_settings.api.R$string.accessibility_screen_title, null, null, 14), null, section.f298759a);
                    } else if (Intrinsics.f(section, jVar)) {
                        modelA = wna.u.a(R$drawable.uikit_icn_24_bug, new TextLocalisedClause(com.revolut.feature.bugreport.api.R$string.profile_bug_reporting_title, null, null, 14), null, section.f298759a);
                    } else if (Intrinsics.f(section, nVar)) {
                        modelA = wna.u.a(R$drawable.uikit_icn_24_lab, new TextLocalisedClause(com.revolut.feature.profile.impl.R$string.profile_new_features_title, null, null, 14), null, section.f298759a);
                    } else if (Intrinsics.f(section, fVar)) {
                        modelA = wna.u.a(R$drawable.uikit_icn_24_revolut, new TextLocalisedClause(R.string.settings_about, null, null, 14), null, section.f298759a);
                    } else if (Intrinsics.f(section, kVar)) {
                        modelA = wna.u.a(R$drawable.uikit_icn_24_broken_heart, new TextLocalisedClause(R.string.terminate_account_dialog_profile_terminate_button, null, null, 14), Integer.valueOf(R$attr.uikit_colorStatusDanger), section.f298759a);
                    } else {
                        if (!Intrinsics.f(section, lVar)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        modelA = wna.u.a(R$drawable.uikit_icn_24_limit, new TextLocalisedClause(com.revolut.feature.profile.impl.R$string.profileHome_settings_item_limits_and_fees_title, null, null, 14), null, section.f298759a);
                    }
                }
                arrayList2.add(modelA);
                it10 = it8;
                it11 = it9;
                mVar2 = mVar;
            }
            yp0.b.k(arrayList2, 0, 0, 0, 0, 31);
            a0.x(arrayList2, arrayList);
            mVar2 = mVar2;
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.revolut.core.ui_kit.models.Style, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [com.revolut.core.ui_kit.models.Clause] */
    /* JADX WARN: Type inference failed for: r9v0, types: [f01.c] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private final Object r(Object obj2, Object obj3, Object obj4) {
        ?? r06;
        TextLocalisedClause textLocalisedClause;
        ?? moneyClause;
        wnf.i iVar = (wnf.i) this.f289293b;
        dj0.d totalAmount = (dj0.d) this.f289294c;
        n71.b bankAccount = (n71.b) obj2;
        ((Boolean) obj3).getClass();
        q0f.b bVar = iVar.f298840b;
        ?? r92 = bVar.f241262b;
        if (bankAccount == null) {
            return f0.f322471a;
        }
        String str = bankAccount.i;
        String str2 = bankAccount.d;
        String str3 = bankAccount.f212985r;
        String str4 = bankAccount.e;
        aim.e eVarB = u.b();
        if (totalAmount != null) {
            Intrinsics.checkNotNullParameter(totalAmount, "totalAmount");
            r06 = 0;
            MoneyClause moneyClause2 = new MoneyClause(totalAmount, new MoneyClause.Format.Defaults(null, new ScaleMode.SimpleLen(2, 2), false, false, 5), null, null, 12);
            eVarB.addAll(u.c(new t5("LIST_ID_TRANSFER_AMOUNT", moneyClause2, new TextLocalisedClause(com.revolut.feature.topup_screen.impl.R$string.topup_mcy_account_details_sections_transfer_amount_transfer_amount_cell_title, null, null, 14), r92.b(moneyClause2), null, null, 0, 0, 0, 0, 2024)));
        } else {
            r06 = 0;
        }
        Intrinsics.checkNotNullParameter(bankAccount, "bankAccount");
        eVarB.addAll(v.k(new t5("LIST_ID_BANK_NAME", new TextClause(str4 == null ? "" : str4, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(com.revolut.feature.topup_screen.impl.R$string.topup_mcy_account_details_sections_account_attributes_bank_name_cell_title, r06, r06, 14), str4 == null ? "" : str4, null, null, 0, 0, 0, 0, 2024), new t5("LIST_ID_ACCOUNT_NAME", new TextClause(str == null ? "" : str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(com.revolut.feature.topup_screen.impl.R$string.topup_mcy_account_details_sections_account_attributes_account_name_cell_title, r06, r06, 14), str == null ? "" : str, null, null, 0, 0, 0, 0, 2024), new t5("LIST_ID_ACCOUNT_NUMBER", new TextClause(str2 == null ? "" : str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(com.revolut.feature.topup_screen.impl.R$string.topup_mcy_account_details_sections_account_attributes_account_number_cell_title, r06, r06, 14), str2 == null ? "" : str2, null, null, 0, 0, 0, 0, 2024), new t5("LIST_ID_IFSC", new TextClause(str3 == null ? "" : str3, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(com.revolut.feature.topup_screen.impl.R$string.topup_mcy_account_details_sections_account_attributes_ifsc_cell_title, r06, r06, 14), str3 == null ? "" : str3, null, null, 0, 0, 0, 0, 2024)));
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(com.revolut.feature.transactions.impl.R$string.transaction_details_transfer_details_button_share_details_title, r06, r06, 14);
        ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_24_share_ios, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
        h4 h4Var = h4.SECONDARY_WHITE;
        int i = R$attr.uikit_dp16;
        int i2 = R$attr.uikit_dp8;
        t70.g gVar = bVar.f241261a;
        Intrinsics.checkNotNullParameter(bankAccount, "bankAccount");
        if (totalAmount != null) {
            textLocalisedClause = textLocalisedClause2;
            moneyClause = new MoneyClause(totalAmount, new MoneyClause.Format.Defaults(null, new ScaleMode.SimpleLen(2, 2), false, false, 5), null, null, 12);
        } else {
            textLocalisedClause = textLocalisedClause2;
            moneyClause = r06;
        }
        StringBuilder sb6 = new StringBuilder();
        if (moneyClause != 0) {
            sb6.append(gVar.getString(com.revolut.feature.topup_screen.impl.R$string.topup_mcy_account_details_sections_transfer_amount_transfer_amount_cell_title));
            sb6.append('\n');
            sb6.append(r92.b(moneyClause));
            sb6.append("\n\n");
        }
        sb6.append(gVar.getString(com.revolut.feature.topup_screen.impl.R$string.topup_mcy_account_details_sections_account_attributes_bank_name_cell_title));
        sb6.append('\n');
        if (str4 == null) {
            str4 = "";
        }
        sb6.append(str4);
        sb6.append("\n\n");
        sb6.append(gVar.getString(com.revolut.feature.topup_screen.impl.R$string.topup_mcy_account_details_sections_account_attributes_account_name_cell_title));
        sb6.append('\n');
        if (str == null) {
            str = "";
        }
        sb6.append(str);
        sb6.append("\n\n");
        sb6.append(gVar.getString(com.revolut.feature.topup_screen.impl.R$string.topup_mcy_account_details_sections_account_attributes_account_number_cell_title));
        sb6.append('\n');
        if (str2 == null) {
            str2 = "";
        }
        sb6.append(str2);
        sb6.append("\n\n");
        sb6.append(gVar.getString(com.revolut.feature.topup_screen.impl.R$string.topup_mcy_account_details_sections_account_attributes_ifsc_cell_title));
        sb6.append('\n');
        if (str3 == null) {
            str3 = "";
        }
        sb6.append(str3);
        eVarB.add(new SmallActionButtonDelegate.Model("ID_MCY_ACCOUNT_DETAILS_SHARE_ACTION", h4Var, resourceImage, null, textLocalisedClause, null, j4.f208300a, sb6.toString(), null, i2, i, i, i, 1368));
        return yp0.b.g(u.a(eVarB), new ListSubheaderDelegate.Model("LIST_ID_ACCOUNT_DETAILS_SUB_HEADER", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.transactions.impl.R$string.transaction_details_transfer_details_header, r06, r06, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), e0.INSIDE_BOX, 0, 0, 124);
    }

    /* JADX WARN: Removed duplicated region for block: B:238:0x0a53  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0a67  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0ac7  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0b19  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0b7c  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0b81  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0bfd  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0446  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x049c  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0533  */
    /* JADX WARN: Type inference failed for: r15v16 */
    /* JADX WARN: Type inference failed for: r15v17, types: [dl3.e, mx0.i1] */
    /* JADX WARN: Type inference failed for: r15v20 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r15v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object s(java.lang.Object r78, java.lang.Object r79, java.lang.Object r80) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 3104
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vh2.o.s(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    private final Object t(Object obj2, Object obj3, Object obj4) {
        Object next;
        wt7.j jVar = (wt7.j) this.f289293b;
        wt7.f fVar = (wt7.f) this.f289294c;
        vs7.f documents = (vs7.f) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(documents, "documents");
        String str = fVar.f299828b;
        String strL = str != null ? m70.a.l(str) : null;
        ArrayList arrayList = documents.f291742b;
        Iterator it8 = arrayList.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (Intrinsics.f(((vs7.e) next).f291739a, strL)) {
                break;
            }
        }
        vs7.e eVar = (vs7.e) next;
        yt7.b bVar = jVar.f299838a;
        Iterable documents2 = eVar != null ? eVar.f291740b : null;
        if (documents2 == null) {
            documents2 = f0.f322471a;
        }
        Intrinsics.checkNotNullParameter(documents2, "documents");
        Iterable iterable = documents2;
        ArrayList arrayList2 = new ArrayList(w.t(iterable, 10));
        Iterator it9 = iterable.iterator();
        while (true) {
            if (!it9.hasNext()) {
                break;
            }
            vs7.d dVar = (vs7.d) it9.next();
            String strQ = j6.a.q("DOCUMENT_ITEM_ID_", dVar.f291737b);
            String str2 = dVar.f291736a;
            RowDelegate.Model.MainImage.Image24 image24A = str2 != null ? zt7.c.a(bVar.f316656a, str2, null) : null;
            TextClause textClauseA = sr7.c.a(dVar.f291737b, null);
            String str3 = dVar.f291738c;
            arrayList2.add(new RowDelegate.Model(strQ, image24A, textClauseA, null, 0, str3 != null ? sr7.c.a(str3, null) : null, null, null, 0, new tf(6, new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false), false, null, false, null, null, null, null, null, null, dVar, null, 0, 0, 0, 0, 532675544));
        }
        yp0.b.k(arrayList2, 0, 0, 0, 0, 31);
        TextClause textClauseA2 = sr7.c.a(documents.f291741a, null);
        ArrayList arrayList3 = new ArrayList(w.t(arrayList, 10));
        Iterator it10 = arrayList.iterator();
        while (it10.hasNext()) {
            String str4 = ((vs7.e) it10.next()).f291739a;
            String str5 = str4 == null ? "" : str4;
            if (str4 == null) {
                str4 = "";
            }
            arrayList3.add(new FixedTabs.Item(str5, sr7.c.a(str4, null), (AnalyticsContext) null, 12));
        }
        return new wt7.g(arrayList2, textClauseA2, false, arrayList3, strL, arrayList.size() > 1);
    }

    private final Object u(Object obj2, Object obj3, Object obj4) {
        TextLocalisedClause textLocalisedClause;
        TimeClause timeClauseA;
        LocalDate localDate;
        b0 b0Var = (b0) this.f289293b;
        wuk.j jVar = (wuk.j) this.f289294c;
        nel.n instrument = (nel.n) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        TextClause textClauseA = yuk.a.a(instrument);
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        nel.a aVar = instrument.f214599h;
        boolean z = aVar instanceof nel.d;
        nel.d dVar = z ? (nel.d) aVar : null;
        BigDecimal bigDecimal = dVar != null ? dVar.f214562a : null;
        LocalDate localDate2 = dVar != null ? dVar.f214563b : null;
        if (bigDecimal == null || localDate2 == null) {
            textLocalisedClause = null;
        } else {
            int i = com.revolut.retail.wealth.resources.R$string.wealth_trading_bond_coupon_rate_maturity_subtitle;
            ytk.c.Companion.getClass();
            PercentageClause percentageClause = new PercentageClause(bigDecimal, ytk.c.f316835a, (Style) null, 4);
            com.revolut.core.ui_kit.models.j jVar2 = c7.Companion;
            LocalDateClause$DateFormat.MonthAndYear monthAndYear = new LocalDateClause$DateFormat.MonthAndYear(ka.SHORT);
            jVar2.getClass();
            textLocalisedClause = new TextLocalisedClause(i, v.k(percentageClause, com.revolut.core.ui_kit.models.j.a(localDate2, monthAndYear, null)), null, 12);
        }
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        TextClause textClauseA2 = yuk.a.a(instrument);
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        nel.d dVar2 = z ? (nel.d) aVar : null;
        if (dVar2 == null || (localDate = dVar2.f214563b) == null) {
            timeClauseA = null;
        } else {
            com.revolut.core.ui_kit.models.j jVar3 = c7.Companion;
            LocalDateClause$DateFormat.MonthAndYear monthAndYear2 = new LocalDateClause$DateFormat.MonthAndYear(ka.SHORT);
            jVar3.getClass();
            timeClauseA = com.revolut.core.ui_kit.models.j.a(localDate, monthAndYear2, null);
        }
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        return new wuk.k(textClauseA, textLocalisedClause, textClauseA2, timeClauseA, new yy0.j(new InstrumentImage(instrument.f214596b, 30, null, null)), v.l(((o3d.f) b0Var.o).a(jVar.f300188l)));
    }

    private final Object v(Object obj2, Object obj3, Object obj4) throws IOException {
        dy dyVarD;
        wv2.p pVar = (wv2.p) this.f289293b;
        wv2.d dVar = (wv2.d) this.f289294c;
        Card card = (Card) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(card, "card");
        String str = (String) dVar.f300272c.getContent();
        o5l.g screenDensity = dVar.e;
        int i = dVar.f300270a;
        boolean z = dVar.d;
        ShowCardPinScreenContract$InputData showCardPinScreenContract$InputData = pVar.f300286a;
        ArrayList arrayList = new ArrayList();
        Clause clause = card.d;
        o5l.b bVar = card.f104690c;
        l9 l9Var = new l9(clause, card.e, card.f, null, null, 48);
        Clause clause2 = card.f104691g;
        CardDetailsDesignConfig cardDetailsDesignConfig = card.f104692h;
        if (cardDetailsDesignConfig != null) {
            Intrinsics.checkNotNullParameter(card, "card");
            Intrinsics.checkNotNullParameter(screenDensity, "screenDensity");
            CardDetailsConfigBackground cardDetailsConfigBackground = cardDetailsDesignConfig.f104701b;
            String strF = edl.a.f(cardDetailsConfigBackground, bVar, screenDensity);
            if (strF != null) {
                UrlImage urlImageB = wv2.p.b(strF);
                String strF2 = edl.a.f(cardDetailsConfigBackground, bVar, screenDensity);
                dyVarD = strF2 != null ? new dy(urlImageB, wv2.p.b(strF2), cardDetailsDesignConfig.d, cardDetailsDesignConfig.e, cardDetailsDesignConfig.f, cardDetailsDesignConfig.f104704h, null, 1084) : wv2.p.d();
            } else {
                dyVarD = wv2.p.d();
            }
        } else {
            dyVarD = wv2.p.d();
        }
        String str2 = card.i;
        arrayList.add(new NewRevolutCardDelegate.Model("CARD_VIEW_LIST_ID", l9Var, clause2, dyVarD, str2 != null ? new UrlImage(str2, null, null, null, 0L, null, null, null, null, null, true, null, null, null, false, false, 520190) : null, 31952));
        String strK0 = str == null ? "0000" : str;
        if (strK0.length() == 4) {
            Intrinsics.checkNotNullParameter(strK0, "<this>");
            strK0 = d0.k0(strK0.length() == 0 ? f0.f322471a : new ge0.b(strK0, 1), " ", null, null, 0, null, 62);
        }
        arrayList.add(new fe0(new TextClause(strK0, (Style) new Custom(null, false, null, str == null, null, Constants.TAG_BLE_FIRMWARE_VERSION), (Integer) null, false, (o9) null, (List) null, 124), R$attr.uikit_dp48));
        if (showCardPinScreenContract$InputData.f64415b && z) {
            arrayList.add(new TextDelegate.Model("PIN_DESCRIPTION_ID", new TextLocalisedClause(com.revolut.feature.card.view_pin.api.R$string.card_view_pin_reveal_pin_body, null, null, 14), false, new ck0(yj0.CENTER_HORIZONTAL), null, null, 0, 0, 0, 0, 2036));
        }
        if (showCardPinScreenContract$InputData.f64416c) {
            arrayList.add(new TextDelegate.Model("PIN_TRIES_ACTION_ID", new TextLocalisedClause(com.revolut.feature.card.view_pin.api.R$string.card_view_pin_reveal_pin_faq, null, new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), 10), true, new ck0(yj0.CENTER_HORIZONTAL), null, null, 0, 0, 0, 0, 2032));
        }
        return new wv2.g(arrayList, new TextLocalisedClause(com.revolut.feature.card.view_pin.api.R$string.card_view_pin_title, null, null, 14), (str == null || str.length() == 0) ? null : new TextLocalisedQuantityClause(R$plurals.card_view_pin_reveal_pin_disappear_timer, Integer.valueOf(i), (List) null, (Style) null, 28));
    }

    private final Object w(Object obj2, Object obj3, Object obj4) {
        ww2.o oVar = (ww2.o) this.f289293b;
        ww2.k kVar = (ww2.k) this.f289294c;
        h93.f0 card = (h93.f0) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(card, "card");
        CardDetailsDesignConfig cardDetailsDesignConfig = (CardDetailsDesignConfig) kVar.f300585c.getContent();
        o5l.g gVar = kVar.d;
        aim.e eVarB = u.b();
        m93.a aVar = oVar.f300590a;
        String str = card.f150110a;
        h93.d dVar = new h93.d(str, ((ha3.x) oVar.f300591b).o(str));
        int i = R$attr.uikit_dp16;
        eVarB.add(m93.a.a(aVar, str, card, cardDetailsDesignConfig, null, dVar, gVar, false, true, i, i, null, card, null, null, null, 28672));
        sa saVar = new sa("SCAM_WARNING_LIST_ID", (Clause) new TextLocalisedClause(com.revolut.feature.card_add_to_googlepay.impl.R$string.google_pay_verification_warning_title, null, null, 14), (Clause) new TextLocalisedClause(com.revolut.feature.card_add_to_googlepay.impl.R$string.x_pay_otp_verification_warning_description, null, null, 14), (List) null, false, (Image) new ResourceImage(R$drawable.uikit_icn_24_warning, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorOrange), (List) null, (ImageTransformations) null, (Clause) null, 246), (y10) null, (Object) null, 4040);
        yp0.b.l(saVar, 0, 0, 0, 0, null, false, 63);
        eVarB.add(saVar);
        return u.a(eVarB);
    }

    private final Object x(Object obj2, Object obj3, Object obj4) {
        Iterable iterableG;
        t tVar = (t) this.f289293b;
        f.a aVar = (f.a) this.f289294c;
        List list = (List) obj2;
        ((Boolean) obj3).getClass();
        ArrayList arrayListY = com.google.android.gms.internal.mlkit_vision_face.a.y("airports", list);
        a0.x((List) iii.c.f(aVar.f300675b, new r1(9), new wug.k(20), new j0(tVar, 12)), arrayListY);
        if (list.isEmpty()) {
            iterableG = f0.f322471a;
        } else {
            hxi.a aVar2 = tVar.f300694a;
            m70.a.c(kotlin.jvm.internal.t0.f186434a);
            iterableG = yp0.b.g(aVar2.a("ID_AIRPORT_", "", list), new ListSubheaderDelegate.Model("ID_HEADER_ALL_AIRPORTS", (Image) null, (Clause) new TextLocalisedClause(com.revolut.retail.feature.airportlounges.impl.R$string.airport_lounges_airport_search_all_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126);
        }
        a0.x(iterableG, arrayListY);
        return arrayListY;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    @Override // kotlin.jvm.functions.Function3
    public final java.lang.Object invoke(java.lang.Object r62, java.lang.Object r63, java.lang.Object r64) {
        /*
            Method dump skipped, instruction units count: 3788
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vh2.o.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public /* synthetic */ o(vne.j jVar, TextLocalisedClause textLocalisedClause, vne.c cVar) {
        this.f289292a = 4;
        this.f289293b = textLocalisedClause;
        this.f289294c = cVar;
    }

    public /* synthetic */ o(w07.f fVar, w07.o oVar, w07.f fVar2) {
        this.f289292a = 12;
        this.f289293b = fVar;
        this.f289294c = fVar2;
    }
}
