package nvg;

import androidx.sqlite.SQLiteConnection;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class g implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f219613a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f219614b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f219615c;

    public /* synthetic */ g(h hVar, List list, int i) {
        this.f219613a = i;
        this.f219614b = hVar;
        this.f219615c = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        SQLiteConnection sQLiteConnection = (SQLiteConnection) obj2;
        switch (this.f219613a) {
            case 0:
                this.f219614b.d.insert(sQLiteConnection, (Iterable) this.f219615c);
                break;
            default:
                this.f219614b.f219621c.insert(sQLiteConnection, (Iterable) this.f219615c);
                break;
        }
        return null;
    }
}
