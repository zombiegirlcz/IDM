package nvg;

import androidx.sqlite.SQLiteConnection;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class r0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f219666a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s0 f219667b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f219668c;

    public /* synthetic */ r0(s0 s0Var, ArrayList arrayList, int i) {
        this.f219666a = i;
        this.f219667b = s0Var;
        this.f219668c = arrayList;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        SQLiteConnection sQLiteConnection = (SQLiteConnection) obj2;
        switch (this.f219666a) {
            case 0:
                this.f219667b.f219670b.insert(sQLiteConnection, (Iterable) this.f219668c);
                return null;
            default:
                return s0.e(this.f219667b, this.f219668c);
        }
    }
}
