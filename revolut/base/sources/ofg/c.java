package ofg;

import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.sqlite.SQLiteConnection;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import obg.q;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f224836a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f224837b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f224838c;

    public /* synthetic */ c(d dVar, ArrayList arrayList, int i) {
        this.f224836a = i;
        this.f224837b = dVar;
        this.f224838c = arrayList;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        SQLiteConnection sQLiteConnection = (SQLiteConnection) obj2;
        switch (this.f224836a) {
            case 0:
                d dVar = this.f224837b;
                dVar.getClass();
                ArrayList airlines = this.f224838c;
                Intrinsics.checkNotNullParameter(airlines, "airlines");
                RoomDatabase roomDatabase = dVar.f224839a;
                DBUtil.performBlocking(roomDatabase, false, true, new q(26));
                DBUtil.performBlocking(roomDatabase, false, true, new c(dVar, airlines, 1));
                return Unit.f186387a;
            default:
                this.f224837b.f224840b.insert(sQLiteConnection, (Iterable) this.f224838c);
                return null;
        }
    }
}
