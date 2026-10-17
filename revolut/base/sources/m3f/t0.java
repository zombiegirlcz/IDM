package m3f;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class t0 extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final t0 f202491c = new t0();

    private t0() {
        super(ModuleDescriptor.MODULE_VERSION, 142);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase db8) {
        Intrinsics.checkNotNullParameter(db8, "db");
        db8.execSQL("DROP table IF EXISTS `trading_fiat_instruments`");
    }
}
