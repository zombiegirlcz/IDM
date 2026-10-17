package pr8;

import androidx.sqlite.SQLiteConnection;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f238964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f238965b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f238966c;

    public /* synthetic */ b(c cVar, ArrayList arrayList, int i) {
        this.f238964a = i;
        this.f238965b = cVar;
        this.f238966c = arrayList;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        SQLiteConnection sQLiteConnection = (SQLiteConnection) obj2;
        switch (this.f238964a) {
            case 0:
                this.f238965b.f238968b.insert(sQLiteConnection, (Iterable) this.f238966c);
                return null;
            default:
                return c.f(this.f238965b, this.f238966c);
        }
    }
}
