package xek;

import androidx.sqlite.SQLiteConnection;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f304692a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f304693b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f304694c;

    public /* synthetic */ b(c cVar, ArrayList arrayList, int i) {
        this.f304692a = i;
        this.f304693b = cVar;
        this.f304694c = arrayList;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        SQLiteConnection sQLiteConnection = (SQLiteConnection) obj2;
        switch (this.f304692a) {
            case 0:
                return c.e(this.f304693b, this.f304694c);
            default:
                this.f304693b.f304696b.insert(sQLiteConnection, (Iterable) this.f304694c);
                return null;
        }
    }
}
