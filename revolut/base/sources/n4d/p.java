package n4d;

import androidx.sqlite.SQLiteConnection;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class p implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f212386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f212387b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f212388c;

    public /* synthetic */ p(q qVar, ArrayList arrayList, int i) {
        this.f212386a = i;
        this.f212387b = qVar;
        this.f212388c = arrayList;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        SQLiteConnection sQLiteConnection = (SQLiteConnection) obj2;
        switch (this.f212386a) {
            case 0:
                this.f212387b.f212390b.insert(sQLiteConnection, (Iterable) this.f212388c);
                break;
            default:
                this.f212387b.f212391c.insert(sQLiteConnection, (Iterable) this.f212388c);
                break;
        }
        return null;
    }
}
