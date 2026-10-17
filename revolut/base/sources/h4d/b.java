package h4d;

import androidx.sqlite.SQLiteConnection;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f149329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f149330b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i4d.a f149331c;

    public /* synthetic */ b(c cVar, i4d.a aVar, int i) {
        this.f149329a = i;
        this.f149330b = cVar;
        this.f149331c = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        SQLiteConnection sQLiteConnection = (SQLiteConnection) obj2;
        switch (this.f149329a) {
            case 0:
                this.f149330b.f149334c.insert(sQLiteConnection, this.f149331c);
                break;
            default:
                this.f149330b.f149333b.insert(sQLiteConnection, this.f149331c);
                break;
        }
        return null;
    }
}
