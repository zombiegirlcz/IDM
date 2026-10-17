package m98;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.content.Intent;
import androidx.recyclerview.widget.GridLayoutManager;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.donations.impl.ui.kompot.screen.recurring.DonationSchedule;
import com.revolut.feature.faq.api.navigation.FaqFeatureConfig;
import com.revolut.feature.onboarding.impl.R$string;
import com.revolut.feature.shared_separate_favourites.domain.watchlist.WatchlistItem;
import com.revolut.feature.subscriptions.models.RecurringPaymentAccount;
import com.revolut.feature.subscriptions.models.RecurringPaymentFilter;
import com.revolut.feature.transactions.api.navigation.TransactionDestination;
import com.revolut.feature.transactions.api.navigation.TransactionListDestination;
import com.revolut.feature.transactions.api.navigation.TransactionsListFilterType;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.favorites.TravelHotelsHomeFavoritesScreen;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.feature.pod_nominees.impl.edit.PodNomineeEditScreen;
import com.revolut.shared.feature.wealth.models.config.TradingLegalEntityInformation;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import com.youTransactor.uCube.rpc.Constants;
import fa1.t;
import ha1.v;
import ip0.w60;
import ip0.x60;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import m9d.j1;
import m9d.l0;
import mhd.j0;
import mk5.c0;
import nii.y0;
import org.joda.time.LocalDate;
import org.joda.time.Period;
import rfm.u;
import te0.w;
import tof.hc;
import tof.i7;
import tof.q6;
import zh9.u0;
import zhm.d0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class k implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f203648a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f203649b;

    public /* synthetic */ k(Object obj2, int i) {
        this.f203648a = i;
        this.f203649b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r1v131, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v5 */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        efm.b bVarM;
        Period periodMonths;
        LocalDate localDateI;
        TradingAccount.TaxAdvantage.Limit.TopUpLimit topUpLimit;
        int i = this.f203648a;
        int i2 = 26;
        int i3 = 8;
        int i5 = 6;
        int i6 = 2;
        int i21 = 0;
        Object obj3 = this.f203649b;
        switch (i) {
            case 0:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                ((p) obj3).y2();
                return Boolean.FALSE;
            case 1:
                com.revolut.retail.feature.crypto.asset_details.impl.ui.screens.holding.a aVar = (com.revolut.retail.feature.crypto.asset_details.impl.ui.screens.holding.a) obj3;
                nc5.c it8 = (nc5.c) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                if (it8 instanceof nc5.b) {
                    aVar.H2(aVar.C, new l0(15));
                    aVar.n2(new m9j.o(aVar, name, i21), new whi.b(i5));
                }
                return Unit.f186387a;
            case 2:
                dj0.d balance = (dj0.d) obj2;
                Intrinsics.checkNotNullParameter(balance, "balance");
                ej0.b bVar = ((m9j.i) obj3).f203807b;
                if (bVar != null) {
                    return pyd.c.L(balance, bVar.f126703a, bVar.f126704b);
                }
                return null;
            case 3:
                qa1.e it9 = (qa1.e) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                ((ma1.d) obj3).getClass();
                return Boolean.valueOf(it9.f243933a > 20);
            case 4:
                ma1.j jVar = (ma1.j) obj3;
                Intent intent = (Intent) obj2;
                Intrinsics.checkNotNullParameter(intent, "intent");
                String action = intent.getAction();
                rfm.h hVar = rfm.h.f253943a;
                if (action == null) {
                    return hVar;
                }
                int iHashCode = action.hashCode();
                if (iHashCode == -223687943) {
                    if (!action.equals("android.bluetooth.device.action.PAIRING_REQUEST")) {
                        return hVar;
                    }
                    jVar.getClass();
                    if (intent.getIntExtra("android.bluetooth.device.extra.PAIRING_CONTEXT", -1) == 2) {
                        Intrinsics.checkNotNullExpressionValue(hVar, "empty(...)");
                        return hVar;
                    }
                    int intExtra = intent.getIntExtra("android.bluetooth.device.extra.PAIRING_KEY", -1);
                    BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
                    name = bluetoothDevice != null ? bluetoothDevice.getName() : 0;
                    return intExtra != -1 ? efm.k.g(new fa1.s(name != 0 ? name : "", intExtra)) : hVar;
                }
                if (iHashCode != 2116862345 || !action.equals("android.bluetooth.device.action.BOND_STATE_CHANGED")) {
                    return hVar;
                }
                jVar.getClass();
                BluetoothDevice bluetoothDevice2 = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
                String name = bluetoothDevice2 != null ? bluetoothDevice2.getName() : null;
                String str = name != null ? name : "";
                int intExtra2 = intent.getIntExtra("android.bluetooth.device.extra.BOND_STATE", 10);
                if (intExtra2 == 11) {
                    u uVarG = efm.k.g(new t(str));
                    Intrinsics.checkNotNullExpressionValue(uVarG, "just(...)");
                    return uVarG;
                }
                if (intExtra2 != 12) {
                    Intrinsics.checkNotNullExpressionValue(hVar, "empty(...)");
                    return hVar;
                }
                u uVarG2 = efm.k.g(new fa1.r(str));
                Intrinsics.checkNotNullExpressionValue(uVarG2, "just(...)");
                return uVarG2;
            case 5:
                ma1.u uVar = (ma1.u) obj3;
                qa1.b info = (qa1.b) obj2;
                Intrinsics.checkNotNullParameter(info, "cardReaderInfo");
                v vVar = uVar.f203908b;
                if (info.e == qa1.d.PERSONALIZED) {
                    ea1.b.a("Terminal is in PERSONALIZED state. Trying to move it to READY state...", fa1.k.INFO);
                    bVarM = vVar.a().e(vVar.b()).l(new bji.a(4)).m(new m78.e(new m9l.d(13), 27));
                } else {
                    bVarM = pfm.m.f235744a;
                }
                ha1.n nVar = uVar.f203907a;
                nVar.getClass();
                Intrinsics.checkNotNullParameter(info, "info");
                ufm.i iVar = new ufm.i(new ufm.c(new h4d.d(info, z ? 1 : 0), i6), new ha1.j(i3, new ha1.m(nVar, info, i21)), 0);
                Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
                return bVarM.f(w.i0(iVar));
            case 6:
                ma9.k kVar = (ma9.k) obj3;
                com.revolut.kompot.common.flow.permissions.a status = (com.revolut.kompot.common.flow.permissions.a) obj2;
                Intrinsics.checkNotNullParameter(status, "status");
                if (!(status instanceof sii.d) || ((sii.d) status).f263635b) {
                    y80.a aVar2 = kVar.f203967p;
                    if (aVar2.c("android.permission.READ_CONTACTS") && aVar2.c("android.permission.WRITE_CONTACTS")) {
                        kVar.n2(new lo.c(kVar, (Continuation) name, 28), new whi.b(i5));
                    } else {
                        kVar.C2(ma9.e.f203965a);
                    }
                } else {
                    yji.l.a1(kVar, kVar.X1(new y0("CONTACT_PERMISSION_DIALOG_ID", new nii.l0(new TextLocalisedClause(R$string.signup_registration_contacts_settings_dialog_title, null, null, 14), new TextLocalisedClause(R$string.signup_registration_contacts_settings_dialog_description, null, null, 14), null, new TextLocalisedClause(R$string.signup_registration_contacts_settings_dialog_positive, null, null, 14), null, null, false, null, 1012), false, 4)), null, null, new ma9.j(kVar, null), 3);
                }
                return Unit.f186387a;
            case 7:
                maa.l lVar = (maa.l) obj3;
                maa.j update = (maa.j) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return maa.j.a(update, null, 0, 0, lVar, null, 23);
            case 8:
                Data bannerModelData = (Data) obj2;
                Intrinsics.checkNotNullParameter(bannerModelData, "bannerData");
                mal.a aVar3 = (mal.a) ((k7i.i) obj3).f182070c;
                Intrinsics.checkNotNullParameter(bannerModelData, "bannerModelData");
                return (List) iii.c.f(bannerModelData, new m9l.d(22), new j1(9), new lk7.n(aVar3, 24));
            case 9:
                com.revolut.feature.onboarding.impl.onboarding.pep.a aVar4 = (com.revolut.feature.onboarding.impl.onboarding.pep.a) obj3;
                dii.g dialogResult = (dii.g) obj2;
                Intrinsics.checkNotNullParameter(dialogResult, "result");
                Intrinsics.checkNotNullParameter(dialogResult, "dialogResult");
                if (Intrinsics.f(dialogResult, dii.e.f115068a)) {
                    aVar4.C2(new mb9.d(true));
                } else if (!(dialogResult instanceof dii.c)) {
                    int i22 = jli.h.f175850a;
                } else if (Intrinsics.f(((dii.c) dialogResult).f115066a.f275445a, "PEP_FAQ_CLAUSE_ID")) {
                    aVar4.C1(new BridgeDestination(new FeatureCommand(new FaqFeatureConfig.Starter("question.who-is-a-pep", 2))));
                }
                return Unit.f186387a;
            case 10:
                mbi.f update2 = (mbi.f) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                od0.i.Companion.getClass();
                od0.i genderOptional = od0.h.a((bj0.b) obj3);
                update2.getClass();
                Intrinsics.checkNotNullParameter(genderOptional, "genderOptional");
                return new mbi.f(genderOptional);
            case 11:
                mc6.k kVar2 = (mc6.k) obj3;
                List recurringPayments = (List) obj2;
                Intrinsics.checkNotNullParameter(recurringPayments, "recurringPayments");
                qua.p pVar = (qua.p) d0.d0(recurringPayments);
                if (pVar == null || (periodMonths = pVar.f249314a.f160151b) == null) {
                    periodMonths = Period.months(1);
                }
                Intrinsics.h(periodMonths);
                if (pVar == null || (localDateI = pVar.f249314a.e) == null) {
                    localDateI = jli.b.i(((l80.f) kVar2.f204286r).e());
                }
                return new DonationSchedule(periodMonths, localDateI);
            case 12:
                RecurringPaymentAccount recurringPaymentAccount = (RecurringPaymentAccount) obj3;
                i7 filter = (i7) obj2;
                Intrinsics.checkNotNullParameter(filter, "filter");
                return u0.f(new TransactionListDestination(new TransactionListDestination.InputData((Clause) null, (TextLocalisedClause) null, (UrlImage) null, false, (TransactionsListFilterType) new TransactionsListFilterType.ByTransactionsFilter(filter, null, null, 6), (String) null, com.revolut.feature.subscriptions.models.a.a(recurringPaymentAccount), (rhf.h) null, rhf.g.JUNIOR_HOME, (TransactionDestination) null, (q6) new hc(((RecurringPaymentAccount.Junior) recurringPaymentAccount).f89319b, null), (Set) null, recurringPaymentAccount, (RecurringPaymentFilter) null, false, 60079)));
            case 13:
                Intrinsics.checkNotNullParameter((Context) obj2, "it");
                return new GridLayoutManager(((TravelHotelsHomeFavoritesScreen) obj3).m2(), 2);
            case 14:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                ((md9.m) obj3).getClass();
                return zhm.u.c(new x60("LOADING_PROMPT_LIST_ID", w60.CIRCLE_ASSET, null));
            case 15:
                com.revolut.feature.acquiring.lite_pos.impl.ui.screen.edit_catalogue_product_entry.a aVar5 = (com.revolut.feature.acquiring.lite_pos.impl.ui.screen.edit_catalogue_product_entry.a) obj3;
                dii.g output = (dii.g) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                if (output instanceof dii.f) {
                    aVar5.l2(new me1.g(aVar5, name, i21), new yi5.b(i2));
                }
                return Unit.f186387a;
            case 16:
                zp0.t it10 = (zp0.t) obj2;
                KProperty[] kPropertyArr = PodNomineeEditScreen.T;
                Intrinsics.checkNotNullParameter(it10, "it");
                mek.j jVarE3 = ((PodNomineeEditScreen) obj3).R2();
                Date date = it10.f324143a;
                com.revolut.retail.feature.pod_nominees.impl.edit.c cVar = (com.revolut.retail.feature.pod_nominees.impl.edit.c) jVarE3;
                cVar.H2(cVar.f102602t, new mek.l(i21, date != null ? ebm.a.N(date) : null, ((l80.f) cVar.f102599q).e().minusYears(120L)));
                return Unit.f186387a;
            case 17:
                return mek.g.a((mek.g) obj2, null, null, null, (mek.h) obj3, null, false, null, Constants.TAG_BLE_FIRMWARE_VERSION);
            case 18:
                df2.o it11 = (df2.o) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.feature.apm.upi.api.R$string.upi_area_upi_id_widget_title, null, null, 14);
                TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(com.revolut.feature.apm.upi.api.R$string.upi_area_upi_id_widget_description, null, null, 14);
                String str2 = it11.f113778a;
                String queryParameter = ((f80.b) ((f80.a) ((lal.a) obj3).d)).f(str2).getQueryParameter("pa");
                return new a12.l(textLocalisedClause, textLocalisedClause2, str2, queryParameter == null ? "" : queryParameter, Integer.valueOf(R$drawable.uikit_icn_24_upi_2));
            case 19:
                mfl.g gVar = (mfl.g) obj3;
                Data reports = gVar.f205024a;
                TradingLegalEntityInformation tradingLegalEntityInformation = gVar.f205025b;
                Data tradingAccount = gVar.f205026c;
                ((mfl.g) obj2).getClass();
                Intrinsics.checkNotNullParameter(reports, "reports");
                Intrinsics.checkNotNullParameter(tradingLegalEntityInformation, "tradingLegalEntityInformation");
                Intrinsics.checkNotNullParameter(tradingAccount, "tradingAccount");
                return new mfl.g(reports, tradingLegalEntityInformation, tradingAccount);
            case 20:
                com.revolut.feature.add_money.impl.flow.c cVar2 = (com.revolut.feature.add_money.impl.flow.c) obj3;
                g1j.b output2 = (g1j.b) obj2;
                Intrinsics.checkNotNullParameter(output2, "output");
                if (output2 == null) {
                    throw new NoWhenBranchMatchedException();
                }
                cVar2.l2(new com.revolut.feature.add_money.impl.flow.b(cVar2, output2, null), new yi5.b(i2));
                return Unit.f186387a;
            case 21:
                Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                return (dgc.i) ((mhc.b) obj3).f205482c.get("KEY_CONCIERGE_ALBERTINE_DETAILS_LAYOUT");
            case 22:
                j0 j0Var = (j0) obj3;
                List<WatchlistItem> watchlistItems = (List) obj2;
                Intrinsics.checkNotNullParameter(watchlistItems, "watchlistItems");
                ArrayList arrayList = new ArrayList();
                for (WatchlistItem watchlistItem : watchlistItems) {
                    String str3 = watchlistItem.f86898a.f86863a;
                    String strD = ((n3d.d) j0Var.u).d(watchlistItem);
                    p5d.b bVar2 = strD == null ? null : new p5d.b(str3, strD, null);
                    if (bVar2 != null) {
                        arrayList.add(bVar2);
                    }
                }
                return arrayList;
            case 23:
                mhh.c cVar3 = (mhh.c) obj3;
                od0.i tradingAccountOptional = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(tradingAccountOptional, "tradingAccountOptional");
                if (!tradingAccountOptional.d() || ((TradingAccount) tradingAccountOptional.c()).getD() == cfl.b.TERMINATED) {
                    throw new IllegalStateException(a10.b.s("No account of portfolioId ", cVar3.f205572m.f322124b, " not terminated found in requested limit widget."));
                }
                TradingAccount.TaxAdvantage taxAdvantage = (TradingAccount.TaxAdvantage) tradingAccountOptional.c();
                TradingAccount.TaxAdvantage.Limit f105255l = taxAdvantage.getF105255l();
                if (f105255l == null || (topUpLimit = f105255l.f105246a) == null) {
                    return null;
                }
                return nhh.a.a(topUpLimit, taxAdvantage);
            case 24:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return (List) ((mhh.e) obj3).f205575a.getValue();
            case 25:
                return (mic.k) obj3;
            case 26:
                dgm.e eVar = ((mif.o) obj3).f205817a;
                Unit unit = Unit.f186387a;
                eVar.onNext(unit);
                return unit;
            case 27:
                mk5.m mVar = (mk5.m) obj3;
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return new mk5.p(c0.a(), mVar.d, mVar.f206189a, mVar.f206190b);
            case 28:
                com.revolut.retail.feature.pricing_plans.ui.impl.screens.family_plans.management.b bVar3 = (com.revolut.retail.feature.pricing_plans.ui.impl.screens.family_plans.management.b) obj3;
                dii.g result = (dii.g) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                if (result instanceof dii.f) {
                    bVar3.f103415t.Z2(new maa.r(bVar3, i3));
                }
                return Unit.f186387a;
            default:
                return (mkk.e) obj3;
        }
    }

    public /* synthetic */ k(c0 c0Var, mk5.m mVar) {
        this.f203648a = 27;
        this.f203649b = mVar;
    }
}
