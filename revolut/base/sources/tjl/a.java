package tjl;

import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.sqlite.SQLiteConnection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import tif.g;
import vjl.i;
import zhm.d0;
import zhm.w;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f271803a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f271804b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f271805c;

    public /* synthetic */ a(b bVar, ArrayList arrayList, int i) {
        this.f271803a = i;
        this.f271804b = bVar;
        this.f271805c = arrayList;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        SQLiteConnection sQLiteConnection = (SQLiteConnection) obj2;
        switch (this.f271803a) {
            case 0:
                b bVar = this.f271804b;
                bVar.getClass();
                ArrayList clients = this.f271805c;
                Intrinsics.checkNotNullParameter(clients, "clients");
                ArrayList arrayList = new ArrayList(w.t(clients, 10));
                Iterator it8 = clients.iterator();
                while (it8.hasNext()) {
                    arrayList.add(((i) it8.next()).f289811a);
                }
                Set setI1 = d0.i1(arrayList);
                RoomDatabase roomDatabase = bVar.f271806a;
                List list = (List) DBUtil.performBlocking(roomDatabase, true, false, new g(14));
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : list) {
                    if (!setI1.contains((String) obj3)) {
                        arrayList2.add(obj3);
                    }
                }
                if (!arrayList2.isEmpty()) {
                    DBUtil.performBlocking(roomDatabase, false, true, new a54.c(15, com.google.android.gms.internal.mlkit_vision_face.a.u(arrayList2, p.a.s("DELETE FROM consented_client WHERE id IN ("), ")"), arrayList2));
                }
                DBUtil.performBlocking(roomDatabase, false, true, new a(bVar, clients, 1));
                return Unit.f186387a;
            default:
                this.f271804b.f271807b.insert(sQLiteConnection, (Iterable) this.f271805c);
                return null;
        }
    }
}
