package nvg;

import androidx.sqlite.SQLiteConnection;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class o implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f219651a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f219652b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f219653c;

    public /* synthetic */ o(p pVar, List list, int i) {
        this.f219651a = i;
        this.f219652b = pVar;
        this.f219653c = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        SQLiteConnection sQLiteConnection = (SQLiteConnection) obj2;
        switch (this.f219651a) {
            case 0:
                this.f219652b.f219658b.insert(sQLiteConnection, (Iterable) this.f219653c);
                break;
            default:
                this.f219652b.d.insert(sQLiteConnection, (Iterable) this.f219653c);
                break;
        }
        return null;
    }
}
