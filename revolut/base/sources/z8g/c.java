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
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f320087a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f320088b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f320089c;

    public /* synthetic */ c(d dVar, ArrayList arrayList, int i) {
        this.f320087a = i;
        this.f320088b = dVar;
        this.f320089c = arrayList;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        SQLiteConnection sQLiteConnection = (SQLiteConnection) obj2;
        switch (this.f320087a) {
            case 0:
                d dVar = this.f320088b;
                dVar.getClass();
                ArrayList campaigns = this.f320089c;
                Intrinsics.checkNotNullParameter(campaigns, "campaigns");
                RoomDatabase roomDatabase = dVar.f320090a;
                DBUtil.performBlocking(roomDatabase, false, true, new w(21));
                DBUtil.performBlocking(roomDatabase, false, true, new c(dVar, campaigns, 1));
                return Unit.f186387a;
            default:
                this.f320088b.f320091b.insert(sQLiteConnection, (Iterable) this.f320089c);
                return null;
        }
    }
}
