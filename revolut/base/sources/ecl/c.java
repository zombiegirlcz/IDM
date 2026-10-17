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
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f124770a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f124771b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f124772c;

    public /* synthetic */ c(d dVar, ArrayList arrayList, int i) {
        this.f124770a = i;
        this.f124771b = dVar;
        this.f124772c = arrayList;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        SQLiteConnection sQLiteConnection = (SQLiteConnection) obj2;
        switch (this.f124770a) {
            case 0:
                this.f124771b.f124774b.insert(sQLiteConnection, (Iterable) this.f124772c);
                return null;
            default:
                d dVar = this.f124771b;
                dVar.getClass();
                ArrayList reports = this.f124772c;
                Intrinsics.checkNotNullParameter(reports, "reports");
                RoomDatabase roomDatabase = dVar.f124773a;
                DBUtil.performBlocking(roomDatabase, false, true, new i(11));
                DBUtil.performBlocking(roomDatabase, false, true, new c(dVar, reports, 0));
                return Unit.f186387a;
        }
    }
}
