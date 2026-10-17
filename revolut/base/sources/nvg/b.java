package nvg;

import androidx.sqlite.SQLiteConnection;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f219592a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f219593b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f219594c;

    public /* synthetic */ b(d dVar, List list, int i) {
        this.f219592a = i;
        this.f219593b = dVar;
        this.f219594c = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        SQLiteConnection sQLiteConnection = (SQLiteConnection) obj2;
        switch (this.f219592a) {
            case 0:
                this.f219593b.f219603b.insert(sQLiteConnection, (Iterable) this.f219594c);
                break;
            case 1:
                this.f219593b.e.insert(sQLiteConnection, (Iterable) this.f219594c);
                break;
            default:
                this.f219593b.d.insert(sQLiteConnection, (Iterable) this.f219594c);
                break;
        }
        return null;
    }
}
