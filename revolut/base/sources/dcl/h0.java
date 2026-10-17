package dcl;

import androidx.collection.ArrayMap;
import androidx.room.EntityUpsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RxRoom;
import androidx.room.util.DBUtil;
import androidx.room.util.RelationUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.room.util.StringUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.revolut.shared.feature.wealth.domain.impl.data.database.WealthDomainDatabase;
import hcl.a3;
import hcl.d3;
import hcl.x2;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Unit;

/* JADX INFO: loaded from: classes12.dex */
public final class h0 extends d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f113022a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qcl.d f113023b = new qcl.d();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ark.c f113024c;
    public final EntityUpsertAdapter d;

    public h0(WealthDomainDatabase wealthDomainDatabase) {
        this.f113022a = wealthDomainDatabase;
        new ark.c(this, 22);
        this.f113024c = new ark.c(23);
        new g0(this, 0);
        this.d = new EntityUpsertAdapter(new ark.c(this, 24), new g0(this, 1));
    }

    public static /* synthetic */ Unit h(h0 h0Var, x2 x2Var) {
        super.f(x2Var);
        return Unit.f186387a;
    }

    @Override // dcl.d0
    public final void a() {
        DBUtil.performBlocking(this.f113022a, false, true, new dak.c(22));
    }

    @Override // dcl.d0
    public final List b() {
        return (List) DBUtil.performBlocking(this.f113022a, true, false, new e0(this, 0));
    }

    @Override // dcl.d0
    public final void c(x2 x2Var) {
        DBUtil.performBlocking(this.f113022a, false, true, new f0(this, x2Var, 1));
    }

    @Override // dcl.d0
    public final efm.r d(List list) {
        StringBuilder sbS = p.a.s("SELECT r.* FROM recently_viewed_instrument r JOIN instruments i ON r.ref = i.ref WHERE i.type IN (");
        int size = list.size();
        StringUtil.appendPlaceholders(sbS, size);
        sbS.append(") ORDER BY r.last_seen DESC LIMIT ");
        sbS.append("?");
        c18.c cVar = new c18.c(this, sbS.toString(), list, size, 1);
        return RxRoom.createObservable(this.f113022a, true, new String[]{"instruments", "recently_viewed_instrument"}, cVar);
    }

    @Override // dcl.d0
    public final efm.r e() {
        e0 e0Var = new e0(this, 1);
        return RxRoom.createObservable(this.f113022a, true, new String[]{"instruments", "recently_viewed_instrument"}, e0Var);
    }

    @Override // dcl.d0
    public final void f(x2 x2Var) {
        DBUtil.performBlocking(this.f113022a, false, true, new f0(this, x2Var, 0));
    }

    @Override // dcl.d0
    public final void g(ArrayList arrayList) {
        DBUtil.performBlocking(this.f113022a, false, true, new dc4.g(this, arrayList, 23));
    }

    public final void i(SQLiteConnection sQLiteConnection, ArrayMap arrayMap) {
        int i;
        Integer numValueOf;
        Set<String> setKeySet = arrayMap.keySet();
        if (setKeySet.isEmpty()) {
            return;
        }
        if (arrayMap.getSize() > 999) {
            RelationUtil.recursiveFetchArrayMap(arrayMap, false, new dc4.g(this, sQLiteConnection, 24));
            return;
        }
        StringBuilder sbS = p.a.s("SELECT `id`,`ref`,`type`,`name`,`symbol`,`stateDetails`,`requiredProducts`,`typeSpecificProperties`,`currency`,`sortOrder`,`isin`,`exchange`,`shortOverview`,`quantityDecimalPlaces`,`priceDecimalPlaces`,`allSymbols`,`underlying_currency`,`promotion_campaigns`,`list_status`,`state_reason`,`delist_date` FROM `instruments` WHERE `ref` IN (");
        StringUtil.appendPlaceholders(sbS, setKeySet.size());
        sbS.append(")");
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(sbS.toString());
        int i2 = 1;
        for (String str : setKeySet) {
            if (str == null) {
                sQLiteStatementPrepare.bindNull(i2);
            } else {
                sQLiteStatementPrepare.bindText(i2, str);
            }
            i2++;
        }
        try {
            int columnIndex = SQLiteStatementUtil.getColumnIndex(sQLiteStatementPrepare, "ref");
            if (columnIndex == -1) {
                return;
            }
            while (sQLiteStatementPrepare.step()) {
                String text = sQLiteStatementPrepare.isNull(columnIndex) ? null : sQLiteStatementPrepare.getText(columnIndex);
                if (text != null && arrayMap.containsKey(text)) {
                    String text2 = sQLiteStatementPrepare.isNull(0) ? null : sQLiteStatementPrepare.getText(0);
                    String text3 = sQLiteStatementPrepare.isNull(1) ? null : sQLiteStatementPrepare.getText(1);
                    String text4 = sQLiteStatementPrepare.isNull(2) ? null : sQLiteStatementPrepare.getText(2);
                    String text5 = sQLiteStatementPrepare.isNull(3) ? null : sQLiteStatementPrepare.getText(3);
                    String text6 = sQLiteStatementPrepare.isNull(4) ? null : sQLiteStatementPrepare.getText(4);
                    hcl.n0 n0VarD = qcl.k.d(sQLiteStatementPrepare.isNull(5) ? null : sQLiteStatementPrepare.getText(5));
                    a3 a3VarF = qcl.k.f(sQLiteStatementPrepare.isNull(6) ? null : sQLiteStatementPrepare.getText(6));
                    d3 d3VarG = qcl.k.g(sQLiteStatementPrepare.isNull(7) ? null : sQLiteStatementPrepare.getText(7));
                    String text7 = sQLiteStatementPrepare.isNull(8) ? null : sQLiteStatementPrepare.getText(8);
                    Integer numValueOf2 = sQLiteStatementPrepare.isNull(9) ? null : Integer.valueOf((int) sQLiteStatementPrepare.getLong(9));
                    String text8 = sQLiteStatementPrepare.isNull(10) ? null : sQLiteStatementPrepare.getText(10);
                    String text9 = sQLiteStatementPrepare.isNull(11) ? null : sQLiteStatementPrepare.getText(11);
                    String text10 = sQLiteStatementPrepare.isNull(12) ? null : sQLiteStatementPrepare.getText(12);
                    int i3 = (int) sQLiteStatementPrepare.getLong(13);
                    if (sQLiteStatementPrepare.isNull(14)) {
                        i = i3;
                        numValueOf = null;
                    } else {
                        i = i3;
                        numValueOf = Integer.valueOf((int) sQLiteStatementPrepare.getLong(14));
                    }
                    arrayMap.put(text, new hcl.k0(text2, text3, text4, text5, text6, n0VarD, a3VarF, d3VarG, text7, numValueOf2, text8, text9, text10, i, numValueOf, qcl.d.f(sQLiteStatementPrepare.isNull(15) ? null : sQLiteStatementPrepare.getText(15)), sQLiteStatementPrepare.isNull(16) ? null : sQLiteStatementPrepare.getText(16), qcl.d.f(sQLiteStatementPrepare.isNull(17) ? null : sQLiteStatementPrepare.getText(17)), qcl.k.c(sQLiteStatementPrepare.isNull(18) ? null : sQLiteStatementPrepare.getText(18)), sQLiteStatementPrepare.isNull(19) ? null : sQLiteStatementPrepare.getText(19), sQLiteStatementPrepare.isNull(20) ? null : Long.valueOf(sQLiteStatementPrepare.getLong(20))));
                }
            }
        } finally {
            sQLiteStatementPrepare.close();
        }
    }
}
