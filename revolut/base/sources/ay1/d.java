package ay1;

import androidx.sqlite.SQLiteConnection;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11009a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f11010b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f11011c;

    public /* synthetic */ d(h hVar, ArrayList arrayList, int i) {
        this.f11009a = i;
        this.f11010b = hVar;
        this.f11011c = arrayList;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        SQLiteConnection sQLiteConnection = (SQLiteConnection) obj2;
        switch (this.f11009a) {
            case 0:
                return h.i(this.f11010b, this.f11011c);
            case 1:
                this.f11010b.f11019b.insert(sQLiteConnection, (Iterable) this.f11011c);
                return null;
            default:
                this.f11010b.f11019b.insert(sQLiteConnection, (Iterable) this.f11011c);
                return Unit.f186387a;
        }
    }
}
