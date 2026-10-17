package d1a;

import aim.f;
import aim.k;
import android.database.Cursor;
import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import c1a.c;
import com.google.gson.reflect.TypeToken;
import com.revolut.data.utils.gson.GsonHolder;
import com.revolut.feature.payments.splitbill.models.recurringsplit.RecurringSplitParticipant;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kg.o;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import zhm.w;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f110614c = new a();
    public static final c f = new c();

    private a() {
        super(2, 3);
    }

    public static f a(SupportSQLiteDatabase supportSQLiteDatabase) throws IOException {
        Cursor cursorQuery = supportSQLiteDatabase.query("SELECT `id`, `participants` FROM `recurring_split`");
        try {
            f builder = new f();
            while (cursorQuery.moveToNext()) {
                Lazy lazy = GsonHolder.f60253a;
                String string = cursorQuery.getString(1);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                o oVarA = GsonHolder.a();
                Type type = new TypeToken<List<? extends String>>() { // from class: com.revolut.feature.payments.splitbill.impl.data.recurringsplit.database.migration.MigrationV2V3ParticipantsToSplits$readParticipantsById$lambda$0$0$$inlined$fromJson$1
                }.getType();
                Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                Object objD = oVarA.d(string, type);
                Intrinsics.checkNotNullExpressionValue(objD, "fromJson(...)");
                Iterable iterable = (Iterable) objD;
                ArrayList arrayList = new ArrayList(w.t(iterable, 10));
                Iterator it8 = iterable.iterator();
                while (it8.hasNext()) {
                    arrayList.add(new RecurringSplitParticipant((String) it8.next(), null));
                }
                if (!arrayList.isEmpty()) {
                    String string2 = cursorQuery.getString(0);
                    Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                    builder.put(string2, arrayList);
                }
            }
            Intrinsics.checkNotNullParameter(builder, "builder");
            f fVarB = builder.b();
            cursorQuery.close();
            return fVarB;
        } finally {
        }
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase db8) {
        Intrinsics.checkNotNullParameter(db8, "db");
        db8.beginTransaction();
        try {
            f fVarA = a(db8);
            db8.execSQL("CREATE TABLE IF NOT EXISTS `recurring_split_migrated` (`id` TEXT NOT NULL, `state` TEXT NOT NULL, `participants_splits` TEXT NOT NULL, `comment` TEXT, `created_date` INTEGER NOT NULL, `updated_date` INTEGER NOT NULL, `source_type` TEXT NOT NULL, `source_reference_id` TEXT NOT NULL, PRIMARY KEY(`id`))");
            db8.execSQL("INSERT INTO `recurring_split_migrated` (`id`, `state`, `participants_splits`, `comment`, `created_date`, `updated_date`, `source_type`, `source_reference_id`) SELECT `id`, `state`, '[]', `comment`, `created_date`, `updated_date`, `source_type`, `source_reference_id` FROM `recurring_split`");
            for (Map.Entry entry : (k) fVarA.entrySet()) {
                String str = (String) entry.getKey();
                List participantsSplits = (List) entry.getValue();
                f.getClass();
                Intrinsics.checkNotNullParameter(participantsSplits, "participantsSplits");
                String strK = GsonHolder.a().k(participantsSplits);
                Intrinsics.checkNotNullExpressionValue(strK, "toJson(...)");
                db8.execSQL("UPDATE `recurring_split_migrated` SET `participants_splits` = ? WHERE `id` = ?", new String[]{strK, str});
            }
            db8.execSQL("DROP TABLE `recurring_split`");
            db8.execSQL("ALTER TABLE `recurring_split_migrated` RENAME TO `recurring_split`");
            db8.setTransactionSuccessful();
            db8.endTransaction();
        } catch (Throwable th10) {
            db8.endTransaction();
            throw th10;
        }
    }
}
