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
public final /* synthetic */ class e implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f320092a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f320093b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f320094c;

    public /* synthetic */ e(f fVar, ArrayList arrayList, int i) {
        this.f320092a = i;
        this.f320093b = fVar;
        this.f320094c = arrayList;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        SQLiteConnection sQLiteConnection = (SQLiteConnection) obj2;
        switch (this.f320092a) {
            case 0:
                f fVar = this.f320093b;
                fVar.getClass();
                ArrayList dropoffs = this.f320094c;
                Intrinsics.checkNotNullParameter(dropoffs, "dropoffs");
                RoomDatabase roomDatabase = fVar.f320095a;
                DBUtil.performBlocking(roomDatabase, false, true, new w(22));
                DBUtil.performBlocking(roomDatabase, false, true, new e(fVar, dropoffs, 1));
                return Unit.f186387a;
            default:
                this.f320093b.f320096b.insert(sQLiteConnection, (Iterable) this.f320094c);
                return null;
        }
    }
}
