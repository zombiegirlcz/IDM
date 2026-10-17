package nvg;

import androidx.sqlite.SQLiteConnection;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class o0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f219654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p0 f219655b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f219656c;

    public /* synthetic */ o0(p0 p0Var, List list, int i) {
        this.f219654a = i;
        this.f219655b = p0Var;
        this.f219656c = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        SQLiteConnection sQLiteConnection = (SQLiteConnection) obj2;
        switch (this.f219654a) {
            case 0:
                this.f219655b.d.insert(sQLiteConnection, (Iterable) this.f219656c);
                break;
            default:
                this.f219655b.f219661b.insert(sQLiteConnection, (Iterable) this.f219656c);
                break;
        }
        return null;
    }
}
