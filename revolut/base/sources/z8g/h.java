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
public final /* synthetic */ class h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f320099a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f320100b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f320101c;

    public /* synthetic */ h(j jVar, ArrayList arrayList, int i) {
        this.f320099a = i;
        this.f320100b = jVar;
        this.f320101c = arrayList;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        SQLiteConnection sQLiteConnection = (SQLiteConnection) obj2;
        switch (this.f320099a) {
            case 0:
                j jVar = this.f320100b;
                jVar.getClass();
                ArrayList inventoryProviderList = this.f320101c;
                Intrinsics.checkNotNullParameter(inventoryProviderList, "inventoryProviderList");
                RoomDatabase roomDatabase = jVar.f320103a;
                DBUtil.performBlocking(roomDatabase, false, true, new w(23));
                DBUtil.performBlocking(roomDatabase, false, true, new h(jVar, inventoryProviderList, 1));
                return Unit.f186387a;
            default:
                this.f320100b.f320104b.insert(sQLiteConnection, (Iterable) this.f320101c);
                return null;
        }
    }
}
