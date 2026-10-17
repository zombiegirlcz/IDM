package lqj;

import androidx.sqlite.SQLiteConnection;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f199315a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f199316b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ mqj.a f199317c;

    public /* synthetic */ b(c cVar, mqj.a aVar, int i) {
        this.f199315a = i;
        this.f199316b = cVar;
        this.f199317c = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        SQLiteConnection sQLiteConnection = (SQLiteConnection) obj2;
        switch (this.f199315a) {
            case 0:
                return Integer.valueOf(this.f199316b.d.handle(sQLiteConnection, this.f199317c));
            default:
                this.f199316b.f199320c.handle(sQLiteConnection, this.f199317c);
                return null;
        }
    }
}
