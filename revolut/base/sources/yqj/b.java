package yqj;

import androidx.sqlite.SQLiteConnection;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f316035a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f316036b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ arj.a f316037c;

    public /* synthetic */ b(c cVar, arj.a aVar, int i) {
        this.f316035a = i;
        this.f316036b = cVar;
        this.f316037c = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        SQLiteConnection sQLiteConnection = (SQLiteConnection) obj2;
        switch (this.f316035a) {
            case 0:
                this.f316036b.f316039b.insert(sQLiteConnection, this.f316037c);
                return null;
            case 1:
                this.f316036b.f316040c.handle(sQLiteConnection, this.f316037c);
                return null;
            default:
                return Integer.valueOf(this.f316036b.d.handle(sQLiteConnection, this.f316037c));
        }
    }
}
