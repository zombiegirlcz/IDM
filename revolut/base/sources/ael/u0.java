package ael;

import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import aw0.o9;
import aw0.q7;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.PercentageClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.data.model.Data;
import com.revolut.domain.interactors.transactions.TransactionContext;
import com.revolut.domain.interactors.transactions.TransactionsSort;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.card_payment_method.api.declaration.SelectPaymentMethodInputData;
import com.revolut.feature.payments.who_to_transfer.api.common.RecipientConfig;
import com.revolut.feature.payments.who_to_transfer.api.common.WhoToTransferFilter;
import com.revolut.feature.spending_analytics.api.models.income_sorter.IncomeSorterDestinationInfo;
import com.revolut.feature.statements.api.models.StatementsFormat;
import com.revolut.feature.statements.api.models.StatementsType;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.feature.api.income_sorter.models.IncomeSorterExecution;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jel.a3;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.ranges.IntRange;
import org.joda.time.DateTime;
import org.joda.time.Duration;
import tof.i7;
import x33.e;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class u0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3665a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3666b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3667c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f3668g;

    public /* synthetic */ u0(b1 b1Var, String str, LocalDate localDate, LocalDate localDate2, xbl.d dVar, xbl.e eVar) {
        this.f3665a = 1;
        this.f3666b = b1Var;
        this.f3668g = str;
        this.f3667c = localDate;
        this.d = localDate2;
        this.e = dVar;
        this.f = eVar;
    }

    private final Object a(Object obj2) {
        nvg.j0 j0Var = (nvg.j0) this.f3668g;
        iwg.a aVar = (iwg.a) this.f3666b;
        eel.c cVar = (eel.c) this.f3667c;
        String str = (String) this.d;
        String str2 = (String) this.e;
        Duration duration = (Duration) this.f;
        pvg.t tVar = j0Var.f219631c;
        SQLiteStatement sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("\n            SELECT * FROM `complex_analytics_pnl` as `cap`\n            INNER JOIN `complex_analytics_pnl_point` as `app`\n            ON `cap`.`asset_type` = `app`.`asset_type`\n            AND `cap`.`time_span` = `app`.`time_span`\n            AND `cap`.`currency` = `app`.`currency`\n            AND `cap`.`portfolio_id` = `app`.`portfolio_id`\n            AND `cap`.`interval` = `app`.`interval`\n            WHERE `cap`.`asset_type` = ?\n            AND `cap`.`time_span` = ?\n            AND `cap`.`currency` = ?\n            AND `cap`.`portfolio_id` = ?\n            AND `cap`.`interval` = ?\n            ORDER BY `app`.`point_start`\n        ");
        try {
            String strA = pvg.t.a(aVar);
            if (strA == null) {
                sQLiteStatementPrepare.bindNull(1);
            } else {
                sQLiteStatementPrepare.bindText(1, strA);
            }
            String strC = pvg.t.c(cVar);
            if (strC == null) {
                sQLiteStatementPrepare.bindNull(2);
            } else {
                sQLiteStatementPrepare.bindText(2, strC);
            }
            if (str == null) {
                sQLiteStatementPrepare.bindNull(3);
            } else {
                sQLiteStatementPrepare.bindText(3, str);
            }
            sQLiteStatementPrepare.bindText(4, str2);
            String string = duration.toString();
            if (string == null) {
                sQLiteStatementPrepare.bindNull(5);
            } else {
                sQLiteStatementPrepare.bindText(5, string);
            }
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "asset_type");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "time_span");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "currency");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "portfolio_id");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "interval");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "start");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "end");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "last_modified");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "point_start");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "point_end");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "net_sell");
            int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "dividends");
            int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "cumulative");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                String text = null;
                iwg.a aVarE = pvg.t.e(sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow));
                eel.c cVarG = pvg.t.g(sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2));
                String text2 = sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3);
                String text3 = sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4);
                String text4 = sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5);
                Duration duration2 = text4 != null ? Duration.parse(text4) : null;
                DateTime dateTimeI = b21.a.i(sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : Long.valueOf(sQLiteStatementPrepare.getLong(columnIndexOrThrow6)));
                DateTime dateTimeI2 = b21.a.i(sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : Long.valueOf(sQLiteStatementPrepare.getLong(columnIndexOrThrow7)));
                String text5 = sQLiteStatementPrepare.isNull(columnIndexOrThrow8) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow8);
                ZonedDateTime zonedDateTime = text5 != null ? ZonedDateTime.parse(text5) : null;
                DateTime dateTimeI3 = b21.a.i(sQLiteStatementPrepare.isNull(columnIndexOrThrow9) ? null : Long.valueOf(sQLiteStatementPrepare.getLong(columnIndexOrThrow9)));
                DateTime dateTimeI4 = b21.a.i(sQLiteStatementPrepare.isNull(columnIndexOrThrow10) ? null : Long.valueOf(sQLiteStatementPrepare.getLong(columnIndexOrThrow10)));
                jo3.b bVarG = b21.a.g(sQLiteStatementPrepare.isNull(columnIndexOrThrow11) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow11));
                jo3.b bVarG2 = b21.a.g(sQLiteStatementPrepare.isNull(columnIndexOrThrow12) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow12));
                if (!sQLiteStatementPrepare.isNull(columnIndexOrThrow13)) {
                    text = sQLiteStatementPrepare.getText(columnIndexOrThrow13);
                }
                int i = columnIndexOrThrow;
                arrayList.add(new pvg.y(aVarE, cVarG, text2, text3, duration2, dateTimeI, dateTimeI2, zonedDateTime, dateTimeI3, dateTimeI4, bVarG, bVarG2, b21.a.g(text)));
                columnIndexOrThrow = i;
            }
            sQLiteStatementPrepare.close();
            return arrayList;
        } catch (Throwable th10) {
            sQLiteStatementPrepare.close();
            throw th10;
        }
    }

    private final Object b(Object obj2) {
        x33.e eVar;
        x33.j jVar;
        Set setI1;
        List list;
        i93.c cVar;
        List list2;
        q43.o0 o0Var = (q43.o0) this.f3668g;
        Data data = (Data) this.f3666b;
        Set set = (Set) this.f3667c;
        sh5.c cVarA = (sh5.c) this.d;
        Data data2 = (Data) this.e;
        Data data3 = (Data) this.f;
        q43.s sVar = (q43.s) obj2;
        SelectPaymentMethodInputData selectPaymentMethodInputData = o0Var.f242034q;
        q43.b0 b0Var = selectPaymentMethodInputData.f65244a.a() ? q43.b0.CRYPTO : sVar.e;
        SelectPaymentMethodInputData.UseCase useCase = selectPaymentMethodInputData.f65244a;
        boolean zA = useCase.a();
        x33.e fVar = e.a.f302638a;
        if (zA) {
            eVar = fVar;
        } else {
            x33.b bVar = (x33.b) data.getContent();
            e.b bVar2 = e.b.f302639a;
            if (bVar == null || (jVar = bVar.d) == null) {
                eVar = bVar2;
            } else {
                if (!(jVar instanceof x33.g)) {
                    if (jVar instanceof x33.h) {
                        fVar = bVar2;
                    } else {
                        if (!(jVar instanceof x33.i)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        fVar = new x33.f(((x33.i) jVar).f302643a);
                    }
                }
                eVar = fVar;
            }
        }
        h93.f0 f0VarA = d43.a.a(useCase);
        if (f0VarA == null || (cVar = f0VarA.f150113g) == null || (list2 = cVar.f) == null) {
            setI1 = null;
        } else {
            List list3 = list2;
            ArrayList arrayList = new ArrayList(zhm.w.t(list3, 10));
            Iterator it8 = list3.iterator();
            while (it8.hasNext()) {
                arrayList.add(((i93.h) it8.next()).f159559a);
            }
            setI1 = zhm.d0.i1(arrayList);
        }
        if (setI1 == null) {
            setI1 = zhm.h0.f322473a;
        }
        Intrinsics.h(set);
        Set setK = zhm.a1.k(set, setI1);
        h93.f0 f0VarA2 = d43.a.a(useCase);
        i93.c cVar2 = f0VarA2 != null ? f0VarA2.f150113g : null;
        h93.f0 f0VarA3 = d43.a.a(useCase);
        boolean z = f0VarA3 != null && f0VarA3.M();
        if (cVar2 == null || (list = cVar2.f159552g) == null || !o0Var.z.a("REVOLUT_CARD.link_to_pocket")) {
            list = null;
        }
        i93.b bVar3 = z ? i93.b.PRO_REGULAR_VAULT : i93.b.REGULAR_VAULT;
        q43.b0 b0Var2 = q43.b0.FIAT;
        if (list != null && !list.contains(i93.b.FIAT)) {
            b0Var2 = null;
        }
        q43.b0 b0Var3 = q43.b0.PERSONAL_VAULT;
        if (list == null || !list.contains(bVar3)) {
            b0Var3 = null;
        }
        q43.b0 b0Var4 = q43.b0.CRYPTO;
        q43.b0[] elements = {b0Var2, b0Var3, (list == null || list.contains(i93.b.CRYPTO)) ? b0Var4 : null};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listY2 = q43.o0.y2(o0Var, (q43.b0[]) kotlin.collections.d.L(elements).toArray(new q43.b0[0]));
        x33.b bVar4 = (x33.b) data.getContent();
        Boolean boolValueOf = bVar4 != null ? Boolean.valueOf(bVar4.f) : null;
        List listA0 = (boolValueOf == null || !boolValueOf.booleanValue()) ? zhm.d0.A0(zhm.d0.f1(listY2), b0Var4) : zhm.d0.d1(listY2);
        if (!useCase.a()) {
            sh5.c.Companion.getClass();
            cVarA = sh5.b.a();
        }
        sh5.c cVar3 = cVarA;
        Intrinsics.h(cVar3);
        return q43.s.a(sVar, data, listA0, setK, b0Var, null, eVar, null, cVar3, data3, (do3.n) data2.getContent(), 673);
    }

    private final Object c(Object obj2) {
        List list;
        int i;
        BigDecimal bigDecimalStripTrailingZeros;
        int i2;
        BigDecimal bigDecimalStripTrailingZeros2;
        yhm.r rVar;
        int i3;
        BigDecimal bigDecimalStripTrailingZeros3;
        BigDecimal bigDecimalStripTrailingZeros4;
        PercentageClause percentageClauseA;
        int i5;
        BigDecimal bigDecimalStripTrailingZeros5;
        yhm.r rVar2;
        PercentageClause percentageClauseA2;
        ncj.d dVar = (ncj.d) this.f3668g;
        xi0.b bVar = (xi0.b) this.f3666b;
        rdj.h hVar = (rdj.h) this.f3667c;
        BigDecimal bigDecimal = (BigDecimal) this.d;
        Ref$IntRef ref$IntRef = (Ref$IntRef) this.e;
        ArrayList arrayList = (ArrayList) this.f;
        List window = (List) obj2;
        Intrinsics.checkNotNullParameter(window, "window");
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(((rdj.f) window.get(1)).d - ((rdj.f) window.get(0)).d);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        if (Intrinsics.f(bigDecimalValueOf, BigDecimal.ZERO)) {
            BigDecimal bigDecimal2 = ((rdj.f) window.get(0)).f253465a;
            BigDecimal bigDecimal3 = ((rdj.f) window.get(0)).f253466b;
            BigDecimal bigDecimal4 = ((rdj.f) window.get(0)).f253467c;
            int i6 = rdj.g.f253468a[dVar.ordinal()];
            if (i6 == 1) {
                MoneyClause moneyClause = !Intrinsics.f(bigDecimal2.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimal2.stripTrailingZeros(), bigDecimal3.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimal3.stripTrailingZeros()) ? new MoneyClause(mif.a.Q(new ej0.b(bigDecimal2, bVar)), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, o9.NON_SENSITIVE, 4) : null;
                dj0.d dVarQ = mif.a.Q(new ej0.b(bigDecimal3, bVar));
                MoneyClause.Format.Defaults defaults = new MoneyClause.Format.Defaults(null, null, false, false, 15);
                o9 o9Var = o9.NON_SENSITIVE;
                rVar2 = new yhm.r(moneyClause, new MoneyClause(dVarQ, defaults, null, o9Var, 4), !Intrinsics.f(bigDecimal4.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimal4.stripTrailingZeros(), bigDecimal3.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimal3.stripTrailingZeros()) ? new MoneyClause(mif.a.Q(new ej0.b(bigDecimal4, bVar)), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, o9Var, 4) : null);
            } else {
                if (i6 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                if (Intrinsics.f(bigDecimal2.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimal2.stripTrailingZeros(), bigDecimal3.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimal3.stripTrailingZeros())) {
                    percentageClauseA2 = null;
                } else {
                    hVar.getClass();
                    percentageClauseA2 = rdj.h.a(bigDecimal, bigDecimal2);
                }
                hVar.getClass();
                rVar2 = new yhm.r(percentageClauseA2, rdj.h.a(bigDecimal, bigDecimal3), !Intrinsics.f(bigDecimal4.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimal4.stripTrailingZeros(), bigDecimal3.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimal3.stripTrailingZeros()) ? rdj.h.a(bigDecimal, bigDecimal4) : null);
            }
            Clause clause = (Clause) rVar2.f314201a;
            Clause clause2 = (Clause) rVar2.f314202b;
            Clause clause3 = (Clause) rVar2.f314203c;
            int i21 = ref$IntRef.f186408a;
            ref$IntRef.f186408a = i21 + 1;
            return zhm.u.c(new q7(clause3, clause2, clause, i21));
        }
        BigDecimal bigDecimalSubtract = ((rdj.f) window.get(1)).f253465a.subtract(((rdj.f) window.get(0)).f253465a);
        Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "subtract(...)");
        MathContext mathContext = MathContext.DECIMAL128;
        BigDecimal bigDecimalDivide = bigDecimalSubtract.divide(bigDecimalValueOf, mathContext);
        BigDecimal bigDecimalSubtract2 = ((rdj.f) window.get(1)).f253466b.subtract(((rdj.f) window.get(0)).f253466b);
        Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract2, "subtract(...)");
        BigDecimal bigDecimalDivide2 = bigDecimalSubtract2.divide(bigDecimalValueOf, mathContext);
        BigDecimal bigDecimalSubtract3 = ((rdj.f) window.get(1)).f253467c.subtract(((rdj.f) window.get(0)).f253467c);
        Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract3, "subtract(...)");
        BigDecimal bigDecimalDivide3 = bigDecimalSubtract3.divide(bigDecimalValueOf, mathContext);
        IntRange intRange = new IntRange(0, (((rdj.f) window.get(1)).d - ((rdj.f) window.get(0)).d) - (((rdj.f) window.get(1)).e == arrayList.size() - 1 ? 0 : 1), 1);
        ArrayList arrayList2 = new ArrayList(zhm.w.t(intRange, 10));
        vim.f it8 = intRange.iterator();
        while (it8.f289625c) {
            BigDecimal bigDecimalValueOf2 = BigDecimal.valueOf(it8.nextInt());
            Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf2, "valueOf(...)");
            BigDecimal bigDecimal5 = ((rdj.f) window.get(0)).f253465a;
            BigDecimal bigDecimalMultiply = bigDecimalDivide.multiply(bigDecimalValueOf2);
            Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
            BigDecimal bigDecimalAdd = bigDecimal5.add(bigDecimalMultiply);
            Intrinsics.checkNotNullExpressionValue(bigDecimalAdd, "add(...)");
            ncj.d dVar2 = dVar;
            BigDecimal bigDecimal6 = ((rdj.f) window.get(0)).f253466b;
            rdj.h hVar2 = hVar;
            BigDecimal bigDecimalMultiply2 = bigDecimalDivide2.multiply(bigDecimalValueOf2);
            Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply2, "multiply(...)");
            BigDecimal bigDecimalAdd2 = bigDecimal6.add(bigDecimalMultiply2);
            Intrinsics.checkNotNullExpressionValue(bigDecimalAdd2, "add(...)");
            BigDecimal bigDecimal7 = ((rdj.f) window.get(0)).f253467c;
            BigDecimal bigDecimalMultiply3 = bigDecimalDivide3.multiply(bigDecimalValueOf2);
            Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply3, "multiply(...)");
            BigDecimal bigDecimalAdd3 = bigDecimal7.add(bigDecimalMultiply3);
            Intrinsics.checkNotNullExpressionValue(bigDecimalAdd3, "add(...)");
            int i22 = rdj.g.f253468a[dVar2.ordinal()];
            if (i22 == 1) {
                list = window;
                if (bigDecimalAdd.signum() == 0) {
                    i = 0;
                    bigDecimalStripTrailingZeros = new BigDecimal(BigInteger.ZERO, 0);
                } else {
                    i = 0;
                    bigDecimalStripTrailingZeros = bigDecimalAdd.stripTrailingZeros();
                }
                MoneyClause moneyClause2 = !Intrinsics.f(bigDecimalStripTrailingZeros, bigDecimalAdd2.signum() == 0 ? new BigDecimal(BigInteger.ZERO, i) : bigDecimalAdd2.stripTrailingZeros()) ? new MoneyClause(mif.a.Q(new ej0.b(bigDecimalAdd, bVar)), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, o9.NON_SENSITIVE, 4) : null;
                dj0.d dVarQ2 = mif.a.Q(new ej0.b(bigDecimalAdd2, bVar));
                MoneyClause.Format.Defaults defaults2 = new MoneyClause.Format.Defaults(null, null, false, false, 15);
                o9 o9Var2 = o9.NON_SENSITIVE;
                MoneyClause moneyClause3 = new MoneyClause(dVarQ2, defaults2, null, o9Var2, 4);
                if (bigDecimalAdd3.signum() == 0) {
                    i2 = 0;
                    bigDecimalStripTrailingZeros2 = new BigDecimal(BigInteger.ZERO, 0);
                } else {
                    i2 = 0;
                    bigDecimalStripTrailingZeros2 = bigDecimalAdd3.stripTrailingZeros();
                }
                rVar = new yhm.r(moneyClause2, moneyClause3, !Intrinsics.f(bigDecimalStripTrailingZeros2, bigDecimalAdd2.signum() == 0 ? new BigDecimal(BigInteger.ZERO, i2) : bigDecimalAdd2.stripTrailingZeros()) ? new MoneyClause(mif.a.Q(new ej0.b(bigDecimalAdd3, bVar)), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, o9Var2, 4) : null);
            } else {
                if (i22 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                if (bigDecimalAdd.signum() == 0) {
                    i3 = 0;
                    bigDecimalStripTrailingZeros3 = new BigDecimal(BigInteger.ZERO, 0);
                } else {
                    i3 = 0;
                    bigDecimalStripTrailingZeros3 = bigDecimalAdd.stripTrailingZeros();
                }
                if (bigDecimalAdd2.signum() == 0) {
                    list = window;
                    bigDecimalStripTrailingZeros4 = new BigDecimal(BigInteger.ZERO, i3);
                } else {
                    list = window;
                    bigDecimalStripTrailingZeros4 = bigDecimalAdd2.stripTrailingZeros();
                }
                if (Intrinsics.f(bigDecimalStripTrailingZeros3, bigDecimalStripTrailingZeros4)) {
                    percentageClauseA = null;
                } else {
                    hVar2.getClass();
                    percentageClauseA = rdj.h.a(bigDecimal, bigDecimalAdd);
                }
                hVar2.getClass();
                PercentageClause percentageClauseA3 = rdj.h.a(bigDecimal, bigDecimalAdd2);
                if (bigDecimalAdd3.signum() == 0) {
                    i5 = 0;
                    bigDecimalStripTrailingZeros5 = new BigDecimal(BigInteger.ZERO, 0);
                } else {
                    i5 = 0;
                    bigDecimalStripTrailingZeros5 = bigDecimalAdd3.stripTrailingZeros();
                }
                rVar = new yhm.r(percentageClauseA, percentageClauseA3, !Intrinsics.f(bigDecimalStripTrailingZeros5, bigDecimalAdd2.signum() == 0 ? new BigDecimal(BigInteger.ZERO, i5) : bigDecimalAdd2.stripTrailingZeros()) ? rdj.h.a(bigDecimal, bigDecimalAdd3) : null);
            }
            Clause clause4 = (Clause) rVar.f314201a;
            Clause clause5 = (Clause) rVar.f314202b;
            Clause clause6 = (Clause) rVar.f314203c;
            int i32 = ref$IntRef.f186408a;
            ref$IntRef.f186408a = i32 + 1;
            arrayList2.add(new q7(clause6, clause5, clause4, i32));
            dVar = dVar2;
            window = list;
            hVar = hVar2;
        }
        return arrayList2;
    }

    private final Object d(Object obj2) {
        rrc.i0 i0Var = (rrc.i0) this.f3668g;
        Clause clause = (Clause) this.f3666b;
        Clause clause2 = (Clause) this.f3667c;
        Clause clause3 = (Clause) this.d;
        Clause clause4 = (Clause) this.e;
        ResourceImage resourceImage = (ResourceImage) this.f;
        Function0 it8 = (Function0) obj2;
        Intrinsics.checkNotNullParameter(it8, "it");
        return new rrc.w(i0Var.f256778a.c(), false, clause, clause2, clause3, clause4, resourceImage);
    }

    private final Object e(Object obj2) {
        ryd.w wVar = (ryd.w) this.f3668g;
        LocalDate fromDate = (LocalDate) this.f3667c;
        LocalDate toDate = (LocalDate) this.d;
        ArrayList currencies = (ArrayList) this.f3666b;
        StatementsFormat format = (StatementsFormat) this.e;
        StatementsType type = (StatementsType) this.f;
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        uyd.h0 h0Var = (uyd.h0) wVar.f258357a;
        h0Var.getClass();
        Intrinsics.checkNotNullParameter(fromDate, "fromDate");
        Intrinsics.checkNotNullParameter(toDate, "toDate");
        Intrinsics.checkNotNullParameter(currencies, "currencies");
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(type, "type");
        return h0Var.f284194l.f(new uyd.k(fromDate, toDate, currencies, format, type, zBooleanValue), true);
    }

    private final Object g(Object obj2) {
        String str;
        k6d.h hVarA;
        Data data = (Data) this.f3668g;
        String str2 = (String) this.f3666b;
        com.revolut.feature.shared.branding.impl.ui.settings.a aVar = (com.revolut.feature.shared.branding.impl.ui.settings.a) this.f3667c;
        List list = (List) this.d;
        k6d.j jVar = (k6d.j) this.e;
        Address address = (Address) this.f;
        s6d.j jVar2 = (s6d.j) obj2;
        k6d.h hVar = (k6d.h) data.getContent();
        if (hVar != null) {
            hVarA = k6d.h.a(hVar, str2, false, false, false, false, null, null, 509);
            str = str2;
        } else {
            str = str2;
            hVarA = null;
        }
        return s6d.j.a(jVar2, Data.copy$default(data, hVarA, null, false, 6, null), !aVar.f86084x.contains(str), list, jVar, address, null, 65);
    }

    private final Object h(Object obj2) {
        return t48.i.a((t48.i) obj2, (List) this.f3668g, (List) this.f3666b, (t48.p) this.f3667c, (t48.g) this.d, (wi0.b) this.e, (t48.h) this.f, 1);
    }

    private final Object i(Object obj2) {
        snf.u uVar = (snf.u) this.f3668g;
        snf.f0 f0Var = (snf.f0) this.f3666b;
        snf.a0 a0Var = (snf.a0) this.f3667c;
        io3.d dVar = (io3.d) this.d;
        String str = (String) this.e;
        snf.i0 i0Var = (snf.i0) this.f;
        Data naviCommandData = (Data) obj2;
        Intrinsics.checkNotNullParameter(naviCommandData, "naviCommandData");
        NaviCommand naviCommand = (NaviCommand) naviCommandData.getContent();
        snf.v vVar = snf.w.Companion;
        String str2 = dVar.f163145a;
        na7.a aVar = i0Var.e;
        vVar.getClass();
        return new Data(new snf.b(uVar, f0Var, naviCommand, a0Var, snf.v.a(str2, str, aVar)), naviCommandData.getError(), naviCommandData.getLoading());
    }

    private final Object j(Object obj2) {
        wel.e eVar = (wel.e) this.f3668g;
        kel.b bVar = (kel.b) this.f3666b;
        List list = (List) this.f3667c;
        TradingAccount tradingAccount = (TradingAccount) this.d;
        com.revolut.feature.spending_analytics.api.models.income_sorter.a aVar = (com.revolut.feature.spending_analytics.api.models.income_sorter.a) this.e;
        hel.b bVar2 = (hel.b) this.f;
        dj0.d convertedBalance = (dj0.d) obj2;
        Intrinsics.checkNotNullParameter(convertedBalance, "convertedBalance");
        String str = eVar.f296818a;
        xi0.a aVar2 = xi0.b.Companion;
        String str2 = bVar.f183148a.e;
        aVar2.getClass();
        xi0.b bVarA = xi0.a.a(str2);
        dj0.d dVar = bVar.d;
        boolean z = list.size() > 1;
        zld.a aVar3 = tradingAccount.getD() == cfl.b.ONBOARDING ? zld.a.PENDING : zld.a.ACTIVE;
        String str3 = tradingAccount.getF().f105176b;
        if (aVar != com.revolut.feature.spending_analytics.api.models.income_sorter.a.CUSTODIAN_JISA) {
            str3 = null;
        }
        return new IncomeSorterDestinationInfo.Investment.CashHolding(bVarA, convertedBalance, dVar, z, str, aVar, bVar2, aVar3, str3);
    }

    private final Object k(Object obj2) {
        xif.s sVar = (xif.s) this.f3668g;
        i7 i7Var = (i7) this.f3666b;
        TransactionsSort transactionsSort = (TransactionsSort) this.f3667c;
        Integer num = (Integer) this.d;
        TransactionContext transactionContext = (TransactionContext) this.e;
        BreadcrumbException breadcrumbException = (BreadcrumbException) this.f;
        Throwable error = (Throwable) obj2;
        Intrinsics.checkNotNullParameter(error, "error");
        efm.r map = sVar.c(i7Var, false, transactionsSort, num, transactionContext, breadcrumbException).map(new xg6.k(new nd8.l(error, 16), 20));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    private final Object l(Object obj2) {
        yrk.g gVar = (yrk.g) this.f3668g;
        String str = (String) this.f3666b;
        uqk.l lVar = (uqk.l) this.f3667c;
        uqk.e eVar = (uqk.e) this.d;
        Integer num = (Integer) this.e;
        Integer num2 = (Integer) this.f;
        Map expandedItems = (Map) obj2;
        Intrinsics.checkNotNullParameter(expandedItems, "expandedItems");
        efm.r rVarDistinctUntilChanged = gVar.f316332b.b(str, lVar, eVar).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged, "distinctUntilChanged(...)");
        return nim.a.w(rVarDistinctUntilChanged, new yrk.e(expandedItems, 0, num, num2));
    }

    private final Object m(Object obj2) {
        efm.r rVarW;
        List listC;
        z4a.d dVar = (z4a.d) this.f3668g;
        String str = (String) this.f3666b;
        WhoToTransferFilter whoToTransferFilter = (WhoToTransferFilter) this.f3667c;
        List availableFilters = (List) this.d;
        jq9.a juniorIncludingMode = (jq9.a) this.e;
        List list = (List) this.f;
        od0.i configOptional = (od0.i) obj2;
        Intrinsics.checkNotNullParameter(configOptional, "configOptional");
        RecipientConfig recipientConfig = (RecipientConfig) configOptional.g();
        dVar.getClass();
        if (str == null || kotlin.text.d0.W(str)) {
            if (whoToTransferFilter != null && (listC = zhm.u.c(whoToTransferFilter)) != null) {
                availableFilters = listC;
            }
            t3a.g gVar = dVar.d;
            Intrinsics.checkNotNullParameter(availableFilters, "availableFilters");
            Intrinsics.checkNotNullParameter(juniorIncludingMode, "juniorIncludingMode");
            rVarW = nim.a.w(nim.a.w(gVar.f267719a.a(false, juniorIncludingMode), new s78.n(availableFilters, 8)), new z4a.a(dVar, recipientConfig));
        } else {
            rVarW = efm.r.just(new Data(zhm.f0.f322471a, null, false, 6, null));
            Intrinsics.h(rVarW);
        }
        return kli.a.h(rVarW, nim.a.w(((u3a.n) dVar.f319357c).d(str, list, juniorIncludingMode), new z4a.a((RecipientConfig) configOptional.g(), dVar)));
    }

    private final Object n(Object obj2) {
        amd.d dVar;
        dj0.d dVar2;
        ejb.b bVar = (ejb.b) this.f3668g;
        zsd.l lVar = (zsd.l) this.f3666b;
        uib.a aVar = (uib.a) this.f3667c;
        List list = (List) this.d;
        wi0.b bVar2 = (wi0.b) this.e;
        od0.i iVar = (od0.i) this.f;
        Pair pair = (Pair) obj2;
        Intrinsics.checkNotNullParameter(pair, "<destruct>");
        List list2 = (List) pair.f186385a;
        List list3 = (List) pair.f186386b;
        amd.b bVar3 = amd.b.SAVINGS;
        amd.e eVar = amd.e.SAVINGS;
        dj0.d dVar3 = bVar.f126836a;
        zhm.f0 f0Var = zhm.f0.f322471a;
        amd.d dVar4 = new amd.d(eVar, list2, f0Var, dVar3);
        if (list3.isEmpty()) {
            dVar = null;
        } else {
            amd.e eVar2 = amd.e.JOINT_SAVINGS;
            ejb.b bVar4 = (ejb.b) iVar.g();
            if (bVar4 == null || (dVar2 = bVar4.f126836a) == null) {
                dj0.d.Companion.getClass();
                dVar2 = dj0.d.e;
            }
            dVar = new amd.d(eVar2, list3, f0Var, dVar2);
        }
        amd.d[] elements = {dVar4, dVar};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return new amd.j(bVar3, kotlin.collections.d.L(elements), null, false, new zsd.g(tnb.g0.d(aVar.f280366a), lVar.f324904j.a(list, bVar2)), 12);
    }

    /* JADX WARN: Removed duplicated region for block: B:338:0x062b A[PHI: r0
      0x062b: PHI (r0v47 com.revolut.feature.address.models.Address) = (r0v46 com.revolut.feature.address.models.Address), (r0v50 com.revolut.feature.address.models.Address) binds: [B:329:0x0611, B:333:0x061b] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r38) {
        /*
            Method dump skipped, instruction units count: 2686
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ael.u0.invoke(java.lang.Object):java.lang.Object");
    }

    public /* synthetic */ u0(Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i) {
        this.f3665a = i;
        this.f3668g = obj2;
        this.f3666b = obj3;
        this.f3667c = obj4;
        this.d = obj5;
        this.e = obj6;
        this.f = obj7;
    }

    public /* synthetic */ u0(Object obj2, LocalDate localDate, LocalDate localDate2, Collection collection, Object obj3, Enum r62, int i) {
        this.f3665a = i;
        this.f3668g = obj2;
        this.f3667c = localDate;
        this.d = localDate2;
        this.f3666b = collection;
        this.e = obj3;
        this.f = r62;
    }

    public /* synthetic */ u0(nei.c cVar, List list, String str, LocalDate localDate, LocalDate localDate2, String str2) {
        this.f3665a = 6;
        this.f3668g = cVar;
        this.f3666b = list;
        this.e = str;
        this.f3667c = localDate;
        this.d = localDate2;
        this.f = str2;
    }

    public /* synthetic */ u0(nvg.s0 s0Var, iwg.a aVar, eel.c cVar, iwg.c cVar2, a3 a3Var, String str, String str2) {
        this.f3665a = 10;
        this.f3668g = aVar;
        this.f3666b = cVar;
        this.f3667c = cVar2;
        this.d = a3Var;
        this.e = str;
        this.f = str2;
    }

    public /* synthetic */ u0(tof.a3 a3Var, gqd.v vVar, IncomeSorterExecution incomeSorterExecution, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, whf.p pVar, od0.i iVar) {
        this.f3665a = 3;
        this.f3668g = a3Var;
        this.f3666b = incomeSorterExecution;
        this.f3667c = linkedHashMap;
        this.d = linkedHashMap2;
        this.e = pVar;
        this.f = iVar;
    }
}
