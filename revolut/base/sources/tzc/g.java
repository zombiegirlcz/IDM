package tzc;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ozc.s0;
import ozc.t;
import te0.w;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class g implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f275916a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f275917b;

    public /* synthetic */ g(j jVar, int i) {
        this.f275916a = i;
        this.f275917b = jVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f275916a) {
            case 0:
                CharSequence it8 = (CharSequence) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                ozc.d dVar = this.f275917b.f275920j;
                String description = it8.toString();
                t tVar = (t) dVar;
                tVar.getClass();
                Intrinsics.checkNotNullParameter(description, "description");
                return w.z0(((s0) tVar.f231329b).B0(), description);
            default:
                Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                j jVar = this.f275917b;
                t tVar2 = (t) jVar.f275920j;
                return tVar2.j3((String) ((s0) tVar2.f231329b).B0().get()).e(((qri.b) jVar.k).m());
        }
    }
}
