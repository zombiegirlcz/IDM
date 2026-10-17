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
public final /* synthetic */ class o implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f320116a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f320117b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f320118c;

    public /* synthetic */ o(p pVar, ArrayList arrayList, int i) {
        this.f320116a = i;
        this.f320117b = pVar;
        this.f320118c = arrayList;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        SQLiteConnection sQLiteConnection = (SQLiteConnection) obj2;
        switch (this.f320116a) {
            case 0:
                p pVar = this.f320117b;
                pVar.getClass();
                ArrayList propertyTypeCategories = this.f320118c;
                Intrinsics.checkNotNullParameter(propertyTypeCategories, "propertyTypeCategories");
                RoomDatabase roomDatabase = pVar.f320119a;
                DBUtil.performBlocking(roomDatabase, false, true, new w(27));
                DBUtil.performBlocking(roomDatabase, false, true, new o(pVar, propertyTypeCategories, 1));
                return Unit.f186387a;
            default:
                this.f320117b.f320120b.insert(sQLiteConnection, (Iterable) this.f320118c);
                return null;
        }
    }
}
