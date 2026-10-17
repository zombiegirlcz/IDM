package tlf;

import android.content.SharedPreferences;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.CurrencyImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.data.model.Data;
import com.revolut.feature.shared.savings.models.SavingsAccountDetails;
import com.revolut.feature.shared.savings.models.product.SavingsProductData;
import com.revolut.feature.uipersonalisation.api.models.AppTheme;
import com.revolut.feature.wealth.models.robo.RoboPortfolioInfo;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.shared.feature.wealth.models.config.Links;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import ip0.cs;
import ip0.nb0;
import ip0.pb0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nii.n1;
import snf.b0;
import snf.e0;
import yhm.m;
import yhm.r;
import z0h.p0;
import z0h.p1;
import z0h.t1;
import zhm.d0;
import zhm.f0;
import zhm.q0;
import zhm.r0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class n implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f272083a;

    public /* synthetic */ n(int i) {
        this.f272083a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [com.revolut.core.ui_kit.models.TextLocalisedClause, com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v5 */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) throws Throwable {
        Object objA;
        Boolean bool;
        int i = this.f272083a;
        od0.i iVarA = od0.i.f224256b;
        int i2 = 14;
        boolean zBooleanValue = false;
        Object obj3 = null;
        switch (i) {
            case 0:
                List pockets = (List) obj2;
                Intrinsics.checkNotNullParameter(pockets, "pockets");
                if (pockets.isEmpty()) {
                    return r0.g();
                }
                List<io3.d> list = pockets;
                int iB = q0.b(w.t(list, 10));
                if (iB < 16) {
                    iB = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
                for (io3.d dVar : list) {
                    linkedHashMap.put(dVar.f163145a, new CurrencyImage(dVar.f163147c, (ImageTransformations) , (TextLocalisedClause) , i2));
                }
                return linkedHashMap;
            case 1:
                Function0 it8 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return new tm8.h(null, null, f0.f322471a);
            case 2:
                Set availableProducts = (Set) obj2;
                Intrinsics.checkNotNullParameter(availableProducts, "availableProducts");
                return new Pair(Boolean.valueOf(!d0.h0(availableProducts, tmh.g.f272227c).isEmpty()), Boolean.valueOf(availableProducts.contains(xnh.a.COMMODITY)));
            case 3:
                n1 it9 = (n1) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return Unit.f186387a;
            case 4:
                tn0.b args = (tn0.b) obj2;
                tn0.c cVar = tn0.c.d;
                Intrinsics.checkNotNullParameter(args, "args");
                try {
                    m.Companion companion = yhm.m.INSTANCE;
                    SharedPreferences sharedPreferences = args.f272277a.getSharedPreferences("startup_preferences", 0);
                    Intrinsics.checkNotNullExpressionValue(sharedPreferences, "getSharedPreferences(...)");
                    objA = new qn0.a(new sn0.b(sharedPreferences));
                    break;
                } catch (CancellationException e) {
                    throw e;
                } catch (Throwable th10) {
                    m.Companion companion2 = yhm.m.INSTANCE;
                    objA = yhm.o.a(th10);
                }
                Throwable thA = yhm.m.a(objA);
                if (thA != null) {
                    hx7.e.n(thA);
                }
                rn0.b aVar = (qn0.a) (objA instanceof yhm.n ? 0 : objA);
                if (aVar == null) {
                    aVar = new un0.a();
                }
                return new tn0.a(aVar);
            case 5:
                r rVar = (r) obj2;
                Intrinsics.checkNotNullParameter(rVar, "<destruct>");
                return new tna.m((AppTheme) rVar.f314201a, ((Boolean) rVar.f314202b).booleanValue(), ((Boolean) rVar.f314203c).booleanValue());
            case 6:
                Function0 defaultLoadingItemsAccessor = (Function0) obj2;
                Intrinsics.checkNotNullParameter(defaultLoadingItemsAccessor, "defaultLoadingItemsAccessor");
                return (List) defaultLoadingItemsAccessor.invoke();
            case 7:
                SavingsAccountDetails it10 = (SavingsAccountDetails) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                od0.i.Companion.getClass();
                return od0.h.a(it10);
            case 8:
                Throwable it11 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return f0.f322471a;
            case 9:
                snb.b it12 = (snb.b) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                od0.i.Companion.getClass();
                return od0.h.a(it12);
            case 10:
                do3.n it13 = (do3.n) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                return do3.q.y(it13);
            case 11:
                SavingsProductData product = (SavingsProductData) obj2;
                Intrinsics.checkNotNullParameter(product, "product");
                Intrinsics.checkNotNullParameter(product, "<this>");
                if (ocd.a.b(product) && ocd.a.a(product)) {
                    zBooleanValue = true;
                }
                return Boolean.valueOf(zBooleanValue);
            case 12:
                SavingsProductData product2 = (SavingsProductData) obj2;
                Intrinsics.checkNotNullParameter(product2, "product");
                return Boolean.valueOf(ocd.a.a(product2));
            case 13:
                od0.i it14 = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                lzi.a aVar2 = (lzi.a) it14.f224257a;
                if (aVar2 == null) {
                    od0.i.Companion.getClass();
                    return iVarA;
                }
                od0.h hVar = od0.i.Companion;
                e5d.c cVar2 = new e5d.c(new d5d.a(aVar2.f200972a, aVar2.f200973b, aVar2.f200974c, aVar2.d, aVar2.e, null), "analytics");
                hVar.getClass();
                return od0.h.a(cVar2);
            case 14:
                od0.i tradingAccount = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(tradingAccount, "tradingAccount");
                TradingAccount tradingAccount2 = (TradingAccount) tradingAccount.f224257a;
                cfl.j e2 = tradingAccount2 != null ? tradingAccount2.getE() : null;
                int i3 = e2 == null ? -1 : tnf.c.f272440a[e2.ordinal()];
                if (i3 == 1) {
                    return new e0(false);
                }
                if (i3 == 2) {
                    return b0.f264574a;
                }
                throw new IllegalStateException("Cannot derive wallet of invest account based on " + e2 + " holder type.");
            case 15:
                Boolean tradingEnabled = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(tradingEnabled, "tradingEnabled");
                if (tradingEnabled.booleanValue()) {
                    od0.h hVar2 = od0.i.Companion;
                    FeatureCommand featureCommandA = jbb.a.a(ibb.c.f160141b, null, null, null, 14);
                    hVar2.getClass();
                    iVarA = od0.h.a(featureCommandA);
                } else {
                    od0.i.Companion.getClass();
                }
                return new Data(iVarA, null, false, 6, null);
            case 16:
                to2.f update = (to2.f) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return to2.f.a(update, new Data(null, null, true, 3, null));
            case 17:
                kl7.d result = (kl7.d) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                List list2 = result.f185303a;
                ArrayList arrayList = new ArrayList(w.t(list2, 10));
                Iterator it15 = list2.iterator();
                while (it15.hasNext()) {
                    arrayList.add(to7.c.g((String) it15.next()));
                }
                return arrayList;
            case 18:
                List carModels = (List) obj2;
                Intrinsics.checkNotNullParameter(carModels, "carModels");
                List list3 = carModels;
                ArrayList arrayList2 = new ArrayList(w.t(list3, 10));
                Iterator it16 = list3.iterator();
                while (it16.hasNext()) {
                    arrayList2.add(to7.c.g((String) it16.next()));
                }
                return arrayList2;
            case 19:
                List settings = (List) obj2;
                Intrinsics.checkNotNullParameter(settings, "settings");
                Iterator it17 = settings.iterator();
                while (true) {
                    if (it17.hasNext()) {
                        Object next = it17.next();
                        if (((soa.b) next).f264801a == soa.c.MARKETING) {
                            obj3 = next;
                        }
                    }
                }
                soa.b bVar = (soa.b) obj3;
                if (bVar != null && (bool = bVar.e) != null) {
                    zBooleanValue = bool.booleanValue();
                }
                return Boolean.valueOf(zBooleanValue);
            case 20:
                Function0 it18 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it18, "it");
                lw0.h hVar3 = new lw0.h(lw0.i.TITLE_SUBTITLE);
                cs csVar = new cs("LARGE_ACTION_BTN_LOADING_LIST_ID");
                yp0.b.r(csVar, 0, 0, 0, 0, 15);
                cs csVar2 = new cs("LARGE_ACTION_SECONDARY_BTN_LOADING_LIST_ID");
                yp0.b.r(csVar2, 0, 0, 0, 0, 15);
                return new tob.g(v.k(csVar, csVar2), hVar3);
            case 21:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                return d0.E0(w.u(((Map) pair.f186386b).values()), (List) pair.f186385a);
            case 22:
                t1 wealthDisclaimersData = (t1) obj2;
                Intrinsics.checkNotNullParameter(wealthDisclaimersData, "wealthDisclaimersData");
                Links links = wealthDisclaimersData.f318563a;
                hel.b bVar2 = wealthDisclaimersData.f318564b;
                return new p1(u.c(new z0h.q0(p0.ALL, links, bVar2)), bVar2);
            case 23:
                ((tp6.b) obj2).getClass();
                return new tp6.b(true);
            case 24:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                return u.c(nb0.b(pb0.Companion, "portfolio-recurring-deposit-widget-loading", false, 0, false, 30));
            case 25:
                List portfolios = (List) obj2;
                Intrinsics.checkNotNullParameter(portfolios, "portfolios");
                ArrayList arrayList3 = new ArrayList();
                for (Object obj4 : portfolios) {
                    if (((RoboPortfolioInfo) obj4).f95704g == xdh.c.ACTIVE) {
                        arrayList3.add(obj4);
                    }
                }
                return arrayList3;
            case 26:
                Throwable it19 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it19, "it");
                return f0.f322471a;
            case 27:
                Pair pair2 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                return d0.E0((List) pair2.f186386b, (List) pair2.f186385a);
            case 28:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                return f0.f322471a;
            default:
                Function0 it20 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it20, "it");
                return new tph.k(null, null, null, true);
        }
    }

    public /* synthetic */ n(Object obj2, int i) {
        this.f272083a = i;
    }
}
