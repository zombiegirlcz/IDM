package zh9;

import java.util.Comparator;

/* JADX INFO: loaded from: classes5.dex */
public final class t implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f322346a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f322347b;

    public /* synthetic */ t(Object obj2, int i) {
        this.f322346a = i;
        this.f322347b = obj2;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        switch (this.f322346a) {
            case 0:
                int iCompare = ((s) this.f322347b).compare(obj2, obj3);
                return iCompare != 0 ? iCompare : cim.b.b(((y) obj2).f322366b.f322317b, ((y) obj3).f322366b.f322317b);
            case 1:
                int iCompare2 = ((t) this.f322347b).compare(obj2, obj3);
                return iCompare2 != 0 ? iCompare2 : cim.b.b(((y) obj2).f322365a.f322330h, ((y) obj3).f322365a.f322330h);
            default:
                zq5.j0 j0Var = (zq5.j0) this.f322347b;
                Long lA = zq5.j0.a(j0Var, (zq5.i0) obj3);
                if (lA == null) {
                    lA = l;
                }
                Long lA2 = zq5.j0.a(j0Var, (zq5.i0) obj2);
                return cim.b.b(lA, lA2 != null ? lA2 : Long.MIN_VALUE);
        }
    }
}
