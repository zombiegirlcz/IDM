package wxf;

import androidx.collection.ArrayMap;
import androidx.room.RoomDatabase;
import androidx.room.util.RelationUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.room.util.StringUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.revolut.feature.travel.common.impl.database.TravelDatabase;
import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f300946a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b21.a f300948c = new b21.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t0g.b f300947b = new t0g.b(this, 16);
    public final t0g.b d = new t0g.b(17);

    public j(TravelDatabase travelDatabase) {
        this.f300946a = travelDatabase;
    }

    public final void a(SQLiteConnection sQLiteConnection, ArrayMap arrayMap) {
        ArrayList arrayList;
        Set<String> setKeySet = arrayMap.keySet();
        if (setKeySet.isEmpty()) {
            return;
        }
        if (arrayMap.getSize() > 999) {
            RelationUtil.recursiveFetchArrayMap(arrayMap, true, new wwa.a(this, sQLiteConnection, 9));
            return;
        }
        StringBuilder sbS = p.a.s("SELECT `id`,`tripId`,`name`,`type`,`product` FROM `travel_trip_destination` WHERE `tripId` IN (");
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
            int columnIndex = SQLiteStatementUtil.getColumnIndex(sQLiteStatementPrepare, "tripId");
            if (columnIndex == -1) {
                sQLiteStatementPrepare.close();
                return;
            }
            while (sQLiteStatementPrepare.step()) {
                String text = sQLiteStatementPrepare.isNull(columnIndex) ? null : sQLiteStatementPrepare.getText(columnIndex);
                if (text != null && (arrayList = (ArrayList) arrayMap.get(text)) != null) {
                    arrayList.add(new sxf.a(sQLiteStatementPrepare.isNull(0) ? null : sQLiteStatementPrepare.getText(0), sQLiteStatementPrepare.isNull(1) ? null : sQLiteStatementPrepare.getText(1), sQLiteStatementPrepare.isNull(2) ? null : sQLiteStatementPrepare.getText(2), sQLiteStatementPrepare.isNull(3) ? null : sQLiteStatementPrepare.getText(3), sQLiteStatementPrepare.isNull(4) ? null : sQLiteStatementPrepare.getText(4)));
                }
            }
        } finally {
            sQLiteStatementPrepare.close();
        }
    }
}
