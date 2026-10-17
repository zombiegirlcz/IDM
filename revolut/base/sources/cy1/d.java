package cy1;

import androidx.sqlite.SQLiteConnection;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f110023a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f110024b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f110025c;

    public /* synthetic */ d(g gVar, ArrayList arrayList, int i) {
        this.f110023a = i;
        this.f110024b = gVar;
        this.f110025c = arrayList;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        SQLiteConnection sQLiteConnection = (SQLiteConnection) obj2;
        switch (this.f110023a) {
            case 0:
                return g.i(this.f110024b, this.f110025c);
            case 1:
                this.f110024b.f110031b.insert(sQLiteConnection, (Iterable) this.f110025c);
                return null;
            default:
                this.f110024b.f110031b.insert(sQLiteConnection, (Iterable) this.f110025c);
                return Unit.f186387a;
        }
    }
}
