package ro5;

import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.sqlite.SQLiteConnection;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import rnd.k;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f255877a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f255878b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f255879c;

    public /* synthetic */ b(d dVar, ArrayList arrayList, int i) {
        this.f255877a = i;
        this.f255878b = dVar;
        this.f255879c = arrayList;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        SQLiteConnection sQLiteConnection = (SQLiteConnection) obj2;
        switch (this.f255877a) {
            case 0:
                d dVar = this.f255878b;
                dVar.getClass();
                ArrayList cryptoWallets = this.f255879c;
                Intrinsics.checkNotNullParameter(cryptoWallets, "cryptoWallets");
                RoomDatabase roomDatabase = dVar.f255882a;
                DBUtil.performBlocking(roomDatabase, false, true, new k(18));
                DBUtil.performBlocking(roomDatabase, false, true, new b(dVar, cryptoWallets, 2));
                break;
            case 1:
                this.f255878b.f255883b.insert(sQLiteConnection, (Iterable) this.f255879c);
                break;
            default:
                this.f255878b.f255885g.insert(sQLiteConnection, (Iterable) this.f255879c);
                break;
        }
        return null;
    }
}
