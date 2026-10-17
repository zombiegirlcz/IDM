package r10;

import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.sqlite.SQLiteConnection;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class s implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f250854a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f250855b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f250856c;

    public /* synthetic */ s(t tVar, ArrayList arrayList, int i) {
        this.f250854a = i;
        this.f250855b = tVar;
        this.f250856c = arrayList;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        SQLiteConnection sQLiteConnection = (SQLiteConnection) obj2;
        switch (this.f250854a) {
            case 0:
                ArrayList feeds = this.f250856c;
                Intrinsics.checkNotNullParameter(feeds, "feeds");
                t tVar = this.f250855b;
                RoomDatabase roomDatabase = (RoomDatabase) tVar.f250857a;
                DBUtil.performBlocking(roomDatabase, false, true, new r0e.i(4));
                DBUtil.performBlocking(roomDatabase, false, true, new s(tVar, feeds, 1));
                return Unit.f186387a;
            default:
                ((ofg.i) this.f250855b.f250858b).insert(sQLiteConnection, (Iterable) this.f250856c);
                return null;
        }
    }
}
