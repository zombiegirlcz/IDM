package yxk;

import androidx.sqlite.SQLiteConnection;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f317720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f317721b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ byk.b f317722c;

    public /* synthetic */ b(c cVar, byk.b bVar, int i) {
        this.f317720a = i;
        this.f317721b = cVar;
        this.f317722c = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        SQLiteConnection sQLiteConnection = (SQLiteConnection) obj2;
        switch (this.f317720a) {
            case 0:
                return c.e(this.f317721b, this.f317722c);
            default:
                this.f317721b.f317724b.insert(sQLiteConnection, this.f317722c);
                return null;
        }
    }
}
