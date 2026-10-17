package u69;

import androidx.sqlite.SQLiteConnection;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class e implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f277509a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f277510b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v69.b f277511c;

    public /* synthetic */ e(h hVar, v69.b bVar, int i) {
        this.f277509a = i;
        this.f277510b = hVar;
        this.f277511c = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        SQLiteConnection sQLiteConnection = (SQLiteConnection) obj2;
        switch (this.f277509a) {
            case 0:
                this.f277510b.d.handle(sQLiteConnection, this.f277511c);
                return null;
            default:
                return Integer.valueOf(this.f277510b.e.handle(sQLiteConnection, this.f277511c));
        }
    }
}
