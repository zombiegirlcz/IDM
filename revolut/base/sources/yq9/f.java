package yq9;

import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.sqlite.SQLiteConnection;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class f implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f316001a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f316002b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f316003c;

    public /* synthetic */ f(h hVar, ArrayList arrayList, int i) {
        this.f316001a = i;
        this.f316002b = hVar;
        this.f316003c = arrayList;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        SQLiteConnection sQLiteConnection = (SQLiteConnection) obj2;
        switch (this.f316001a) {
            case 0:
                h hVar = this.f316002b;
                hVar.getClass();
                ArrayList groups = this.f316003c;
                Intrinsics.checkNotNullParameter(groups, "groups");
                RoomDatabase roomDatabase = hVar.f316005a;
                DBUtil.performBlocking(roomDatabase, false, true, new ypd.i(6));
                DBUtil.performBlocking(roomDatabase, false, true, new f(hVar, groups, 1));
                return Unit.f186387a;
            default:
                this.f316002b.f316006b.insert(sQLiteConnection, (Iterable) this.f316003c);
                return null;
        }
    }
}
