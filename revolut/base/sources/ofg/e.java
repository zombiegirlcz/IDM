package ofg;

import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.sqlite.SQLiteConnection;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import obg.q;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class e implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f224841a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f224842b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f224843c;

    public /* synthetic */ e(g gVar, ArrayList arrayList, int i) {
        this.f224841a = i;
        this.f224842b = gVar;
        this.f224843c = arrayList;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        SQLiteConnection sQLiteConnection = (SQLiteConnection) obj2;
        switch (this.f224841a) {
            case 0:
                g gVar = this.f224842b;
                gVar.getClass();
                ArrayList accounts = this.f224843c;
                Intrinsics.checkNotNullParameter(accounts, "accounts");
                RoomDatabase roomDatabase = gVar.f224846a;
                DBUtil.performBlocking(roomDatabase, false, true, new q(27));
                DBUtil.performBlocking(roomDatabase, false, true, new e(gVar, accounts, 3));
                break;
            case 1:
                g gVar2 = this.f224842b;
                gVar2.getClass();
                ArrayList providers = this.f224843c;
                Intrinsics.checkNotNullParameter(providers, "providers");
                RoomDatabase roomDatabase2 = gVar2.f224846a;
                DBUtil.performBlocking(roomDatabase2, false, true, new q(28));
                DBUtil.performBlocking(roomDatabase2, false, true, new e(gVar2, providers, 2));
                break;
            case 2:
                this.f224842b.f224847b.insert(sQLiteConnection, (Iterable) this.f224843c);
                break;
            default:
                this.f224842b.f224848c.insert(sQLiteConnection, (Iterable) this.f224843c);
                break;
        }
        return null;
    }
}
