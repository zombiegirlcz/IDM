package j3f;

import amh.n;
import androidx.room.RoomDatabase;
import androidx.room.RoomRawQuery;
import androidx.room.RoomSQLiteQuery;
import androidx.room.coroutines.FlowUtil;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.room.util.StringUtil;
import androidx.sqlite.SQLiteStatement;
import androidx.sqlite.db.SimpleSQLiteQuery;
import com.revolut.feature.trading.impl.data.database.TradingDatabase;
import com.revolut.shared.feature.wealth.models.account.WealthAccountType;
import dcl.b0;
import is6.x;
import java.time.Instant;
import java.util.List;
import kotlinx.coroutines.flow.Flow;
import n3f.c0;
import n3f.l;
import n3f.m;
import n3f.o;
import n3f.p;
import n3f.q;
import n3f.r;
import n3f.s;
import n3f.u;
import n3f.v;
import n3f.w;
import n3f.y;
import n3f.z;
import y20.a1;
import y3f.t;

/* JADX INFO: loaded from: classes13.dex */
public final class h extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f171185a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x f171186b = new x(this, 2);

    public h(TradingDatabase tradingDatabase) {
        this.f171185a = tradingDatabase;
    }

    @Override // j3f.f
    public final Object d(List list, a1 a1Var) {
        StringBuilder sbS = p.a.s("\n            DELETE \n                FROM trading_trades\n            WHERE \n                portfolio_id IS NOT NULL AND portfolio_id NOT IN (");
        StringUtil.appendPlaceholders(sbS, list.size());
        sbS.append(")");
        sbS.append("\n");
        sbS.append("        ");
        return DBUtil.performSuspending(this.f171185a, false, true, new n(sbS.toString(), list, 6), a1Var);
    }

    @Override // j3f.f
    public final Object e(String str, t tVar) {
        return DBUtil.performSuspending(this.f171185a, true, false, new is6.t(this, str, 27), tVar);
    }

    @Override // j3f.f
    public final Object f(SimpleSQLiteQuery simpleSQLiteQuery, gim.i iVar) {
        RoomRawQuery roomRawQuery = RoomSQLiteQuery.copyFrom(simpleSQLiteQuery).toRoomRawQuery();
        return DBUtil.performSuspending(this.f171185a, true, false, new g(this, roomRawQuery.getSql(), roomRawQuery, 0), iVar);
    }

    @Override // j3f.f
    public final Flow g(SimpleSQLiteQuery simpleSQLiteQuery) {
        RoomRawQuery roomRawQuery = RoomSQLiteQuery.copyFrom(simpleSQLiteQuery).toRoomRawQuery();
        b0 b0Var = new b0(roomRawQuery.getSql(), roomRawQuery, 2);
        return FlowUtil.createFlow(this.f171185a, false, new String[]{"trading_trades"}, b0Var);
    }

    @Override // j3f.f
    public final Flow h(SimpleSQLiteQuery simpleSQLiteQuery) {
        RoomRawQuery roomRawQuery = RoomSQLiteQuery.copyFrom(simpleSQLiteQuery).toRoomRawQuery();
        g gVar = new g(this, roomRawQuery.getSql(), roomRawQuery, 1);
        return FlowUtil.createFlow(this.f171185a, false, new String[]{"trading_trades"}, gVar);
    }

    @Override // j3f.f
    public final Object k(List list, gim.c cVar) {
        list.getClass();
        return DBUtil.performSuspending(this.f171185a, false, true, new is6.t(this, list, 28), cVar);
    }

    public final c0 l(SQLiteStatement sQLiteStatement) {
        y yVarI;
        n3f.c cVarA;
        n3f.i iVarF;
        n3f.f fVarD;
        u uVarP;
        n3f.h hVarE;
        q qVarL;
        n3f.e eVarC;
        l lVarG;
        z zVarT;
        n3f.d dVarB;
        m mVarV;
        o oVarH;
        p pVarK;
        Instant instantJ;
        boolean z;
        boolean z3;
        boolean z4;
        v vVarQ;
        s sVarN;
        String text;
        int i;
        String text2;
        int i2;
        WealthAccountType wealthAccountTypeU;
        String text3;
        int i3;
        n3f.t tVarO;
        String text4;
        int i5;
        String text5;
        int i6;
        String text6;
        int i21;
        boolean z6;
        boolean z11;
        String text7;
        int i22;
        r rVarM;
        w wVarR;
        n3f.x xVarS;
        n3f.n nVarJ;
        String text8;
        int i32;
        Boolean boolValueOf;
        Boolean bool;
        int columnIndex = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "trade_id");
        int columnIndex2 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "compound_id");
        int columnIndex3 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "ref");
        int columnIndex4 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "holding_id");
        int columnIndex5 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "state");
        int columnIndex6 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "completed_at");
        int columnIndex7 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "updated_at");
        int columnIndex8 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "created_at");
        int columnIndex9 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "stock_trade");
        int columnIndex10 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "cash_trade");
        int columnIndex11 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "dividend_trade");
        int columnIndex12 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "coupon");
        int columnIndex13 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "redemption");
        int columnIndex14 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "custody_fees");
        int columnIndex15 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "margin_trade");
        int columnIndex16 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "commodity_trade");
        int columnIndex17 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "exchange_trade");
        int columnIndex18 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "stock_transfer_trade");
        int columnIndex19 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "cash_transfer_trade");
        int columnIndex20 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "fee_trade");
        int columnIndex21 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "fund_trade");
        int columnIndex22 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "value");
        int columnIndex23 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "settlementDate");
        int columnIndex24 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "slip_transaction");
        int columnIndex25 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "stock_transfer_fee");
        int columnIndex26 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "commission_refund");
        int columnIndex27 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "refund");
        int columnIndex28 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "overnight_fee");
        int columnIndex29 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "standing_order_id");
        int columnIndex30 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "client_order_id");
        int columnIndex31 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "account_type");
        int columnIndex32 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "portfolio_id");
        int columnIndex33 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "price_adjustment");
        int columnIndex34 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "base_instrument_currency");
        int columnIndex35 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "counter_instrument_currency");
        int columnIndex36 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "badge");
        int columnIndex37 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "deficit_adjustment");
        int columnIndex38 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "stock_promotion_clawback");
        int columnIndex39 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "transfer_request_id");
        int columnIndex40 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "merger");
        int columnIndex41 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "spin_off");
        int columnIndex42 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "stock_split");
        int columnIndex43 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "initiated_by");
        int columnIndex44 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "account_holder_type");
        int columnIndex45 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "awaiting_settlement");
        int columnIndex46 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "currency_pair_first");
        int columnIndex47 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "currency_pair_second");
        String text9 = null;
        String text10 = (columnIndex == -1 || sQLiteStatement.isNull(columnIndex)) ? null : sQLiteStatement.getText(columnIndex);
        String text11 = (columnIndex2 == -1 || sQLiteStatement.isNull(columnIndex2)) ? null : sQLiteStatement.getText(columnIndex2);
        String text12 = (columnIndex3 == -1 || sQLiteStatement.isNull(columnIndex3)) ? null : sQLiteStatement.getText(columnIndex3);
        String text13 = (columnIndex4 == -1 || sQLiteStatement.isNull(columnIndex4)) ? null : sQLiteStatement.getText(columnIndex4);
        String text14 = (columnIndex5 == -1 || sQLiteStatement.isNull(columnIndex5)) ? null : sQLiteStatement.getText(columnIndex5);
        Long lValueOf = (columnIndex6 == -1 || sQLiteStatement.isNull(columnIndex6)) ? null : Long.valueOf(sQLiteStatement.getLong(columnIndex6));
        Long lValueOf2 = (columnIndex7 == -1 || sQLiteStatement.isNull(columnIndex7)) ? null : Long.valueOf(sQLiteStatement.getLong(columnIndex7));
        long j2 = columnIndex8 == -1 ? 0L : sQLiteStatement.getLong(columnIndex8);
        if (columnIndex9 == -1) {
            yVarI = null;
        } else {
            yVarI = r3f.a.i(sQLiteStatement.isNull(columnIndex9) ? null : sQLiteStatement.getText(columnIndex9));
        }
        if (columnIndex10 == -1) {
            cVarA = null;
        } else {
            cVarA = r3f.a.a(sQLiteStatement.isNull(columnIndex10) ? null : sQLiteStatement.getText(columnIndex10));
        }
        if (columnIndex11 == -1) {
            iVarF = null;
        } else {
            iVarF = r3f.a.f(sQLiteStatement.isNull(columnIndex11) ? null : sQLiteStatement.getText(columnIndex11));
        }
        if (columnIndex12 == -1) {
            fVarD = null;
        } else {
            fVarD = r3f.a.d(sQLiteStatement.isNull(columnIndex12) ? null : sQLiteStatement.getText(columnIndex12));
        }
        if (columnIndex13 == -1) {
            uVarP = null;
        } else {
            uVarP = r3f.a.p(sQLiteStatement.isNull(columnIndex13) ? null : sQLiteStatement.getText(columnIndex13));
        }
        if (columnIndex14 == -1) {
            hVarE = null;
        } else {
            hVarE = r3f.a.e(sQLiteStatement.isNull(columnIndex14) ? null : sQLiteStatement.getText(columnIndex14));
        }
        if (columnIndex15 == -1) {
            qVarL = null;
        } else {
            qVarL = r3f.a.l(sQLiteStatement.isNull(columnIndex15) ? null : sQLiteStatement.getText(columnIndex15));
        }
        if (columnIndex16 == -1) {
            eVarC = null;
        } else {
            eVarC = r3f.a.c(sQLiteStatement.isNull(columnIndex16) ? null : sQLiteStatement.getText(columnIndex16));
        }
        if (columnIndex17 == -1) {
            lVarG = null;
        } else {
            lVarG = r3f.a.g(sQLiteStatement.isNull(columnIndex17) ? null : sQLiteStatement.getText(columnIndex17));
        }
        if (columnIndex18 == -1) {
            zVarT = null;
        } else {
            zVarT = r3f.a.t(sQLiteStatement.isNull(columnIndex18) ? null : sQLiteStatement.getText(columnIndex18));
        }
        if (columnIndex19 == -1) {
            dVarB = null;
        } else {
            dVarB = r3f.a.b(sQLiteStatement.isNull(columnIndex19) ? null : sQLiteStatement.getText(columnIndex19));
        }
        if (columnIndex20 == -1) {
            mVarV = null;
        } else {
            mVarV = r3f.a.v(sQLiteStatement.isNull(columnIndex20) ? null : sQLiteStatement.getText(columnIndex20));
        }
        if (columnIndex21 == -1) {
            oVarH = null;
        } else {
            oVarH = r3f.a.h(sQLiteStatement.isNull(columnIndex21) ? null : sQLiteStatement.getText(columnIndex21));
        }
        if (columnIndex22 == -1) {
            pVarK = null;
        } else {
            pVarK = r3f.a.k(sQLiteStatement.isNull(columnIndex22) ? null : sQLiteStatement.getText(columnIndex22));
        }
        if (columnIndex23 == -1) {
            instantJ = null;
        } else {
            instantJ = b21.a.j(sQLiteStatement.isNull(columnIndex23) ? null : Long.valueOf(sQLiteStatement.getLong(columnIndex23)));
        }
        if (columnIndex24 == -1) {
            z = false;
        } else {
            z = ((int) sQLiteStatement.getLong(columnIndex24)) != 0;
        }
        if (columnIndex25 == -1) {
            z3 = false;
        } else {
            z3 = ((int) sQLiteStatement.getLong(columnIndex25)) != 0;
        }
        if (columnIndex26 == -1) {
            z4 = false;
        } else {
            z4 = ((int) sQLiteStatement.getLong(columnIndex26)) != 0;
        }
        if (columnIndex27 == -1) {
            vVarQ = null;
        } else {
            vVarQ = r3f.a.q(sQLiteStatement.isNull(columnIndex27) ? null : sQLiteStatement.getText(columnIndex27));
        }
        if (columnIndex28 == -1) {
            sVarN = null;
        } else {
            sVarN = r3f.a.n(sQLiteStatement.isNull(columnIndex28) ? null : sQLiteStatement.getText(columnIndex28));
        }
        if (columnIndex29 == -1 || sQLiteStatement.isNull(columnIndex29)) {
            i = columnIndex30;
            text = null;
        } else {
            text = sQLiteStatement.getText(columnIndex29);
            i = columnIndex30;
        }
        if (i == -1 || sQLiteStatement.isNull(i)) {
            i2 = columnIndex31;
            text2 = null;
        } else {
            text2 = sQLiteStatement.getText(i);
            i2 = columnIndex31;
        }
        if (i2 == -1) {
            wealthAccountTypeU = null;
        } else {
            wealthAccountTypeU = r3f.a.u(sQLiteStatement.isNull(i2) ? null : sQLiteStatement.getText(i2));
        }
        if (columnIndex32 == -1 || sQLiteStatement.isNull(columnIndex32)) {
            i3 = columnIndex33;
            text3 = null;
        } else {
            text3 = sQLiteStatement.getText(columnIndex32);
            i3 = columnIndex33;
        }
        if (i3 == -1) {
            tVarO = null;
        } else {
            tVarO = r3f.a.o(sQLiteStatement.isNull(i3) ? null : sQLiteStatement.getText(i3));
        }
        if (columnIndex34 == -1 || sQLiteStatement.isNull(columnIndex34)) {
            i5 = columnIndex35;
            text4 = null;
        } else {
            text4 = sQLiteStatement.getText(columnIndex34);
            i5 = columnIndex35;
        }
        if (i5 == -1 || sQLiteStatement.isNull(i5)) {
            i6 = columnIndex36;
            text5 = null;
        } else {
            text5 = sQLiteStatement.getText(i5);
            i6 = columnIndex36;
        }
        if (i6 == -1 || sQLiteStatement.isNull(i6)) {
            i21 = columnIndex37;
            text6 = null;
        } else {
            text6 = sQLiteStatement.getText(i6);
            i21 = columnIndex37;
        }
        if (i21 == -1) {
            z6 = false;
        } else {
            z6 = ((int) sQLiteStatement.getLong(i21)) != 0;
        }
        if (columnIndex38 == -1) {
            z11 = false;
        } else {
            z11 = ((int) sQLiteStatement.getLong(columnIndex38)) != 0;
        }
        if (columnIndex39 == -1 || sQLiteStatement.isNull(columnIndex39)) {
            i22 = columnIndex40;
            text7 = null;
        } else {
            text7 = sQLiteStatement.getText(columnIndex39);
            i22 = columnIndex40;
        }
        if (i22 == -1) {
            rVarM = null;
        } else {
            rVarM = r3f.a.m(sQLiteStatement.isNull(i22) ? null : sQLiteStatement.getText(i22));
        }
        if (columnIndex41 == -1) {
            wVarR = null;
        } else {
            wVarR = r3f.a.r(sQLiteStatement.isNull(columnIndex41) ? null : sQLiteStatement.getText(columnIndex41));
        }
        if (columnIndex42 == -1) {
            xVarS = null;
        } else {
            xVarS = r3f.a.s(sQLiteStatement.isNull(columnIndex42) ? null : sQLiteStatement.getText(columnIndex42));
        }
        if (columnIndex43 == -1) {
            nVarJ = null;
        } else {
            nVarJ = r3f.a.j(sQLiteStatement.isNull(columnIndex43) ? null : sQLiteStatement.getText(columnIndex43));
        }
        if (columnIndex44 == -1 || sQLiteStatement.isNull(columnIndex44)) {
            i32 = columnIndex45;
            text8 = null;
        } else {
            text8 = sQLiteStatement.getText(columnIndex44);
            i32 = columnIndex45;
        }
        if (i32 == -1) {
            bool = null;
        } else {
            Integer numValueOf = sQLiteStatement.isNull(i32) ? null : Integer.valueOf((int) sQLiteStatement.getLong(i32));
            if (numValueOf == null) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
            }
            bool = boolValueOf;
        }
        String text15 = (columnIndex46 == -1 || sQLiteStatement.isNull(columnIndex46)) ? null : sQLiteStatement.getText(columnIndex46);
        if (columnIndex47 != -1 && !sQLiteStatement.isNull(columnIndex47)) {
            text9 = sQLiteStatement.getText(columnIndex47);
        }
        return new c0(text10, text11, text12, text13, text14, lValueOf, lValueOf2, j2, yVarI, cVarA, iVarF, fVarD, uVarP, hVarE, qVarL, eVarC, lVarG, zVarT, dVarB, mVarV, oVarH, pVarK, instantJ, z, z3, z4, vVarQ, sVarN, text, text2, wealthAccountTypeU, text3, tVarO, text4, text5, text6, z6, z11, text7, rVarM, wVarR, xVarS, nVarJ, text8, bool, text15, text9);
    }
}
