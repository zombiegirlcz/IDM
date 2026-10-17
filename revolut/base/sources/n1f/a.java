package n1f;

import androidx.sqlite.SQLiteConnection;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f211311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f211312b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f211313c;

    public /* synthetic */ a(b bVar, ArrayList arrayList, int i) {
        this.f211311a = i;
        this.f211312b = bVar;
        this.f211313c = arrayList;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        SQLiteConnection sQLiteConnection = (SQLiteConnection) obj2;
        switch (this.f211311a) {
            case 0:
                this.f211312b.f211315b.insert(sQLiteConnection, (Iterable) this.f211313c);
                break;
            default:
                this.f211312b.d.handleMultiple(sQLiteConnection, this.f211313c);
                break;
        }
        return null;
    }
}
