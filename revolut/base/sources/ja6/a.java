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
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f172440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f172441b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f172442c;

    public /* synthetic */ a(b bVar, ArrayList arrayList, int i) {
        this.f172440a = i;
        this.f172441b = bVar;
        this.f172442c = arrayList;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        SQLiteConnection sQLiteConnection = (SQLiteConnection) obj2;
        switch (this.f172440a) {
            case 0:
                b bVar = this.f172441b;
                bVar.getClass();
                ArrayList charityCampaigns = this.f172442c;
                Intrinsics.checkNotNullParameter(charityCampaigns, "charityCampaigns");
                RoomDatabase roomDatabase = bVar.f172443a;
                DBUtil.performBlocking(roomDatabase, false, true, new l(13));
                DBUtil.performBlocking(roomDatabase, false, true, new a(bVar, charityCampaigns, 1));
                return Unit.f186387a;
            default:
                this.f172441b.f172444b.insert(sQLiteConnection, (Iterable) this.f172442c);
                return null;
        }
    }
}
