package krl;

import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class n implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f189006a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f189007b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f189008c;

    public /* synthetic */ n(o oVar, String str, int i) {
        this.f189006a = i;
        this.f189007b = oVar;
        this.f189008c = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        SQLiteStatement sQLiteStatementPrepare;
        Boolean boolValueOf;
        int i;
        int i2;
        Integer numValueOf;
        Boolean boolValueOf2;
        switch (this.f189006a) {
            case 0:
                rrl.a aVar = this.f189007b.f189011c;
                sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("SELECT * FROM invest_orders WHERE compound_id = ?");
                String str = this.f189008c;
                try {
                    if (str == null) {
                        sQLiteStatementPrepare.bindNull(1);
                    } else {
                        sQLiteStatementPrepare.bindText(1, str);
                    }
                    int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
                    int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "account_type");
                    int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "compound_id");
                    int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "created_at");
                    int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "updated_at");
                    int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "completed_at");
                    int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "side");
                    int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "state");
                    int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "order_type");
                    int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "currency_pair_first");
                    int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "currency_pair_second");
                    int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "symbol");
                    int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "instrument_type");
                    int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "stock_order");
                    int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "tax_advantaged_order");
                    int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "commodity_order");
                    int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "margin_order");
                    int columnIndexOrThrow18 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "fund_order");
                    int columnIndexOrThrow19 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mutual_fund_order");
                    int columnIndexOrThrow20 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "option_order");
                    int columnIndexOrThrow21 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "initiated_by");
                    int columnIndexOrThrow22 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "account_holder_type");
                    int columnIndexOrThrow23 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "blocking");
                    int columnIndexOrThrow24 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "portfolio_id");
                    if (sQLiteStatementPrepare.step()) {
                        String text = sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow);
                        String text2 = sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2);
                        String text3 = sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3);
                        long j2 = sQLiteStatementPrepare.getLong(columnIndexOrThrow4);
                        long j3 = sQLiteStatementPrepare.getLong(columnIndexOrThrow5);
                        Long lValueOf = sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : Long.valueOf(sQLiteStatementPrepare.getLong(columnIndexOrThrow6));
                        String text4 = sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow7);
                        String text5 = sQLiteStatementPrepare.isNull(columnIndexOrThrow8) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow8);
                        String text6 = sQLiteStatementPrepare.isNull(columnIndexOrThrow9) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow9);
                        String text7 = sQLiteStatementPrepare.isNull(columnIndexOrThrow10) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow10);
                        String text8 = sQLiteStatementPrepare.isNull(columnIndexOrThrow11) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow11);
                        String text9 = sQLiteStatementPrepare.isNull(columnIndexOrThrow12) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow12);
                        String text10 = sQLiteStatementPrepare.isNull(columnIndexOrThrow13) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow13);
                        p pVarG = rrl.a.g(sQLiteStatementPrepare.isNull(columnIndexOrThrow14) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow14));
                        q qVarH = rrl.a.h(sQLiteStatementPrepare.isNull(columnIndexOrThrow15) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow15));
                        b bVarB = rrl.a.b(sQLiteStatementPrepare.isNull(columnIndexOrThrow16) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow16));
                        e eVarD = rrl.a.d(sQLiteStatementPrepare.isNull(columnIndexOrThrow17) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow17));
                        d dVarC = rrl.a.c(sQLiteStatementPrepare.isNull(columnIndexOrThrow18) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow18));
                        g gVarE = rrl.a.e(sQLiteStatementPrepare.isNull(columnIndexOrThrow19) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow19));
                        h hVarF = rrl.a.f(sQLiteStatementPrepare.isNull(columnIndexOrThrow20) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow20));
                        a aVarA = rrl.a.a(sQLiteStatementPrepare.isNull(columnIndexOrThrow21) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow21));
                        String text11 = sQLiteStatementPrepare.isNull(columnIndexOrThrow22) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow22);
                        Integer numValueOf2 = sQLiteStatementPrepare.isNull(columnIndexOrThrow23) ? null : Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow23));
                        if (numValueOf2 == null) {
                            boolValueOf = null;
                        } else {
                            boolValueOf = Boolean.valueOf(numValueOf2.intValue() != 0);
                        }
                        kVar = new k(text, text2, text3, j2, j3, lValueOf, text4, text5, text6, text7, text8, text9, text10, pVarG, qVarH, bVarB, eVarD, dVarC, gVarE, hVarF, aVarA, text11, boolValueOf, sQLiteStatementPrepare.isNull(columnIndexOrThrow24) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow24));
                    }
                    sQLiteStatementPrepare.close();
                    return kVar;
                } finally {
                }
            default:
                rrl.a aVar2 = this.f189007b.f189011c;
                sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("\n           SELECT * FROM invest_orders\n           WHERE (? IS NULL OR currency_pair_first = ? OR currency_pair_second = ?)\n        ");
                String str2 = this.f189008c;
                try {
                    if (str2 == null) {
                        sQLiteStatementPrepare.bindNull(1);
                    } else {
                        sQLiteStatementPrepare.bindText(1, str2);
                    }
                    if (str2 == null) {
                        sQLiteStatementPrepare.bindNull(2);
                    } else {
                        sQLiteStatementPrepare.bindText(2, str2);
                    }
                    if (str2 == null) {
                        sQLiteStatementPrepare.bindNull(3);
                    } else {
                        sQLiteStatementPrepare.bindText(3, str2);
                    }
                    int columnIndexOrThrow25 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
                    int columnIndexOrThrow26 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "account_type");
                    int columnIndexOrThrow27 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "compound_id");
                    int columnIndexOrThrow28 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "created_at");
                    int columnIndexOrThrow29 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "updated_at");
                    int columnIndexOrThrow30 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "completed_at");
                    int columnIndexOrThrow31 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "side");
                    int columnIndexOrThrow32 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "state");
                    int columnIndexOrThrow33 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "order_type");
                    int columnIndexOrThrow34 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "currency_pair_first");
                    int columnIndexOrThrow35 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "currency_pair_second");
                    int columnIndexOrThrow36 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "symbol");
                    int columnIndexOrThrow37 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "instrument_type");
                    int columnIndexOrThrow38 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "stock_order");
                    int columnIndexOrThrow39 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "tax_advantaged_order");
                    int columnIndexOrThrow40 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "commodity_order");
                    int columnIndexOrThrow41 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "margin_order");
                    int columnIndexOrThrow42 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "fund_order");
                    int columnIndexOrThrow43 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mutual_fund_order");
                    int columnIndexOrThrow44 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "option_order");
                    int columnIndexOrThrow45 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "initiated_by");
                    int columnIndexOrThrow46 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "account_holder_type");
                    int columnIndexOrThrow47 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "blocking");
                    int columnIndexOrThrow48 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "portfolio_id");
                    ArrayList arrayList = new ArrayList();
                    while (sQLiteStatementPrepare.step()) {
                        String text12 = sQLiteStatementPrepare.isNull(columnIndexOrThrow25) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow25);
                        String text13 = sQLiteStatementPrepare.isNull(columnIndexOrThrow26) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow26);
                        String text14 = sQLiteStatementPrepare.isNull(columnIndexOrThrow27) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow27);
                        long j5 = sQLiteStatementPrepare.getLong(columnIndexOrThrow28);
                        long j16 = sQLiteStatementPrepare.getLong(columnIndexOrThrow29);
                        Long lValueOf2 = sQLiteStatementPrepare.isNull(columnIndexOrThrow30) ? null : Long.valueOf(sQLiteStatementPrepare.getLong(columnIndexOrThrow30));
                        String text15 = sQLiteStatementPrepare.isNull(columnIndexOrThrow31) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow31);
                        String text16 = sQLiteStatementPrepare.isNull(columnIndexOrThrow32) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow32);
                        String text17 = sQLiteStatementPrepare.isNull(columnIndexOrThrow33) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow33);
                        String text18 = sQLiteStatementPrepare.isNull(columnIndexOrThrow34) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow34);
                        String text19 = sQLiteStatementPrepare.isNull(columnIndexOrThrow35) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow35);
                        String text20 = sQLiteStatementPrepare.isNull(columnIndexOrThrow36) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow36);
                        String text21 = sQLiteStatementPrepare.isNull(columnIndexOrThrow37) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow37);
                        p pVarG2 = rrl.a.g(sQLiteStatementPrepare.isNull(columnIndexOrThrow38) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow38));
                        int i3 = columnIndexOrThrow25;
                        int i5 = columnIndexOrThrow39;
                        q qVarH2 = rrl.a.h(sQLiteStatementPrepare.isNull(i5) ? null : sQLiteStatementPrepare.getText(i5));
                        columnIndexOrThrow39 = i5;
                        int i6 = columnIndexOrThrow40;
                        b bVarB2 = rrl.a.b(sQLiteStatementPrepare.isNull(i6) ? null : sQLiteStatementPrepare.getText(i6));
                        columnIndexOrThrow40 = i6;
                        int i21 = columnIndexOrThrow41;
                        e eVarD2 = rrl.a.d(sQLiteStatementPrepare.isNull(i21) ? null : sQLiteStatementPrepare.getText(i21));
                        columnIndexOrThrow41 = i21;
                        int i22 = columnIndexOrThrow42;
                        d dVarC2 = rrl.a.c(sQLiteStatementPrepare.isNull(i22) ? null : sQLiteStatementPrepare.getText(i22));
                        columnIndexOrThrow42 = i22;
                        int i32 = columnIndexOrThrow43;
                        g gVarE2 = rrl.a.e(sQLiteStatementPrepare.isNull(i32) ? null : sQLiteStatementPrepare.getText(i32));
                        columnIndexOrThrow43 = i32;
                        int i33 = columnIndexOrThrow44;
                        h hVarF2 = rrl.a.f(sQLiteStatementPrepare.isNull(i33) ? null : sQLiteStatementPrepare.getText(i33));
                        columnIndexOrThrow44 = i33;
                        int i43 = columnIndexOrThrow45;
                        a aVarA2 = rrl.a.a(sQLiteStatementPrepare.isNull(i43) ? null : sQLiteStatementPrepare.getText(i43));
                        columnIndexOrThrow45 = i43;
                        int i59 = columnIndexOrThrow46;
                        String text22 = sQLiteStatementPrepare.isNull(i59) ? null : sQLiteStatementPrepare.getText(i59);
                        columnIndexOrThrow46 = i59;
                        int i66 = columnIndexOrThrow47;
                        if (sQLiteStatementPrepare.isNull(i66)) {
                            i = columnIndexOrThrow38;
                            i2 = columnIndexOrThrow26;
                            numValueOf = null;
                        } else {
                            i = columnIndexOrThrow38;
                            i2 = columnIndexOrThrow26;
                            numValueOf = Integer.valueOf((int) sQLiteStatementPrepare.getLong(i66));
                        }
                        if (numValueOf == null) {
                            boolValueOf2 = null;
                        } else {
                            boolValueOf2 = Boolean.valueOf(numValueOf.intValue() != 0);
                        }
                        int i74 = columnIndexOrThrow48;
                        arrayList.add(new k(text12, text13, text14, j5, j16, lValueOf2, text15, text16, text17, text18, text19, text20, text21, pVarG2, qVarH2, bVarB2, eVarD2, dVarC2, gVarE2, hVarF2, aVarA2, text22, boolValueOf2, sQLiteStatementPrepare.isNull(i74) ? null : sQLiteStatementPrepare.getText(i74)));
                        columnIndexOrThrow48 = i74;
                        columnIndexOrThrow26 = i2;
                        columnIndexOrThrow38 = i;
                        columnIndexOrThrow47 = i66;
                        columnIndexOrThrow25 = i3;
                        break;
                    }
                    sQLiteStatementPrepare.close();
                    return arrayList;
                } finally {
                }
        }
    }
}
