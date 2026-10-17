package w0e;

import androidx.sqlite.SQLiteConnection;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f293682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f293683b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f293684c;

    public /* synthetic */ b(c cVar, ArrayList arrayList, int i) {
        this.f293682a = i;
        this.f293683b = cVar;
        this.f293684c = arrayList;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        SQLiteConnection sQLiteConnection = (SQLiteConnection) obj2;
        switch (this.f293682a) {
            case 0:
                return c.e(this.f293683b, this.f293684c);
            default:
                this.f293683b.f293686b.insert(sQLiteConnection, (Iterable) this.f293684c);
                return null;
        }
    }
}
