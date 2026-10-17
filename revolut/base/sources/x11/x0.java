package x11;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class x0 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final x0 f302051c = new x0();

    private x0() {
        super(ModuleDescriptor.MODULE_VERSION, 142);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        database.execSQL("ALTER TABLE `transactions` ADD COLUMN `transferType` TEXT DEFAULT NULL");
    }
}
