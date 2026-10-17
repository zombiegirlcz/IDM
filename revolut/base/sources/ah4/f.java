package ah4;

import dx4.p4;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class f implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ax4.b f4890b;

    public /* synthetic */ f(ax4.b bVar, int i) {
        this.f4889a = i;
        this.f4890b = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f4889a) {
            case 0:
                return m.a((m) obj2, null, null, this.f4890b, null, 11);
            case 1:
                return c64.k.a((c64.k) obj2, this.f4890b, null, null, false, 14);
            case 2:
                return dh4.f.a((dh4.f) obj2, null, this.f4890b, 1);
            case 3:
                return ff4.i.a((ff4.i) obj2, this.f4890b, null, null, null, null, 254);
            case 4:
                p4 screenDetailsItem = ((fh4.i) obj2).f135136a;
                Intrinsics.checkNotNullParameter(screenDetailsItem, "screenDetailsItem");
                ax4.b constructorState = this.f4890b;
                Intrinsics.checkNotNullParameter(constructorState, "constructorState");
                return new fh4.i(screenDetailsItem, constructorState);
            case 5:
                return h74.a.a((h74.a) obj2, this.f4890b, null, 2);
            case 6:
                return hb4.e.a((hb4.e) obj2, this.f4890b, null, 2);
            case 7:
                ((i65.f) obj2).getClass();
                ax4.b constructorState2 = this.f4890b;
                Intrinsics.checkNotNullParameter(constructorState2, "constructorState");
                return new i65.f(constructorState2);
            case 8:
                return ka4.f.a((ka4.f) obj2, this.f4890b, null, 2);
            case 9:
                return mh4.k.a((mh4.k) obj2, this.f4890b, null, null, null, null, null, 254);
            case 10:
                return nf4.e.a((nf4.e) obj2, this.f4890b, null, 2);
            case 11:
                return oc4.d.a((oc4.d) obj2, this.f4890b, null, 2);
            case 12:
                return pf4.e.a((pf4.e) obj2, this.f4890b, null, 6);
            default:
                return x64.j.a((x64.j) obj2, this.f4890b, null, 6);
        }
    }
}
