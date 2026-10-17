package f2i;

import com.revolut.kompot.common.ParcelableDestination;
import efm.h0;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class o implements kfm.o, kfm.p, kfm.g, efm.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f131804a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f131805b;

    public /* synthetic */ o(Object obj2, int i) {
        this.f131804a = i;
        this.f131805b = obj2;
    }

    public Set a() {
        return (Set) this.f131805b;
    }

    @Override // kfm.g
    public void accept(Object obj2) {
        switch (this.f131804a) {
            case 12:
                ((f0d.k) this.f131805b).invoke(obj2);
                break;
            case 13:
            case 16:
            case 18:
            default:
                ((f9b.d) this.f131805b).invoke(obj2);
                break;
            case 14:
                ((f7l.e) this.f131805b).invoke(obj2);
                break;
            case 15:
                ((f9b.c) this.f131805b).invoke(obj2);
                break;
            case 17:
                ((f9b.d) this.f131805b).invoke(obj2);
                break;
            case 19:
                ((f9b.d) this.f131805b).invoke(obj2);
                break;
            case 20:
                ((f9b.d) this.f131805b).invoke(obj2);
                break;
            case 21:
                ((a09.z) this.f131805b).invoke(obj2);
                break;
            case 22:
                ((f9b.c) this.f131805b).invoke(obj2);
                break;
        }
    }

    @Override // efm.o
    public efm.n apply(efm.k upstream) {
        f9b.f fVar = (f9b.f) this.f131805b;
        Intrinsics.checkNotNullParameter(upstream, "upstream");
        o oVar = new o(new f9b.d(fVar, 1), 19);
        dfm.c cVar = mfm.f.d;
        en.a aVar = mfm.f.f205043c;
        return new rfm.y(new rfm.y(upstream, cVar, cVar, oVar, aVar), cVar, new o(new f9b.d(fVar, 2), 20), cVar, aVar);
    }

    @Override // kfm.p
    public boolean test(Object p0) {
        switch (this.f131804a) {
            case 4:
                f0d.k kVar = (f0d.k) this.f131805b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) kVar.invoke(p0)).booleanValue();
            default:
                f0d.k kVar2 = (f0d.k) this.f131805b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) kVar2.invoke(p0)).booleanValue();
        }
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object p0) {
        switch (this.f131804a) {
            case 0:
                n nVar = (n) this.f131805b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) nVar.invoke(p0);
            case 1:
                x xVar = (x) this.f131805b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (rp0.y) xVar.invoke(p0);
            case 2:
                n nVar2 = (n) this.f131805b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) nVar2.invoke(p0);
            case 3:
                n nVar3 = (n) this.f131805b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) nVar3.invoke(p0);
            case 4:
            case 7:
            case 10:
            case 12:
            case 14:
            case 15:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            default:
                f9g.g gVar = (f9g.g) this.f131805b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (ParcelableDestination) gVar.invoke(p0);
            case 5:
                f0d.k kVar = (f0d.k) this.f131805b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (g) kVar.invoke(p0);
            case 6:
                eif.c cVar = (eif.c) this.f131805b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (rp0.y) cVar.invoke(p0);
            case 8:
                f0m.c cVar2 = (f0m.c) this.f131805b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) cVar2.invoke(p0);
            case 9:
                f0d.l lVar = (f0d.l) this.f131805b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (od0.i) lVar.invoke(p0);
            case 11:
                f0m.c cVar3 = (f0m.c) this.f131805b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.n) cVar3.invoke(p0);
            case 13:
                f7l.c cVar4 = (f7l.c) this.f131805b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (c7l.d) cVar4.invoke(p0);
            case 16:
                ay2.k kVar2 = (ay2.k) this.f131805b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.w) kVar2.invoke(p0);
            case 24:
                f0d.l lVar2 = (f0d.l) this.f131805b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) lVar2.invoke(p0);
            case 25:
                f9g.a aVar = (f9g.a) this.f131805b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) aVar.invoke(p0);
            case 26:
                f9g.a aVar2 = (f9g.a) this.f131805b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) aVar2.invoke(p0);
            case 27:
                f9g.e eVar = (f9g.e) this.f131805b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) eVar.invoke(p0);
            case 28:
                b7j.e eVar2 = (b7j.e) this.f131805b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.n) eVar2.invoke(p0);
        }
    }
}
