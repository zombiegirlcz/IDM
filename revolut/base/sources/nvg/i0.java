package nvg;

import androidx.sqlite.SQLiteConnection;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class i0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f219622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j0 f219623b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f219624c;

    public /* synthetic */ i0(j0 j0Var, List list, int i) {
        this.f219622a = i;
        this.f219623b = j0Var;
        this.f219624c = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        SQLiteConnection sQLiteConnection = (SQLiteConnection) obj2;
        switch (this.f219622a) {
            case 0:
                this.f219623b.f219630b.insert(sQLiteConnection, (Iterable) this.f219624c);
                break;
            default:
                this.f219623b.d.insert(sQLiteConnection, (Iterable) this.f219624c);
                break;
        }
        return null;
    }
}
