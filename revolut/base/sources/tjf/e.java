package tjf;

import android.content.Context;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import aw0.o9;
import com.google.common.base.Preconditions;
import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.data.model.Data;
import com.revolut.feature.credit.card.impl.ui.autopay.flow.settings.CreditCardAutopaySettingsFlowContract$State;
import com.revolut.feature.crypto.remittance.impl.ui.multichain.info.CryptoMultichainInfoControllerContract$SheetPagerItem;
import com.revolut.feature.shared.savings.models.product.ProductGroup;
import com.revolut.feature.shared.savings.models.product.SavingsProductData;
import com.revolut.feature.transactions.impl.R$string;
import com.revolut.feature.wealth.api.domain.model.WealthAccount;
import com.revolut.feature.wealth_discovery.impl.screener.screens.collection.ScreenerCollectionScreenContract$CollectionConfig;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.recyclerkit.layoutmanager.UIKitLinearLayoutManager;
import com.revolut.retail.feature.api.AnalyticsAccountsSelection;
import com.revolut.retail.feature.commodity.order_flow.api.CommodityOrderFlowApi$Toggles$CommodityRecurringBuys;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberPortingContractType;
import com.revolut.shared.feature.wealth.models.screener.ScreenerCollection;
import com.revolut.sso.api.models.UserInfoFromApp;
import com.revolut.sso.impl.domain.models.UserInfoAccount;
import com.revolut.sso.impl.ui.email.change_flow.ChangeEmailFlowContract$State;
import ecm.c2;
import ecm.e1;
import ecm.e2;
import gcm.p1;
import gcm.p2;
import grl.b7;
import grl.c7;
import ip0.nb0;
import ip0.pb0;
import java.net.URI;
import java.net.URISyntaxException;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import kl7.s0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.json.Json;
import le.u1;
import sgm.e3;
import z0h.t1;
import zhm.r0;
import zhm.y0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class e implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f271651a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f271652b;

    public /* synthetic */ e(Object obj2, int i) {
        this.f271651a = i;
        this.f271652b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v112, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v16, types: [java.lang.Object, java.util.Map] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i;
        String text;
        int i2;
        int i3;
        Integer numValueOf;
        int i5;
        vjl.m mVar;
        vjl.m mVar2;
        int i6;
        vjl.k kVar;
        Flow gVar;
        Object next;
        ProductGroup.RiskConfig riskConfig;
        z0h.q0 q0Var;
        Object tVar;
        boolean z = false;
        Object obj3 = null;
        switch (this.f271651a) {
            case 0:
                j jVar = (j) this.f271652b;
                Function0 it8 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return jVar.d.c(R$string.search_block_joint_transactions_title, "JOINT_TRANSACTIONS_SECTION_LIST_ID");
            case 1:
                n nVar = (n) this.f271652b;
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                return nVar.f271685c.f((List) pair.f186385a, (k71.q) pair.f186386b, com.revolut.feature.globalsearch.api.R$string.search_block_recent_transactions_title, "CREDIT_TRANSACTIONS_SECTION_LIST_ID", o97.r.CREDIT_RECENT_TRANSACTIONS);
            case 2:
                q0 q0Var2 = (q0) this.f271652b;
                Throwable it9 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return q0Var2.f271694b.b(com.revolut.feature.pocket_details.api.R$string.revolut_accounts_home_transactions_title, "TRANSACTIONS_SECTION_LIST_ID");
            case 3:
                sjl.b bVar = ((tjl.b) this.f271652b).f271808c;
                SQLiteStatement sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("SELECT * FROM consented_client ORDER BY lastUsedAt DESC");
                try {
                    int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
                    int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "name");
                    int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "consents");
                    int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "createdAt");
                    int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "lastUsedAt");
                    int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "iconUri");
                    ArrayList arrayList = new ArrayList();
                    while (sQLiteStatementPrepare.step()) {
                        String text2 = sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow);
                        String text3 = sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2);
                        String json = sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3);
                        Intrinsics.checkNotNullParameter(json, "json");
                        Json jsonA = af0.b.a();
                        jsonA.getClass();
                        List list = (List) jsonA.b(new qlm.e(vjl.h.Companion.serializer()), json);
                        Long lValueOf = sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : Long.valueOf(sQLiteStatementPrepare.getLong(columnIndexOrThrow4));
                        Instant instantOfEpochMilli = lValueOf != null ? Instant.ofEpochMilli(lValueOf.longValue()) : null;
                        Long lValueOf2 = sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : Long.valueOf(sQLiteStatementPrepare.getLong(columnIndexOrThrow5));
                        arrayList.add(new vjl.i(text2, text3, list, instantOfEpochMilli, lValueOf2 != null ? Instant.ofEpochMilli(lValueOf2.longValue()) : null, sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6)));
                        break;
                    }
                    return arrayList;
                } finally {
                    sQLiteStatementPrepare.close();
                }
            case 4:
                ((tjl.d) this.f271652b).getClass();
                SQLiteStatement sQLiteStatementPrepare2 = ((SQLiteConnection) obj2).prepare("SELECT * FROM user_info_account");
                try {
                    int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "id");
                    int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "displayTitle");
                    int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "displaySubtitle");
                    int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "profileType");
                    int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "email_value");
                    int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "email_verified");
                    int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "email_unmaskedValue");
                    int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "phone_value");
                    int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "phone_verified");
                    int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "phone_unmaskedValue");
                    int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "address_streetAddress");
                    int columnIndexOrThrow18 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "address_postalCode");
                    int columnIndexOrThrow19 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "address_country");
                    int columnIndexOrThrow20 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "address_locality");
                    int columnIndexOrThrow21 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "address_region");
                    ArrayList arrayList2 = new ArrayList();
                    while (sQLiteStatementPrepare2.step()) {
                        String text4 = sQLiteStatementPrepare2.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow7);
                        String text5 = sQLiteStatementPrepare2.isNull(columnIndexOrThrow8) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow8);
                        String text6 = sQLiteStatementPrepare2.isNull(columnIndexOrThrow9) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow9);
                        vjl.p pVarA = sjl.c.a(sQLiteStatementPrepare2.isNull(columnIndexOrThrow10) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow10));
                        if (sQLiteStatementPrepare2.isNull(columnIndexOrThrow11) && sQLiteStatementPrepare2.isNull(columnIndexOrThrow12) && sQLiteStatementPrepare2.isNull(columnIndexOrThrow13)) {
                            i = columnIndexOrThrow7;
                            i2 = columnIndexOrThrow8;
                            i3 = columnIndexOrThrow9;
                            i5 = columnIndexOrThrow10;
                            mVar = null;
                        } else {
                            if (sQLiteStatementPrepare2.isNull(columnIndexOrThrow11)) {
                                i = columnIndexOrThrow7;
                                text = null;
                            } else {
                                i = columnIndexOrThrow7;
                                text = sQLiteStatementPrepare2.getText(columnIndexOrThrow11);
                            }
                            if (sQLiteStatementPrepare2.isNull(columnIndexOrThrow12)) {
                                i2 = columnIndexOrThrow8;
                                i3 = columnIndexOrThrow9;
                                numValueOf = null;
                            } else {
                                i2 = columnIndexOrThrow8;
                                i3 = columnIndexOrThrow9;
                                numValueOf = Integer.valueOf((int) sQLiteStatementPrepare2.getLong(columnIndexOrThrow12));
                            }
                            i5 = columnIndexOrThrow10;
                            mVar = new vjl.m(text, sQLiteStatementPrepare2.isNull(columnIndexOrThrow13) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow13), numValueOf == null ? null : Boolean.valueOf(numValueOf.intValue() != 0));
                        }
                        if (sQLiteStatementPrepare2.isNull(columnIndexOrThrow14) && sQLiteStatementPrepare2.isNull(columnIndexOrThrow15) && sQLiteStatementPrepare2.isNull(columnIndexOrThrow16)) {
                            mVar2 = null;
                        } else {
                            String text7 = sQLiteStatementPrepare2.isNull(columnIndexOrThrow14) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow14);
                            Integer numValueOf2 = sQLiteStatementPrepare2.isNull(columnIndexOrThrow15) ? null : Integer.valueOf((int) sQLiteStatementPrepare2.getLong(columnIndexOrThrow15));
                            mVar2 = new vjl.m(text7, sQLiteStatementPrepare2.isNull(columnIndexOrThrow16) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow16), numValueOf2 == null ? null : Boolean.valueOf(numValueOf2.intValue() != 0));
                        }
                        if (sQLiteStatementPrepare2.isNull(columnIndexOrThrow17) && sQLiteStatementPrepare2.isNull(columnIndexOrThrow18) && sQLiteStatementPrepare2.isNull(columnIndexOrThrow19) && sQLiteStatementPrepare2.isNull(columnIndexOrThrow20)) {
                            i6 = columnIndexOrThrow21;
                            if (sQLiteStatementPrepare2.isNull(i6)) {
                                kVar = null;
                                arrayList2.add(new vjl.q(text4, text5, text6, pVarA, mVar, mVar2, kVar));
                                columnIndexOrThrow21 = i6;
                                columnIndexOrThrow8 = i2;
                                columnIndexOrThrow7 = i;
                                columnIndexOrThrow9 = i3;
                                columnIndexOrThrow10 = i5;
                            }
                        } else {
                            i6 = columnIndexOrThrow21;
                        }
                        kVar = new vjl.k(sQLiteStatementPrepare2.isNull(columnIndexOrThrow17) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow17), sQLiteStatementPrepare2.isNull(columnIndexOrThrow18) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow18), sQLiteStatementPrepare2.isNull(columnIndexOrThrow19) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow19), sQLiteStatementPrepare2.isNull(columnIndexOrThrow20) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow20), sQLiteStatementPrepare2.isNull(i6) ? null : sQLiteStatementPrepare2.getText(i6));
                        arrayList2.add(new vjl.q(text4, text5, text6, pVarA, mVar, mVar2, kVar));
                        columnIndexOrThrow21 = i6;
                        columnIndexOrThrow8 = i2;
                        columnIndexOrThrow7 = i;
                        columnIndexOrThrow9 = i3;
                        columnIndexOrThrow10 = i5;
                        break;
                    }
                    return arrayList2;
                } catch (Throwable th10) {
                    throw th10;
                }
            case 5:
                CryptoMultichainInfoControllerContract$SheetPagerItem cryptoMultichainInfoControllerContract$SheetPagerItem = (CryptoMultichainInfoControllerContract$SheetPagerItem) this.f271652b;
                tk5.d update = (tk5.d) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                String str = cryptoMultichainInfoControllerContract$SheetPagerItem.f70974b;
                ArrayList pagerItems = update.f271878a;
                Intrinsics.checkNotNullParameter(pagerItems, "pagerItems");
                return new tk5.d(str, pagerItems);
            case 6:
                tki.c controller = (tki.c) this.f271652b;
                Context it10 = (Context) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                Intrinsics.checkNotNullParameter(controller, "controller");
                UIKitLinearLayoutManager uIKitLinearLayoutManager = new UIKitLinearLayoutManager(((ViewController) controller).m2());
                uIKitLinearLayoutManager.f98539c = true;
                return uIKitLinearLayoutManager;
            case 7:
                EsimPhoneNumberPortingContractType esimPhoneNumberPortingContractType = (EsimPhoneNumberPortingContractType) this.f271652b;
                tkj.d update2 = (tkj.d) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                update2.getClass();
                return new tkj.d(esimPhoneNumberPortingContractType);
            case 8:
                ryc.a aVar = (ryc.a) this.f271652b;
                Boolean enabled = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(enabled, "enabled");
                return enabled.booleanValue() ? ((s6e.z) ((g6e.d) aVar.f258290b)).a().distinctUntilChanged() : te0.w.h(r0.g());
            case 9:
                tlh.a aVar2 = (tlh.a) this.f271652b;
                Pair pair2 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                boolean zBooleanValue = ((Boolean) pair2.f186385a).booleanValue();
                WealthAccount.Commodities commodities = (WealthAccount.Commodities) pair2.f186386b;
                aim.o oVar = new aim.o();
                if (zBooleanValue) {
                    oVar.add(c0h.b.ETFS);
                    oVar.add(c0h.b.STOCKS);
                }
                if (commodities.available() && ((jte.d) aVar2.f272101c).c(CommodityOrderFlowApi$Toggles$CommodityRecurringBuys.f99801c)) {
                    oVar.add(c0h.b.COMMODITIES);
                }
                return y0.a(oVar);
            case 10:
                KSerializer kSerializer = (KSerializer) this.f271652b;
                List it11 = (List) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return kSerializer;
            case 11:
                ((tm.g) this.f271652b).f.onNext(new Data(null, null, true, 3, null));
                return Unit.f186387a;
            case 12:
                com.revolut.feature.junior_rewards.impl.ui.list.a aVar3 = (com.revolut.feature.junior_rewards.impl.ui.list.a) this.f271652b;
                im8.b result = (im8.b) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                if (result == null) {
                    throw new NoWhenBranchMatchedException();
                }
                aVar3.X1(result.f162315a);
                return Unit.f186387a;
            case 13:
                tmh.g gVar2 = (tmh.g) this.f271652b;
                Pair pair3 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair3, "<destruct>");
                boolean zBooleanValue2 = ((Boolean) pair3.f186385a).booleanValue();
                boolean zBooleanValue3 = ((Boolean) pair3.f186386b).booleanValue();
                if (zBooleanValue2) {
                    gVar = gVar2.f272229b.f2828l.w0();
                } else {
                    gVar2.getClass();
                    gVar = new go.g(new Data(null, null, false, 6, null), 2);
                }
                return new ax9.o(yh5.b.d(gVar, zBooleanValue3 ? gVar2.f272229b.f2828l.s1() : new go.g(new Data(null, null, false, 6, null), 2)), 15);
            case 14:
                UserInfoFromApp userInfoFromApp = (UserInfoFromApp) this.f271652b;
                return ChangeEmailFlowContract$State.a((ChangeEmailFlowContract$State) obj2, null, userInfoFromApp.f105997b, userInfoFromApp.d, 1);
            case 15:
                UserInfoFromApp.Email email = (UserInfoFromApp.Email) this.f271652b;
                ArrayList arrayList3 = new ArrayList();
                for (Object obj4 : (List) obj2) {
                    UserInfoAccount.Claim claim = ((UserInfoAccount) obj4).f;
                    if (Intrinsics.f(claim != null ? claim.f106213c : null, email.f105999a)) {
                        arrayList3.add(obj4);
                    }
                }
                return arrayList3;
            case 16:
                tn7.d dVar = (tn7.d) this.f271652b;
                Function0 getDefaultLoadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems, "getDefaultLoadingItems");
                return new tn7.g(tn7.k.b(dVar), (List) getDefaultLoadingItems.invoke(), false);
            case 17:
                tnd.b bVar2 = (tnd.b) this.f271652b;
                AnalyticsAccountsSelection selection = (AnalyticsAccountsSelection) obj2;
                Intrinsics.checkNotNullParameter(selection, "selection");
                if (!(selection instanceof AnalyticsAccountsSelection.Spending) || !ind.a.i((AnalyticsAccountsSelection.Spending) selection)) {
                    od0.i.Companion.getClass();
                    return new go.g(new Data(od0.i.f224256b, null, false, 6, null), 2);
                }
                rpj.a aVar4 = bVar2.f272424a;
                w4l.i loadingStrategy = w4l.i.f294643c;
                Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                tpj.d dVar2 = aVar4.f256397a;
                dVar2.getClass();
                Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                return nim.a.v(dVar2.d.b(Unit.f186387a, loadingStrategy), new tlf.n(bVar2, 13));
            case 18:
                e3 e3Var = (e3) this.f271652b;
                pcd.s vault = (pcd.s) obj2;
                Intrinsics.checkNotNullParameter(vault, "vault");
                return ((aqg.b) ((kpg.a) e3Var.f262807c)).a(vault);
            case 19:
                bof.r rVar = (bof.r) this.f271652b;
                Function0 it12 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                List list2 = (List) ((tnj.d) rVar.f17429b).f272464b.getValue();
                ArrayList arrayList4 = new ArrayList(zhm.w.t(list2, 10));
                Iterator it13 = list2.iterator();
                while (it13.hasNext()) {
                    arrayList4.add(nb0.a(pb0.Companion, ((qv0.i) it13.next()).getF51938a(), false, 4));
                }
                yp0.b.k(arrayList4, 0, 0, 0, 0, 31);
                return new rnj.f(null, arrayList4);
            case 20:
                to.e eVar = (to.e) this.f271652b;
                String requestedHost = (String) obj2;
                Intrinsics.checkNotNullParameter(requestedHost, "requestedHost");
                jo.c cVar = eVar.f272485b;
                e1 e1Var = fcm.d.f;
                Logger logger = p1.f142808a;
                try {
                    fcm.d dVar3 = new fcm.d(new URI(null, null, requestedHost, 443, null, null, null).getAuthority());
                    dVar3.e = eVar.f272484a;
                    dVar3.u(eVar.e);
                    dVar3.t();
                    List retryableStatusCodes = to.b.f272475a;
                    Intrinsics.checkNotNullParameter(retryableStatusCodes, "retryableStatusCodes");
                    c2 c2Var = c7.f146071b;
                    if (c2Var == null) {
                        synchronized (c7.class) {
                            try {
                                c2Var = c7.f146071b;
                                if (c2Var == null) {
                                    ao.h hVar = new ao.h(9, z);
                                    ArrayList arrayList5 = new ArrayList();
                                    hVar.f7848c = arrayList5;
                                    hVar.f7847b = (String) Preconditions.checkNotNull("revolut.tracking.MobileTracker", "name");
                                    arrayList5.add((ecm.p1) Preconditions.checkNotNull(c7.a(), "method"));
                                    c2Var = new c2(hVar);
                                    c7.f146071b = c2Var;
                                }
                            } finally {
                            }
                            break;
                        }
                    }
                    Pair pair4 = new Pair("name", zhm.u.c(zhm.q0.c(new Pair("service", c2Var.f124787a))));
                    Pair pair5 = new Pair("maxAttempts", String.valueOf(5));
                    Pair pair6 = new Pair("initialBackoff", "1s");
                    Pair pair7 = new Pair("maxBackoff", "60s");
                    Pair pair8 = new Pair("backoffMultiplier", Double.valueOf(2.0d));
                    List list3 = retryableStatusCodes;
                    ArrayList arrayList6 = new ArrayList(zhm.w.t(list3, 10));
                    Iterator it14 = list3.iterator();
                    while (it14.hasNext()) {
                        arrayList6.add(((e2) it14.next()).name());
                    }
                    dVar3.r(zhm.q0.c(new Pair("methodConfig", zhm.u.c(r0.k(pair4, new Pair("retryPolicy", r0.k(pair5, pair6, pair7, pair8, new Pair("retryableStatusCodes", arrayList6))))))));
                    dVar3.v();
                    dVar3.s();
                    TimeUnit timeUnit = TimeUnit.MINUTES;
                    hcm.m mVar3 = dVar3.d;
                    mVar3.getClass();
                    Preconditions.checkArgument(true, "keepalive time must be positive");
                    long nanos = timeUnit.toNanos(1L);
                    mVar3.k = nanos;
                    long jMax = Math.max(nanos, p2.k);
                    mVar3.k = jMax;
                    if (jMax >= hcm.m.f151289q) {
                        mVar3.k = Long.MAX_VALUE;
                    }
                    TimeUnit timeUnit2 = TimeUnit.SECONDS;
                    hcm.m mVar4 = dVar3.d;
                    mVar4.getClass();
                    Preconditions.checkArgument(true, "keepalive timeout must be positive");
                    long nanos2 = timeUnit2.toNanos(20L);
                    mVar4.f151294l = nanos2;
                    mVar4.f151294l = Math.max(nanos2, p2.f142820l);
                    dVar3.d.getClass();
                    ecm.e eVarA = dVar3.a();
                    List listAsList = Arrays.asList(eVar.f272486c);
                    Preconditions.checkNotNull(eVarA, "channel");
                    Iterator it15 = listAsList.iterator();
                    while (it15.hasNext()) {
                        eVarA = new ecm.k(eVarA, (ecm.j) it15.next());
                    }
                    return new b7(eVarA, ecm.d.f124789h.c(lcm.d.f193911b, lcm.b.FUTURE));
                } catch (URISyntaxException e) {
                    throw new IllegalArgumentException(p.a.p("Invalid host or port: ", requestedHost, " 443"), e);
                }
            case 21:
                to2.f fVar = (to2.f) this.f271652b;
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                return new to2.l(to2.n.a(fVar.f272498a), zhm.f0.f322471a, true);
            case 22:
                to7.n nVar2 = (to7.n) this.f271652b;
                List carVariations = (List) obj2;
                Intrinsics.checkNotNullParameter(carVariations, "carVariations");
                Set<s0> setKeySet = zhm.k0.a(new to7.l(carVariations, 0)).keySet();
                ArrayList arrayList7 = new ArrayList(zhm.w.t(setKeySet, 10));
                for (s0 s0Var : setKeySet) {
                    int iF = xl7.h.f(s0Var);
                    f01.c uiKitResources = nVar2.f272540b;
                    Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
                    arrayList7.add(new to7.q(s0Var, a10.b.o(iF, null, null, 14, uiKitResources)));
                }
                List<to7.q> listP0 = zhm.d0.P0(arrayList7, new to7.m());
                ArrayList arrayList8 = new ArrayList(zhm.w.t(listP0, 10));
                for (to7.q qVar : listP0) {
                    s0 s0Var2 = qVar.f272544a;
                    Object obj5 = jl7.f.f175621a;
                    Intrinsics.checkNotNullParameter(s0Var2, "<this>");
                    arrayList8.add(new SingleChoiceDelegate.Model(u1.g(s0Var2, jl7.f.f175621a), new TextClause(qVar.f272545b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), false, null, null, 2040));
                }
                return arrayList8;
            case 23:
                tob.i iVar = (tob.i) this.f271652b;
                List productContainers = (List) obj2;
                Intrinsics.checkNotNullParameter(productContainers, "productContainers");
                Iterator it16 = productContainers.iterator();
                while (true) {
                    if (it16.hasNext()) {
                        next = it16.next();
                        if (iVar.o.f83157a == ((SavingsProductData) next).f86683a.f86619c) {
                        }
                    } else {
                        next = null;
                    }
                }
                SavingsProductData savingsProductData = (SavingsProductData) next;
                ProductGroup productGroup = savingsProductData != null ? savingsProductData.f86684b : null;
                if (productGroup != null && (riskConfig = productGroup.f86533s) != null) {
                    return riskConfig;
                }
                throw new IllegalStateException("No riskConfig available for groupType " + iVar.o.f83157a);
            case 24:
                zel.f fVar2 = (zel.f) this.f271652b;
                t1 wealthDisclaimersData = (t1) obj2;
                Intrinsics.checkNotNullParameter(wealthDisclaimersData, "wealthDisclaimersData");
                int i21 = toh.e.f273216a[fVar2.ordinal()];
                if (i21 == 1) {
                    q0Var = new z0h.q0(z0h.p0.STOCKS, wealthDisclaimersData.f318563a, wealthDisclaimersData.f318564b);
                } else if (i21 == 2) {
                    q0Var = new z0h.q0(z0h.p0.ETFS, wealthDisclaimersData.f318563a, wealthDisclaimersData.f318564b);
                } else {
                    if (i21 != 3) {
                        if (i21 != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                        tVar = new z0h.t(wealthDisclaimersData.f318563a, wealthDisclaimersData.f318564b);
                        return new z0h.p1(zhm.u.c(tVar), wealthDisclaimersData.f318564b);
                    }
                    q0Var = new z0h.q0(z0h.p0.BONDS, wealthDisclaimersData.f318563a, wealthDisclaimersData.f318564b);
                }
                tVar = q0Var;
                return new z0h.p1(zhm.u.c(tVar), wealthDisclaimersData.f318564b);
            case 25:
                CreditCardAutopaySettingsFlowContract$State creditCardAutopaySettingsFlowContract$State = (CreditCardAutopaySettingsFlowContract$State) this.f271652b;
                Intrinsics.checkNotNullParameter((CreditCardAutopaySettingsFlowContract$State) obj2, "$this$update");
                return creditCardAutopaySettingsFlowContract$State;
            case 26:
                vp8.h hVar2 = (vp8.h) this.f271652b;
                tp8.e update3 = (tp8.e) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                return tp8.e.a(update3, null, hVar2.f291142a, 1);
            case 27:
                pp8.i iVar2 = (pp8.i) this.f271652b;
                tp8.e update4 = (tp8.e) obj2;
                Intrinsics.checkNotNullParameter(update4, "$this$update");
                return tp8.e.a(update4, iVar2.f238299a, null, 2);
            case 28:
                ScreenerCollectionScreenContract$CollectionConfig screenerCollectionScreenContract$CollectionConfig = (ScreenerCollectionScreenContract$CollectionConfig) this.f271652b;
                List collections = (List) obj2;
                Intrinsics.checkNotNullParameter(collections, "collections");
                Iterator it17 = collections.iterator();
                while (true) {
                    if (it17.hasNext()) {
                        Object next2 = it17.next();
                        if (Intrinsics.f(((ScreenerCollection) next2).f105154a, ((ScreenerCollectionScreenContract$CollectionConfig.FromId) screenerCollectionScreenContract$CollectionConfig).f96226a)) {
                            obj3 = next2;
                        }
                    }
                }
                ScreenerCollection screenerCollection = (ScreenerCollection) obj3;
                if (screenerCollection != null) {
                    return screenerCollection;
                }
                throw new IllegalStateException(a10.b.s("Collection ", ((ScreenerCollectionScreenContract$CollectionConfig.FromId) screenerCollectionScreenContract$CollectionConfig).f96226a, " doesn't exist"));
            default:
                tpj.d dVar4 = (tpj.d) this.f271652b;
                Unit it18 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it18, "it");
                return (od0.i) dVar4.f273413b.get("analytics_air_tip");
        }
    }

    public /* synthetic */ e(Object obj2, Object obj3, int i) {
        this.f271651a = i;
        this.f271652b = obj3;
    }
}
