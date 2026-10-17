package n4d;

import androidx.sqlite.SQLiteConnection;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class u implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f212406a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f212407b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f212408c;

    public /* synthetic */ u(x xVar, List list, int i) {
        this.f212406a = i;
        this.f212407b = xVar;
        this.f212408c = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        SQLiteConnection sQLiteConnection = (SQLiteConnection) obj2;
        switch (this.f212406a) {
            case 0:
                this.f212407b.f212417c.insert(sQLiteConnection, (Iterable) this.f212408c);
                return null;
            case 1:
                return x.p(this.f212407b, this.f212408c);
            default:
                this.f212407b.d.insert(sQLiteConnection, (Iterable) this.f212408c);
                return null;
        }
    }
}
