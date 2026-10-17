package sx1;

import androidx.sqlite.SQLiteConnection;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f266249a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f266250b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f266251c;

    public /* synthetic */ d(g gVar, ArrayList arrayList, int i) {
        this.f266249a = i;
        this.f266250b = gVar;
        this.f266251c = arrayList;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        SQLiteConnection sQLiteConnection = (SQLiteConnection) obj2;
        switch (this.f266249a) {
            case 0:
                this.f266250b.f266257b.insert(sQLiteConnection, (Iterable) this.f266251c);
                return null;
            case 1:
                return g.i(this.f266250b, this.f266251c);
            default:
                this.f266250b.f266257b.insert(sQLiteConnection, (Iterable) this.f266251c);
                return Unit.f186387a;
        }
    }
}
