package nvg;

import androidx.sqlite.SQLiteConnection;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class u0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f219675a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v0 f219676b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f219677c;

    public /* synthetic */ u0(v0 v0Var, List list, int i) {
        this.f219675a = i;
        this.f219676b = v0Var;
        this.f219677c = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        SQLiteConnection sQLiteConnection = (SQLiteConnection) obj2;
        switch (this.f219675a) {
            case 0:
                this.f219676b.f219682b.insert(sQLiteConnection, (Iterable) this.f219677c);
                break;
            default:
                this.f219676b.d.insert(sQLiteConnection, (Iterable) this.f219677c);
                break;
        }
        return null;
    }
}
