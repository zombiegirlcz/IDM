package gi9;

import androidx.collection.ArrayMap;
import androidx.room.RoomDatabase;
import androidx.room.util.RelationUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.room.util.StringUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.google.gson.reflect.TypeToken;
import com.revolut.data.utils.gson.GsonHolder;
import com.revolut.feature.pay_later.impl.database.PayLaterDatabase;
import dcl.g0;
import dcl.s0;
import hi9.l;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kg.o;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f144100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s0 f144101b = new s0(this, 10);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s0 f144102c = new s0(this, 11);
    public final s0 d = new s0(12);
    public final s0 e = new s0(13);
    public final s0 f = new s0(14);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final s0 f144103g = new s0(15);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final g0 f144104h = new g0(4);

    public c(PayLaterDatabase payLaterDatabase) {
        this.f144100a = payLaterDatabase;
    }

    public final void a(SQLiteConnection sQLiteConnection, ArrayMap arrayMap) {
        Set<String> setKeySet = arrayMap.keySet();
        if (setKeySet.isEmpty()) {
            return;
        }
        if (arrayMap.getSize() > 999) {
            RelationUtil.recursiveFetchArrayMap(arrayMap, false, new b(this, sQLiteConnection, 0));
            return;
        }
        StringBuilder sbS = p.a.s("SELECT `planId`,`seenRescheduleVersion` FROM `plan_preferences` WHERE `planId` IN (");
        StringUtil.appendPlaceholders(sbS, setKeySet.size());
        sbS.append(")");
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(sbS.toString());
        int i = 1;
        for (String str : setKeySet) {
            if (str == null) {
                sQLiteStatementPrepare.bindNull(i);
            } else {
                sQLiteStatementPrepare.bindText(i, str);
            }
            i++;
        }
        try {
            int columnIndex = SQLiteStatementUtil.getColumnIndex(sQLiteStatementPrepare, "planId");
            if (columnIndex == -1) {
                return;
            }
            while (sQLiteStatementPrepare.step()) {
                Integer numValueOf = null;
                String text = sQLiteStatementPrepare.isNull(columnIndex) ? null : sQLiteStatementPrepare.getText(columnIndex);
                if (text != null && arrayMap.containsKey(text)) {
                    String text2 = sQLiteStatementPrepare.isNull(0) ? null : sQLiteStatementPrepare.getText(0);
                    if (!sQLiteStatementPrepare.isNull(1)) {
                        numValueOf = Integer.valueOf((int) sQLiteStatementPrepare.getLong(1));
                    }
                    arrayMap.put(text, new l(text2, numValueOf));
                }
            }
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    public final void b(SQLiteConnection sQLiteConnection, ArrayMap arrayMap) {
        ArrayList arrayList;
        Set<String> setKeySet = arrayMap.keySet();
        if (setKeySet.isEmpty()) {
            return;
        }
        int i = 1;
        if (arrayMap.getSize() > 999) {
            RelationUtil.recursiveFetchArrayMap(arrayMap, true, new b(this, sQLiteConnection, 1));
            return;
        }
        StringBuilder sbS = p.a.s("SELECT `planId`,`index`,`dueDate`,`state`,`currency`,`paidDateTime`,`transactionIds`,`amount`,`repaidAmount`,`fee`,`repaidFee`,`lateInterest`,`repaidLateInterest`,`isOverLimit` FROM `repayments` WHERE `planId` IN (");
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
            int columnIndex = SQLiteStatementUtil.getColumnIndex(sQLiteStatementPrepare, "planId");
            if (columnIndex == -1) {
                return;
            }
            while (sQLiteStatementPrepare.step()) {
                List list = null;
                String text = sQLiteStatementPrepare.isNull(columnIndex) ? null : sQLiteStatementPrepare.getText(columnIndex);
                if (text != null && (arrayList = (ArrayList) arrayMap.get(text)) != null) {
                    String text2 = sQLiteStatementPrepare.isNull(0) ? null : sQLiteStatementPrepare.getText(0);
                    int i3 = (int) sQLiteStatementPrepare.getLong(i);
                    long j2 = sQLiteStatementPrepare.getLong(2);
                    String text3 = sQLiteStatementPrepare.isNull(3) ? null : sQLiteStatementPrepare.getText(3);
                    String text4 = sQLiteStatementPrepare.isNull(4) ? null : sQLiteStatementPrepare.getText(4);
                    Long lValueOf = sQLiteStatementPrepare.isNull(5) ? null : Long.valueOf(sQLiteStatementPrepare.getLong(5));
                    String text5 = sQLiteStatementPrepare.isNull(6) ? null : sQLiteStatementPrepare.getText(6);
                    if (text5 != null) {
                        o oVarA = GsonHolder.a();
                        Type type = new TypeToken<List<? extends String>>() { // from class: com.revolut.feature.pay_later.impl.database.converters.PayLaterListStringConverter$fromJson$stub_for_inlining$$inlined$fromJson$1
                        }.getType();
                        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                        Object objD = oVarA.d(text5, type);
                        Intrinsics.checkNotNullExpressionValue(objD, "fromJson(...)");
                        list = (List) objD;
                    }
                    arrayList.add(new hi9.a(text2, i3, j2, text3, text4, lValueOf, list, sQLiteStatementPrepare.getLong(7), sQLiteStatementPrepare.getLong(8), sQLiteStatementPrepare.getLong(9), sQLiteStatementPrepare.getLong(10), sQLiteStatementPrepare.getLong(11), sQLiteStatementPrepare.getLong(12), ((int) sQLiteStatementPrepare.getLong(13)) != 0));
                }
                i = 1;
            }
        } finally {
            sQLiteStatementPrepare.close();
        }
    }
}
