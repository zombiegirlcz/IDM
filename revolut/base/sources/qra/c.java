package qra;

import androidx.sqlite.SQLiteConnection;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f248671a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f248672b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ sra.b f248673c;

    public /* synthetic */ c(d dVar, sra.b bVar, int i) {
        this.f248671a = i;
        this.f248672b = dVar;
        this.f248673c = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        SQLiteConnection sQLiteConnection = (SQLiteConnection) obj2;
        switch (this.f248671a) {
            case 0:
                this.f248672b.f248676c.handle(sQLiteConnection, this.f248673c);
                break;
            default:
                this.f248672b.f248675b.insert(sQLiteConnection, this.f248673c);
                break;
        }
        return null;
    }
}
