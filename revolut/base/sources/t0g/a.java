package t0g;

import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.sqlite.SQLiteConnection;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f267021a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f267022b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f267023c;

    public /* synthetic */ a(c cVar, ArrayList arrayList, int i) {
        this.f267021a = i;
        this.f267022b = cVar;
        this.f267023c = arrayList;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        SQLiteConnection sQLiteConnection = (SQLiteConnection) obj2;
        switch (this.f267021a) {
            case 0:
                c cVar = this.f267022b;
                cVar.getClass();
                ArrayList bookings = this.f267023c;
                Intrinsics.checkNotNullParameter(bookings, "bookings");
                RoomDatabase roomDatabase = cVar.f267025a;
                DBUtil.performBlocking(roomDatabase, false, true, new szb.g(13));
                DBUtil.performBlocking(roomDatabase, false, true, new a(cVar, bookings, 1));
                return Unit.f186387a;
            default:
                this.f267022b.f267026b.insert(sQLiteConnection, (Iterable) this.f267023c);
                return null;
        }
    }
}
