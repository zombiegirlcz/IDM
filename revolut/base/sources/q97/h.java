package q97;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.domain.models.user.UserCompanyRegion;
import com.revolut.feature.apm.core.api.product.ApmBizum;
import com.revolut.feature.apm.core.api.product.ApmBlik;
import com.revolut.feature.apm.core.api.product.ApmBreb;
import com.revolut.feature.apm.core.api.product.ApmIris;
import com.revolut.feature.apm.core.api.product.ApmMultibanco;
import com.revolut.feature.apm.core.api.product.ApmPayId;
import com.revolut.feature.apm.core.api.product.ApmPix;
import com.revolut.feature.apm.core.api.product.ApmQvik;
import com.revolut.feature.apm.core.api.product.ApmSpin;
import com.revolut.feature.apm.core.api.product.ApmUpi;
import com.revolut.feature.apm.core.api.product.ApmWero;
import com.revolut.feature.exchange.models.BuyFundingCurrencyPrefill;
import com.revolut.feature.globalsearch.api.R$string;
import com.revolut.feature.wealth.api.domain.model.WealthAccount;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.feature.crypto.asset_details.api.navigation.CryptoAssetDetailsFeatureConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f243700a;

    public /* synthetic */ h(int i) {
        this.f243700a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        t97.d dVar;
        Object next;
        WealthAccount.Securities securities;
        Object next2;
        switch (this.f243700a) {
            case 0:
                vo1.b availability = (vo1.b) obj2;
                Intrinsics.checkNotNullParameter(availability, "availability");
                t97.d dVar2 = t97.d.APM_BILLS_TAXES;
                if (!availability.f290839a) {
                    dVar2 = null;
                }
                t97.d dVar3 = t97.d.APM_BILLS_BPAY;
                if (!availability.f290840b) {
                    dVar3 = null;
                }
                t97.d dVar4 = t97.d.APM_BILLS_PAGO_PA;
                if (!availability.f290841c) {
                    dVar4 = null;
                }
                t97.d[] elements = {dVar2, dVar3, dVar4, availability.d ? t97.d.BILLS_AND_TAXES_F24 : null};
                Intrinsics.checkNotNullParameter(elements, "elements");
                List listL = kotlin.collections.d.L(elements);
                ArrayList arrayList = new ArrayList(zhm.w.t(listL, 10));
                Iterator it8 = listL.iterator();
                while (it8.hasNext()) {
                    arrayList.add(t97.c.a((t97.d) it8.next()));
                }
                return arrayList;
            case 1:
                List<dx1.e> apmProducts = (List) obj2;
                Intrinsics.checkNotNullParameter(apmProducts, "apmProducts");
                ArrayList arrayList2 = new ArrayList();
                for (dx1.e eVar : apmProducts) {
                    if (Intrinsics.f(eVar, ApmBizum.f61808c)) {
                        dVar = t97.d.APM_BIZUM;
                    } else if (Intrinsics.f(eVar, ApmBlik.f61809c)) {
                        dVar = t97.d.APM_BLIK;
                    } else if (Intrinsics.f(eVar, ApmBreb.f61810c)) {
                        dVar = t97.d.APM_BRE_B;
                    } else if (Intrinsics.f(eVar, ApmIris.f61811c)) {
                        dVar = t97.d.APM_IRIS;
                    } else if (Intrinsics.f(eVar, ApmMultibanco.f61815c)) {
                        dVar = t97.d.APM_MULTIBANCO;
                    } else if (Intrinsics.f(eVar, ApmMultibanco.b.f61816a)) {
                        dVar = t97.d.APM_MULTIBANCO_VIA_VERDE;
                    } else if (Intrinsics.f(eVar, ApmPayId.f61819c)) {
                        dVar = t97.d.APM_PAYID;
                    } else if (Intrinsics.f(eVar, ApmPix.f61820c)) {
                        dVar = t97.d.PIX;
                    } else if (Intrinsics.f(eVar, ApmQvik.f61823c)) {
                        dVar = t97.d.APM_QVIK;
                    } else if (Intrinsics.f(eVar, ApmQvik.b.f61824a)) {
                        dVar = t97.d.APM_QVIK_SECONDARY_ID;
                    } else if (Intrinsics.f(eVar, ApmSpin.f61827c)) {
                        dVar = t97.d.APM_SPIN;
                    } else if (Intrinsics.f(eVar, ApmUpi.f61828c)) {
                        dVar = t97.d.APM_UPI;
                    } else {
                        if (!Intrinsics.f(eVar, ApmWero.f61829c)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        dVar = t97.d.APM_WERO;
                    }
                    p97.a[] elements2 = {p97.a.a(t97.c.a(dVar), 0, null, null, null, null, eVar, 63), eVar instanceof ApmUpi ? p97.a.a(t97.c.a(t97.d.APM_UPI_MANDATES), 0, null, null, null, null, j.APM_UPI_MANDATES, 63) : null};
                    Intrinsics.checkNotNullParameter(elements2, "elements");
                    zhm.a0.x(kotlin.collections.d.L(elements2), arrayList2);
                }
                return arrayList2;
            case 2:
                Boolean isSwishEnabled = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(isSwishEnabled, "isSwishEnabled");
                return zhm.v.l(isSwishEnabled.booleanValue() ? t97.c.a(t97.d.APM_SWISH) : null);
            case 3:
                NaviCommand it9 = (NaviCommand) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return new o97.l(it9);
            case 4:
                NaviCommand it10 = (NaviCommand) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return new o97.l(it10);
            case 5:
                List wealthAccounts = (List) obj2;
                Intrinsics.checkNotNullParameter(wealthAccounts, "wealthAccounts");
                Iterator it11 = wealthAccounts.iterator();
                while (true) {
                    if (it11.hasNext()) {
                        next = it11.next();
                        if (next instanceof WealthAccount.Margin) {
                        }
                    } else {
                        next = null;
                    }
                }
                WealthAccount.Margin margin = (WealthAccount.Margin) next;
                return Boolean.valueOf(pd.b.j(margin != null ? Boolean.valueOf(margin.available()) : null));
            case 6:
                KompotDestination it12 = (KompotDestination) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                return new o97.d(it12);
            case 7:
                List facilities = (List) obj2;
                Intrinsics.checkNotNullParameter(facilities, "facilities");
                return m72.b.x(facilities, od0.i.Companion);
            case 8:
                NaviCommand it13 = (NaviCommand) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                return new o97.d(zh9.u0.b(it13));
            case 9:
                NaviCommand it14 = (NaviCommand) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                return new o97.d(zh9.u0.b(it14));
            case 10:
                xi0.b it15 = (xi0.b) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                return new o97.l(new FeatureCommand(new CryptoAssetDetailsFeatureConfig.AssetDetails(it15, (BuyFundingCurrencyPrefill) null, 6)));
            case 11:
                NaviCommand cardCommand = (NaviCommand) obj2;
                Intrinsics.checkNotNullParameter(cardCommand, "cardCommand");
                return new o97.d(zh9.u0.b(cardCommand));
            case 12:
                yoj.a feature = (yoj.a) obj2;
                Intrinsics.checkNotNullParameter(feature, "feature");
                return Boolean.valueOf(yoj.b.k(feature) || yoj.b.l(feature));
            case 13:
                vf0.y yVar = (vf0.y) obj2;
                Intrinsics.checkNotNullParameter(yVar, "<destruct>");
                Boolean bool = (Boolean) yVar.f288491a;
                Boolean bool2 = (Boolean) yVar.f288492b;
                Boolean bool3 = (Boolean) yVar.f288493c;
                Boolean bool4 = (Boolean) yVar.d;
                boolean zBooleanValue = ((Boolean) yVar.e).booleanValue();
                Boolean bool5 = (Boolean) yVar.f;
                if (!bool.booleanValue()) {
                    return zhm.f0.f322471a;
                }
                p97.a aVarA = t97.c.a(t97.d.CRYPTO_TAB);
                p97.a aVarA2 = t97.c.a(t97.d.CRYPTO_TRADING);
                p97.a aVarA3 = zBooleanValue ? t97.c.a(t97.d.REVOLUT_X) : null;
                p97.a aVarA4 = t97.c.a(t97.d.STABLECOINS);
                p97.a aVarA5 = t97.c.a(t97.d.CRYPTO_STRATEGIES);
                Intrinsics.h(bool2);
                p97.a aVarA6 = bool2.booleanValue() ? t97.c.a(t97.d.STAKING) : null;
                Intrinsics.h(bool5);
                p97.a aVarA7 = bool5.booleanValue() ? t97.c.a(t97.d.CRYPTO_CARDS) : null;
                Intrinsics.h(bool3);
                p97.a aVarA8 = bool3.booleanValue() ? t97.c.a(t97.d.CRYPTO_DEPOSITS) : null;
                Intrinsics.h(bool4);
                p97.a[] elements3 = {aVarA, aVarA2, aVarA3, aVarA4, aVarA5, aVarA6, aVarA7, aVarA8, bool4.booleanValue() ? t97.c.a(t97.d.CRYPTO_WITHDRAWALS) : null};
                Intrinsics.checkNotNullParameter(elements3, "elements");
                return kotlin.collections.d.L(elements3);
            case 14:
                yoj.a feature2 = (yoj.a) obj2;
                Intrinsics.checkNotNullParameter(feature2, "feature");
                return Boolean.valueOf(yoj.b.k(feature2) || yoj.b.l(feature2));
            case 15:
                yoj.a feature3 = (yoj.a) obj2;
                Intrinsics.checkNotNullParameter(feature3, "feature");
                return Boolean.valueOf(yoj.b.k(feature3) || yoj.b.l(feature3));
            case 16:
                yoj.a feature4 = (yoj.a) obj2;
                Intrinsics.checkNotNullParameter(feature4, "feature");
                return Boolean.valueOf(yoj.b.k(feature4) || yoj.b.l(feature4));
            case 17:
                ed5.c it16 = (ed5.c) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                it16.getClass();
                return Boolean.valueOf(it16 instanceof ed5.a);
            case 18:
                lo5.o entrypoint = (lo5.o) obj2;
                Intrinsics.checkNotNullParameter(entrypoint, "entrypoint");
                KompotDestination kompotDestination = entrypoint.f197407a;
                return kompotDestination instanceof BridgeDestination ? ((BridgeDestination) kompotDestination).f98270a : zh9.u0.f(kompotDestination);
            case 19:
                NaviCommand it17 = (NaviCommand) obj2;
                Intrinsics.checkNotNullParameter(it17, "it");
                return new o97.d(zh9.u0.b(it17));
            case 20:
                FeatureCommand command = (FeatureCommand) obj2;
                Intrinsics.checkNotNullParameter(command, "command");
                return new o97.l(command);
            case 21:
                Boolean esimAvailable = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(esimAvailable, "esimAvailable");
                return !esimAvailable.booleanValue() ? zhm.f0.f322471a : zhm.u.c(p97.a.a(t97.c.a(t97.d.ESIM), R$drawable.uikit_icn_24_sim_card, new TextLocalisedClause(R$string.lifestyle_search_products_esim, null, null, 14), null, null, null, null, 121));
            case 22:
                List accounts = (List) obj2;
                Intrinsics.checkNotNullParameter(accounts, "accounts");
                return Boolean.valueOf(ksj.b.m(accounts));
            case 23:
                l71.d it18 = (l71.d) obj2;
                Intrinsics.checkNotNullParameter(it18, "it");
                Intrinsics.checkNotNullParameter(it18, "<this>");
                return Boolean.valueOf(it18.a() == UserCompanyRegion.AU || it18.a() == UserCompanyRegion.NZ);
            case 24:
                List accounts2 = (List) obj2;
                Intrinsics.checkNotNullParameter(accounts2, "accounts");
                Iterator it19 = accounts2.iterator();
                while (true) {
                    securities = null;
                    if (it19.hasNext()) {
                        next2 = it19.next();
                        if (next2 instanceof WealthAccount.Securities) {
                        }
                    } else {
                        next2 = null;
                    }
                }
                WealthAccount.Securities securities2 = (WealthAccount.Securities) next2;
                if (securities2 != null && securities2.available()) {
                    securities = securities2;
                }
                od0.i.Companion.getClass();
                return od0.h.a(securities);
            case 25:
                FeatureCommand it20 = (FeatureCommand) obj2;
                Intrinsics.checkNotNullParameter(it20, "it");
                return new o97.l(it20);
            case 26:
                NaviCommand it21 = (NaviCommand) obj2;
                Intrinsics.checkNotNullParameter(it21, "it");
                return new o97.l(it21);
            case 27:
                FeatureCommand it22 = (FeatureCommand) obj2;
                Intrinsics.checkNotNullParameter(it22, "it");
                return new o97.l(it22);
            case 28:
                FeatureCommand it23 = (FeatureCommand) obj2;
                Intrinsics.checkNotNullParameter(it23, "it");
                return new o97.l(it23);
            default:
                NaviCommand it24 = (NaviCommand) obj2;
                Intrinsics.checkNotNullParameter(it24, "it");
                return new o97.l(it24);
        }
    }

    public /* synthetic */ h(p97.c cVar, int i) {
        this.f243700a = i;
    }
}
