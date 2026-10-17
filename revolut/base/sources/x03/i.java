package x03;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class i implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f301467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f301468b;

    public /* synthetic */ i(n nVar, int i) {
        this.f301467a = i;
        this.f301468b = nVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f301467a) {
            case 0:
                a it8 = (a) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return new yhm.r(this.f301468b.i.a(it8.f301459a, it8.f301460b), it8.f301461c, it8.f301459a);
            case 1:
                Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                return okl.m.w(null, null, null, 7, ((q) this.f301468b.k).f301482b);
            default:
                wy2.d dVar = (wy2.d) obj2;
                n nVar = this.f301468b;
                c cVar = nVar.k;
                Intrinsics.h(dVar);
                efm.b bVarU = mo3.a.u(((q) cVar).a(dVar, false, b.TRACK_DELIVERY), nVar.f301475l, true);
                Intrinsics.checkNotNullExpressionValue(bVarU, "withProgress$default(...)");
                return bVarU;
        }
    }
}
