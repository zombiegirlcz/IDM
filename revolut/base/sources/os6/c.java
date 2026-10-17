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
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f229243a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f229244b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f229245c;

    public /* synthetic */ c(d dVar, ArrayList arrayList, int i) {
        this.f229243a = i;
        this.f229244b = dVar;
        this.f229245c = arrayList;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        SQLiteConnection sQLiteConnection = (SQLiteConnection) obj2;
        switch (this.f229243a) {
            case 0:
                d dVar = this.f229244b;
                dVar.getClass();
                ArrayList profiles = this.f229245c;
                Intrinsics.checkNotNullParameter(profiles, "profiles");
                RoomDatabase roomDatabase = dVar.f229246a;
                DBUtil.performBlocking(roomDatabase, false, true, new h(23));
                return Unit.f186387a;
            default:
                return this.f229244b.f229247b.insertAndReturnIdsList(sQLiteConnection, this.f229245c);
        }
    }
}
