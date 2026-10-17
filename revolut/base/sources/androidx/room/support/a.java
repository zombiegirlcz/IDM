package androidx.room.support;

import androidx.room.support.AutoClosingRoomOpenHelper;
import androidx.sqlite.db.SupportSQLiteStatement;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes16.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7694a;

    public /* synthetic */ a(int i) {
        this.f7694a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        SupportSQLiteStatement supportSQLiteStatement = (SupportSQLiteStatement) obj2;
        switch (this.f7694a) {
            case 0:
                return Integer.valueOf(AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteStatement.executeUpdateDelete$lambda$1(supportSQLiteStatement));
            case 1:
                return Long.valueOf(AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteStatement.executeInsert$lambda$2(supportSQLiteStatement));
            default:
                return AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteStatement.execute$lambda$0(supportSQLiteStatement);
        }
    }
}
