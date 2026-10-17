package u11;

import android.content.Context;
import com.revolut.data.database.AppRoomDatabase;
import kotlin.jvm.internal.Intrinsics;
import od0.e;

/* JADX INFO: loaded from: classes20.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f276325a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AppRoomDatabase f276326b;

    public a(Context context, AppRoomDatabase appRoomDatabase) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appRoomDatabase, "appRoomDatabase");
        this.f276325a = context;
        this.f276326b = appRoomDatabase;
    }

    @Override // od0.e
    public final void clear() {
        AppRoomDatabase.INSTANCE.getClass();
        Context context = this.f276325a;
        Intrinsics.checkNotNullParameter(context, "context");
        AppRoomDatabase database = this.f276326b;
        Intrinsics.checkNotNullParameter(database, "database");
        ce0.a.a(context, "revolut_app_room_db", database);
    }
}
