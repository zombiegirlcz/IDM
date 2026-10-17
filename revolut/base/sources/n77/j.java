package n77;

import androidx.sqlite.SQLiteConnection;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class j implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f213021a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f213022b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f213023c;

    public /* synthetic */ j(l lVar, ArrayList arrayList, int i) {
        this.f213021a = i;
        this.f213022b = lVar;
        this.f213023c = arrayList;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        SQLiteConnection sQLiteConnection = (SQLiteConnection) obj2;
        switch (this.f213021a) {
            case 0:
                this.f213022b.f213026b.insert(sQLiteConnection, (Iterable) this.f213023c);
                return null;
            default:
                return l.e(this.f213022b, this.f213023c);
        }
    }
}
