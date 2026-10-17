package ce0;

import android.content.Context;
import androidx.room.RoomDatabase;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile boolean f23327a;

    private a() {
    }

    public static void a(Context context, String dbName, RoomDatabase db8) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dbName, "dbName");
        Intrinsics.checkNotNullParameter(db8, "db");
        try {
            db8.close();
        } catch (Exception unused) {
        }
        context.deleteDatabase(dbName);
    }

    public static RoomDatabase b(Function0 builderFactory) {
        Intrinsics.checkNotNullParameter(builderFactory, "builderFactory");
        if (!f23327a) {
            synchronized (a.class) {
                try {
                    if (!f23327a) {
                        System.loadLibrary("sqlcipher");
                        f23327a = true;
                    }
                    Unit unit = Unit.f186387a;
                } catch (Throwable th10) {
                    throw th10;
                }
            }
        }
        return ((RoomDatabase.Builder) builderFactory.invoke()).addCallback(new i()).build();
    }
}
