package nvg;

import androidx.sqlite.SQLiteConnection;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class f0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f219610a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g0 f219611b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f219612c;

    public /* synthetic */ f0(g0 g0Var, List list, int i) {
        this.f219610a = i;
        this.f219611b = g0Var;
        this.f219612c = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        SQLiteConnection sQLiteConnection = (SQLiteConnection) obj2;
        switch (this.f219610a) {
            case 0:
                this.f219611b.f219617b.insert(sQLiteConnection, (Iterable) this.f219612c);
                break;
            default:
                this.f219611b.d.insert(sQLiteConnection, (Iterable) this.f219612c);
                break;
        }
        return null;
    }
}
