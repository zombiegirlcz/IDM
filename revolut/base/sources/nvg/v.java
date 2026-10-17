package nvg;

import androidx.sqlite.SQLiteConnection;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class v implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f219678a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w f219679b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f219680c;

    public /* synthetic */ v(w wVar, List list, int i) {
        this.f219678a = i;
        this.f219679b = wVar;
        this.f219680c = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        SQLiteConnection sQLiteConnection = (SQLiteConnection) obj2;
        switch (this.f219678a) {
            case 0:
                this.f219679b.f219685b.insert(sQLiteConnection, (Iterable) this.f219680c);
                break;
            default:
                this.f219679b.d.insert(sQLiteConnection, (Iterable) this.f219680c);
                break;
        }
        return null;
    }
}
