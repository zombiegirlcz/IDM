package ce9;

import ce9.d;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f23425b;

    public /* synthetic */ b(j jVar, int i) {
        this.f23424a = i;
        this.f23425b = jVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f23424a) {
            case 0:
                this.f23425b.f23435c.onNext((p) obj2);
                return Unit.f186387a;
            default:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                n nVar = (n) pair.f186385a;
                p pVar = (p) pair.f186386b;
                Intrinsics.h(pVar);
                Function2 function2 = this.f23425b.f23434b;
                int i = i.f23432a[nVar.ordinal()];
                if (i != 1) {
                    if (i == 2 || i == 3) {
                        efm.r rVarOnErrorReturn = ((efm.r) function2.invoke(null, nVar)).map(new cd0.c(new a(nVar, 0), 15)).startWith(new g(nVar == n.FORCE_REFRESH)).onErrorReturn(new cd0.c(new ccg.c(10), 16));
                        Intrinsics.h(rVarOnErrorReturn);
                        return rVarOnErrorReturn;
                    }
                    if (i != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                efm.r rVarOnErrorReturn2 = ((efm.r) function2.invoke(pVar, nVar)).map(new cd0.c(new ccg.c(11), 17)).startWith(d.a.f23427a).onErrorReturn(new cd0.c(new ccg.c(12), 19));
                Intrinsics.h(rVarOnErrorReturn2);
                return rVarOnErrorReturn2;
        }
    }
}
