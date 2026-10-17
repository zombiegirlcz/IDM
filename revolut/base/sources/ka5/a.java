package ka5;

import androidx.room.RoomOpenDelegate;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;
import com.revolut.feature.credit.post_termination_plan.impl.database.PostTerminationPlanDatabase_Impl;
import java.util.HashMap;
import java.util.HashSet;
import prk.o;

/* JADX INFO: loaded from: classes21.dex */
public final class a extends RoomOpenDelegate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PostTerminationPlanDatabase_Impl f182433a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(PostTerminationPlanDatabase_Impl postTerminationPlanDatabase_Impl) {
        super(1, "852f70fed5929ff863a62714dd9dbf90", "331cbec32956ea2f4b74d6c6f5f2cd25");
        this.f182433a = postTerminationPlanDatabase_Impl;
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void createAllTables(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `post_termination_plan` (`planId` TEXT NOT NULL, `type` TEXT NOT NULL, `currency` TEXT NOT NULL, `amountDue` INTEGER NOT NULL, `discountedAmount` INTEGER, `leftToRepay` INTEGER, `repaymentDay` INTEGER, `remainingRepayments` INTEGER NOT NULL, `status` TEXT NOT NULL, `minimumRepayment` INTEGER NOT NULL, `maximumRepayment` INTEGER NOT NULL, `suggestedRepayment` INTEGER, PRIMARY KEY(`planId`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        SQLite.execSQL(sQLiteConnection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '852f70fed5929ff863a62714dd9dbf90')");
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void dropAllTables(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `post_termination_plan`");
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void onCreate(SQLiteConnection sQLiteConnection) {
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void onOpen(SQLiteConnection sQLiteConnection) {
        int i = PostTerminationPlanDatabase_Impl.f70665j;
        this.f182433a.internalInitInvalidationTracker(sQLiteConnection);
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void onPostMigrate(SQLiteConnection sQLiteConnection) {
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void onPreMigrate(SQLiteConnection sQLiteConnection) {
        DBUtil.dropFtsSyncTriggers(sQLiteConnection);
    }

    @Override // androidx.room.RoomOpenDelegate
    public final RoomOpenDelegate.ValidationResult onValidateSchema(SQLiteConnection sQLiteConnection) {
        HashMap map = new HashMap(12);
        map.put("planId", new TableInfo.Column("planId", "TEXT", true, 1, null, 1));
        map.put("type", new TableInfo.Column("type", "TEXT", true, 0, null, 1));
        map.put("currency", new TableInfo.Column("currency", "TEXT", true, 0, null, 1));
        map.put("amountDue", new TableInfo.Column("amountDue", "INTEGER", true, 0, null, 1));
        map.put("discountedAmount", new TableInfo.Column("discountedAmount", "INTEGER", false, 0, null, 1));
        map.put("leftToRepay", new TableInfo.Column("leftToRepay", "INTEGER", false, 0, null, 1));
        map.put("repaymentDay", new TableInfo.Column("repaymentDay", "INTEGER", false, 0, null, 1));
        map.put("remainingRepayments", new TableInfo.Column("remainingRepayments", "INTEGER", true, 0, null, 1));
        map.put("status", new TableInfo.Column("status", "TEXT", true, 0, null, 1));
        map.put("minimumRepayment", new TableInfo.Column("minimumRepayment", "INTEGER", true, 0, null, 1));
        map.put("maximumRepayment", new TableInfo.Column("maximumRepayment", "INTEGER", true, 0, null, 1));
        TableInfo tableInfo = new TableInfo("post_termination_plan", map, o.s(map, "suggestedRepayment", new TableInfo.Column("suggestedRepayment", "INTEGER", false, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo2 = TableInfo.read(sQLiteConnection, "post_termination_plan");
        return !tableInfo.equals(tableInfo2) ? new RoomOpenDelegate.ValidationResult(false, o.o("post_termination_plan(com.revolut.feature.credit.post_termination_plan.impl.database.entity.PostTerminationPlanDetailsEntity).\n Expected:\n", tableInfo, "\n Found:\n", tableInfo2)) : new RoomOpenDelegate.ValidationResult(true, null);
    }
}
