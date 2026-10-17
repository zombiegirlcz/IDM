package wxf;

import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.sqlite.SQLiteConnection;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import wvg.r1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class i implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f300943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f300944b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f300945c;

    public /* synthetic */ i(j jVar, List list, int i) {
        this.f300943a = i;
        this.f300944b = jVar;
        this.f300945c = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        SQLiteConnection sQLiteConnection = (SQLiteConnection) obj2;
        switch (this.f300943a) {
            case 0:
                j jVar = this.f300944b;
                jVar.getClass();
                List<sxf.d> tripsWithDestinations = this.f300945c;
                Intrinsics.checkNotNullParameter(tripsWithDestinations, "tripsWithDestinations");
                RoomDatabase roomDatabase = jVar.f300946a;
                DBUtil.performBlocking(roomDatabase, false, true, new r1(27));
                for (sxf.d dVar : tripsWithDestinations) {
                    DBUtil.performBlocking(roomDatabase, false, true, new wwa.a(jVar, dVar.f266483a, 8));
                    List list = dVar.f266484b;
                    list.getClass();
                    DBUtil.performBlocking(roomDatabase, false, true, new i(jVar, list, 1));
                }
                return Unit.f186387a;
            default:
                this.f300944b.d.insert(sQLiteConnection, (Iterable) this.f300945c);
                return null;
        }
    }
}
