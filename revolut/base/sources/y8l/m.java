package y8l;

import androidx.sqlite.SQLiteConnection;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class m implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f311700a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f311701b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f311702c;

    public /* synthetic */ m(o oVar, ArrayList arrayList, int i) {
        this.f311700a = i;
        this.f311701b = oVar;
        this.f311702c = arrayList;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        SQLiteConnection sQLiteConnection = (SQLiteConnection) obj2;
        switch (this.f311700a) {
            case 0:
                return o.f(this.f311701b, this.f311702c);
            default:
                this.f311701b.f311706c.insert(sQLiteConnection, (Iterable) this.f311702c);
                return null;
        }
    }
}
