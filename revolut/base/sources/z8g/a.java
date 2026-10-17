package z8g;

import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.sqlite.SQLiteConnection;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import z55.w;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f320082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f320083b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f320084c;

    public /* synthetic */ a(b bVar, ArrayList arrayList, int i) {
        this.f320082a = i;
        this.f320083b = bVar;
        this.f320084c = arrayList;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        SQLiteConnection sQLiteConnection = (SQLiteConnection) obj2;
        switch (this.f320082a) {
            case 0:
                b bVar = this.f320083b;
                bVar.getClass();
                ArrayList bookings = this.f320084c;
                Intrinsics.checkNotNullParameter(bookings, "bookings");
                RoomDatabase roomDatabase = bVar.f320085a;
                DBUtil.performBlocking(roomDatabase, false, true, new w(19));
                DBUtil.performBlocking(roomDatabase, false, true, new a(bVar, bookings, 1));
                return Unit.f186387a;
            default:
                this.f320083b.f320086b.insert(sQLiteConnection, (Iterable) this.f320084c);
                return null;
        }
    }
}
