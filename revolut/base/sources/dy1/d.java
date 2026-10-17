package dy1;

import androidx.sqlite.SQLiteConnection;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f121036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f121037b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f121038c;

    public /* synthetic */ d(g gVar, ArrayList arrayList, int i) {
        this.f121036a = i;
        this.f121037b = gVar;
        this.f121038c = arrayList;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        SQLiteConnection sQLiteConnection = (SQLiteConnection) obj2;
        switch (this.f121036a) {
            case 0:
                this.f121037b.f121044b.insert(sQLiteConnection, (Iterable) this.f121038c);
                return null;
            case 1:
                return g.i(this.f121037b, this.f121038c);
            default:
                this.f121037b.f121044b.insert(sQLiteConnection, (Iterable) this.f121038c);
                return Unit.f186387a;
        }
    }
}
