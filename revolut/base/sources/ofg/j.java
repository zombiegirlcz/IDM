package ofg;

import androidx.collection.ArrayMap;
import androidx.room.RoomDatabase;
import androidx.room.util.RelationUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.room.util.StringUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.revolut.feature.travel.miles.impl.database.TravelMilesDatabase;
import java.util.ArrayList;
import java.util.Set;
import qfg.o;

/* JADX INFO: loaded from: classes9.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f224853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nvg.c f224854b = new nvg.c();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f224855c = new i(0);

    public j(TravelMilesDatabase travelMilesDatabase) {
        this.f224853a = travelMilesDatabase;
    }

    public final void a(SQLiteConnection sQLiteConnection, ArrayMap arrayMap) {
        ArrayList arrayList;
        Set<String> setKeySet = arrayMap.keySet();
        if (setKeySet.isEmpty()) {
            return;
        }
        if (arrayMap.getSize() > 999) {
            RelationUtil.recursiveFetchArrayMap(arrayMap, true, new a(this, sQLiteConnection, 4));
            return;
        }
        StringBuilder sbS = p.a.s("SELECT `id`,`type`,`idType`,`source`,`topUpId` FROM `travel_miles_transactions` WHERE `topUpId` IN (");
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
            int columnIndex = SQLiteStatementUtil.getColumnIndex(sQLiteStatementPrepare, "topUpId");
            if (columnIndex == -1) {
                sQLiteStatementPrepare.close();
                return;
            }
            while (sQLiteStatementPrepare.step()) {
                String text = sQLiteStatementPrepare.isNull(columnIndex) ? null : sQLiteStatementPrepare.getText(columnIndex);
                if (text != null && (arrayList = (ArrayList) arrayMap.get(text)) != null) {
                    arrayList.add(new o(sQLiteStatementPrepare.isNull(0) ? null : sQLiteStatementPrepare.getText(0), sQLiteStatementPrepare.isNull(1) ? null : sQLiteStatementPrepare.getText(1), sQLiteStatementPrepare.isNull(2) ? null : sQLiteStatementPrepare.getText(2), sQLiteStatementPrepare.isNull(3) ? null : sQLiteStatementPrepare.getText(3), sQLiteStatementPrepare.isNull(4) ? null : sQLiteStatementPrepare.getText(4)));
                }
            }
        } finally {
            sQLiteStatementPrepare.close();
        }
    }
}
