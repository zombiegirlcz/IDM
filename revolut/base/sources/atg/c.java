package atg;

import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9044a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fo3.c f9045b;

    public /* synthetic */ c(fo3.c cVar, int i) {
        this.f9044a = i;
        this.f9045b = cVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f9044a) {
            case 0:
                String it8 = (String) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return Boolean.valueOf(Intrinsics.f(it8, this.f9045b.b()));
            case 1:
                List balances = (List) obj2;
                Intrinsics.checkNotNullParameter(balances, "balances");
                od0.h hVar = od0.i.Companion;
                dj0.d dVarX = yoj.b.x(balances, this.f9045b.d);
                hVar.getClass();
                return od0.h.a(dVarX);
            case 2:
                List<io3.d> pockets = (List) obj2;
                Intrinsics.checkNotNullParameter(pockets, "pockets");
                for (io3.d dVar : pockets) {
                    if (Intrinsics.f(dVar.f163147c, this.f9045b.d.f306286a)) {
                        return dVar;
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            case 3:
                List balances2 = (List) obj2;
                Intrinsics.checkNotNullParameter(balances2, "balances");
                return yoj.b.x(balances2, this.f9045b.d);
            case 4:
                List filteredPockets = (List) obj2;
                Intrinsics.checkNotNullParameter(filteredPockets, "filteredPockets");
                return new Pair(this.f9045b, filteredPockets);
            default:
                return s0c.c.a((s0c.c) obj2, null, null, this.f9045b.d, 3);
        }
    }
}
