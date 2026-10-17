package z8g;

import a9g.n0;
import androidx.collection.ArrayMap;
import androidx.room.RoomDatabase;
import androidx.room.util.RelationUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.room.util.StringUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.revolut.feature.travel.hotels.impl.database.TravelHotelsDatabase;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f320113a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f320114b = new i(2);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f320115c = new i(this, 3);

    public n(TravelHotelsDatabase travelHotelsDatabase) {
        this.f320113a = travelHotelsDatabase;
    }

    public final void a(SQLiteConnection sQLiteConnection, ArrayMap arrayMap) {
        Set<String> setKeySet = arrayMap.keySet();
        if (setKeySet.isEmpty()) {
            return;
        }
        if (arrayMap.getSize() > 999) {
            RelationUtil.recursiveFetchArrayMap(arrayMap, false, new z1.c(this, sQLiteConnection, 29));
            return;
        }
        StringBuilder sbS = p.a.s("SELECT `id`,`type`,`name`,`description`,`imageUrl`,`country`,`propertyCount`,`coordinates`,`isDistrict`,`isPopular` FROM `hotels_location` WHERE `id` IN (");
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
            int columnIndex = SQLiteStatementUtil.getColumnIndex(sQLiteStatementPrepare, "id");
            if (columnIndex == -1) {
                return;
            }
            while (sQLiteStatementPrepare.step()) {
                String text = null;
                String text2 = sQLiteStatementPrepare.isNull(columnIndex) ? null : sQLiteStatementPrepare.getText(columnIndex);
                if (text2 != null && arrayMap.containsKey(text2)) {
                    String text3 = sQLiteStatementPrepare.isNull(0) ? null : sQLiteStatementPrepare.getText(0);
                    String text4 = sQLiteStatementPrepare.isNull(1) ? null : sQLiteStatementPrepare.getText(1);
                    String text5 = sQLiteStatementPrepare.isNull(2) ? null : sQLiteStatementPrepare.getText(2);
                    String text6 = sQLiteStatementPrepare.isNull(3) ? null : sQLiteStatementPrepare.getText(3);
                    String text7 = sQLiteStatementPrepare.isNull(4) ? null : sQLiteStatementPrepare.getText(4);
                    a9g.k kVarA = a9g.l.a(sQLiteStatementPrepare.isNull(5) ? null : sQLiteStatementPrepare.getText(5));
                    Integer numValueOf = sQLiteStatementPrepare.isNull(6) ? null : Integer.valueOf((int) sQLiteStatementPrepare.getLong(6));
                    if (!sQLiteStatementPrepare.isNull(7)) {
                        text = sQLiteStatementPrepare.getText(7);
                    }
                    arrayMap.put(text2, new n0(text3, text4, text5, text6, text7, kVarA, numValueOf, a9g.j.a(text), ((int) sQLiteStatementPrepare.getLong(8)) != 0, ((int) sQLiteStatementPrepare.getLong(9)) != 0));
                }
            }
        } finally {
            sQLiteStatementPrepare.close();
        }
    }
}
