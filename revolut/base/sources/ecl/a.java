package ecl;

import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.sqlite.SQLiteConnection;
import ebi.i;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f124765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f124766b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f124767c;

    public /* synthetic */ a(b bVar, ArrayList arrayList, int i) {
        this.f124765a = i;
        this.f124766b = bVar;
        this.f124767c = arrayList;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        SQLiteConnection sQLiteConnection = (SQLiteConnection) obj2;
        switch (this.f124765a) {
            case 0:
                b bVar = this.f124766b;
                bVar.getClass();
                ArrayList reports = this.f124767c;
                Intrinsics.checkNotNullParameter(reports, "reports");
                RoomDatabase roomDatabase = bVar.f124768a;
                DBUtil.performBlocking(roomDatabase, false, true, new i(10));
                DBUtil.performBlocking(roomDatabase, false, true, new a(bVar, reports, 1));
                return Unit.f186387a;
            default:
                this.f124766b.f124769b.insert(sQLiteConnection, (Iterable) this.f124767c);
                return null;
        }
    }
}
