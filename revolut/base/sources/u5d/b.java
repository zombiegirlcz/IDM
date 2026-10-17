package u5d;

import androidx.room.util.DBUtil;
import java.util.concurrent.Callable;
import uo7.k;
import uyh.k0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class b implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f277447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f277448b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w5d.a f277449c;

    public /* synthetic */ b(c cVar, w5d.a aVar, int i) {
        this.f277447a = i;
        this.f277448b = cVar;
        this.f277449c = aVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f277447a) {
            case 0:
                c cVar = this.f277448b;
                return (w5d.a) cVar.f277450a.runInTransaction(new b(cVar, this.f277449c, 1));
            default:
                c cVar2 = this.f277448b;
                v5d.a aVarA = cVar2.a();
                aVarA.getClass();
                w5d.a aVar = this.f277449c;
                aVar.getClass();
                DBUtil.performBlocking(aVarA.f286197a, false, true, new k0(aVarA, aVar, 26));
                return (w5d.a) DBUtil.performBlocking(cVar2.a().f286197a, true, false, new k(aVar.f295100a, 22));
        }
    }
}
