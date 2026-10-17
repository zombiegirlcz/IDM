package dcl;

import androidx.sqlite.SQLiteConnection;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class x0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f113067a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y0 f113068b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ocl.a f113069c;

    public /* synthetic */ x0(y0 y0Var, ocl.a aVar, int i) {
        this.f113067a = i;
        this.f113068b = y0Var;
        this.f113069c = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        SQLiteConnection sQLiteConnection = (SQLiteConnection) obj2;
        switch (this.f113067a) {
            case 0:
                return y0.e(this.f113068b, this.f113069c);
            default:
                this.f113068b.f113071b.insert(sQLiteConnection, this.f113069c);
                return null;
        }
    }
}
