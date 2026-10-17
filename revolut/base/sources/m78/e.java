package m78;

import efm.h0;
import efm.n;
import efm.r;
import efm.w;
import efm.x;
import java.util.Collection;
import java.util.List;
import kfm.o;
import kfm.p;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import m62.l;
import m98.k;
import m9d.j1;
import m9d.l0;
import m9j.m;
import org.reactivestreams.Publisher;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class e implements o, kfm.g, x, p, kfm.d, kfm.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f203340a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f203341b;

    public /* synthetic */ e(Object obj2, int i) {
        this.f203340a = i;
        this.f203341b = obj2;
    }

    @Override // kfm.g
    public void accept(Object obj2) {
        switch (this.f203340a) {
            case 3:
                ((b2.a) this.f203341b).invoke(obj2);
                break;
            case 12:
                ((m9l.d) this.f203341b).invoke(obj2);
                break;
            case 14:
                ((ma1.h) this.f203341b).invoke(obj2);
                break;
            case 19:
                ((m9l.d) this.f203341b).invoke(obj2);
                break;
            case 22:
                ((lul.d) this.f203341b).invoke(obj2);
                break;
            case 27:
                ((m9l.d) this.f203341b).invoke(obj2);
                break;
            default:
                ((b79.i) this.f203341b).invoke(obj2);
                break;
        }
    }

    @Override // efm.x
    public w apply(r it8) {
        Collection collection = (Collection) this.f203341b;
        Intrinsics.checkNotNullParameter(it8, "it");
        return it8.doOnError(new e(new b2.a(collection, 5), 3));
    }

    @Override // kfm.p
    public boolean test(Object p0) {
        switch (this.f203340a) {
            case 7:
                k kVar = (k) this.f203341b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) kVar.invoke(p0)).booleanValue();
            default:
                m9l.d dVar = (m9l.d) this.f203341b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) dVar.invoke(p0)).booleanValue();
        }
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object p0) {
        switch (this.f203340a) {
            case 0:
                l lVar = (l) this.f203341b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (xi0.b) lVar.invoke(p0);
            case 1:
                l lVar2 = (l) this.f203341b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Boolean) lVar2.invoke(p0);
            case 2:
                m mVar = (m) this.f203341b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) mVar.invoke(p0);
            case 3:
            case 6:
            case 7:
            case 12:
            case 13:
            case 14:
            case 19:
            case 20:
            case 22:
            case 23:
            default:
                lul.d dVar = (lul.d) this.f203341b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) dVar.invoke(p0);
            case 4:
                imk.e eVar = (imk.e) this.f203341b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) eVar.invoke(p0);
            case 5:
                l0 l0Var = (l0) this.f203341b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) l0Var.invoke(p0);
            case 8:
                m9l.d dVar2 = (m9l.d) this.f203341b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (fa1.g) dVar2.invoke(p0);
            case 9:
                m9l.d dVar3 = (m9l.d) this.f203341b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (fa1.g) dVar3.invoke(p0);
            case 10:
                m9l.d dVar4 = (m9l.d) this.f203341b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Boolean) dVar4.invoke(p0);
            case 11:
                ma1.h hVar = (ma1.h) this.f203341b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) hVar.invoke(p0);
            case 15:
                k kVar = (k) this.f203341b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (n) kVar.invoke(p0);
            case 16:
                m9l.d dVar5 = (m9l.d) this.f203341b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Unit) dVar5.invoke(p0);
            case 17:
                ma1.p pVar = (ma1.p) this.f203341b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) pVar.invoke(p0);
            case 18:
                ma1.p pVar2 = (ma1.p) this.f203341b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) pVar2.invoke(p0);
            case 21:
                m9l.d dVar6 = (m9l.d) this.f203341b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Publisher) dVar6.invoke(p0);
            case 24:
                m9l.d dVar7 = (m9l.d) this.f203341b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) dVar7.invoke(p0);
            case 25:
                m9l.d dVar8 = (m9l.d) this.f203341b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Publisher) dVar8.invoke(p0);
            case 26:
                k kVar2 = (k) this.f203341b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) kVar2.invoke(p0);
        }
    }

    @Override // kfm.d
    public boolean test(Object p0, Object p17) {
        j1 j1Var = (j1) this.f203341b;
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(p17, "p1");
        return ((Boolean) j1Var.invoke(p0, p17)).booleanValue();
    }

    @Override // kfm.c
    public Object apply(Object p0, Object p17) {
        j1 j1Var = (j1) this.f203341b;
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(p17, "p1");
        return (Pair) j1Var.invoke(p0, p17);
    }
}
