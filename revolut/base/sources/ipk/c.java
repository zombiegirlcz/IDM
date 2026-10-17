package ipk;

import androidx.sqlite.SQLiteConnection;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f167753a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f167754b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f167755c;

    public /* synthetic */ c(e eVar, f fVar, int i) {
        this.f167753a = i;
        this.f167754b = eVar;
        this.f167755c = fVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        SQLiteConnection sQLiteConnection = (SQLiteConnection) obj2;
        switch (this.f167753a) {
            case 0:
                this.f167754b.f167758b.insert(sQLiteConnection, this.f167755c);
                return null;
            case 1:
                return Integer.valueOf(this.f167754b.e.handle(sQLiteConnection, this.f167755c));
            default:
                this.f167754b.d.handle(sQLiteConnection, this.f167755c);
                return null;
        }
    }
}
