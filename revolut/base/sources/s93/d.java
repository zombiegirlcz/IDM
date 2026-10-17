package s93;

import androidx.sqlite.SQLiteConnection;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f261103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f261104b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f261105c;

    public /* synthetic */ d(e eVar, ArrayList arrayList, int i) {
        this.f261103a = i;
        this.f261104b = eVar;
        this.f261105c = arrayList;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        SQLiteConnection sQLiteConnection = (SQLiteConnection) obj2;
        switch (this.f261103a) {
            case 0:
                return e.e(this.f261104b, this.f261105c);
            default:
                this.f261104b.f261107b.insert(sQLiteConnection, (Iterable) this.f261105c);
                return null;
        }
    }
}
