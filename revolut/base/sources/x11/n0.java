package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import org.jmrtd.cbeff.ISO781611;

/* JADX INFO: loaded from: classes.dex */
public final class n0 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final n0 f301938c = new n0();

    private n0() {
        super(133, ISO781611.CREATOR_OF_BIOMETRIC_REFERENCE_DATA);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        prk.o.B(supportSQLiteDatabase, "database", "\n                DROP INDEX IF EXISTS `index_rewards_transactions_cashback_dates_updated_date`\n            ", "\n                DROP INDEX IF EXISTS `index_rewards_transactions_cashback_state`\n            ", "\n            DROP TABLE IF EXISTS `rewards_transactions`\n        ");
    }
}
