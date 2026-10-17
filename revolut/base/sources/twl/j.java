package twl;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import te0.s;
import tof.a3;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class j implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f275058a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f275059b;

    public /* synthetic */ j(p pVar, int i) {
        this.f275058a = i;
        this.f275059b = pVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f275058a) {
            case 0:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                a3 a3Var = (a3) pair.f186385a;
                d dVar = (d) pair.f186386b;
                Intrinsics.h(a3Var);
                Intrinsics.h(dVar);
                p pVar = this.f275059b;
                q qVar = (q) pVar.f275066j.f275055a;
                if (((Boolean) qVar.f275069c.getValue(qVar, q.f[1]).get()).booleanValue()) {
                    pfm.n nVar = new pfm.n(new to7.f(pVar, a3Var, 2), 1);
                    Intrinsics.checkNotNullExpressionValue(nVar, "fromCallable(...)");
                    return nVar;
                }
                pfm.h hVar = new pfm.h(new r2d.e(dVar, 11, pVar, a3Var), 2);
                Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
                return hVar;
            case 1:
                com.google.android.gms.internal.mlkit_vision_face.a.C(null, null, null, 7, this.f275059b.i);
                return Unit.f186387a;
            case 2:
                k3l.j it8 = (k3l.j) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                q qVar2 = (q) this.f275059b.f275066j.f275055a;
                return qVar2.d.getValue(qVar2, q.f[2]).c(s.f270018a).firstOrError();
            default:
                a3 a3Var2 = (a3) obj2;
                Intrinsics.h(a3Var2);
                pfm.n nVar2 = new pfm.n(new to7.f(this.f275059b, a3Var2, 2), 1);
                Intrinsics.checkNotNullExpressionValue(nVar2, "fromCallable(...)");
                return nVar2;
        }
    }
}
