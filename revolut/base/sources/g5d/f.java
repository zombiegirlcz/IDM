package g5d;

import androidx.room.util.SQLiteConnectionUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class f implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f140759a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f140760b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f140761c;
    public final /* synthetic */ String d;

    public /* synthetic */ f(int i, String str, String str2, long j2) {
        this.f140759a = i;
        this.f140760b = j2;
        this.f140761c = str;
        this.d = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        SQLiteStatement sQLiteStatementPrepare;
        switch (this.f140759a) {
            case 0:
                long j2 = this.f140760b;
                SQLiteConnection sQLiteConnection = (SQLiteConnection) obj2;
                sQLiteStatementPrepare = sQLiteConnection.prepare("\n        UPDATE air_tip_state\n        SET was_clicked = 1, expiration_date = ?\n        WHERE air_tip_id = ? AND air_tip_type = ? AND was_clicked = 0\n        ");
                try {
                    sQLiteStatementPrepare.bindLong(1, j2);
                    String str = this.f140761c;
                    if (str == null) {
                        sQLiteStatementPrepare.bindNull(2);
                    } else {
                        sQLiteStatementPrepare.bindText(2, str);
                    }
                    String str2 = this.d;
                    if (str2 == null) {
                        sQLiteStatementPrepare.bindNull(3);
                    } else {
                        sQLiteStatementPrepare.bindText(3, str2);
                    }
                    sQLiteStatementPrepare.step();
                    Integer numValueOf = Integer.valueOf(SQLiteConnectionUtil.getTotalChangedRows(sQLiteConnection));
                    sQLiteStatementPrepare.close();
                    return numValueOf;
                } finally {
                }
            default:
                long j3 = this.f140760b;
                SQLiteConnection sQLiteConnection2 = (SQLiteConnection) obj2;
                sQLiteStatementPrepare = sQLiteConnection2.prepare("\n        UPDATE air_tip_state\n        SET expiration_date = ?, has_animated = 1\n        WHERE air_tip_id = ? AND air_tip_type = ?\n        ");
                try {
                    sQLiteStatementPrepare.bindLong(1, j3);
                    String str3 = this.f140761c;
                    if (str3 == null) {
                        sQLiteStatementPrepare.bindNull(2);
                    } else {
                        sQLiteStatementPrepare.bindText(2, str3);
                    }
                    String str4 = this.d;
                    if (str4 == null) {
                        sQLiteStatementPrepare.bindNull(3);
                    } else {
                        sQLiteStatementPrepare.bindText(3, str4);
                    }
                    sQLiteStatementPrepare.step();
                    Integer numValueOf2 = Integer.valueOf(SQLiteConnectionUtil.getTotalChangedRows(sQLiteConnection2));
                    sQLiteStatementPrepare.close();
                    return numValueOf2;
                } finally {
                }
        }
    }
}
