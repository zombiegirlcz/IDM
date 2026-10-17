package e0d;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ozc.s0;
import ozc.t;
import te0.w;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class g implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f121560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f121561b;

    public /* synthetic */ g(j jVar, int i) {
        this.f121560a = i;
        this.f121561b = jVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f121560a) {
            case 0:
                CharSequence it8 = (CharSequence) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                ozc.d dVar = this.f121561b.f121564j;
                String note = it8.toString();
                t tVar = (t) dVar;
                tVar.getClass();
                Intrinsics.checkNotNullParameter(note, "note");
                return w.z0(((s0) tVar.f231329b).H0(), note);
            default:
                Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                return ((qri.b) this.f121561b.k).m();
        }
    }
}
