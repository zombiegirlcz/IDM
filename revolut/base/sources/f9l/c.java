package f9l;

import androidx.sqlite.SQLiteConnection;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f132990a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f132991b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f132992c;

    public /* synthetic */ c(d dVar, ArrayList arrayList, int i) {
        this.f132990a = i;
        this.f132991b = dVar;
        this.f132992c = arrayList;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        SQLiteConnection sQLiteConnection = (SQLiteConnection) obj2;
        switch (this.f132990a) {
            case 0:
                return d.d(this.f132991b, this.f132992c);
            default:
                this.f132991b.f132994b.insert(sQLiteConnection, (Iterable) this.f132992c);
                return null;
        }
    }
}
