package n45;

import androidx.collection.ArrayMap;
import androidx.room.RoomDatabase;
import androidx.room.util.RelationUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.room.util.StringUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.revolut.feature.credit.loan.impl.database.LoanDatabase;
import java.util.List;
import java.util.Set;
import kotlinx.serialization.json.Json;
import o45.j;
import o45.m;
import o45.s;
import o45.v;
import o45.z;

/* JADX INFO: loaded from: classes13.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f212295a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r45.a f212297c = new r45.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ao.g f212296b = new ao.g(this, 22);
    public final ao.g d = new ao.g(this, 23);
    public final ao.g e = new ao.g(24);
    public final ao.g f = new ao.g(25);

    public c(LoanDatabase loanDatabase) {
        this.f212295a = loanDatabase;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(SQLiteConnection sQLiteConnection, ArrayMap arrayMap) {
        v vVar;
        List list;
        o45.g gVar;
        j jVar;
        s sVar;
        Set<String> setKeySet = arrayMap.keySet();
        if (setKeySet.isEmpty()) {
            return;
        }
        int i = 0;
        if (arrayMap.getSize() > 999) {
            RelationUtil.recursiveFetchArrayMap(arrayMap, false, new b(this, sQLiteConnection, 0));
            return;
        }
        StringBuilder sbS = p.a.s("SELECT `id`,`durationMonths`,`repaymentDay`,`outstandingBalance`,`accruedInterest`,`accruedFee`,`oneTimeFee`,`monthlyRepayment`,`isInCooldownPeriod`,`unavailableFeatures`,`borrowers`,`autoPayRepaymentSource`,`backupCard`,`repaymentConfig`,`agreementNumber` FROM `loan_details_shard` WHERE `id` IN (");
        StringUtil.appendPlaceholders(sbS, setKeySet.size());
        sbS.append(")");
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(sbS.toString());
        int i2 = 1;
        int i3 = 1;
        for (String str : setKeySet) {
            if (str == null) {
                sQLiteStatementPrepare.bindNull(i3);
            } else {
                sQLiteStatementPrepare.bindText(i3, str);
            }
            i3++;
        }
        try {
            int columnIndex = SQLiteStatementUtil.getColumnIndex(sQLiteStatementPrepare, "id");
            if (columnIndex == -1) {
                return;
            }
            while (sQLiteStatementPrepare.step()) {
                String text = sQLiteStatementPrepare.isNull(columnIndex) ? null : sQLiteStatementPrepare.getText(columnIndex);
                if (text != null && arrayMap.containsKey(text)) {
                    String text2 = sQLiteStatementPrepare.isNull(i) ? null : sQLiteStatementPrepare.getText(i);
                    int i5 = (int) sQLiteStatementPrepare.getLong(i2);
                    int i6 = (int) sQLiteStatementPrepare.getLong(2);
                    long j2 = sQLiteStatementPrepare.getLong(3);
                    o45.c cVarB = r45.a.b(sQLiteStatementPrepare.isNull(4) ? null : sQLiteStatementPrepare.getText(4));
                    o45.c cVarB2 = r45.a.b(sQLiteStatementPrepare.isNull(5) ? null : sQLiteStatementPrepare.getText(5));
                    o45.c cVarB3 = r45.a.b(sQLiteStatementPrepare.isNull(6) ? null : sQLiteStatementPrepare.getText(6));
                    long j3 = sQLiteStatementPrepare.getLong(7);
                    boolean z = ((int) sQLiteStatementPrepare.getLong(8)) != 0 ? i2 : i;
                    String text3 = sQLiteStatementPrepare.isNull(9) ? null : sQLiteStatementPrepare.getText(9);
                    if (text3 != null) {
                        Json jsonA = h55.b.a();
                        jsonA.getClass();
                        vVar = (v) jsonA.b(nlm.a.c(v.Companion.serializer()), text3);
                    } else {
                        vVar = null;
                    }
                    String text4 = sQLiteStatementPrepare.isNull(10) ? null : sQLiteStatementPrepare.getText(10);
                    if (text4 != null) {
                        Json jsonA2 = h55.b.a();
                        jsonA2.getClass();
                        list = (List) jsonA2.b(nlm.a.c(new qlm.e(m.Companion.serializer())), text4);
                    } else {
                        list = null;
                    }
                    String text5 = sQLiteStatementPrepare.isNull(11) ? null : sQLiteStatementPrepare.getText(11);
                    if (text5 != null) {
                        Json jsonA3 = h55.b.a();
                        jsonA3.getClass();
                        gVar = (o45.g) jsonA3.b(nlm.a.c(o45.g.INSTANCE.serializer()), text5);
                    } else {
                        gVar = null;
                    }
                    String text6 = sQLiteStatementPrepare.isNull(12) ? null : sQLiteStatementPrepare.getText(12);
                    if (text6 != null) {
                        Json jsonA4 = h55.b.a();
                        jsonA4.getClass();
                        jVar = (j) jsonA4.b(nlm.a.c(j.Companion.serializer()), text6);
                    } else {
                        jVar = null;
                    }
                    String text7 = sQLiteStatementPrepare.isNull(13) ? null : sQLiteStatementPrepare.getText(13);
                    if (text7 != null) {
                        Json jsonA5 = h55.b.a();
                        jsonA5.getClass();
                        sVar = (s) jsonA5.b(nlm.a.c(s.Companion.serializer()), text7);
                    } else {
                        sVar = null;
                    }
                    arrayMap.put(text, new z(text2, i5, i6, j2, cVarB, cVarB2, cVarB3, j3, z, vVar, list, gVar, jVar, sVar, sQLiteStatementPrepare.isNull(14) ? null : sQLiteStatementPrepare.getText(14)));
                }
                i2 = 1;
                i = 0;
            }
        } finally {
            sQLiteStatementPrepare.close();
        }
    }
}
