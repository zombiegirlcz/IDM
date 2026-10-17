package flm;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;
import skm.k0;

/* JADX INFO: loaded from: classes14.dex */
public final /* synthetic */ class a extends q implements Function3 {
    public static final a f = new a(3, b.class, "register", "register(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        b bVar = (b) obj2;
        i iVar = (i) obj3;
        long j2 = bVar.f136003a;
        if (j2 <= 0) {
            ((h) iVar).e = Unit.f186387a;
        } else {
            d0.c cVar = new d0.c(iVar, bVar, 16);
            Intrinsics.i(iVar, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>");
            h hVar = (h) iVar;
            CoroutineContext coroutineContext = hVar.f136011a;
            hVar.f136013c = k0.d(coroutineContext).j(j2, cVar, coroutineContext);
        }
        return Unit.f186387a;
    }
}
