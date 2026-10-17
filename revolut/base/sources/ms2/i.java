package ms2;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class i implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f208624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f208625b;

    public /* synthetic */ i(k kVar, int i) {
        this.f208624a = i;
        this.f208625b = kVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f208624a) {
            case 0:
                Unit it8 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return (od0.i) ((ks2.d) this.f208625b.f208628h).y0().get();
            case 1:
                ks2.c it9 = (ks2.c) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return (od0.i) ((ks2.d) this.f208625b.f208628h).E0().get();
            case 2:
                ks2.c it10 = (ks2.c) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return (od0.i) ((ks2.d) this.f208625b.f208628h).I0().get();
            case 3:
                ks2.c it11 = (ks2.c) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return (od0.i) ((ks2.d) this.f208625b.f208628h).D0().get();
            default:
                ty0.a it12 = (ty0.a) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                ks2.d dVar = (ks2.d) this.f208625b.f208628h;
                return (od0.i) dVar.f189120s.getValue(dVar, ks2.d.f189108y[17]).get();
        }
    }
}
