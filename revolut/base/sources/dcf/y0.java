package dcf;

import aw0.m6;
import aw0.n6;
import cie.l1;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.CdnImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.data.model.Data;
import com.revolut.feature.terms.api.model.Terms;
import com.revolut.feature.trading_add_ons.impl.R$string;
import com.revolut.shared.feature.wealth.models.config.Links;
import com.youTransactor.uCube.rpc.Constants;
import ip0.ak0;
import ip0.pb0;
import java.time.Period;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import z0h.a1;
import z0h.t1;

/* JADX INFO: loaded from: classes8.dex */
public final class y0 implements jki.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final acf.c f112977a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final acf.c f112978b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final acf.a f112979c;
    public final acf.k d;
    public final fcf.n e;
    public final aah.m f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final fcf.k f112980g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final hcf.a f112981h;

    public y0(acf.c featureItemMapper, acf.c featureItemMapperRevamp, acf.a errorStateMapper, acf.k loadingStateMapper, fcf.n textMapper, aah.m wealthDisclaimersMapper, fcf.k subscriptionConfirmationDialogMapper, hcf.a headerMapper) {
        Intrinsics.checkNotNullParameter(featureItemMapper, "featureItemMapper");
        Intrinsics.checkNotNullParameter(featureItemMapperRevamp, "featureItemMapperRevamp");
        Intrinsics.checkNotNullParameter(errorStateMapper, "errorStateMapper");
        Intrinsics.checkNotNullParameter(loadingStateMapper, "loadingStateMapper");
        Intrinsics.checkNotNullParameter(textMapper, "textMapper");
        Intrinsics.checkNotNullParameter(wealthDisclaimersMapper, "wealthDisclaimersMapper");
        Intrinsics.checkNotNullParameter(subscriptionConfirmationDialogMapper, "subscriptionConfirmationDialogMapper");
        Intrinsics.checkNotNullParameter(headerMapper, "headerMapper");
        this.f112977a = featureItemMapper;
        this.f112978b = featureItemMapperRevamp;
        this.f112979c = errorStateMapper;
        this.d = loadingStateMapper;
        this.e = textMapper;
        this.f = wealthDisclaimersMapper;
        this.f112980g = subscriptionConfirmationDialogMapper;
        this.f112981h = headerMapper;
    }

    @Override // jki.p
    public final jki.m a(jki.i iVar) {
        t1 t1Var;
        ZonedDateTime zonedDateTime;
        hel.b tradingContext;
        t1 t1Var2;
        Object next;
        rp0.y yVar;
        fcf.j jVar;
        Period period;
        rp0.y yVarD;
        x domainState = (x) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Data data = domainState.f112967a;
        Data data2 = domainState.d;
        Data data3 = domainState.f112969c;
        if (data.getContent() == null && data.getLoading()) {
            return g();
        }
        if (data.getContent() == null && !data.getLoading()) {
            return f();
        }
        if (data3.getContent() == null) {
            if (data3.getLoading()) {
                return g();
            }
            f();
        }
        if (data2.getContent() == null) {
            if (data2.getLoading()) {
                return g();
            }
            f();
        }
        boolean z = domainState.f112971h;
        lbf.p pVar = (lbf.p) data.getContent();
        if (pVar == null) {
            return f();
        }
        lbf.m mVar = pVar.f193684a;
        lbf.j jVar2 = pVar.f193685b;
        hel.b bVar = (hel.b) data3.getContent();
        if (bVar != null && (t1Var = (t1) data2.getContent()) != null) {
            boolean zA = pVar.a();
            acf.c cVar = this.f112977a;
            acf.c cVar2 = this.f112978b;
            hcf.a aVar = this.f112981h;
            v uVar = t.f112965a;
            if (zA) {
                if ((jVar2 != null ? jVar2.f193678b : null) != null) {
                    return e(pVar, bVar, t1Var, z);
                }
                if ((jVar2 != null ? jVar2.d : null) == null) {
                    return e(pVar, bVar, t1Var, z);
                }
                if (z) {
                    cVar = cVar2;
                }
                ArrayList arrayListA = cVar.a(mVar, bVar);
                yp0.b.k(arrayListA, 0, 0, 0, 0, 31);
                if (jVar2 != null && (zonedDateTime = jVar2.d) != null) {
                    RowDelegate.Model model = new RowDelegate.Model("ADD_ON_ENDS_ON_ID", null, new TextLocalisedClause(R$string.price_plan_add_ons_add_on_goodby_ending_date, zhm.u.c(new TimeClause(zonedDateTime.toInstant().toEpochMilli(), new TimeClause.Format.DayAndMonth(0), null, null, 12)), null, 12), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870906);
                    yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
                    LargeActionButtonDelegate.Model model2 = new LargeActionButtonDelegate.Model("ADD_ON_KEEP_ADD_ON_ID", LargeActionButton.ButtonStyle.f58726b, null, new TextLocalisedClause(R$string.price_plan_add_ons_add_on_goodbye_button_cancel_unsubscribe, null, null, 14), false, null, null, null, null, 1000);
                    yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
                    aim.e eVarB = zhm.u.b();
                    List listA = !z ? hcf.a.a(aVar, pVar) : null;
                    if (listA != null) {
                        eVarB.addAll(listA);
                    }
                    eVarB.addAll(arrayListA);
                    eVarB.add(model);
                    eVarB.add(model2);
                    eVarB.add(c(mVar.f193683g, bVar));
                    eVarB.addAll(b(t1Var));
                    return new y(zhm.u.a(eVarB), d(R$string.price_plan_add_ons_add_on_title_your_trading_pro, pVar), null, null, null, null, uVar);
                }
                return f();
            }
            lbf.p pVar2 = (lbf.p) data.getContent();
            if (pVar2 != null && (tradingContext = (hel.b) data3.getContent()) != null && (t1Var2 = (t1) data2.getContent()) != null) {
                Data portfolioStatusData = domainState.f112968b;
                lbf.m mVar2 = pVar2.f193684a;
                List list = mVar2.f193682c;
                if (z) {
                    cVar = cVar2;
                }
                ArrayList arrayListA2 = cVar.a(mVar2, tradingContext);
                yp0.b.k(arrayListA2, 0, 0, 0, 0, 31);
                Iterator it8 = list.iterator();
                while (true) {
                    if (!it8.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it8.next();
                    if (((lbf.b) next).f193666a == lbf.c.MONTHLY) {
                        break;
                    }
                }
                lbf.b price = (lbf.b) next;
                if (price == null) {
                    price = (lbf.b) zhm.d0.d0(list);
                }
                if (price == null) {
                    return f();
                }
                dj0.d dVar = price.f193668c;
                aim.e eVarB2 = zhm.u.b();
                List listA2 = hcf.a.a(aVar, pVar2);
                if (z) {
                    listA2 = null;
                }
                if (listA2 != null) {
                    eVarB2.addAll(listA2);
                }
                eVarB2.addAll(arrayListA2);
                eVarB2.add(c(mVar2.f193683g, tradingContext));
                eVarB2.addAll(b(t1Var2));
                aim.e eVarA = zhm.u.a(eVarB2);
                z zVarD = d(z ? R$string.price_plan_add_ons_add_on_title_unlock_trading_pro : R$string.price_plan_add_ons_add_on_title_get_trading_pro, pVar2);
                fcf.p pVar3 = (fcf.p) this.e;
                pVar3.getClass();
                Intrinsics.checkNotNullParameter(price, "price");
                Intrinsics.checkNotNullParameter(portfolioStatusData, "portfolioStatusData");
                Intrinsics.checkNotNullParameter(tradingContext, "tradingContext");
                Clause clause = (Clause) iii.c.f(portfolioStatusData, new fag.o0(23), new f5g.l(29), new a0i.a(pVar3, 16, price, tradingContext));
                aw0.e eVar = clause != null ? new aw0.e(true, ((hcf.b) aVar).c(pVar2), null, m6.c(n6.Companion, clause, LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, null, 764), null, null, 52) : null;
                rp0.y yVar2 = (rp0.y) iii.c.f(portfolioStatusData, new dak.c(17), new d7j.o0(26), new l1(25));
                rp0.y yVar3 = (rp0.y) iii.c.f(portfolioStatusData, new dak.c(16), new d7j.o0(25), new l1(24));
                lbf.c cVar3 = price.f193666a;
                lbf.e eVar2 = price.e;
                if (dVar.k()) {
                    yVar = null;
                } else {
                    int i = x0.f112972a[tradingContext.ordinal()];
                    fcf.k kVar = this.f112980g;
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                lbf.p pVar4 = (lbf.p) data.getContent();
                                yVarD = ((fcf.m) kVar).d(new fcf.f(cVar3, dVar, eVar2 != null ? eVar2.f193672a : null, new fcf.j(R$string.price_plan_add_ons_add_on_terms_and_conditions_trading_pro, pVar4 != null ? pVar4.f193684a.f193683g : null)));
                            }
                            yVar = null;
                        } else {
                            lbf.p pVar5 = (lbf.p) data.getContent();
                            yVarD = ((fcf.m) kVar).d(new fcf.g(cVar3, dVar, eVar2 != null ? eVar2.f193672a : null, new fcf.j(R$string.price_plan_add_ons_add_on_terms_and_conditions_trading_pro, pVar5 != null ? pVar5.f193684a.f193683g : null)));
                        }
                        yVar = yVarD;
                    } else {
                        Terms terms = (Terms) domainState.e.getContent();
                        if (terms != null) {
                            lbf.p pVar6 = (lbf.p) data.getContent();
                            String str = pVar6 != null ? pVar6.f193684a.f193683g : null;
                            String str2 = domainState.f;
                            lbf.c cVar4 = price.f193666a;
                            fcf.j jVar3 = new fcf.j(R$string.price_plan_add_ons_add_on_terms_and_conditions_trading_pro, str);
                            fcf.j jVar4 = new fcf.j(R$string.price_plan_add_ons_add_on_subscription_confirmation_terms_us_link_revolut_terms, str2);
                            if (eVar2 != null) {
                                Period period2 = eVar2.f193672a;
                                jVar = jVar3;
                                period = period2;
                            } else {
                                jVar = jVar3;
                                period = null;
                            }
                            yVarD = ((fcf.m) kVar).d(new fcf.h(cVar4, dVar, jVar, jVar4, terms, period));
                            yVar = yVarD;
                        }
                        yVar = null;
                    }
                }
                lbf.i iVar2 = (lbf.i) domainState.f112970g.getContent();
                if (iVar2 != null && !iVar2.equals(lbf.g.f193675a)) {
                    if (!(iVar2 instanceof lbf.h)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    lbf.l lVar = ((lbf.h) iVar2).f193676a;
                    if (lVar == null) {
                        lVar = lbf.l.UNKNOWN;
                    }
                    uVar = new u(lVar);
                }
                return new y(eVarA, zVarD, eVar, yVar2, yVar3, yVar, uVar);
            }
            return f();
        }
        return f();
    }

    public final List b(t1 t1Var) {
        Links links = t1Var.f318563a;
        hel.b bVar = t1Var.f318564b;
        return this.f.c(zhm.u.c(new a1(links, bVar)), bVar);
    }

    public final TextDelegate.Model c(String str, hel.b tradingContext) {
        Custom custom;
        ((fcf.p) this.e).getClass();
        Intrinsics.checkNotNullParameter(tradingContext, "tradingContext");
        int i = R$string.price_plan_add_ons_add_on_terms_and_conditions_full_launch;
        int[] iArr = fcf.o.f133742a;
        switch (iArr[tradingContext.ordinal()]) {
            case 1:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                custom = null;
                break;
            case 2:
                custom = new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254);
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return new TextDelegate.Model("TERMS_AND_CONDITIONS_ID", new TextLocalisedClause(i, zhm.u.c(new TextLocalisedClause(iArr[tradingContext.ordinal()] == 1 ? R$string.price_plan_add_ons_add_on_terms_and_conditions_link_us : R$string.price_plan_add_ons_add_on_terms_and_conditions_link, null, new Click(28, (Integer) null, (Object) str, "ADD_ON_TPRO_TERMS_LINK_ID", false), 10)), custom, 8), false, new ak0(null, null, 3), null, null, 0, 0, 0, 0, 2032);
    }

    public final z d(int i, lbf.p addOn) {
        TagViewData tagViewData = null;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(i, null, null, 14);
        CdnImage cdnImage = new CdnImage("trading_pro_background", "mobile/pricing_plan_add_ons/trading_pro", ".webp", null, null, null, Constants.TAG_FULL_SVPP_IDENTIFICATION);
        hcf.a aVar = this.f112981h;
        Clause clauseC = addOn != null ? ((hcf.b) aVar).c(addOn) : null;
        if (addOn != null) {
            ((hcf.b) aVar).getClass();
            Intrinsics.checkNotNullParameter(addOn, "addOn");
            Pair pair = addOn.a() ? new Pair(Integer.valueOf(R$attr.uikit_colorGreen), Integer.valueOf(R$attr.uikit_colorGreen_10)) : new Pair(Integer.valueOf(R$attr.uikit_colorForeground), Integer.valueOf(R$attr.uikit_colorForeground_20));
            tagViewData = new TagViewData(null, new TextLocalisedClause(addOn.a() ? R$string.price_plan_add_ons_add_on_status_active : R$string.price_plan_add_ons_add_on_badge_trusted_by_traders, null, new Custom(Integer.valueOf(((Number) pair.f186385a).intValue()), false, null, false, null, 254), 10), new Color.Solid(((Number) pair.f186386b).intValue()), R$attr.uikit_colorTransparent, null, 1000);
        }
        return new z(textLocalisedClause, cdnImage, clauseC, tagViewData);
    }

    public final y e(lbf.p pVar, hel.b bVar, t1 t1Var, boolean z) {
        lbf.m mVar = pVar.f193684a;
        ArrayList arrayListA = (z ? this.f112978b : this.f112977a).a(mVar, bVar);
        yp0.b.k(arrayListA, 0, 0, 0, 0, 31);
        RowDelegate.Model model = new RowDelegate.Model("REMOVE_ADD_ON_BUTTON_ID", null, new TextLocalisedClause(z ? R$string.price_plan_add_ons_add_on_cancel_trading_pro : R$string.price_plan_add_ons_add_on_remove_add_on, null, new Custom(Integer.valueOf(R$attr.uikit_colorRed), false, null, false, null, 254), 10), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870906);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        aim.e eVarB = zhm.u.b();
        List listA = hcf.a.a(this.f112981h, pVar);
        if (z) {
            listA = null;
        }
        if (listA != null) {
            eVarB.addAll(listA);
        }
        eVarB.addAll(arrayListA);
        eVarB.add(model);
        eVarB.add(c(mVar.f193683g, bVar));
        eVarB.addAll(b(t1Var));
        return new y(zhm.u.a(eVarB), d(R$string.price_plan_add_ons_add_on_title_your_trading_pro, pVar), null, null, null, null, t.f112965a);
    }

    public final y f() {
        List listA = ((acf.b) this.f112979c).a();
        yp0.b.k(listA, 0, 0, 0, 0, 31);
        return new y(listA, d(R$string.price_plan_add_ons_add_on_title_trading_pro, null), null, null, null, null, new u(lbf.l.UNKNOWN));
    }

    public final y g() {
        this.d.getClass();
        List listK = zhm.v.k(new pb0("1"), new pb0("2"), new pb0("3"));
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        return new y(listK, d(R$string.price_plan_add_ons_add_on_title_trading_pro, null), null, null, null, null, t.f112965a);
    }
}
