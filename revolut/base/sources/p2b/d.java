package p2b;

import java.math.BigDecimal;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nel.n;
import zhm.f0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f232195a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kge.d f232196b;

    public /* synthetic */ d(kge.d dVar, int i) {
        this.f232195a = i;
        this.f232196b = dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f232195a) {
            case 0:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                n nVar = (n) pair.f186385a;
                List list = (List) pair.f186386b;
                this.f232196b.getClass();
                y49.h hVarK = kge.d.k(nVar, list);
                if (hVarK != null) {
                    return hVarK;
                }
                BigDecimal ZERO = BigDecimal.ZERO;
                Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
                dj0.d dVar = new dj0.d(0L, nVar.i);
                Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
                xi0.b bVar = nVar.i;
                dj0.d dVar2 = new dj0.d(0L, bVar);
                Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
                ej0.b bVar2 = new ej0.b(ZERO, bVar);
                dj0.d dVar3 = new dj0.d(0L, bVar);
                Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
                ej0.b bVar3 = new ej0.b(ZERO, bVar);
                Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
                ej0.b bVar4 = new ej0.b(ZERO, bVar);
                Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
                return new y49.h(nVar, ZERO, dVar, ZERO, dVar2, bVar2, dVar3, null, bVar3, bVar4, ZERO, f0.f322471a);
            case 1:
                String instrumentRef = (String) obj2;
                Intrinsics.checkNotNullParameter(instrumentRef, "instrumentRef");
                return rd0.e.b(((ael.k) ((ybl.b) this.f232196b.f183975c)).f(instrumentRef));
            default:
                Set securityRefs = (Set) obj2;
                Intrinsics.checkNotNullParameter(securityRefs, "securityRefs");
                return !securityRefs.isEmpty() ? ((ael.k) ((ybl.b) this.f232196b.f183975c)).l(securityRefs) : zi0.c.i(f0.f322471a);
        }
    }
}
