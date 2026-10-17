package z8h;

import com.revolut.feature.wealth.models.combined_buying_power.CombinedBuyingPowerConverted;
import gim.i;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import r10.r;
import w4l.k;
import yhm.o;
import zh9.u0;
import zhm.h0;

/* JADX INFO: loaded from: classes9.dex */
public final class e extends i implements Function2 {
    public final /* synthetic */ n9l.b A;
    public final /* synthetic */ List B;
    public /* synthetic */ boolean u;
    public final /* synthetic */ g v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f320140w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ xi0.b f320141x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ k f320142y;
    public final /* synthetic */ String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g gVar, String str, xi0.b bVar, k kVar, String str2, n9l.b bVar2, List list, Continuation continuation) {
        super(2, continuation);
        this.v = gVar;
        this.f320140w = str;
        this.f320141x = bVar;
        this.f320142y = kVar;
        this.z = str2;
        this.A = bVar2;
        this.B = list;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, this.f320140w, this.f320141x, this.f320142y, this.z, this.A, this.B, continuation);
        eVar.u = ((Boolean) obj2).booleanValue();
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Boolean bool = (Boolean) obj2;
        bool.booleanValue();
        return ((e) create(bool, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        final g gVar = this.v;
        wzg.a aVar = gVar.f320145b;
        boolean z = this.u;
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        final int i = 1;
        k kVar = this.f320142y;
        String portfolioId = this.f320140w;
        final List list = this.B;
        final xi0.b bVar = this.f320141x;
        if (!z) {
            return nim.a.v(wzg.a.e(aVar, portfolioId, bVar, kVar), new Function1() { // from class: z8h.d
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj3) {
                    switch (i) {
                        case 0:
                            Pair pair = (Pair) obj3;
                            return gVar.c((List) pair.f186385a, null, (CombinedBuyingPowerConverted.MarginBorrowingLimit) ((od0.i) pair.f186386b).f224257a, bVar, list);
                        default:
                            return gVar.c((List) obj3, null, null, bVar, list);
                    }
                }
            });
        }
        Flow flowE = wzg.a.e(aVar, portfolioId, bVar, kVar);
        r rVar = gVar.f320144a;
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        String instrumentRef = this.z;
        Intrinsics.checkNotNullParameter(instrumentRef, "instrumentRef");
        k loadingStrategy = this.f320142y;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        n9l.b updatePeriod = this.A;
        Intrinsics.checkNotNullParameter(updatePeriod, "updatePeriod");
        f8h.d dVar = (f8h.d) rVar.f250851a;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        Intrinsics.checkNotNullParameter(instrumentRef, "instrumentRef");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        Intrinsics.checkNotNullParameter(updatePeriod, "updatePeriod");
        final int i2 = 0;
        return nim.a.v(u0.m(flowE, nim.a.A(rd0.e.n(xam.a.h(new f(gVar, bVar, null), qe0.o.a(dVar.f132782h, new t7h.o(portfolioId, instrumentRef), updatePeriod.a(), loadingStrategy, false, null, 24)), h0.f322473a), new b(1))), new Function1() { // from class: z8h.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj3) {
                switch (i2) {
                    case 0:
                        Pair pair = (Pair) obj3;
                        return gVar.c((List) pair.f186385a, null, (CombinedBuyingPowerConverted.MarginBorrowingLimit) ((od0.i) pair.f186386b).f224257a, bVar, list);
                    default:
                        return gVar.c((List) obj3, null, null, bVar, list);
                }
            }
        });
    }
}
