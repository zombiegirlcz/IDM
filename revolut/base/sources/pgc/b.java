package pgc;

import androidx.sqlite.SQLiteConnection;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f235860a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f235861b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f235862c;

    public /* synthetic */ b(c cVar, ArrayList arrayList, int i) {
        this.f235860a = i;
        this.f235861b = cVar;
        this.f235862c = arrayList;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        SQLiteConnection sQLiteConnection = (SQLiteConnection) obj2;
        switch (this.f235860a) {
            case 0:
                return c.e(this.f235861b, this.f235862c);
            default:
                this.f235861b.f235864b.insert(sQLiteConnection, (Iterable) this.f235862c);
                return null;
        }
    }
}
