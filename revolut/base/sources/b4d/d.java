package b4d;

import androidx.room.RoomDatabase;
import androidx.room.RoomRawQuery;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteStatement;
import androidx.sqlite.db.SimpleSQLiteQuery;
import com.revolut.feature.separate_favourites.item_data.impl.database.SeparateFavouritesItemDatabase;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes13.dex */
public final class d extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f12297a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ao.g f12298b = new ao.g(this, 1);

    public d(SeparateFavouritesItemDatabase separateFavouritesItemDatabase) {
        this.f12297a = separateFavouritesItemDatabase;
    }

    public static /* synthetic */ Unit f(d dVar, ArrayList arrayList) {
        super.e(arrayList);
        return Unit.f186387a;
    }

    @Override // b4d.b
    public final List a(SimpleSQLiteQuery simpleSQLiteQuery) {
        RoomRawQuery roomRawQuery = RoomSQLiteQuery.copyFrom(simpleSQLiteQuery).toRoomRawQuery();
        return (List) DBUtil.performBlocking(this.f12297a, true, false, new c(this, 0, roomRawQuery.getSql(), roomRawQuery));
    }

    @Override // b4d.b
    public final void c(List list) {
        list.getClass();
        DBUtil.performBlocking(this.f12297a, false, true, new as9.a(this, list, 26));
    }

    @Override // b4d.b
    public final void d(String str) {
        DBUtil.performBlocking(this.f12297a, false, true, new ak7.g(str, 22));
    }

    @Override // b4d.b
    public final void e(ArrayList arrayList) {
        DBUtil.performBlocking(this.f12297a, false, true, new as9.a(this, arrayList, 25));
    }

    public final c4d.a g(SQLiteStatement sQLiteStatement) {
        BigDecimal bigDecimal;
        DateTime dateTimeA;
        DateTime dateTimeA2;
        BigDecimal bigDecimal2;
        int columnIndex = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "id");
        int columnIndex2 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "from_id");
        int columnIndex3 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "from_name");
        int columnIndex4 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "from_type_key");
        int columnIndex5 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "to");
        int columnIndex6 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "target_rate");
        int columnIndex7 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "created_at");
        int columnIndex8 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "completed_at");
        int columnIndex9 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "type");
        int columnIndex10 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "note");
        int columnIndex11 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "frequency");
        int columnIndex12 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "percentage");
        int columnIndex13 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "time_range");
        String text = null;
        String text2 = (columnIndex == -1 || sQLiteStatement.isNull(columnIndex)) ? null : sQLiteStatement.getText(columnIndex);
        String text3 = (columnIndex2 == -1 || sQLiteStatement.isNull(columnIndex2)) ? null : sQLiteStatement.getText(columnIndex2);
        String text4 = (columnIndex3 == -1 || sQLiteStatement.isNull(columnIndex3)) ? null : sQLiteStatement.getText(columnIndex3);
        String text5 = (columnIndex4 == -1 || sQLiteStatement.isNull(columnIndex4)) ? null : sQLiteStatement.getText(columnIndex4);
        String text6 = (columnIndex5 == -1 || sQLiteStatement.isNull(columnIndex5)) ? null : sQLiteStatement.getText(columnIndex5);
        if (columnIndex6 == -1) {
            bigDecimal = null;
        } else {
            String text7 = sQLiteStatement.isNull(columnIndex6) ? null : sQLiteStatement.getText(columnIndex6);
            bigDecimal = text7 != null ? new BigDecimal(text7) : null;
        }
        if (columnIndex7 == -1) {
            dateTimeA = null;
        } else {
            dateTimeA = k4d.a.a(sQLiteStatement.isNull(columnIndex7) ? null : Long.valueOf(sQLiteStatement.getLong(columnIndex7)));
        }
        if (columnIndex8 == -1) {
            dateTimeA2 = null;
        } else {
            dateTimeA2 = k4d.a.a(sQLiteStatement.isNull(columnIndex8) ? null : Long.valueOf(sQLiteStatement.getLong(columnIndex8)));
        }
        String text8 = (columnIndex9 == -1 || sQLiteStatement.isNull(columnIndex9)) ? null : sQLiteStatement.getText(columnIndex9);
        String text9 = (columnIndex10 == -1 || sQLiteStatement.isNull(columnIndex10)) ? null : sQLiteStatement.getText(columnIndex10);
        String text10 = (columnIndex11 == -1 || sQLiteStatement.isNull(columnIndex11)) ? null : sQLiteStatement.getText(columnIndex11);
        if (columnIndex12 == -1) {
            bigDecimal2 = null;
        } else {
            String text11 = sQLiteStatement.isNull(columnIndex12) ? null : sQLiteStatement.getText(columnIndex12);
            bigDecimal2 = text11 != null ? new BigDecimal(text11) : null;
        }
        if (columnIndex13 != -1 && !sQLiteStatement.isNull(columnIndex13)) {
            text = sQLiteStatement.getText(columnIndex13);
        }
        return new c4d.a(text2, text3, text4, text5, text6, bigDecimal, dateTimeA, dateTimeA2, text8, text9, text10, bigDecimal2, text);
    }
}
