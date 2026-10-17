package gi9;

import androidx.collection.ArrayMap;
import androidx.sqlite.SQLiteConnection;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f144097a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f144098b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SQLiteConnection f144099c;

    public /* synthetic */ b(c cVar, SQLiteConnection sQLiteConnection, int i) {
        this.f144097a = i;
        this.f144098b = cVar;
        this.f144099c = sQLiteConnection;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f144097a) {
            case 0:
                this.f144098b.a(this.f144099c, (ArrayMap) obj2);
                break;
            default:
                this.f144098b.b(this.f144099c, (ArrayMap) obj2);
                break;
        }
        return Unit.f186387a;
    }
}
