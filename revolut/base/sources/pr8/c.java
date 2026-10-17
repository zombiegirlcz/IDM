package pr8;

import androidx.room.RoomDatabase;
import androidx.room.RoomRawQuery;
import androidx.room.RoomSQLiteQuery;
import androidx.room.RxRoom;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteStatement;
import androidx.sqlite.db.SimpleSQLiteQuery;
import ay1.f;
import com.revolut.feature.junior_transfer_request.impl.db.JuniorTransferRequestDatabase;
import efm.d0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import om4.l0;
import pp5.d;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f238967a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final or8.a f238969c = new or8.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f238968b = new f(this, 16);

    public c(JuniorTransferRequestDatabase juniorTransferRequestDatabase) {
        this.f238967a = juniorTransferRequestDatabase;
    }

    public static /* synthetic */ Unit f(c cVar, ArrayList arrayList) {
        super.e(arrayList);
        return Unit.f186387a;
    }

    @Override // pr8.a
    public final void a(ArrayList arrayList) {
        DBUtil.performBlocking(this.f238967a, false, true, new a54.c(11, com.google.android.gms.internal.mlkit_vision_face.a.u(arrayList, p.a.s("DELETE from junior_transfer_request where id IN ("), ")"), arrayList));
    }

    @Override // pr8.a
    public final d0 b(SimpleSQLiteQuery simpleSQLiteQuery) {
        RoomRawQuery roomRawQuery = RoomSQLiteQuery.copyFrom(simpleSQLiteQuery).toRoomRawQuery();
        return RxRoom.createSingle(this.f238967a, true, false, new l0(this, 26, roomRawQuery.getSql(), roomRawQuery));
    }

    @Override // pr8.a
    public final List c() {
        return (List) DBUtil.performBlocking(this.f238967a, true, false, new d(this, 12));
    }

    @Override // pr8.a
    public final void d(ArrayList arrayList) {
        DBUtil.performBlocking(this.f238967a, false, true, new b(this, arrayList, 0));
    }

    @Override // pr8.a
    public final void e(ArrayList arrayList) {
        DBUtil.performBlocking(this.f238967a, false, true, new b(this, arrayList, 1));
    }

    public final xr8.b g(SQLiteStatement sQLiteStatement) {
        String text;
        c cVar;
        xr8.a aVarA;
        xr8.a aVarA2;
        int i;
        xr8.c cVar2;
        jo3.b bVar;
        int columnIndex = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "id");
        int columnIndex2 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "amount");
        int columnIndex3 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "currency");
        int columnIndex4 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "transactionId");
        int columnIndex5 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "transactionWalletId");
        int columnIndex6 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "transactionPocketId");
        int columnIndex7 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "state");
        int columnIndex8 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "createdDate");
        int columnIndex9 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "comment");
        int columnIndex10 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "gifUrl");
        int columnIndex11 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "sender");
        int columnIndex12 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "recipient");
        int columnIndex13 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "reason_code");
        int columnIndex14 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "reason_limit_amount");
        int columnIndex15 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "reason_limit_currency");
        String text2 = null;
        String text3 = (columnIndex == -1 || sQLiteStatement.isNull(columnIndex)) ? null : sQLiteStatement.getText(columnIndex);
        long j2 = columnIndex2 == -1 ? 0L : sQLiteStatement.getLong(columnIndex2);
        String text4 = (columnIndex3 == -1 || sQLiteStatement.isNull(columnIndex3)) ? null : sQLiteStatement.getText(columnIndex3);
        String text5 = (columnIndex4 == -1 || sQLiteStatement.isNull(columnIndex4)) ? null : sQLiteStatement.getText(columnIndex4);
        String text6 = (columnIndex5 == -1 || sQLiteStatement.isNull(columnIndex5)) ? null : sQLiteStatement.getText(columnIndex5);
        String text7 = (columnIndex6 == -1 || sQLiteStatement.isNull(columnIndex6)) ? null : sQLiteStatement.getText(columnIndex6);
        String text8 = (columnIndex7 == -1 || sQLiteStatement.isNull(columnIndex7)) ? null : sQLiteStatement.getText(columnIndex7);
        long j3 = columnIndex8 == -1 ? 0L : sQLiteStatement.getLong(columnIndex8);
        String text9 = (columnIndex9 == -1 || sQLiteStatement.isNull(columnIndex9)) ? null : sQLiteStatement.getText(columnIndex9);
        if (columnIndex10 == -1 || sQLiteStatement.isNull(columnIndex10)) {
            cVar = this;
            text = null;
        } else {
            text = sQLiteStatement.getText(columnIndex10);
            cVar = this;
        }
        or8.a aVar = cVar.f238969c;
        if (columnIndex11 == -1) {
            aVarA = null;
        } else {
            aVarA = aVar.a(sQLiteStatement.isNull(columnIndex11) ? null : sQLiteStatement.getText(columnIndex11));
        }
        if (columnIndex12 == -1) {
            aVarA2 = null;
        } else {
            aVarA2 = aVar.a(sQLiteStatement.isNull(columnIndex12) ? null : sQLiteStatement.getText(columnIndex12));
        }
        if ((columnIndex13 == -1 || sQLiteStatement.isNull(columnIndex13)) && (columnIndex14 == -1 || sQLiteStatement.isNull(columnIndex14))) {
            i = columnIndex15;
            if (i == -1 || sQLiteStatement.isNull(i)) {
                cVar2 = null;
            }
            return new xr8.b(text3, j2, text4, text5, text6, text7, text8, j3, text9, text, aVarA, aVarA2, cVar2);
        }
        i = columnIndex15;
        String text10 = (columnIndex13 == -1 || sQLiteStatement.isNull(columnIndex13)) ? null : sQLiteStatement.getText(columnIndex13);
        if ((columnIndex14 == -1 || sQLiteStatement.isNull(columnIndex14)) && (i == -1 || sQLiteStatement.isNull(i))) {
            bVar = null;
        } else {
            long j5 = columnIndex14 != -1 ? sQLiteStatement.getLong(columnIndex14) : 0L;
            if (i != -1 && !sQLiteStatement.isNull(i)) {
                text2 = sQLiteStatement.getText(i);
            }
            bVar = new jo3.b(j5, text2);
        }
        cVar2 = new xr8.c(text10, bVar);
        return new xr8.b(text3, j2, text4, text5, text6, text7, text8, j3, text9, text, aVarA, aVarA2, cVar2);
    }
}
