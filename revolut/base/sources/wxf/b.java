package wxf;

import androidx.sqlite.SQLiteConnection;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f300930a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f300931b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ oxf.b[] f300932c;

    public /* synthetic */ b(c cVar, oxf.b[] bVarArr, int i) {
        this.f300930a = i;
        this.f300931b = cVar;
        this.f300932c = bVarArr;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) throws Exception {
        SQLiteConnection sQLiteConnection = (SQLiteConnection) obj2;
        switch (this.f300930a) {
            case 0:
                this.f300931b.f300934b.insert(sQLiteConnection, (Object[]) this.f300932c);
                return null;
            default:
                return c.p(this.f300931b, this.f300932c);
        }
    }
}
