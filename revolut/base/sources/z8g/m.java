package z8g;

import a9g.q0;
import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.sqlite.SQLiteConnection;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import z55.w;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class m implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f320110a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f320111b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f320112c;

    public /* synthetic */ m(n nVar, ArrayList arrayList, int i) {
        this.f320110a = i;
        this.f320111b = nVar;
        this.f320112c = arrayList;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        SQLiteConnection sQLiteConnection = (SQLiteConnection) obj2;
        switch (this.f320110a) {
            case 0:
                n nVar = this.f320111b;
                nVar.getClass();
                ArrayList promotionsWithLocations = this.f320112c;
                Intrinsics.checkNotNullParameter(promotionsWithLocations, "promotionsWithLocations");
                RoomDatabase roomDatabase = nVar.f320113a;
                DBUtil.performBlocking(roomDatabase, false, true, new w(25));
                ArrayList arrayList = new ArrayList(zhm.w.t(promotionsWithLocations, 10));
                Iterator it8 = promotionsWithLocations.iterator();
                while (it8.hasNext()) {
                    arrayList.add(((q0) it8.next()).f2565b);
                }
                DBUtil.performBlocking(roomDatabase, false, true, new m(nVar, arrayList, 2));
                ArrayList arrayList2 = new ArrayList(zhm.w.t(promotionsWithLocations, 10));
                Iterator it9 = promotionsWithLocations.iterator();
                while (it9.hasNext()) {
                    arrayList2.add(((q0) it9.next()).f2564a);
                }
                DBUtil.performBlocking(roomDatabase, false, true, new m(nVar, arrayList2, 1));
                break;
            case 1:
                this.f320111b.f320114b.insert(sQLiteConnection, (Iterable) this.f320112c);
                break;
            default:
                this.f320111b.f320115c.insert(sQLiteConnection, (Iterable) this.f320112c);
                break;
        }
        return null;
    }
}
