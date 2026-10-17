package pgc;

import androidx.sqlite.SQLiteConnection;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class e implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f235865a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f235866b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f235867c;

    public /* synthetic */ e(f fVar, ArrayList arrayList, int i) {
        this.f235865a = i;
        this.f235866b = fVar;
        this.f235867c = arrayList;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        SQLiteConnection sQLiteConnection = (SQLiteConnection) obj2;
        switch (this.f235865a) {
            case 0:
                return f.e(this.f235866b, this.f235867c);
            default:
                this.f235866b.f235869b.insert(sQLiteConnection, (Iterable) this.f235867c);
                return null;
        }
    }
}
