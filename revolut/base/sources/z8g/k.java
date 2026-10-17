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
public final /* synthetic */ class k implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f320105a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f320106b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f320107c;

    public /* synthetic */ k(l lVar, ArrayList arrayList, int i) {
        this.f320105a = i;
        this.f320106b = lVar;
        this.f320107c = arrayList;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        SQLiteConnection sQLiteConnection = (SQLiteConnection) obj2;
        switch (this.f320105a) {
            case 0:
                l lVar = this.f320106b;
                lVar.getClass();
                ArrayList locations = this.f320107c;
                Intrinsics.checkNotNullParameter(locations, "locations");
                RoomDatabase roomDatabase = lVar.f320108a;
                DBUtil.performBlocking(roomDatabase, false, true, new w(24));
                DBUtil.performBlocking(roomDatabase, false, true, new k(lVar, locations, 1));
                return Unit.f186387a;
            default:
                this.f320106b.f320109b.insert(sQLiteConnection, (Iterable) this.f320107c);
                return null;
        }
    }
}
