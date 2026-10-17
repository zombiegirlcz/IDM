package os6;

import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.sqlite.SQLiteConnection;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import or4.h;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f229237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f229238b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f229239c;

    public /* synthetic */ a(b bVar, ArrayList arrayList, int i) {
        this.f229237a = i;
        this.f229238b = bVar;
        this.f229239c = arrayList;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        SQLiteConnection sQLiteConnection = (SQLiteConnection) obj2;
        switch (this.f229237a) {
            case 0:
                b bVar = this.f229238b;
                bVar.getClass();
                ArrayList events = this.f229239c;
                Intrinsics.checkNotNullParameter(events, "events");
                RoomDatabase roomDatabase = bVar.f229240a;
                DBUtil.performBlocking(roomDatabase, false, true, new h(22));
                return Unit.f186387a;
            default:
                return this.f229238b.f229241b.insertAndReturnIdsList(sQLiteConnection, this.f229239c);
        }
    }
}
