package wxf;

import androidx.sqlite.SQLiteConnection;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class g implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f300938a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f300939b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ oxf.c[] f300940c;

    public /* synthetic */ g(h hVar, oxf.c[] cVarArr, int i) {
        this.f300938a = i;
        this.f300939b = hVar;
        this.f300940c = cVarArr;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) throws Exception {
        SQLiteConnection sQLiteConnection = (SQLiteConnection) obj2;
        switch (this.f300938a) {
            case 0:
                this.f300939b.f300942b.insert(sQLiteConnection, (Object[]) this.f300940c);
                return null;
            default:
                return h.e(this.f300939b, this.f300940c);
        }
    }
}
