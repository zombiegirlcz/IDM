package m91;

import androidx.sqlite.SQLiteConnection;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class g implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f203608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f203609b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f203610c;

    public /* synthetic */ g(h hVar, ArrayList arrayList, int i) {
        this.f203608a = i;
        this.f203609b = hVar;
        this.f203610c = arrayList;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        SQLiteConnection sQLiteConnection = (SQLiteConnection) obj2;
        switch (this.f203608a) {
            case 0:
                this.f203609b.f203613c.insert(sQLiteConnection, (Iterable) this.f203610c);
                return null;
            case 1:
                this.f203609b.f.handleMultiple(sQLiteConnection, this.f203610c);
                return null;
            case 2:
                this.f203609b.e.insert(sQLiteConnection, (Iterable) this.f203610c);
                return null;
            case 3:
                this.f203609b.f203615h.handleMultiple(sQLiteConnection, this.f203610c);
                return null;
            case 4:
                this.f203609b.k.handleMultiple(sQLiteConnection, this.f203610c);
                return null;
            case 5:
                this.f203609b.f203614g.handleMultiple(sQLiteConnection, this.f203610c);
                return null;
            case 6:
                this.f203609b.f203612b.insert(sQLiteConnection, (Iterable) this.f203610c);
                return null;
            case 7:
                return h.x(this.f203609b, this.f203610c);
            case 8:
                this.f203609b.i.handleMultiple(sQLiteConnection, this.f203610c);
                return null;
            case 9:
                return h.w(this.f203609b, this.f203610c);
            case 10:
                this.f203609b.f203616j.handleMultiple(sQLiteConnection, this.f203610c);
                return null;
            case 11:
                this.f203609b.d.insert(sQLiteConnection, (Iterable) this.f203610c);
                return null;
            case 12:
                return h.v(this.f203609b, this.f203610c);
            default:
                return h.u(this.f203609b, this.f203610c);
        }
    }
}
