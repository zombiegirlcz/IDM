package ksd;

import amd.l;
import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.PercentageClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.CdnImage;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.CircleTransformation;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.pricingplans.models.PricingPlanSubscription;
import com.revolut.feature.spending_analytics.api.R$string;
import com.revolut.feature_rev_points_pocket_api.model.RevPointsPocketInfo;
import com.youTransactor.uCube.rpc.Constants;
import efm.r;
import hha.m;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.cbeff.ISO781611;
import zhm.d0;
import zhm.f0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f189424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f189425b;

    public /* synthetic */ b(g gVar, int i) {
        this.f189424a = i;
        this.f189425b = gVar;
    }

    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Float, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r3v27, types: [com.revolut.core.ui_kit.models.Style, java.util.List] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        BigDecimal bigDecimal;
        TextLocalisedClause textLocalisedClause;
        Iterator it8;
        ?? r06;
        TextLocalisedClause textLocalisedClause2;
        BigDecimal bigDecimal2;
        int i = this.f189424a;
        int i2 = 3;
        g gVar = this.f189425b;
        switch (i) {
            case 0:
                vf0.g gVar2 = (vf0.g) obj2;
                Intrinsics.checkNotNullParameter(gVar2, "<destruct>");
                lsd.c group = (lsd.c) gVar2.f288428a;
                lsd.c bills = (lsd.c) gVar2.f288429b;
                lsd.c personal = (lsd.c) gVar2.f288430c;
                lsd.c joint = (lsd.c) gVar2.d;
                lsd.c pro = (lsd.c) gVar2.e;
                lsd.c proTax = (lsd.c) gVar2.f;
                List cashback = (List) gVar2.f288431g;
                List revPointsPocket = (List) gVar2.f288432h;
                List list = cashback;
                List<m71.a> list2 = revPointsPocket;
                ArrayList arrayListE0 = d0.E0(list2, d0.E0(list, d0.E0(proTax.f199673b, d0.E0(pro.f199673b, d0.E0(joint.f199673b, d0.E0(personal.f199673b, d0.E0(bills.f199673b, group.f199673b)))))));
                Object obj3 = null;
                ArrayList arrayList = new ArrayList();
                Iterator it9 = arrayListE0.iterator();
                while (it9.hasNext()) {
                    dj0.d dVar = ((m71.a) it9.next()).f203278a;
                    if (dVar != null) {
                        arrayList.add(dVar);
                    }
                }
                dj0.d.Companion.getClass();
                dj0.d dVarO = dj0.d.e;
                int i3 = 0;
                for (Object obj4 : arrayList) {
                    int i5 = i3 + 1;
                    if (i3 < 0) {
                        v.s();
                        throw null;
                    }
                    dVarO = i3 == 0 ? (dj0.d) obj4 : pyd.c.O(dVarO, (dj0.d) obj4);
                    i3 = i5;
                }
                amd.e eVar = amd.e.POCKETS;
                i iVar = gVar.f;
                Intrinsics.checkNotNullParameter(bills, "bills");
                Intrinsics.checkNotNullParameter(group, "group");
                Intrinsics.checkNotNullParameter(personal, "personal");
                Intrinsics.checkNotNullParameter(joint, "joint");
                Intrinsics.checkNotNullParameter(pro, "pro");
                Intrinsics.checkNotNullParameter(proTax, "proTax");
                Intrinsics.checkNotNullParameter(cashback, "cashback");
                Intrinsics.checkNotNullParameter(revPointsPocket, "revPointsPocket");
                ArrayList arrayListA = iVar.a(bills);
                ArrayList arrayListA2 = iVar.a(group);
                ArrayList arrayListA3 = iVar.a(personal);
                ArrayList arrayListA4 = iVar.a(joint);
                ArrayList arrayListA5 = iVar.a(pro);
                ArrayList arrayListA6 = iVar.a(proTax);
                ArrayList arrayList2 = new ArrayList(w.t(list, 10));
                Iterator it10 = list.iterator();
                while (it10.hasNext()) {
                    m71.a aVar = (m71.a) it10.next();
                    lsd.a aVar2 = (lsd.a) aVar.f203279b;
                    dj0.d dVar2 = aVar2.f199669a;
                    dj0.d dVar3 = aVar.f203278a;
                    ArrayList arrayList3 = arrayListA;
                    ArrayList arrayList4 = arrayListA2;
                    ArrayList arrayList5 = arrayListA3;
                    ?? r3 = obj3;
                    TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.analytics_net_worth_cashback_title, r3, r3, 14);
                    PricingPlanSubscription pricingPlanSubscription = aVar2.f199670b;
                    m mVar = pricingPlanSubscription.f81139q;
                    if (mVar == null || (bigDecimal2 = mVar.f152321a) == null) {
                        jha.c cVar = pricingPlanSubscription.f81129a.o;
                        bigDecimal = cVar != null ? cVar.f174189b : null;
                    } else {
                        bigDecimal = bigDecimal2;
                    }
                    if (bigDecimal != null) {
                        textLocalisedClause = textLocalisedClause3;
                        it8 = it10;
                        r06 = 0;
                        textLocalisedClause2 = new TextLocalisedClause(R$string.analytics_net_worth_cashback_subtitle, u.c(new PercentageClause(bigDecimal, (PercentageClause.Format) null, (Style) null, 6)), null, 12);
                    } else {
                        textLocalisedClause = textLocalisedClause3;
                        it8 = it10;
                        r06 = 0;
                        textLocalisedClause2 = null;
                    }
                    arrayList2.add(new m71.a(dVar3, new amd.f(textLocalisedClause, textLocalisedClause2, new MoneyClause(dVar2, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, new CdnImage("ultra_cards", "mobile/cards", null, new ImageTransformations(null, new CircleTransformation((Float) r06, (Integer) r06, false, 15), null, null, null, null, null, ISO781611.SMT_TAG), null, null, Constants.TAG_E4_CUSTOMER_DATA), null, new l(dVar2), 168)));
                    arrayListA = arrayList3;
                    arrayListA2 = arrayList4;
                    arrayListA3 = arrayList5;
                    it10 = it8;
                    obj3 = null;
                }
                ArrayList arrayList6 = arrayListA;
                ArrayList arrayList7 = arrayListA2;
                ArrayList arrayList8 = arrayListA3;
                ArrayList arrayList9 = new ArrayList(w.t(list2, 10));
                for (m71.a aVar3 : list2) {
                    dj0.d dVar4 = aVar3.f203278a;
                    Object obj5 = aVar3.f203279b;
                    TextLocalisedClause textLocalisedClause4 = new TextLocalisedClause(R$string.analytics_net_worth_points_pocket_title, null, null, 14);
                    LayeredImage layeredImageI = LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_rev_points_mono, R$attr.uikit_colorWhite, R$attr.uikit_colorBlue);
                    RevPointsPocketInfo revPointsPocketInfo = ((lsd.b) obj5).f199671a;
                    arrayList9.add(new m71.a(dVar4, new amd.f(textLocalisedClause4, null, new MoneyClause(revPointsPocketInfo.e, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, layeredImageI, null, new amd.d0(revPointsPocketInfo.f97784a), 170)));
                }
                ArrayList arrayListU = w.u(v.k(arrayList6, arrayList7, arrayList8, arrayListA4, arrayListA5, arrayListA6, arrayList2, arrayList9));
                ArrayList arrayList10 = new ArrayList();
                for (Object obj6 : arrayListU) {
                    dj0.d dVar5 = ((m71.a) obj6).f203278a;
                    if ((dVar5 != null ? dVar5.f115082a : -1L) >= 0) {
                        arrayList10.add(obj6);
                    }
                }
                List listP0 = d0.P0(arrayList10, new h());
                ArrayList arrayList11 = new ArrayList(w.t(listP0, 10));
                Iterator it11 = listP0.iterator();
                while (it11.hasNext()) {
                    arrayList11.add((amd.f) ((m71.a) it11.next()).f203279b);
                }
                return new amd.d(eVar, arrayList11, f0.f322471a, dVarO);
            case 1:
                amd.d group2 = (amd.d) obj2;
                Intrinsics.checkNotNullParameter(group2, "group");
                dj0.d dVar6 = group2.d;
                gVar.getClass();
                if (dVar6.f115082a < 0 || dVar6.f115083b.f306286a.length() <= 0 || group2.f6313b.isEmpty()) {
                    return null;
                }
                return group2;
            case 2:
                uc3.e cashbackStatus = (uc3.e) obj2;
                Intrinsics.checkNotNullParameter(cashbackStatus, "cashbackStatus");
                if (d.f189426a[cashbackStatus.ordinal()] == 1) {
                    r rVarJust = r.just(new Data(f0.f322471a, null, false, 6, null));
                    Intrinsics.h(rVarJust);
                    return rVarJust;
                }
                bd3.a aVar4 = gVar.f189429a;
                w4l.h hVar = w4l.h.f294642c;
                return pd.b.r(nim.a.w(mif.a.f(aVar4.c(hVar), gVar.f189430b.v(hVar), aVar4.g(hVar), gVar.d.J(AccountId.Personal.f51414a, hVar)), new kpj.a(gVar, 26)), new b(gVar, i2));
            default:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                List list3 = (List) pair.f186385a;
                xi0.b bVar = (xi0.b) pair.f186386b;
                List list4 = list3;
                ArrayList arrayList12 = new ArrayList(w.t(list4, 10));
                Iterator it12 = list4.iterator();
                while (it12.hasNext()) {
                    arrayList12.add(((lsd.a) it12.next()).f199669a.f115083b);
                }
                return nim.a.w(gVar.a(arrayList12, bVar), new c9h.a(list3, bVar, 1));
        }
    }
}
