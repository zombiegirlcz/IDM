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
import vjl.q;
import zhm.d0;
import zhm.w;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f271809a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f271810b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f271811c;

    public /* synthetic */ c(d dVar, ArrayList arrayList, int i) {
        this.f271809a = i;
        this.f271810b = dVar;
        this.f271811c = arrayList;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        SQLiteConnection sQLiteConnection = (SQLiteConnection) obj2;
        switch (this.f271809a) {
            case 0:
                d dVar = this.f271810b;
                dVar.getClass();
                ArrayList accounts = this.f271811c;
                Intrinsics.checkNotNullParameter(accounts, "accounts");
                ArrayList arrayList = new ArrayList(w.t(accounts, 10));
                Iterator it8 = accounts.iterator();
                while (it8.hasNext()) {
                    arrayList.add(((q) it8.next()).f289820a);
                }
                Set setI1 = d0.i1(arrayList);
                RoomDatabase roomDatabase = dVar.f271812a;
                List list = (List) DBUtil.performBlocking(roomDatabase, true, false, new g(15));
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : list) {
                    if (!setI1.contains((String) obj3)) {
                        arrayList2.add(obj3);
                    }
                }
                if (!arrayList2.isEmpty()) {
                    DBUtil.performBlocking(roomDatabase, false, true, new a54.c(16, com.google.android.gms.internal.mlkit_vision_face.a.u(arrayList2, p.a.s("DELETE FROM user_info_account WHERE id IN ("), ")"), arrayList2));
                }
                DBUtil.performBlocking(roomDatabase, false, true, new c(dVar, accounts, 1));
                return Unit.f186387a;
            default:
                this.f271810b.f271813b.insert(sQLiteConnection, (Iterable) this.f271811c);
                return null;
        }
    }
}
