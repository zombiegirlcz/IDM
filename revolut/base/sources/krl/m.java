package krl;

import a31.x;
import androidx.collection.MutableObjectFloatMap;
import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.content.compose.ComposeNavigator;
import androidx.content.compose.NavHostKt;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.statements.api.models.CustomisationParameters;
import com.revolut.feature.statements.api.models.CustomisationSelection;
import com.revolut.feature.statements.api.models.Product;
import com.revolut.feature.statements.api.models.ProductElement;
import com.revolut.feature.statements.api.models.StatementPeriodType;
import com.revolut.feature.statements.api.models.StatementsFormat;
import com.revolut.feature.statements.api.models.StatementsType;
import com.revolut.feature.trading_orders.common.models.SourcePocket;
import com.revolut.feature.transfer.core.models.CountryProfile;
import com.revolut.feature.transfer_reasons.models.reason.TransferReasonsValues;
import com.revolut.feature.wealth.models.combined_buying_power.CombinedBuyingPowerConverted;
import com.revolut.retail.feature.balance.picker.api.models.BalanceWrapper;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuoteParams;
import com.revolut.shared.feature.wealth.models.config.TradingLegalEntityInformation;
import com.revolut.shared.feature.wealth.models.instrument.InstrumentTicker;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import com.revolut.trading.orders.R$string;
import java.io.Serializable;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import jel.a3;
import jel.h1;
import k4l.e0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import kotlinx.coroutines.flow.Flow;
import nel.a0;
import nvg.g0;
import nvg.s0;
import org.joda.time.LocalDate;
import oyd.l;
import pvg.f0;
import pvg.t;
import pvg.v;
import ryd.w;
import skm.p0;
import uyd.h0;
import uyd.z;
import vrl.j0;
import vrl.l0;
import zh9.u0;
import zhm.a1;
import zhm.u;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class m implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f189001a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f189002b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f189003c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f189004g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f189005h;

    public /* synthetic */ m(TradingAccount tradingAccount, l4l.a aVar, l0 l0Var, TradingLegalEntityInformation tradingLegalEntityInformation, String str, m4l.j jVar, xdf.g gVar) {
        this.f189001a = 13;
        this.f189003c = tradingAccount;
        this.d = aVar;
        this.e = l0Var;
        this.f = tradingLegalEntityInformation;
        this.f189002b = str;
        this.f189004g = jVar;
        this.f189005h = gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object a(java.lang.Object r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: krl.m.a(java.lang.Object):java.lang.Object");
    }

    private final Object b(Object obj2) {
        wsg.n nVar = (wsg.n) this.f189003c;
        qsg.a aVar = (qsg.a) this.d;
        AccountId accountId = (AccountId) this.e;
        io3.l lVar = (io3.l) this.f;
        io3.k kVar = (io3.k) this.f189004g;
        io3.j jVar = (io3.j) this.f189005h;
        io3.i iVar = (io3.i) this.f189002b;
        List pockets = (List) obj2;
        Intrinsics.checkNotNullParameter(pockets, "pockets");
        ArrayList arrayList = new ArrayList();
        for (Object obj3 : pockets) {
            io3.d dVar = (io3.d) obj3;
            if (lVar == null || dVar.u() == lVar) {
                if (kVar == null || dVar.r() == kVar) {
                    if (jVar == null || dVar.q() == jVar) {
                        if (iVar == null || dVar.o() == iVar) {
                            arrayList.add(obj3);
                        }
                    }
                }
            }
        }
        return nVar.p0(arrayList, aVar, accountId);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r32v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v30, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v34, types: [java.util.ArrayList] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        ArrayList arrayList;
        ArrayList arrayList2;
        Iterator it8;
        SQLiteStatement sQLiteStatementPrepare;
        Flow flowE;
        String str;
        Set setL;
        Set<String> selectedTransactionDirections;
        Set<String> selectedCategories;
        ?? arrayList3;
        xi0.b currency;
        Locale language;
        Object next;
        l.a aVar;
        String str2;
        xi0.b bVar;
        Object next2;
        ArrayList arrayList4;
        del.a aVarB;
        int i = this.f189001a;
        Object obj3 = this.f189005h;
        Object obj4 = this.f189004g;
        Object obj5 = this.f;
        Object obj6 = this.f189002b;
        Object obj7 = this.e;
        Object obj8 = this.d;
        Object obj9 = this.f189003c;
        switch (i) {
            case 0:
                return o.g((o) obj9, (k4l.d) obj8, (ArrayList) obj7, (ArrayList) obj5, (Boolean) obj3, (String) obj6, (ArrayList) obj4);
            case 1:
                Data balanceGroupList = (Data) obj8;
                String query = (String) obj6;
                CountryProfile countryProfile = (CountryProfile) obj7;
                n1j.r rVar = (n1j.r) obj5;
                j1j.b bVar2 = (j1j.b) obj4;
                t1j.d dVar = (t1j.d) obj3;
                n1j.m mVar = (n1j.m) obj2;
                p1j.m mVar2 = ((com.revolut.retail.feature.balance.picker.impl.balance_picker_v2.c) obj9).f99513x;
                f01.a aVar2 = mVar2.f231967b;
                Intrinsics.checkNotNullParameter(balanceGroupList, "balanceGroupList");
                Intrinsics.checkNotNullParameter(query, "query");
                if (d0.W(query)) {
                    arrayList = null;
                } else {
                    try {
                        Object content = balanceGroupList.getContent();
                        if (content != null) {
                            ArrayList arrayList5 = new ArrayList();
                            Iterator it9 = ((List) content).iterator();
                            while (it9.hasNext()) {
                                k1j.b bVar3 = (k1j.b) it9.next();
                                List listA = mVar2.f231966a.a(bVar3.f180282a, bVar3.f180284c, countryProfile);
                                ArrayList arrayList6 = new ArrayList();
                                for (Object obj10 : listA) {
                                    BalanceWrapper balanceWrapper = (BalanceWrapper) obj10;
                                    if (jli.g.h(balanceWrapper.getE(), query)) {
                                        it8 = it9;
                                    } else {
                                        it8 = it9;
                                        if (!jli.g.h(aVar2.b(new CurrencyClause(balanceWrapper.getF99406c(), CurrencyClause.Format.Ticker.f57756a, null, 4)).toString(), query)) {
                                            Clause clause = bVar3.f180283b;
                                            if (clause != null ? jli.g.h(aVar2.b(clause).toString(), query) : false) {
                                            }
                                        }
                                        it9 = it8;
                                    }
                                    arrayList6.add(obj10);
                                    it9 = it8;
                                }
                                Iterator it10 = it9;
                                k1j.b bVarA = !arrayList6.isEmpty() ? k1j.b.a(bVar3, arrayList6) : null;
                                if (bVarA != null) {
                                    arrayList5.add(bVarA);
                                }
                                it9 = it10;
                            }
                            arrayList2 = arrayList5;
                        } else {
                            arrayList2 = null;
                        }
                        balanceGroupList = new Data(arrayList2, balanceGroupList.getError(), balanceGroupList.getLoading());
                        arrayList = null;
                    } catch (Throwable th10) {
                        arrayList = null;
                        balanceGroupList = new Data(null, th10, balanceGroupList.getLoading());
                    }
                }
                return n1j.m.e(mVar, balanceGroupList, null, rVar, null, bVar2, dVar != null ? dVar.f267383b : arrayList, countryProfile, null, null, 394);
            case 2:
                iwg.a aVar3 = (iwg.a) obj8;
                eel.c cVar = (eel.c) obj7;
                String str3 = (String) obj6;
                iwg.c cVar2 = (iwg.c) obj5;
                String str4 = (String) obj4;
                String str5 = (String) obj3;
                b21.a aVar4 = ((g0) obj9).f219618c;
                sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("\n            SELECT `cpc`.`asset_type`, `cpc`.`time_span`, `cpc`.`currency`, `cpc`.`method`, `cpc`.`benchmark` AS `benchmark_ref`,\n            `cpc`.`portfolio_id`, `cpc`.`start`, `cpc`.`end`, `cpc`.`last_modified`, `ccp`.`timestamp`, `ccp`.`returns`, `ccp`.`totalReturns`, `ccp`.`benchmark`,\n            `ccp`.`pnl`\n            FROM `complex_analytics_performance_chart` as `cpc`\n            INNER JOIN `complex_analytics_performance_chart_point` as `ccp`\n            ON `cpc`.`asset_type` = `ccp`.`asset_type`\n            AND `cpc`.`time_span` = `ccp`.`time_span`\n            AND `cpc`.`currency` = `ccp`.`currency`\n            AND `cpc`.`method` = `ccp`.`method`\n            AND `cpc`.`portfolio_id` = `ccp`.`portfolio_id`\n            AND `cpc`.`benchmark` = `ccp`.`benchmark_ref`\n            WHERE `cpc`.`asset_type` = ?\n            AND `cpc`.`time_span` = ?\n            AND `cpc`.`currency` = ?\n            AND `cpc`.`method` = ?\n            AND (? IS NULL OR cpc.benchmark = ?)\n            AND `cpc`.`portfolio_id` = ?\n            ORDER BY `ccp`.`timestamp` ASC\n        ");
                try {
                    String strA = t.a(aVar3);
                    if (strA == null) {
                        sQLiteStatementPrepare.bindNull(1);
                    } else {
                        sQLiteStatementPrepare.bindText(1, strA);
                    }
                    String strC = t.c(cVar);
                    if (strC == null) {
                        sQLiteStatementPrepare.bindNull(2);
                    } else {
                        sQLiteStatementPrepare.bindText(2, strC);
                    }
                    if (str3 == null) {
                        sQLiteStatementPrepare.bindNull(3);
                    } else {
                        sQLiteStatementPrepare.bindText(3, str3);
                    }
                    String strB = t.b(cVar2);
                    if (strB == null) {
                        sQLiteStatementPrepare.bindNull(4);
                    } else {
                        sQLiteStatementPrepare.bindText(4, strB);
                    }
                    int i2 = 5;
                    if (str4 == null) {
                        sQLiteStatementPrepare.bindNull(5);
                    } else {
                        sQLiteStatementPrepare.bindText(5, str4);
                    }
                    if (str4 == null) {
                        sQLiteStatementPrepare.bindNull(6);
                    } else {
                        sQLiteStatementPrepare.bindText(6, str4);
                    }
                    int i3 = 7;
                    sQLiteStatementPrepare.bindText(7, str5);
                    ArrayList arrayList7 = new ArrayList();
                    while (sQLiteStatementPrepare.step()) {
                        arrayList7.add(new v(t.e(sQLiteStatementPrepare.isNull(0) ? null : sQLiteStatementPrepare.getText(0)), t.g(sQLiteStatementPrepare.isNull(1) ? null : sQLiteStatementPrepare.getText(1)), sQLiteStatementPrepare.isNull(2) ? null : sQLiteStatementPrepare.getText(2), t.f(sQLiteStatementPrepare.isNull(3) ? null : sQLiteStatementPrepare.getText(3)), sQLiteStatementPrepare.isNull(4) ? null : sQLiteStatementPrepare.getText(4), sQLiteStatementPrepare.isNull(i2) ? null : sQLiteStatementPrepare.getText(i2), b21.a.i(sQLiteStatementPrepare.isNull(6) ? null : Long.valueOf(sQLiteStatementPrepare.getLong(6))), b21.a.i(sQLiteStatementPrepare.isNull(i3) ? null : Long.valueOf(sQLiteStatementPrepare.getLong(i3))), b21.a.i(sQLiteStatementPrepare.isNull(8) ? null : Long.valueOf(sQLiteStatementPrepare.getLong(8))), b21.a.i(sQLiteStatementPrepare.isNull(9) ? null : Long.valueOf(sQLiteStatementPrepare.getLong(9))), (float) sQLiteStatementPrepare.getDouble(10), (float) sQLiteStatementPrepare.getDouble(11), sQLiteStatementPrepare.isNull(12) ? null : Float.valueOf((float) sQLiteStatementPrepare.getDouble(12)), b21.a.g(sQLiteStatementPrepare.isNull(13) ? null : sQLiteStatementPrepare.getText(13))));
                        i2 = 5;
                        i3 = 7;
                        break;
                    }
                    sQLiteStatementPrepare.close();
                    return arrayList7;
                } finally {
                }
            case 3:
                iwg.a aVar5 = (iwg.a) obj8;
                eel.c cVar3 = (eel.c) obj7;
                iwg.c cVar4 = (iwg.c) obj5;
                a3 a3Var = (a3) obj4;
                String str6 = (String) obj6;
                String str7 = (String) obj3;
                t tVar = ((s0) obj9).f219671c;
                sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("SELECT * FROM `complex_analytics_sector_contributors` WHERE `asset_type` = ? AND `time_span` = ? AND `method` = ? AND `sector` = ? AND `portfolio_id` = ? AND `currency` = ?");
                try {
                    String strA2 = t.a(aVar5);
                    if (strA2 == null) {
                        sQLiteStatementPrepare.bindNull(1);
                    } else {
                        sQLiteStatementPrepare.bindText(1, strA2);
                    }
                    String strC2 = t.c(cVar3);
                    if (strC2 == null) {
                        sQLiteStatementPrepare.bindNull(2);
                    } else {
                        sQLiteStatementPrepare.bindText(2, strC2);
                    }
                    String strB2 = t.b(cVar4);
                    if (strB2 == null) {
                        sQLiteStatementPrepare.bindNull(3);
                    } else {
                        sQLiteStatementPrepare.bindText(3, strB2);
                    }
                    String strD = t.d(a3Var);
                    if (strD == null) {
                        sQLiteStatementPrepare.bindNull(4);
                    } else {
                        sQLiteStatementPrepare.bindText(4, strD);
                    }
                    sQLiteStatementPrepare.bindText(5, str6);
                    if (str7 == null) {
                        sQLiteStatementPrepare.bindNull(6);
                    } else {
                        sQLiteStatementPrepare.bindText(6, str7);
                    }
                    int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "asset_type");
                    int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "time_span");
                    int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "method");
                    int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "sector");
                    int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "portfolio_id");
                    int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "currency");
                    int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "asset");
                    int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "pnl");
                    int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "returns");
                    int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "closedOn");
                    int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "ref");
                    ArrayList arrayList8 = new ArrayList();
                    while (sQLiteStatementPrepare.step()) {
                        iwg.a aVarE = t.e(sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow));
                        eel.c cVarG = t.g(sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2));
                        iwg.c cVarF = t.f(sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3));
                        String text = sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4);
                        a3 a3VarC0 = text != null ? ta6.a.c0(text) : null;
                        String text2 = sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5);
                        String text3 = sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6);
                        String text4 = sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow7);
                        jo3.b bVarG = b21.a.g(sQLiteStatementPrepare.isNull(columnIndexOrThrow8) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow8));
                        float f = (float) sQLiteStatementPrepare.getDouble(columnIndexOrThrow9);
                        String text5 = sQLiteStatementPrepare.isNull(columnIndexOrThrow10) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow10);
                        arrayList8.add(new f0(aVarE, cVarG, cVarF, a3VarC0, text2, text3, text4, bVarG, f, text5 != null ? LocalDate.parse(text5) : null, sQLiteStatementPrepare.isNull(columnIndexOrThrow11) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow11)));
                        break;
                    }
                    sQLiteStatementPrepare.close();
                    return arrayList8;
                } finally {
                }
            case 4:
                nel.n instrument = (nel.n) obj8;
                TradingLegalEntityInformation tradingLegalEntityInformation = (TradingLegalEntityInformation) obj7;
                TradingAccount tradingAccount = (TradingAccount) obj5;
                InstrumentTicker instrumentTicker = (InstrumentTicker) obj4;
                h1 h1Var = (h1) obj3;
                e0 e0Var = (e0) obj6;
                SourcePocket sourcePocket = (SourcePocket) obj2;
                Intrinsics.checkNotNullParameter(sourcePocket, "sourcePocket");
                orb.c cVar5 = ((orb.o) obj9).f;
                Intrinsics.checkNotNullParameter(instrument, "instrument");
                Intrinsics.checkNotNullParameter(sourcePocket, "sourcePocket");
                SourcePocket.Balance e = sourcePocket.getE();
                Intrinsics.i(e, "null cannot be cast to non-null type com.revolut.feature.trading_orders.common.models.SourcePocket.Balance.MoneyBalance");
                dj0.d dVar2 = ((SourcePocket.Balance.MoneyBalance) e).f91775a;
                if (Intrinsics.f(dVar2.f115083b, instrument.i)) {
                    flowE = nim.a.v(cVar5.a(instrument, bfl.g.BUY, qrb.b.AMOUNT, pyd.c.Y(dVar2)), new ar3.a(21, dVar2));
                } else {
                    o7.b bVar4 = cVar5.f228085a;
                    xi0.b bVar5 = dVar2.f115083b;
                    xi0.b bVar6 = instrument.i;
                    f8l.e eVar = f8l.e.MARKET;
                    f8l.b bVar7 = f8l.b.FROM;
                    flowE = boh.f.e(o7.b.u(bVar4, new OrderQuoteParams(bVar5, bVar6, eVar, pyd.c.Y(dVar2), bVar7, bVar7, null, false, null, f8l.f.TRADING, null, null, null, null, 15616)), new ood.k(cVar5, instrument, 20));
                }
                return nim.a.v(zi0.c.w(flowE), new m(sourcePocket, tradingLegalEntityInformation, tradingAccount, instrument, instrumentTicker, h1Var, e0Var, 5));
            case 5:
                qrb.a availableToInvest = (qrb.a) obj2;
                Intrinsics.checkNotNullParameter(availableToInvest, "availableToInvest");
                return new qrb.h((SourcePocket) obj9, (TradingLegalEntityInformation) obj8, (TradingAccount) obj7, (nel.n) obj5, (InstrumentTicker) obj4, (h1) obj3, (e0) obj6, availableToInvest);
            case 6:
                return NavHostKt.NavHost$lambda$75$lambda$74((MutableObjectFloatMap) obj9, (ComposeNavigator) obj8, (Function1) obj7, (Function1) obj5, (Function1) obj4, (State) obj3, (MutableState) obj6, (AnimatedContentTransitionScope) obj2);
            case 7:
                String juniorId = (String) obj6;
                java.time.LocalDate fromDate = (java.time.LocalDate) obj8;
                java.time.LocalDate toDate = (java.time.LocalDate) obj7;
                xi0.b currency2 = (xi0.b) obj5;
                StatementsFormat format = (StatementsFormat) obj4;
                StatementsType type = (StatementsType) obj3;
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                h0 h0Var = (h0) ((w) obj9).f258357a;
                h0Var.getClass();
                Intrinsics.checkNotNullParameter(juniorId, "juniorId");
                Intrinsics.checkNotNullParameter(fromDate, "fromDate");
                Intrinsics.checkNotNullParameter(toDate, "toDate");
                Intrinsics.checkNotNullParameter(currency2, "currency");
                Intrinsics.checkNotNullParameter(format, "format");
                Intrinsics.checkNotNullParameter(type, "type");
                return h0Var.f284195m.f(new uyd.m(juniorId, fromDate, toDate, currency2, format, type, zBooleanValue), true);
            case 8:
                java.time.LocalDate fromDate2 = (java.time.LocalDate) obj8;
                java.time.LocalDate toDate2 = (java.time.LocalDate) obj5;
                ArrayList currencies = (ArrayList) obj7;
                StatementsFormat format2 = (StatementsFormat) obj4;
                StatementsType type2 = (StatementsType) obj3;
                String str8 = (String) obj6;
                boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                h0 h0Var2 = (h0) ((w) obj9).f258357a;
                h0Var2.getClass();
                Intrinsics.checkNotNullParameter(fromDate2, "fromDate");
                Intrinsics.checkNotNullParameter(toDate2, "toDate");
                Intrinsics.checkNotNullParameter(currencies, "currencies");
                Intrinsics.checkNotNullParameter(format2, "format");
                Intrinsics.checkNotNullParameter(type2, "type");
                return h0Var2.e.f(new uyd.n(fromDate2, toDate2, currencies, format2, type2, str8 == null ? null : str8, zBooleanValue2), true);
            case 9:
                CustomisationParameters customisationParameters = (CustomisationParameters) obj8;
                CustomisationSelection customisationSelection = (CustomisationSelection) obj7;
                java.time.LocalDate from = (java.time.LocalDate) obj5;
                java.time.LocalDate to6 = (java.time.LocalDate) obj4;
                StatementPeriodType statementPeriodType = (StatementPeriodType) obj3;
                StatementsFormat format3 = (StatementsFormat) obj6;
                boolean zBooleanValue3 = ((Boolean) obj2).booleanValue();
                h0 h0Var3 = (h0) ((w) obj9).f258357a;
                h0Var3.getClass();
                Intrinsics.checkNotNullParameter(from, "fromDate");
                Intrinsics.checkNotNullParameter(to6, "toDate");
                Intrinsics.checkNotNullParameter(statementPeriodType, "statementPeriodType");
                Intrinsics.checkNotNullParameter(format3, "format");
                Intrinsics.checkNotNullParameter(from, "from");
                Intrinsics.checkNotNullParameter(to6, "to");
                Intrinsics.checkNotNullParameter(statementPeriodType, "statementPeriodType");
                Intrinsics.checkNotNullParameter(format3, "format");
                DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ISO_LOCAL_DATE;
                String str9 = from.format(dateTimeFormatter);
                Intrinsics.checkNotNullExpressionValue(str9, "format(...)");
                String str10 = to6.format(dateTimeFormatter);
                Intrinsics.checkNotNullExpressionValue(str10, "format(...)");
                switch (pyd.b.f240810a[statementPeriodType.ordinal()]) {
                    case 1:
                        str = "TAX_YEAR";
                        break;
                    case 2:
                        str = "CALENDAR_YEAR";
                        break;
                    case 3:
                        str = "CUSTOM";
                        break;
                    case 4:
                        str = "MONTH";
                        break;
                    case 5:
                        str = "ALL_TIME";
                        break;
                    case 6:
                        throw new IllegalArgumentException("Unsupported period type: StatementPeriodType.LAST_FULL_YEAR");
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                String str11 = str;
                if (customisationSelection == null) {
                    setL = zhm.h0.f322473a;
                } else {
                    Set setI1 = zhm.d0.i1(customisationSelection.getProductSelection().getSelectedProducts());
                    Map<String, Set<String>> selectedElements = customisationSelection.getProductSelection().getSelectedElements();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry<String, Set<String>> entry : selectedElements.entrySet()) {
                        if (!entry.getValue().isEmpty()) {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
                    setL = a1.l(setI1, linkedHashMap.keySet());
                }
                Set set = setL;
                if (customisationSelection == null || (selectedTransactionDirections = customisationSelection.getSelectedTransactionDirections()) == null) {
                    selectedTransactionDirections = zhm.h0.f322473a;
                }
                Set<String> set2 = selectedTransactionDirections;
                if (customisationSelection == null || (selectedCategories = customisationSelection.getSelectedCategories()) == null) {
                    selectedCategories = zhm.h0.f322473a;
                }
                Set<String> set3 = selectedCategories;
                if (customisationSelection == null || customisationParameters == null) {
                    arrayList3 = zhm.f0.f322471a;
                } else {
                    ArrayList<String> arrayListU = zhm.w.u(customisationSelection.getProductSelection().getSelectedElements().values());
                    arrayList3 = new ArrayList();
                    for (String str12 : arrayListU) {
                        List<Product> products = customisationParameters.getProducts();
                        ArrayList arrayList9 = new ArrayList(zhm.w.t(products, 10));
                        Iterator it11 = products.iterator();
                        while (it11.hasNext()) {
                            arrayList9.add(((Product) it11.next()).getElements());
                        }
                        Iterator it12 = zhm.w.u(arrayList9).iterator();
                        while (true) {
                            if (it12.hasNext()) {
                                next = it12.next();
                                if (Intrinsics.f(((ProductElement) next).getId(), str12)) {
                                }
                            } else {
                                next = null;
                            }
                        }
                        ProductElement productElement = (ProductElement) next;
                        if (productElement == null) {
                            aVar = null;
                        } else {
                            String type3 = productElement.getType();
                            String currency3 = productElement.getCurrency();
                            if (currency3 == null) {
                                dj0.d balance = productElement.getBalance();
                                str2 = (balance == null || (bVar = balance.f115083b) == null) ? null : bVar.f306286a;
                            } else {
                                str2 = currency3;
                            }
                            aVar = new l.a(type3, str12, str2);
                        }
                        if (aVar != null) {
                            arrayList3.add(aVar);
                        }
                    }
                }
                efm.d0<oyd.q> d0VarGenerateConsolidatedStatement = h0Var3.f284188a.generateConsolidatedStatement(new oyd.l(str9, str10, str11, set, set2, set3, arrayList3, customisationSelection != null ? customisationSelection.getHideBalances() : false, (customisationSelection == null || (language = customisationSelection.getLanguage()) == null) ? null : language.getLanguage(), (customisationSelection == null || (currency = customisationSelection.getCurrency()) == null) ? null : currency.f306286a, zBooleanValue3, format3.getValue()));
                z zVar = new z(8, new ux7.i(1, h0Var3.f284189b, syd.a.class, "toDomain", "toDomain(Lcom/revolut/feature/statements/impl/dto/StatementUrlStateDto;)Lcom/revolut/feature/statements/api/models/StatementUrlState;", 0, 6));
                d0VarGenerateConsolidatedStatement.getClass();
                ufm.i iVar = new ufm.i(new ufm.i(d0VarGenerateConsolidatedStatement, zVar, 1), new z(9, new uwi.v(21)), 1);
                Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                efm.r rVarX = te0.w.i0(iVar).x();
                Intrinsics.checkNotNullExpressionValue(rVarX, "toObservable(...)");
                return rVarX;
            case 10:
                upd.c cVar6 = (upd.c) obj9;
                ArrayList arrayList10 = (ArrayList) obj7;
                String str13 = (String) obj6;
                TradingAccount tradingAccount2 = (TradingAccount) obj8;
                com.revolut.feature.spending_analytics.api.models.income_sorter.a aVar6 = (com.revolut.feature.spending_analytics.api.models.income_sorter.a) obj4;
                hel.b bVar8 = (hel.b) obj3;
                ArrayList arrayList11 = (ArrayList) obj5;
                List instrumentWithTickers = (List) obj2;
                Intrinsics.checkNotNullParameter(instrumentWithTickers, "instrumentWithTickers");
                ArrayList<a0> arrayList12 = new ArrayList();
                for (Object obj11 : instrumentWithTickers) {
                    a0 a0Var = (a0) obj11;
                    if (cVar6.b(a0Var.f214560a, a0Var.f214561b)) {
                        arrayList12.add(obj11);
                    }
                }
                ArrayList arrayList13 = new ArrayList(zhm.w.t(arrayList12, 10));
                for (a0 a0Var2 : arrayList12) {
                    nel.n nVar = a0Var2.f214560a;
                    InstrumentTicker instrumentTicker2 = a0Var2.f214561b;
                    Iterator it13 = arrayList10.iterator();
                    while (true) {
                        if (it13.hasNext()) {
                            next2 = it13.next();
                            if (Intrinsics.f(((kel.n) next2).e, nVar.f214596b)) {
                            }
                        } else {
                            next2 = null;
                        }
                    }
                    kel.n nVar2 = (kel.n) next2;
                    if (instrumentTicker2 == null || nVar2 == null) {
                        arrayList4 = arrayList10;
                        aVarB = null;
                    } else {
                        ael.q qVar = cVar6.f281962c;
                        zhm.f0 f0Var = zhm.f0.f322471a;
                        xi0.a aVar7 = xi0.b.Companion;
                        arrayList4 = arrayList10;
                        String str14 = nVar2.f183173a.e;
                        aVar7.getClass();
                        aVarB = qVar.b(nVar2, instrumentTicker2, f0Var, xi0.a.a(str14));
                    }
                    su9.c cVar7 = cVar6.d;
                    dj0.d money = pyd.c.M(aVarB != null ? aVarB.b() : null);
                    Intrinsics.checkNotNullParameter(money, "money");
                    arrayList13.add(nim.a.v(xam.a.h(new u29.c(money, cVar7, (Continuation) null, 6), rd0.e.b(((wsg.n) cVar7.f265694b).J(AccountId.Personal.f51414a, w4l.h.f294642c))), new m(cVar6, nVar, str13, tradingAccount2, aVar6, bVar8, nVar2, aVarB)));
                    arrayList10 = arrayList4;
                }
                return nim.a.v(!arrayList13.isEmpty() ? u0.k(arrayList13) : zi0.c.i(zhm.f0.f322471a), new ua2.r(2, arrayList11));
            case 11:
                dj0.d totalCostInBaseCurrency = (dj0.d) obj2;
                Intrinsics.checkNotNullParameter(totalCostInBaseCurrency, "totalCostInBaseCurrency");
                return upd.c.a((nel.n) obj9, (String) obj6, (TradingAccount) obj8, (com.revolut.feature.spending_analytics.api.models.income_sorter.a) obj7, (hel.b) obj5, (kel.n) obj4, (del.a) obj3, totalCostInBaseCurrency);
            case 12:
                wga.j slot = (wga.j) obj8;
                String currentPlanId = (String) obj2;
                Intrinsics.checkNotNullParameter(currentPlanId, "currentPlanId");
                zga.g gVar = (zga.g) ((ryc.a) obj9).f258289a;
                Intrinsics.checkNotNullParameter(slot, "slot");
                Intrinsics.checkNotNullParameter(currentPlanId, "currentPlanId");
                w4l.i loadingStrategy = w4l.i.f294643c;
                Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                return nim.a.v(((x4l.c) gVar.f322101c.getValue()).b(new zga.c(slot, currentPlanId, (String) obj6, (String) obj7, (String) obj5, (List) obj4, (String) obj3), loadingStrategy), new zg6.c(1));
            case 13:
                TradingAccount tradingAccount3 = (TradingAccount) obj9;
                l4l.a aVar8 = (l4l.a) obj8;
                l0 l0Var = (l0) obj7;
                TradingLegalEntityInformation tradingLegalEntityInformation2 = (TradingLegalEntityInformation) obj5;
                String str15 = (String) obj6;
                m4l.j jVar = (m4l.j) obj4;
                xdf.g gVar2 = (xdf.g) obj3;
                CombinedBuyingPowerConverted combinedBuyingPowerConverted = (CombinedBuyingPowerConverted) obj2;
                Intrinsics.checkNotNullParameter(combinedBuyingPowerConverted, "combinedBuyingPowerConverted");
                n2l.j jVarB = n2l.l.b(tradingAccount3);
                if (jVarB == null) {
                    return Optional.empty();
                }
                TextLocalisedClause textLocalisedClauseH = l0Var.f291651g.h(jVarB, tradingLegalEntityInformation2.f105106a, null);
                aim.e eVarB = u.b();
                eVarB.add(new SourcePocket.InvestAccountCombinedBuyingPower(str15, tradingAccount3, combinedBuyingPowerConverted, new TextLocalisedClause(R$string.trading_orders_pockets_combined_buying_power_title, null, null, 14), new SourcePocket.Balance.MoneyBalance(combinedBuyingPowerConverted.f95660c.f95661a), null, jVar, combinedBuyingPowerConverted.f95660c.f95661a.f115083b));
                List<kel.c> list = combinedBuyingPowerConverted.f95659b;
                ArrayList arrayList14 = new ArrayList(zhm.w.t(list, 10));
                for (kel.c cVar8 : list) {
                    kel.b bVar9 = cVar8.f183153a;
                    nel.n nVar3 = gVar2.f304433a;
                    j0 j0VarB = l0.b(bVar9, nVar3 != null ? nVar3.i : null, jVar != null ? jVar.f202769c : null);
                    l4l.a aVar9 = aVar8;
                    arrayList14.add(new SourcePocket.Holding(cVar8.f183153a, tradingAccount3, j0VarB.f291643b, new SourcePocket.Balance.MoneyBalance(j0VarB.f291642a), null, aVar9, jVar));
                    aVar8 = aVar9;
                }
                eVarB.addAll(arrayList14);
                return Optional.of(new xdf.h(textLocalisedClauseH, aVar8, u.a(eVarB)));
            case 14:
                return a(obj2);
            case 15:
                return b(obj2);
            default:
                qua.p recurringPayment = (qua.p) obj8;
                TransferReasonsValues transferReasonsValues = (TransferReasonsValues) obj7;
                String str16 = (String) obj6;
                String str17 = (String) obj5;
                qua.v vVar = (qua.v) obj4;
                Map map = (Map) obj3;
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                od0.i iVar2 = (od0.i) pair.f186385a;
                hbd.a params = (hbd.a) pair.f186386b;
                s71.a aVar10 = ((yua.q) obj9).f316963a;
                String strName = vVar != null ? vVar.name() : null;
                String str18 = (String) iVar2.g();
                x xVar = (x) aVar10;
                Intrinsics.checkNotNullParameter(recurringPayment, "recurringPayment");
                Intrinsics.checkNotNullParameter(params, "params");
                p0 p0Var = p0.f264001a;
                return te0.w.i0(xVar.d(te0.w.o0(elm.f.f127540b, new a31.v(xVar, recurringPayment, transferReasonsValues, str16, str17, strName, map, str18, (Continuation) null)), params, recurringPayment.L));
        }
    }

    public /* synthetic */ m(Object obj2, Serializable serializable, Serializable serializable2, String str, Object obj3, Object obj4, Object obj5, int i) {
        this.f189001a = i;
        this.f189003c = obj2;
        this.d = serializable;
        this.e = serializable2;
        this.f189002b = str;
        this.f = obj3;
        this.f189004g = obj4;
        this.f189005h = obj5;
    }

    public /* synthetic */ m(Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, int i) {
        this.f189001a = i;
        this.f189003c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
        this.f189004g = obj6;
        this.f189005h = obj7;
        this.f189002b = obj8;
    }

    public /* synthetic */ m(Object obj2, Object obj3, String str, Object obj4, Object obj5, Object obj6, Object obj7, int i) {
        this.f189001a = i;
        this.f189003c = obj2;
        this.d = obj3;
        this.f189002b = str;
        this.e = obj4;
        this.f = obj5;
        this.f189004g = obj6;
        this.f189005h = obj7;
    }

    public /* synthetic */ m(o oVar, k4l.d dVar, ArrayList arrayList, ArrayList arrayList2, Boolean bool, String str, ArrayList arrayList3) {
        this.f189001a = 0;
        this.f189003c = oVar;
        this.d = dVar;
        this.e = arrayList;
        this.f = arrayList2;
        this.f189005h = bool;
        this.f189002b = str;
        this.f189004g = arrayList3;
    }

    public /* synthetic */ m(s0 s0Var, iwg.a aVar, eel.c cVar, iwg.c cVar2, a3 a3Var, String str, String str2) {
        this.f189001a = 3;
        this.f189003c = s0Var;
        this.d = aVar;
        this.e = cVar;
        this.f = cVar2;
        this.f189004g = a3Var;
        this.f189002b = str;
        this.f189005h = str2;
    }

    public /* synthetic */ m(w wVar, String str, java.time.LocalDate localDate, java.time.LocalDate localDate2, xi0.b bVar, StatementsFormat statementsFormat, StatementsType statementsType) {
        this.f189001a = 7;
        this.f189003c = wVar;
        this.f189002b = str;
        this.d = localDate;
        this.e = localDate2;
        this.f = bVar;
        this.f189004g = statementsFormat;
        this.f189005h = statementsType;
    }

    public /* synthetic */ m(w wVar, java.time.LocalDate localDate, java.time.LocalDate localDate2, ArrayList arrayList, StatementsFormat statementsFormat, StatementsType statementsType, String str) {
        this.f189001a = 8;
        this.f189003c = wVar;
        this.d = localDate;
        this.f = localDate2;
        this.e = arrayList;
        this.f189004g = statementsFormat;
        this.f189005h = statementsType;
        this.f189002b = str;
    }

    public /* synthetic */ m(upd.c cVar, ArrayList arrayList, String str, TradingAccount tradingAccount, com.revolut.feature.spending_analytics.api.models.income_sorter.a aVar, hel.b bVar, ArrayList arrayList2) {
        this.f189001a = 10;
        this.f189003c = cVar;
        this.e = arrayList;
        this.f189002b = str;
        this.d = tradingAccount;
        this.f189004g = aVar;
        this.f189005h = bVar;
        this.f = arrayList2;
    }

    public /* synthetic */ m(upd.c cVar, nel.n nVar, String str, TradingAccount tradingAccount, com.revolut.feature.spending_analytics.api.models.income_sorter.a aVar, hel.b bVar, kel.n nVar2, del.a aVar2) {
        this.f189001a = 11;
        this.f189003c = nVar;
        this.f189002b = str;
        this.d = tradingAccount;
        this.e = aVar;
        this.f = bVar;
        this.f189004g = nVar2;
        this.f189005h = aVar2;
    }
}
