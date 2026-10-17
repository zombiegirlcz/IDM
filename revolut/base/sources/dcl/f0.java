package dcl;

import androidx.sqlite.SQLiteConnection;
import hcl.x2;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class f0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f113016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h0 f113017b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x2 f113018c;

    public /* synthetic */ f0(h0 h0Var, x2 x2Var, int i) {
        this.f113016a = i;
        this.f113017b = h0Var;
        this.f113018c = x2Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        SQLiteConnection sQLiteConnection = (SQLiteConnection) obj2;
        switch (this.f113016a) {
            case 0:
                return h0.h(this.f113017b, this.f113018c);
            default:
                this.f113017b.f113024c.insert(sQLiteConnection, this.f113018c);
                return null;
        }
    }
}
