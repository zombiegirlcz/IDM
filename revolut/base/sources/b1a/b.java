package b1a;

import androidx.sqlite.SQLiteConnection;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11755a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f11756b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f11757c;

    public /* synthetic */ b(c cVar, ArrayList arrayList, int i) {
        this.f11755a = i;
        this.f11756b = cVar;
        this.f11757c = arrayList;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        SQLiteConnection sQLiteConnection = (SQLiteConnection) obj2;
        switch (this.f11755a) {
            case 0:
                this.f11756b.f11759b.insert(sQLiteConnection, (Iterable) this.f11757c);
                return null;
            default:
                return c.e(this.f11756b, this.f11757c);
        }
    }
}
