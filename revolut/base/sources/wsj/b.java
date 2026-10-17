package wsj;

import androidx.sqlite.SQLiteConnection;
import kotlin.jvm.functions.Function1;
import ysj.k;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f299738a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f299739b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k f299740c;

    public /* synthetic */ b(d dVar, k kVar, int i) {
        this.f299738a = i;
        this.f299739b = dVar;
        this.f299740c = kVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        SQLiteConnection sQLiteConnection = (SQLiteConnection) obj2;
        switch (this.f299738a) {
            case 0:
                this.f299739b.e.handle(sQLiteConnection, this.f299740c);
                return null;
            default:
                return Integer.valueOf(this.f299739b.f.handle(sQLiteConnection, this.f299740c));
        }
    }
}
