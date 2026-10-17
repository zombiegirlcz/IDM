package ccf;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class r implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f23085b;

    public /* synthetic */ r(t tVar, int i) {
        this.f23084a = i;
        this.f23085b = tVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Unit it8 = (Unit) obj2;
        switch (this.f23084a) {
            case 0:
                Intrinsics.checkNotNullParameter(it8, "it");
                t tVar = this.f23085b;
                return ((wbf.n) tVar.f23087p).b(tVar.f23090s, true);
            case 1:
                Intrinsics.checkNotNullParameter(it8, "it");
                return this.f23085b.f23088q.k(false);
            case 2:
                Intrinsics.checkNotNullParameter(it8, "it");
                return this.f23085b.u.f296143a.i.f(Unit.f186387a, true);
            default:
                Intrinsics.checkNotNullParameter(it8, "it");
                return ybl.l.b(this.f23085b.f23093x);
        }
    }
}
