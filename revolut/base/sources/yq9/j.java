package yq9;

import androidx.room.util.DBUtil;
import androidx.sqlite.SQLiteConnection;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class j implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f316010a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f316011b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f316012c;

    public /* synthetic */ j(l lVar, ArrayList arrayList, int i) {
        this.f316010a = i;
        this.f316011b = lVar;
        this.f316012c = arrayList;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        SQLiteConnection sQLiteConnection = (SQLiteConnection) obj2;
        switch (this.f316010a) {
            case 0:
                l lVar = this.f316011b;
                lVar.getClass();
                ArrayList members = this.f316012c;
                Intrinsics.checkNotNullParameter(members, "members");
                DBUtil.performBlocking(lVar.f316016a, false, true, new ypd.i(8));
                lVar.b(members);
                return Unit.f186387a;
            default:
                this.f316011b.f316017b.insert(sQLiteConnection, (Iterable) this.f316012c);
                return null;
        }
    }
}
