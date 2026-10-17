package ql6;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import aw0.o9;
import cfl.f0;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.payinstore.impl.R$string;
import com.revolut.feature.wealth.models.robo.Template;
import com.revolut.retail.feature.api.AnalyticsAccount;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccounts;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingProduct;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingProductCode;
import com.revolut.sso.impl.ui.combined_authentication.unified.CombinedAuthenticationUnifiedScreen;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import nkm.y;
import zhm.a0;
import zhm.d0;
import zhm.f0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class s implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f247218a;

    public /* synthetic */ s(int i) {
        this.f247218a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Object next;
        boolean z = false;
        switch (this.f247218a) {
            case 0:
                Function0 it8 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return iii.c.c(5);
            case 1:
                Unit it9 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return "BIOMETRIC_PAYMENTS_SETTINGS";
            case 2:
                Context ctx = (Context) obj2;
                KProperty[] kPropertyArr = CombinedAuthenticationUnifiedScreen.Y;
                Intrinsics.checkNotNullParameter(ctx, "ctx");
                LinearLayoutManager linearLayoutManager = new LinearLayoutManager(ctx);
                linearLayoutManager.setStackFromEnd(true);
                return linearLayoutManager;
            case 3:
                qll.q update = (qll.q) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return qll.q.a(update, new qll.m(null), null, null, null, 30);
            case 4:
                return qll.q.a((qll.q) obj2, new qll.m(null), null, null, null, 30);
            case 5:
                Boolean handled = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(handled, "handled");
                handled.booleanValue();
                return handled;
            case 6:
                rlm.f Json = (rlm.f) obj2;
                Intrinsics.checkNotNullParameter(Json, "$this$Json");
                Json.f255101c = true;
                return Unit.f186387a;
            case 7:
                Function0 it10 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return new cii.b(null, f0.f322471a, new lw0.h(lw0.i.AVATAR));
            case 8:
                gk3.g.Companion.getClass();
                return gk3.g.e;
            case 9:
                gk3.g gVar = (gk3.g) obj2;
                Intrinsics.h(gVar);
                Intrinsics.checkNotNullParameter(gVar, "<this>");
                return Boolean.valueOf(gVar.f144323a);
            case 10:
                TradingAccounts tradingAccounts = (TradingAccounts) obj2;
                Intrinsics.checkNotNullParameter(tradingAccounts, "tradingAccounts");
                Iterator it11 = tradingAccounts.f105278a.iterator();
                while (true) {
                    if (it11.hasNext()) {
                        Object next2 = it11.next();
                        if (((TradingAccount) next2) instanceof TradingAccount.Robo) {
                            obj = next2;
                        }
                    }
                }
                if (obj != null) {
                    return (TradingAccount) obj;
                }
                throw new IllegalStateException("ROBO trading account not created");
            case 11:
                TradingAccount roboTradingAccount = (TradingAccount) obj2;
                Intrinsics.checkNotNullParameter(roboTradingAccount, "roboTradingAccount");
                Iterator it12 = roboTradingAccount.c0().iterator();
                while (true) {
                    if (it12.hasNext()) {
                        next = it12.next();
                        if (com.revolut.shared.feature.wealth.models.trading_accounts.e.a((TradingProduct) next)) {
                        }
                    } else {
                        next = null;
                    }
                }
                TradingProduct tradingProduct = (TradingProduct) next;
                obj = tradingProduct != null ? tradingProduct.f105281b : null;
                if (Intrinsics.f(obj, TradingProductCode.RoboUS.f105335a)) {
                    return ilc.a.US;
                }
                if (Intrinsics.f(obj, TradingProductCode.RoboGB.f105333a)) {
                    return ilc.a.GB;
                }
                if (Intrinsics.f(obj, TradingProductCode.RoboEU.f105332a)) {
                    return ilc.a.EEA;
                }
                if (Intrinsics.f(obj, TradingProductCode.RoboSG.f105334a)) {
                    return ilc.a.SG;
                }
                throw new IllegalStateException(prk.o.r(roboTradingAccount.getF105262a(), "ROBO trading product not found for trading account "));
            case 12:
                List products = (List) obj2;
                Intrinsics.checkNotNullParameter(products, "products");
                Iterator it13 = products.iterator();
                while (true) {
                    if (it13.hasNext()) {
                        Object next3 = it13.next();
                        if (com.revolut.shared.feature.wealth.models.trading_accounts.e.a((TradingProduct) next3)) {
                            obj = next3;
                        }
                    }
                }
                if (obj != null) {
                    return (TradingProduct) obj;
                }
                throw new IllegalStateException("ROBO trading product not available");
            case 13:
                cfl.f0 it14 = (cfl.f0) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                obj = it14 instanceof f0.a ? (f0.a) it14 : null;
                if (obj != null) {
                    return obj;
                }
                throw new IllegalStateException(("Trading product is not Robo product: " + it14).toString());
            case 14:
                od0.i account = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(account, "account");
                Object obj3 = account.f224257a;
                TradingAccount.Robo robo = obj3 instanceof TradingAccount.Robo ? (TradingAccount.Robo) obj3 : null;
                if (robo == null) {
                    throw new IllegalStateException("No Robo account found for portfolio id.");
                }
                Iterator it15 = robo.c0().iterator();
                while (true) {
                    if (it15.hasNext()) {
                        Object next4 = it15.next();
                        if (com.revolut.shared.feature.wealth.models.trading_accounts.e.a((TradingProduct) next4)) {
                            obj = next4;
                        }
                    }
                }
                TradingProduct tradingProduct2 = (TradingProduct) obj;
                if (tradingProduct2 != null) {
                    return tradingProduct2;
                }
                throw new IllegalStateException("No Product found for Robo account");
            case 15:
                cfl.f0 it16 = (cfl.f0) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                obj = it16 instanceof f0.a ? (f0.a) it16 : null;
                if (obj != null) {
                    return obj;
                }
                throw new IllegalStateException(("Trading product is not Robo product: " + it16).toString());
            case 16:
                TradingAccounts accounts = (TradingAccounts) obj2;
                Intrinsics.checkNotNullParameter(accounts, "accounts");
                List list = accounts.f105278a;
                ArrayList arrayList = new ArrayList();
                for (Object obj4 : list) {
                    if (obj4 instanceof TradingAccount.Robo) {
                        arrayList.add(obj4);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj5 : arrayList) {
                    TradingAccount.Robo robo2 = (TradingAccount.Robo) obj5;
                    Intrinsics.checkNotNullParameter(robo2, "<this>");
                    if (com.revolut.shared.feature.wealth.models.trading_accounts.d.e(robo2) || com.revolut.shared.feature.wealth.models.trading_accounts.d.g(robo2)) {
                        arrayList2.add(obj5);
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                Iterator it17 = arrayList2.iterator();
                while (it17.hasNext()) {
                    a0.x(((TradingAccount.Robo) it17.next()).J(), arrayList3);
                }
                return arrayList3;
            case 17:
                od0.i portfolio = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(portfolio, "portfolio");
                alc.n nVar = (alc.n) portfolio.f224257a;
                if (nVar == null) {
                    od0.i.Companion.getClass();
                    return od0.i.f224256b;
                }
                od0.h hVar = od0.i.Companion;
                String str = nVar.f6207a;
                hVar.getClass();
                return od0.h.a(str);
            case 18:
                Template it18 = (Template) obj2;
                Intrinsics.checkNotNullParameter(it18, "it");
                od0.i.Companion.getClass();
                return od0.h.a(it18);
            case 19:
                Template it19 = (Template) obj2;
                Intrinsics.checkNotNullParameter(it19, "it");
                od0.i.Companion.getClass();
                return od0.h.a(it19);
            case 20:
                TradingAccounts accounts2 = (TradingAccounts) obj2;
                Intrinsics.checkNotNullParameter(accounts2, "accounts");
                return y.J(y.x(y.t(y.n(d0.Q(accounts2.f105278a), qmc.f.f247800a), new s(21)), new s(22)));
            case 21:
                TradingAccount.Robo it20 = (TradingAccount.Robo) obj2;
                Intrinsics.checkNotNullParameter(it20, "it");
                return it20.J();
            case 22:
                TradingAccount.Portfolio it21 = (TradingAccount.Portfolio) obj2;
                Intrinsics.checkNotNullParameter(it21, "it");
                return it21.f105210a.toString();
            case 23:
                Function0 it22 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it22, "it");
                return zhm.f0.f322471a;
            case 24:
                xzg.k collectionWithChildren = (xzg.k) obj2;
                Intrinsics.checkNotNullParameter(collectionWithChildren, "collectionWithChildren");
                return new qmh.i(collectionWithChildren.a());
            case 25:
                Object i = ((qv0.p) obj2).getE();
                if (i instanceof qmh.h) {
                    return (qmh.h) i;
                }
                return null;
            case 26:
                Function0 getDefaultLoadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems, "getDefaultLoadingItems");
                return new qn9.m(new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, (List) getDefaultLoadingItems.invoke(), false, new TextLocalisedClause(R$string.retail_pay_in_store_common_action_pay, null, null, 14));
            case 27:
                ike.b it23 = (ike.b) obj2;
                Intrinsics.checkNotNullParameter(it23, "it");
                return Boolean.valueOf(it23.f161941a);
            case 28:
                AnalyticsAccount getIndividualSelection = (AnalyticsAccount) obj2;
                Intrinsics.checkNotNullParameter(getIndividualSelection, "$this$getIndividualSelection");
                if ((getIndividualSelection instanceof AnalyticsAccount.Personal) && !(getIndividualSelection instanceof AnalyticsAccount.Personal.All)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                AnalyticsAccount getIndividualSelection2 = (AnalyticsAccount) obj2;
                Intrinsics.checkNotNullParameter(getIndividualSelection2, "$this$getIndividualSelection");
                if ((getIndividualSelection2 instanceof AnalyticsAccount.Joint) && !(getIndividualSelection2 instanceof AnalyticsAccount.Joint.All)) {
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }
}
