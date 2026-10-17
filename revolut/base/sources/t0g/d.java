package t0g;

import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.sqlite.SQLiteConnection;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f267027a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f267028b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f267029c;

    public /* synthetic */ d(e eVar, ArrayList arrayList, int i) {
        this.f267027a = i;
        this.f267028b = eVar;
        this.f267029c = arrayList;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        SQLiteConnection sQLiteConnection = (SQLiteConnection) obj2;
        switch (this.f267027a) {
            case 0:
                e eVar = this.f267028b;
                eVar.getClass();
                ArrayList bookings = this.f267029c;
                Intrinsics.checkNotNullParameter(bookings, "bookings");
                RoomDatabase roomDatabase = eVar.f267030a;
                DBUtil.performBlocking(roomDatabase, false, true, new szb.g(14));
                DBUtil.performBlocking(roomDatabase, false, true, new d(eVar, bookings, 1));
                return Unit.f186387a;
            default:
                this.f267028b.f267031b.insert(sQLiteConnection, (Iterable) this.f267029c);
                return null;
        }
    }
}
