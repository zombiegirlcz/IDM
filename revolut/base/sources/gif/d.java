package gif;

import efm.i;
import eif.k;
import g9i.s;
import ge6.j;
import ghk.r;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import qfm.i2;
import qfm.j1;
import qfm.n;
import qfm.p2;
import qfm.x;
import qfm.z;
import skm.p0;
import te0.w;
import tof.q6;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f144176a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f144177b;

    public /* synthetic */ d(h hVar, int i) {
        this.f144176a = i;
        this.f144177b = hVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f144176a) {
            case 0:
                h hVar = this.f144177b;
                tif.b bVar = hVar.f144182c;
                q6 q6Var = hVar.f144184h;
                if (q6Var != null) {
                    bVar.e(q6Var, false);
                    return Unit.f186387a;
                }
                Intrinsics.r("transactionScope");
                throw null;
            case 1:
                Boolean completed = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(completed, "completed");
                if (completed.booleanValue()) {
                    return i.i(Boolean.TRUE);
                }
                h hVar2 = this.f144177b;
                k kVar = hVar2.f144183g;
                Continuation continuation = null;
                if (kVar == null) {
                    Intrinsics.r("transactionsCacheInflater");
                    throw null;
                }
                ufm.c cVar = new ufm.c(new eif.g(kVar, 1), 2);
                Intrinsics.checkNotNullExpressionValue(cVar, "fromCallable(...)");
                i2 i2VarP = new ufm.i(w.i0(cVar), new j(28, new d(hVar2, 2)), 0).p(new j(29, new d(hVar2, 3)));
                z zVar = new z(new n(new j1(i2VarP.v(), new j(21, new r(24)), 2), new j(22, new r(21)), 2), new j(23, new d(hVar2, 0)));
                a08.d dVar = new a08.d(hVar2, 24);
                dfm.c cVar2 = mfm.f.d;
                n nVar = new n(new x(zVar, cVar2, cVar2, dVar, mfm.f.f205043c), pd.b.n(p0.f264003c, new ge7.f(hVar2, continuation, 7)), 0);
                Intrinsics.checkNotNullExpressionValue(nVar, "concatWith(...)");
                return nVar;
            case 2:
                x71.c timeData = (x71.c) obj2;
                Intrinsics.checkNotNullParameter(timeData, "timeData");
                x71.a aVar = (x71.a) timeData.f303137a;
                h hVar3 = this.f144177b;
                if (aVar != null) {
                    k kVar2 = hVar3.f144183g;
                    if (kVar2 != null) {
                        return kVar2.e(aVar);
                    }
                    Intrinsics.r("transactionsCacheInflater");
                    throw null;
                }
                k kVar3 = hVar3.f144183g;
                if (kVar3 != null) {
                    return kVar3.d();
                }
                Intrinsics.r("transactionsCacheInflater");
                throw null;
            default:
                i errors = (i) obj2;
                Intrinsics.checkNotNullParameter(errors, "errors");
                j jVar = new j(24, new s(1, gom.e.f145194a, gom.c.class, "e", "e(Ljava/lang/Throwable;)V", 0, 15));
                dfm.c cVar3 = mfm.f.d;
                en.a aVar2 = mfm.f.f205043c;
                errors.getClass();
                p2 p2VarQ = new x(errors, jVar, cVar3, aVar2, aVar2).b(30000L, TimeUnit.MILLISECONDS).q(5L);
                i flowable = this.f144177b.f144181b.c(false).filter(new j(25, new r(22))).toFlowable(efm.a.DROP);
                j jVar2 = new j(26, new r(23));
                flowable.getClass();
                return p2VarQ.j(new j1(flowable, jVar2, 0));
        }
    }
}
