package nvg;

import androidx.sqlite.SQLiteConnection;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class c0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f219599a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d0 f219600b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f219601c;

    public /* synthetic */ c0(d0 d0Var, ArrayList arrayList, int i) {
        this.f219599a = i;
        this.f219600b = d0Var;
        this.f219601c = arrayList;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        SQLiteConnection sQLiteConnection = (SQLiteConnection) obj2;
        switch (this.f219599a) {
            case 0:
                return d0.f(this.f219600b, this.f219601c);
            default:
                this.f219600b.f219606b.insert(sQLiteConnection, (Iterable) this.f219601c);
                return null;
        }
    }
}
