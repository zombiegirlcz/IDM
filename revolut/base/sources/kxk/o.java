package kxk;

import au0.c2;
import aw0.o9;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.IconNavBarMenuItem;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.apm.upi.impl.screens.pending_payment.subscription.UpiConfirmationScreenContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.summary.SummaryScreenContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.content.OfferContentScreenContract$InputData;
import com.revolut.feature.external_accounts.impl.ui.link.screens.branches.BranchesScreenContract$InputData;
import com.revolut.feature.freelancer.impl.ui.ecommerce.manage.details.FreelancerPluginDetailsScreenContract$InputData;
import com.revolut.feature.freelancer.impl.ui.tax_hub.profile.create.TaxHubCreateProfileScreenContract$InputData;
import com.revolut.feature.payments.groups.impl.ui_chat.group_transactions.GroupTransactionsScreenContract$InputData;
import com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.value_reminder.CobrandedCardsValueReminderScreenContract$InputData;
import com.revolut.feature.robo.impl.ui.screen.spare_change.PortfolioSpareChangeScreenContract$DomainState;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.pass_passengers.AirportLoungePassPassengersContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.dynamic_form.business_details.EsimMobilePlanDynamicFormBusinessDetailsScreenContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_summary.EsimMobilePlanSummaryScreenContract$InputData;
import com.revolut.retail.wealth.resources.R$string;
import com.revolut.revolut.feature_fourthline_impl.R;
import com.revolut.shared.feature.wealth.models.config.TradingLegalEntityInformation;
import com.youTransactor.uCube.rpc.Constants;
import ip0.ak0;
import ip0.p70;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import mx4.z;
import ojk.g0;
import org.joda.time.DateTime;
import rch.p;
import rch.q;
import rch.w;
import smd.s;
import unc.r;
import unc.t;
import v4e.x;
import xo8.j0;
import xu3.k0;
import xu3.l0;
import xu3.m0;
import xu3.o0;
import z0h.q1;
import zhm.d0;
import zhm.f0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes12.dex */
public final class o implements cli.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f190610a = 26;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f190611b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f190612c;

    public o(s footerDelegate, com.revolut.feature.payments.profile.impl.ui_kompot.flow.c paymentProfileNavbarMapper) {
        Intrinsics.checkNotNullParameter(footerDelegate, "footerDelegate");
        Intrinsics.checkNotNullParameter(paymentProfileNavbarMapper, "paymentProfileNavbarMapper");
        this.f190611b = footerDelegate;
        this.f190612c = paymentProfileNavbarMapper;
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0427  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x043c  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0441  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0464  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0468  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0477  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0437 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0193  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final cli.o a(cli.j r65) {
        /*
            Method dump skipped, instruction units count: 1272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kxk.o.a(cli.j):cli.o");
    }

    private final cli.o b(cli.j jVar) {
        TextLocalisedClause textLocalisedClause;
        TextLocalisedClause textLocalisedClause2;
        List listB;
        rch.e domainState = (rch.e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        mzg.d dVar = domainState.f253271a;
        Data data = domainState.f253273c;
        int i = p.f253284a[dVar.ordinal()];
        int i2 = 13;
        int i3 = 1;
        if (i == 1) {
            q qVar = (q) this.f190611b;
            List list = data != null ? (List) iii.c.f(data, new raf.o(qVar, 7), new r6f.i(qVar, i2), new qbg.j(qVar, 23)) : null;
            if (list == null) {
                list = f0.f322471a;
            }
            TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.wealth_trading_popular_assets_crypto_title, null, null, 14);
            TextLocalisedClause textLocalisedClause4 = new TextLocalisedClause(R$string.wealth_trading_popular_assets_crypto_subtitle, null, null, 14);
            aim.e eVarB = u.b();
            eVarB.addAll(list);
            eVarB.add(new LargeActionButtonDelegate.Model("MostPopular.SeeAll", LargeActionButton.ButtonStyle.o, null, new TextLocalisedClause(com.revolut.feature.mainscreen.api.R$string.crypto_discovery_discover_all_crypto, null, null, 14), false, null, rch.i.f253277a, R$attr.uikit_dp0, R$attr.uikit_dp16, 0, 0, 6512));
            eVarB.add(new TextDelegate.Model("MostPopular.Disclaimer", yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), v.k(new TextLocalisedClause(R$string.wealth_trading_topMovers_footer, null, null, 14), new TextLocalisedClause(R.string.common_action_learn_more, null, new Click(28, (Integer) null, (Object) rch.h.f253276a, "MostPopular.Disclaimer.Link", false), 10))), false, new ak0(null, null, 3), null, null, R$attr.uikit_dp0, 0, 0, 0, 1908));
            Unit unit = Unit.f186387a;
            return new rch.k(u.a(eVarB), textLocalisedClause3, textLocalisedClause4);
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        w wVar = (w) this.f190612c;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Data data2 = domainState.e;
        List list2 = domainState.f253272b;
        List list3 = data != null ? (List) iii.c.f(data, new rbj.g(wVar, 11), new rbh.j(i2), new rbe.c(wVar, domainState, i3)) : null;
        if (list3 == null) {
            list3 = f0.f322471a;
        }
        TradingLegalEntityInformation tradingLegalEntityInformation = data2 != null ? (TradingLegalEntityInformation) data2.getContent() : null;
        xzg.a aVar = xzg.a.BOND;
        if (d8l.d.q(list2, aVar)) {
            textLocalisedClause = new TextLocalisedClause(R$string.wealth_trading_popular_assets_bonds_title, null, null, 14);
        } else if (d8l.d.q(list2, xzg.a.ETF)) {
            textLocalisedClause = new TextLocalisedClause((tradingLegalEntityInformation != null ? tradingLegalEntityInformation.f105106a : null) == hel.b.US ? R$string.wealth_invest_popular_etfs_us_title : R$string.wealth_invest_popular_etfs_title, null, null, 14);
        } else {
            textLocalisedClause = d8l.d.q(list2, xzg.a.CFD) ? new TextLocalisedClause(R$string.wealth_trading_popular_assets_cfds_title, null, null, 14) : new TextLocalisedClause(R$string.wealth_trading_popular_assets_stocks_title, null, null, 14);
        }
        TradingLegalEntityInformation tradingLegalEntityInformation2 = data2 != null ? (TradingLegalEntityInformation) data2.getContent() : null;
        if (d8l.d.q(list2, aVar)) {
            textLocalisedClause2 = new TextLocalisedClause(R$string.wealth_trading_popular_assets_bonds_subtitle, u.c(new TextLocalisedClause(R$string.wealth_trading_popular_assets_bonds_subtitle_learn_more, null, new Click(28, (Integer) null, (Object) rch.f.BONDS, "HEADER_LEARN_MORE", false), 10)), null, 12);
        } else if (d8l.d.q(list2, xzg.a.ETF)) {
            textLocalisedClause2 = new TextLocalisedClause((tradingLegalEntityInformation2 != null ? tradingLegalEntityInformation2.f105106a : null) == hel.b.US ? R$string.wealth_invest_popular_etfs_us_info : R$string.wealth_trading_popular_assets_etfs_subtitle, null, null, 14);
        } else {
            textLocalisedClause2 = d8l.d.q(list2, xzg.a.CFD) ? new TextLocalisedClause(R$string.wealth_trading_popular_assets_cfds_subtitle, null, null, 14) : new TextLocalisedClause(R$string.wealth_trading_popular_assets_stocks_subtitle, null, null, 14);
        }
        aim.e eVarB2 = u.b();
        eVarB2.addAll(list3);
        Data data3 = domainState.f;
        if (data3 != null && (listB = ((aah.m) wVar.f253291b).b(data3)) != null) {
            eVarB2.addAll(listB);
        }
        Unit unit2 = Unit.f186387a;
        return new rch.k(u.a(eVarB2), textLocalisedClause, textLocalisedClause2);
    }

    private final cli.o d(cli.j jVar) {
        String str;
        String str2;
        tb4.i domainState = (tb4.i) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        SummaryScreenContract$InputData summaryScreenContract$InputData = (SummaryScreenContract$InputData) this.f190611b;
        m0 m0Var = summaryScreenContract$InputData.f67734a;
        o0 o0Var = summaryScreenContract$InputData.f67735b;
        if (m0Var instanceof k0) {
            k0 k0Var = (k0) m0Var;
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.feature.credit.core.R$string.financial_evidence_summary_title, u.c(k0Var.f308914a), null, 12);
            int i = com.revolut.feature.credit.core.R$string.financial_evidence_summary_description;
            if (o0Var == o0.JOINT_APPLICANTS) {
                str2 = k0Var.f308916c;
                if (str2 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
            } else {
                str2 = k0Var.f308915b;
            }
            final int i2 = 1;
            return new tb4.o((List) iii.c.f(domainState.f269443a, new t9b.a(12), new t5e.j(23), new Function3(this) { // from class: tb4.s

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ kxk.o f269454b;

                {
                    this.f269454b = this;
                }

                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    int i3 = i2;
                    ry3.b evidences = (ry3.b) obj2;
                    ((Boolean) obj3).booleanValue();
                    switch (i3) {
                        case 0:
                            Intrinsics.checkNotNullParameter(evidences, "evidences");
                            break;
                        default:
                            Intrinsics.checkNotNullParameter(evidences, "evidences");
                            break;
                    }
                    return ((t) this.f269454b.f190612c).b(evidences);
                }
            }), textLocalisedClause, new TextLocalisedClause(i, u.c(str2), null, 12), new TextLocalisedClause(com.revolut.feature.credit.core.R$string.financial_evidence_summary_action_primary, u.c(k0Var.e), null, 12), new TextLocalisedClause(com.revolut.feature.credit.core.R$string.financial_evidence_summary_action_secondary, u.c(k0Var.f), null, 12), ((Boolean) iii.c.f(domainState.f269443a, new t9b.a(11), new t5e.j(22), new sr8.a(9))).booleanValue());
        }
        if (!(m0Var instanceof l0)) {
            throw new NoWhenBranchMatchedException();
        }
        l0 l0Var = (l0) m0Var;
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(com.revolut.feature.credit.core.R$string.financial_evidence_summary_title, u.c(l0Var.f308922a), null, 12);
        int i3 = com.revolut.feature.credit.core.R$string.financial_evidence_summary_description;
        if (o0Var == o0.JOINT_APPLICANTS) {
            str = l0Var.f308924c;
            if (str == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
        } else {
            str = l0Var.f308923b;
        }
        final int i5 = 0;
        return new tb4.o((List) iii.c.f(domainState.f269443a, new t9b.a(14), new t5e.j(21), new Function3(this) { // from class: tb4.s

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ kxk.o f269454b;

            {
                this.f269454b = this;
            }

            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                int i32 = i5;
                ry3.b evidences = (ry3.b) obj2;
                ((Boolean) obj3).booleanValue();
                switch (i32) {
                    case 0:
                        Intrinsics.checkNotNullParameter(evidences, "evidences");
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(evidences, "evidences");
                        break;
                }
                return ((t) this.f269454b.f190612c).b(evidences);
            }
        }), textLocalisedClause2, new TextLocalisedClause(i3, u.c(str), null, 12), new TextLocalisedClause(com.revolut.feature.credit.core.R$string.financial_evidence_summary_action_primary, u.c(l0Var.f), null, 12), null, ((Boolean) iii.c.f(domainState.f269443a, new t9b.a(13), new t5e.j(24), new sr8.a(10))).booleanValue());
    }

    private final cli.o e(cli.j jVar) {
        unc.m mVar;
        Boolean boolValueOf;
        PortfolioSpareChangeScreenContract$DomainState domainState = (PortfolioSpareChangeScreenContract$DomainState) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        unc.s sVar = (unc.s) this.f190611b;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Data data = domainState.d;
        Integer num = domainState.f85204b;
        int i = 9;
        unc.n nVar = new unc.n(data != null ? (TextLocalisedClause) iii.c.f(data, new umc.c(8), new uj8.j(19), new uk2.w(sVar, i)) : null);
        List listL = v.l(num != null ? new p70("spare-change-radial-slider", num.intValue()) : null);
        t tVar = (t) this.f190612c;
        Data data2 = domainState.e;
        List list = data2 != null ? (List) iii.c.f(data2, new umc.c(tVar, i), new uj8.j(20), new uk2.w(num, tVar)) : null;
        if (list == null) {
            list = f0.f322471a;
        }
        ArrayList arrayListU = zhm.w.u(v.k(listL, list));
        Data data3 = domainState.f85203a;
        unc.e eVar = domainState.f85205c;
        vnc.b bVar = domainState.f;
        int i2 = eVar == null ? -1 : unc.q.f281409a[eVar.ordinal()];
        unc.l kVar = unc.j.f281398a;
        if (i2 == -1) {
            if (bVar != vnc.b.CREATE && bVar != vnc.b.UPDATE) {
                kVar = new unc.k(new TextLocalisedClause(R$string.wealth_robo_spare_change_screen_button_create, null, null, 14), true);
            }
            mVar = new unc.m(unc.i.f281397a, kVar);
        } else if (i2 != 1) {
            if (i2 != 2 && i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            if (bVar != vnc.b.CREATE) {
                kVar = new unc.k(new TextLocalisedClause(R$string.wealth_robo_spare_change_screen_button_create, null, null, 14), true);
            }
            mVar = new unc.m(unc.i.f281397a, kVar);
        } else {
            od0.i iVar = data3 != null ? (od0.i) data3.getContent() : null;
            if (iVar == null || num == null) {
                boolValueOf = null;
            } else {
                int iIntValue = num.intValue();
                vnc.a aVar = (vnc.a) iVar.f224257a;
                boolValueOf = Boolean.valueOf(!(aVar != null && aVar.f290791a == iIntValue));
            }
            boolean zF = Intrinsics.f(boolValueOf, Boolean.TRUE);
            boolean z = bVar == vnc.b.UPDATE;
            unc.l kVar2 = bVar == vnc.b.REMOVE ? kVar : new unc.k(new TextLocalisedClause(R$string.wealth_robo_spare_change_screen_button_remove, null, null, 14), true);
            if (!z || !zF) {
                kVar = new unc.k(new TextLocalisedClause(R$string.wealth_robo_spare_change_screen_button_update, null, null, 14), zF);
            }
            mVar = new unc.m(kVar2, kVar);
        }
        return new unc.o(nVar, arrayListU, mVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0120  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final cli.o f(cli.j r28) {
        /*
            Method dump skipped, instruction units count: 525
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kxk.o.f(cli.j):cli.o");
    }

    private final cli.o g(cli.j jVar) {
        vkj.e domainState = (vkj.e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        boolean z = true;
        List listA = ((zkj.c) this.f190612c).a(domainState.f289969a, ((EsimMobilePlanDynamicFormBusinessDetailsScreenContract$InputData) this.f190611b).d, true);
        LinkedHashMap linkedHashMap = domainState.f289969a;
        if (!linkedHashMap.isEmpty()) {
            Iterator it8 = linkedHashMap.entrySet().iterator();
            while (true) {
                if (!it8.hasNext()) {
                    break;
                }
                if (!alj.a.a((zkj.b) ((Map.Entry) it8.next()).getValue())) {
                    z = false;
                    break;
                }
            }
        }
        return new vkj.i(listA, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final cli.o h(cli.j r19) {
        /*
            Method dump skipped, instruction units count: 317
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kxk.o.h(cli.j):cli.o");
    }

    private final cli.o i(cli.j jVar) {
        w50.a domainState = (w50.a) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Date date = new Date(ebm.a.P((LocalDate) this.f190612c));
        List list = ((w50.j) this.f190611b).f294661a;
        vim.e eVarB = list.isEmpty() ? vim.i.b(date, date) : vim.i.b(new Date(ebm.a.P((LocalDate) d0.b0(list))), new Date(ebm.a.P((LocalDate) d0.m0(list))));
        vim.d dVar = domainState.f294650a;
        vim.e eVarB2 = dVar != null ? vim.i.b(new Date(ebm.a.P((LocalDate) dVar.getStart())), new Date(ebm.a.P((LocalDate) dVar.b()))) : null;
        List listD1 = d0.d1(list);
        ArrayList arrayList = new ArrayList(zhm.w.t(listD1, 10));
        Iterator it8 = listD1.iterator();
        while (it8.hasNext()) {
            arrayList.add(new DateTime(ebm.a.P((LocalDate) it8.next())));
        }
        return new w50.d(eVarB, eVarB2, date, arrayList, domainState.f294650a != null);
    }

    private final cli.o j(cli.j jVar) {
        Collection collection;
        x5e.c domainState = (x5e.c) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        aim.e eVarB = u.b();
        x xVar = (x) this.f190612c;
        v4e.p domainState2 = domainState.f302942b;
        Intrinsics.checkNotNullParameter(domainState2, "domainState");
        Data data = domainState2.f286057a;
        Data data2 = domainState2.e;
        Data data3 = domainState2.f286058b;
        Data dataU = (data == null || data2 == null || data3 == null) ? null : t1.u(data, data2, data3);
        if (dataU == null || (collection = (List) iii.c.f(dataU, new v2g.i(xVar, 17), new v25.g(17), new uk2.w(xVar, domainState2, 19))) == null) {
            collection = f0.f322471a;
        }
        eVarB.addAll(collection);
        eVarB.addAll(((a5e.m) this.f190611b).a(domainState.f302941a));
        return new x5e.d(u.a(eVarB));
    }

    private final cli.o k(cli.j jVar) {
        String strA;
        String str;
        xd7.g domainState = (xd7.g) jVar;
        rd7.c cVar = (rd7.c) this.f190612c;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Integer num = domainState.f304279c;
        int iIntValue = num != null ? num.intValue() : domainState.f304278b;
        List list = domainState.f304277a;
        int i = xd7.j.f304287a[cVar.ordinal()];
        if (i == 1) {
            rd7.h hVar = (rd7.h) d0.e0(iIntValue, list);
            strA = hVar != null ? hVar.a() : null;
            if (strA == null) {
                strA = "";
            }
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            strA = domainState.d;
        }
        String str2 = strA;
        List<rd7.h> list2 = list;
        ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
        for (rd7.h hVar2 : list2) {
            if (hVar2 instanceof rd7.g) {
                str = ((rd7.g) hVar2).f253366a;
            } else {
                if (!(hVar2 instanceof rd7.f)) {
                    throw new NoWhenBranchMatchedException();
                }
                str = ((rd7.f) hVar2).f253364a;
            }
            arrayList.add(new c2(rd7.m.a(hVar2, gz0.b.FitCenter), str, 8));
        }
        return new xd7.h(arrayList, iIntValue, cVar == rd7.c.EDITABLE ? u.c(new IconNavBarMenuItem("gallery_confirm", new ResourceImage(R$drawable.uikit_icn_24_check, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorForeground), (List) null, (ImageTransformations) null, (Clause) null, 246), new TextLocalisedClause(com.revolut.feature.image_gallery.R$string.image_gallery_toolbar_confirm, null, null, 14), null, Constants.TAG_FULL_SVPP_IDENTIFICATION)) : !((rd7.l) this.f190611b).b() ? f0.f322471a : u.c(new IconNavBarMenuItem("gallery_share", new ResourceImage(R$drawable.uikit_icn_24_share_ios, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorForeground), (List) null, (ImageTransformations) null, (Clause) null, 246), new TextLocalisedClause(com.revolut.feature.image_gallery.R$string.image_gallery_toolbar_share, null, null, 14), null, Constants.TAG_FULL_SVPP_IDENTIFICATION)), new TextLocalisedClause(com.revolut.feature.image_gallery.R$string.image_gallery_toolbar_counter, v.k(Integer.valueOf(iIntValue + 1), Integer.valueOf(list.size())), null, 12), str2, (rd7.c) this.f190612c);
    }

    private final cli.o l(cli.j jVar) {
        y6b.f domainState = (y6b.f) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (y6b.h) iii.c.f(domainState.f311251a, new y66.p(this, 3), new y65.n(5), new j0(this, 17));
    }

    /* JADX WARN: Removed duplicated region for block: B:144:0x076f  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x07a4  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x08c7  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x08cb  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x091c  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0926  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0a49  */
    /* JADX WARN: Type inference failed for: r4v12, types: [java.lang.Object, java.util.List] */
    @Override // cli.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final cli.o c(cli.j r80) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 3508
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kxk.o.c(cli.j):cli.o");
    }

    public o(a5e.m underlyingAssetsWidgetContractMapper, x assetsPerformanceChartWidgetMapper) {
        Intrinsics.checkNotNullParameter(underlyingAssetsWidgetContractMapper, "underlyingAssetsWidgetContractMapper");
        Intrinsics.checkNotNullParameter(assetsPerformanceChartWidgetMapper, "assetsPerformanceChartWidgetMapper");
        this.f190611b = underlyingAssetsWidgetContractMapper;
        this.f190612c = assetsPerformanceChartWidgetMapper;
    }

    public o(vhg.g menuItemsMapper, vhg.i searchInputMapper, vhg.f flightCardsMapper, vhg.h searchBannerMapper) {
        Intrinsics.checkNotNullParameter(menuItemsMapper, "menuItemsMapper");
        Intrinsics.checkNotNullParameter(searchInputMapper, "searchInputMapper");
        Intrinsics.checkNotNullParameter(flightCardsMapper, "flightCardsMapper");
        Intrinsics.checkNotNullParameter(searchBannerMapper, "searchBannerMapper");
        this.f190611b = flightCardsMapper;
        this.f190612c = searchBannerMapper;
    }

    public o(z0k.p instrumentNewsMapper, q1 wealthDisclaimerMapper) {
        Intrinsics.checkNotNullParameter(instrumentNewsMapper, "instrumentNewsMapper");
        Intrinsics.checkNotNullParameter(wealthDisclaimerMapper, "wealthDisclaimerMapper");
        this.f190611b = instrumentNewsMapper;
        this.f190612c = wealthDisclaimerMapper;
    }

    public o(mfl.k titleDescriptionProvider, pfl.c reportsMapper) {
        Intrinsics.checkNotNullParameter(titleDescriptionProvider, "titleDescriptionProvider");
        Intrinsics.checkNotNullParameter(reportsMapper, "reportsMapper");
        this.f190611b = titleDescriptionProvider;
        this.f190612c = reportsMapper;
    }

    public o(pui.c itemsMapper, pui.f qrCodeItemsMapper) {
        Intrinsics.checkNotNullParameter(itemsMapper, "itemsMapper");
        Intrinsics.checkNotNullParameter(qrCodeItemsMapper, "qrCodeItemsMapper");
        this.f190611b = itemsMapper;
        this.f190612c = qrCodeItemsMapper;
    }

    public o(t2h.a input, n4h.f actionsPanelDialogMapper) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(actionsPanelDialogMapper, "actionsPanelDialogMapper");
        this.f190611b = input;
        this.f190612c = actionsPanelDialogMapper;
    }

    public o(UpiConfirmationScreenContract$InputData inputData, su9.c providerFactory) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(providerFactory, "providerFactory");
        this.f190611b = inputData;
        this.f190612c = providerFactory;
    }

    public o(BranchesScreenContract$InputData inputData, an6.b branchesMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(branchesMapper, "branchesMapper");
        this.f190611b = inputData;
        this.f190612c = branchesMapper;
    }

    public o(oe1.a editCustomProductListItemsFactory, rd1.b catalogueCommonItemsFactory) {
        Intrinsics.checkNotNullParameter(editCustomProductListItemsFactory, "editCustomProductListItemsFactory");
        Intrinsics.checkNotNullParameter(catalogueCommonItemsFactory, "catalogueCommonItemsFactory");
        this.f190611b = editCustomProductListItemsFactory;
        this.f190612c = catalogueCommonItemsFactory;
    }

    public o(q cryptoMapper, w stocksMapper) {
        Intrinsics.checkNotNullParameter(cryptoMapper, "cryptoMapper");
        Intrinsics.checkNotNullParameter(stocksMapper, "stocksMapper");
        this.f190611b = cryptoMapper;
        this.f190612c = stocksMapper;
    }

    public o(w50.j dateSelection, LocalDate currentDate) {
        Intrinsics.checkNotNullParameter(dateSelection, "dateSelection");
        Intrinsics.checkNotNullParameter(currentDate, "currentDate");
        this.f190611b = dateSelection;
        this.f190612c = currentDate;
    }

    public o(GroupTransactionsScreenContract$InputData inputData, com.revolut.feature.payments.groups.impl.mappers.transactions.a transactionsMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(transactionsMapper, "transactionsMapper");
        this.f190611b = inputData;
        this.f190612c = transactionsMapper;
    }

    public o(EsimMobilePlanDynamicFormBusinessDetailsScreenContract$InputData inputData, zkj.c attributesInputFieldMapper, alj.a dynamicFormAttributesValidator) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(attributesInputFieldMapper, "attributesInputFieldMapper");
        Intrinsics.checkNotNullParameter(dynamicFormAttributesValidator, "dynamicFormAttributesValidator");
        this.f190611b = inputData;
        this.f190612c = attributesInputFieldMapper;
    }

    public o(EsimMobilePlanSummaryScreenContract$InputData inputData, rmj.c topBlockItemsMapper, rmj.b featureGroupsItemsMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(topBlockItemsMapper, "topBlockItemsMapper");
        Intrinsics.checkNotNullParameter(featureGroupsItemsMapper, "featureGroupsItemsMapper");
        this.f190611b = inputData;
        this.f190612c = featureGroupsItemsMapper;
    }

    public o(g0 itemsMapper, onk.a headerMapper) {
        Intrinsics.checkNotNullParameter(itemsMapper, "itemsMapper");
        Intrinsics.checkNotNullParameter(headerMapper, "headerMapper");
        this.f190611b = itemsMapper;
        this.f190612c = headerMapper;
    }

    public o(rd1.b catalogueCommonItemsFactory, u80.t ratesMoneyUtils) {
        Intrinsics.checkNotNullParameter(catalogueCommonItemsFactory, "catalogueCommonItemsFactory");
        Intrinsics.checkNotNullParameter(ratesMoneyUtils, "ratesMoneyUtils");
        this.f190611b = catalogueCommonItemsFactory;
        this.f190612c = ratesMoneyUtils;
    }

    public o(SummaryScreenContract$InputData inputData, tb4.t summaryUiStateItemsFactory) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(summaryUiStateItemsFactory, "summaryUiStateItemsFactory");
        this.f190611b = inputData;
        this.f190612c = summaryUiStateItemsFactory;
    }

    public o(AirportLoungePassPassengersContract$InputData inputData, nyi.a actionsMapper, nyi.b firstNameMapper, nyi.c lastNameMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(actionsMapper, "actionsMapper");
        Intrinsics.checkNotNullParameter(firstNameMapper, "firstNameMapper");
        Intrinsics.checkNotNullParameter(lastNameMapper, "lastNameMapper");
        this.f190611b = inputData;
        this.f190612c = actionsMapper;
    }

    public o(nld.e loadingMapper, nld.d errorMapper, nld.b contentMapper) {
        Intrinsics.checkNotNullParameter(loadingMapper, "loadingMapper");
        Intrinsics.checkNotNullParameter(errorMapper, "errorMapper");
        Intrinsics.checkNotNullParameter(contentMapper, "contentMapper");
        this.f190611b = errorMapper;
        this.f190612c = contentMapper;
    }

    public o(uw6.b pluginDetailsItemsFactory, vw6.b pluginCommonItemsFactory, FreelancerPluginDetailsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(pluginDetailsItemsFactory, "pluginDetailsItemsFactory");
        Intrinsics.checkNotNullParameter(pluginCommonItemsFactory, "pluginCommonItemsFactory");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f190611b = pluginCommonItemsFactory;
        this.f190612c = inputData;
    }

    public o(er4.b documentSectionMapper, or4.j ratesSectionMapper) {
        Intrinsics.checkNotNullParameter(documentSectionMapper, "documentSectionMapper");
        Intrinsics.checkNotNullParameter(ratesSectionMapper, "ratesSectionMapper");
        this.f190611b = documentSectionMapper;
        this.f190612c = ratesSectionMapper;
    }

    public o(z6b.a billingItemsMapper, r6b.a termsItemsMapper) {
        Intrinsics.checkNotNullParameter(billingItemsMapper, "billingItemsMapper");
        Intrinsics.checkNotNullParameter(termsItemsMapper, "termsItemsMapper");
        this.f190611b = billingItemsMapper;
        this.f190612c = termsItemsMapper;
    }

    public o(u37.v profileItemsFactory, TaxHubCreateProfileScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(profileItemsFactory, "profileItemsFactory");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f190611b = profileItemsFactory;
        this.f190612c = inputData;
    }

    public o(y7b.a itemsMapper, CobrandedCardsValueReminderScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(itemsMapper, "itemsMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f190611b = itemsMapper;
        this.f190612c = inputData;
    }

    public o(lxk.c tradingScheduleTabMapper, lxk.a tradingSchedulePageMapper) {
        Intrinsics.checkNotNullParameter(tradingScheduleTabMapper, "tradingScheduleTabMapper");
        Intrinsics.checkNotNullParameter(tradingSchedulePageMapper, "tradingSchedulePageMapper");
        this.f190611b = tradingScheduleTabMapper;
        this.f190612c = tradingSchedulePageMapper;
    }

    public o(mx4.h actionFooterMapper, z creditScreenConstructorMapper) {
        Intrinsics.checkNotNullParameter(actionFooterMapper, "actionFooterMapper");
        Intrinsics.checkNotNullParameter(creditScreenConstructorMapper, "creditScreenConstructorMapper");
        this.f190611b = actionFooterMapper;
        this.f190612c = creditScreenConstructorMapper;
    }

    public o(rd7.l shareHandler, rd7.j galleryInput) {
        Intrinsics.checkNotNullParameter(shareHandler, "shareHandler");
        Intrinsics.checkNotNullParameter(galleryInput, "galleryInput");
        this.f190611b = shareHandler;
        this.f190612c = galleryInput.f253371c;
    }

    public o(OfferContentScreenContract$InputData inputData, pf4.b mapper, q74.b creditNavigationIconMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(creditNavigationIconMapper, "creditNavigationIconMapper");
        this.f190611b = inputData;
        this.f190612c = mapper;
    }

    public o(unc.s headerMapper, unc.u radialSliderMapper, t howItWorksMapper, r buttonsMapper) {
        Intrinsics.checkNotNullParameter(headerMapper, "headerMapper");
        Intrinsics.checkNotNullParameter(radialSliderMapper, "radialSliderMapper");
        Intrinsics.checkNotNullParameter(howItWorksMapper, "howItWorksMapper");
        Intrinsics.checkNotNullParameter(buttonsMapper, "buttonsMapper");
        this.f190611b = headerMapper;
        this.f190612c = howItWorksMapper;
    }
}
