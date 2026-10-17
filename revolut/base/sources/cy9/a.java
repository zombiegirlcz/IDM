package cy9;

import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.sqlite.SQLiteConnection;
import cw7.j;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f110061a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f110062b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f110063c;

    public /* synthetic */ a(b bVar, ArrayList arrayList, int i) {
        this.f110061a = i;
        this.f110062b = bVar;
        this.f110063c = arrayList;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        SQLiteConnection sQLiteConnection = (SQLiteConnection) obj2;
        switch (this.f110061a) {
            case 0:
                b bVar = this.f110062b;
                bVar.getClass();
                ArrayList settings = this.f110063c;
                Intrinsics.checkNotNullParameter(settings, "settings");
                RoomDatabase roomDatabase = bVar.f110064a;
                DBUtil.performBlocking(roomDatabase, false, true, new j(16));
                DBUtil.performBlocking(roomDatabase, false, true, new a(bVar, settings, 1));
                return Unit.f186387a;
            default:
                this.f110062b.f110065b.insert(sQLiteConnection, (Iterable) this.f110063c);
                return null;
        }
    }
}
