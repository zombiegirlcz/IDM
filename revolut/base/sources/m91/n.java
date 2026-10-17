package m91;

import androidx.sqlite.SQLiteConnection;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class n implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f203617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f203618b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f203619c;

    public /* synthetic */ n(o oVar, ArrayList arrayList, int i) {
        this.f203617a = i;
        this.f203618b = oVar;
        this.f203619c = arrayList;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        SQLiteConnection sQLiteConnection = (SQLiteConnection) obj2;
        switch (this.f203617a) {
            case 0:
                this.f203618b.f203621b.insert(sQLiteConnection, (Iterable) this.f203619c);
                return null;
            default:
                return o.e(this.f203618b, this.f203619c);
        }
    }
}
