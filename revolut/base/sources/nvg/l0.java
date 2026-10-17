package nvg;

import androidx.sqlite.SQLiteConnection;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class l0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f219642a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m0 f219643b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f219644c;

    public /* synthetic */ l0(m0 m0Var, ArrayList arrayList, int i) {
        this.f219642a = i;
        this.f219643b = m0Var;
        this.f219644c = arrayList;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        SQLiteConnection sQLiteConnection = (SQLiteConnection) obj2;
        switch (this.f219642a) {
            case 0:
                return m0.e(this.f219643b, this.f219644c);
            default:
                this.f219643b.f219649b.insert(sQLiteConnection, (Iterable) this.f219644c);
                return null;
        }
    }
}
