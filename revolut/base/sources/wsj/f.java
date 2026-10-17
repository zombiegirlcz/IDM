package wsj;

import androidx.sqlite.SQLiteConnection;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class f implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f299746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f299747b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ysj.g f299748c;

    public /* synthetic */ f(g gVar, ysj.g gVar2, int i) {
        this.f299746a = i;
        this.f299747b = gVar;
        this.f299748c = gVar2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        SQLiteConnection sQLiteConnection = (SQLiteConnection) obj2;
        switch (this.f299746a) {
            case 0:
                return Integer.valueOf(this.f299747b.f.handle(sQLiteConnection, this.f299748c));
            default:
                this.f299747b.e.handle(sQLiteConnection, this.f299748c);
                return null;
        }
    }
}
