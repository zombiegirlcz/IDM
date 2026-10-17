package hz8;

import androidx.collection.ArrayMap;
import androidx.sqlite.SQLiteConnection;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f157058a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f157059b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SQLiteConnection f157060c;

    public /* synthetic */ c(h hVar, SQLiteConnection sQLiteConnection, int i) {
        this.f157058a = i;
        this.f157059b = hVar;
        this.f157060c = sQLiteConnection;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f157058a) {
            case 0:
                this.f157059b.c(this.f157060c, (ArrayMap) obj2);
                break;
            default:
                this.f157059b.b(this.f157060c, (ArrayMap) obj2);
                break;
        }
        return Unit.f186387a;
    }
}
