package ja6;

import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.sqlite.SQLiteConnection;
import j7b.l;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f172446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f172447b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f172448c;

    public /* synthetic */ c(f fVar, ArrayList arrayList, int i) {
        this.f172446a = i;
        this.f172447b = fVar;
        this.f172448c = arrayList;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        SQLiteConnection sQLiteConnection = (SQLiteConnection) obj2;
        switch (this.f172446a) {
            case 0:
                this.f172447b.f172456c.insert(sQLiteConnection, (Iterable) this.f172448c);
                return null;
            case 1:
                f fVar = this.f172447b;
                fVar.getClass();
                ArrayList charitiesCollections = this.f172448c;
                Intrinsics.checkNotNullParameter(charitiesCollections, "charitiesCollections");
                RoomDatabase roomDatabase = fVar.f172454a;
                DBUtil.performBlocking(roomDatabase, false, true, new l(14));
                DBUtil.performBlocking(roomDatabase, false, true, new c(fVar, charitiesCollections, 0));
                return Unit.f186387a;
            case 2:
                f fVar2 = this.f172447b;
                fVar2.getClass();
                ArrayList charities = this.f172448c;
                Intrinsics.checkNotNullParameter(charities, "charities");
                RoomDatabase roomDatabase2 = fVar2.f172454a;
                DBUtil.performBlocking(roomDatabase2, false, true, new l(15));
                DBUtil.performBlocking(roomDatabase2, false, true, new c(fVar2, charities, 3));
                return Unit.f186387a;
            default:
                this.f172447b.f172455b.insert(sQLiteConnection, (Iterable) this.f172448c);
                return null;
        }
    }
}
