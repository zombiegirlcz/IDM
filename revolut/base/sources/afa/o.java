package afa;

import com.revolut.feature.pockets.impl.ui.pockets_list.PocketsListScreen;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class o extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ PocketsListScreen f3995w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(PocketsListScreen pocketsListScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f3995w = pocketsListScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                o oVar = new o(this.f3995w, continuation, 0);
                oVar.v = obj2;
                return oVar;
            case 1:
                o oVar2 = new o(this.f3995w, continuation, 1);
                oVar2.v = obj2;
                return oVar2;
            default:
                o oVar3 = new o(this.f3995w, continuation, 2);
                oVar3.v = obj2;
                return oVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((o) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((o) create((b0) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((o) create((c) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        int i = this.u;
        PocketsListScreen pocketsListScreen = this.f3995w;
        switch (i) {
            case 0:
                String newTerm = (String) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                h hVarF3 = pocketsListScreen.R2();
                Intrinsics.h(newTerm);
                com.revolut.feature.pockets.impl.ui.pockets_list.c cVar = (com.revolut.feature.pockets.impl.ui.pockets_list.c) hVarF3;
                cVar.getClass();
                Intrinsics.checkNotNullParameter(newTerm, "newTerm");
                cVar.H2(cVar.D, new a31.g(newTerm, 22));
                return Unit.f186387a;
            case 1:
                b0 parcel = (b0) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                h hVarF32 = pocketsListScreen.R2();
                Intrinsics.h(parcel);
                com.revolut.feature.pockets.impl.ui.pockets_list.c cVar2 = (com.revolut.feature.pockets.impl.ui.pockets_list.c) hVarF32;
                cVar2.getClass();
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                Continuation continuation = null;
                if (parcel instanceof z) {
                    z zVar = (z) parcel;
                    cVar2.n2(new v(cVar2, zVar.f4015a, zVar.f4016b, continuation, 2), new whi.b(6));
                } else {
                    if (!(parcel instanceof a0)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    a0 a0Var = (a0) parcel;
                    String str = a0Var.f3976a;
                    wi0.b bVar = a0Var.f3977b;
                    xi0.b.Companion.getClass();
                    if (Intrinsics.f(str, xi0.b.f306272g.f306286a)) {
                        cVar2.l2(new v(cVar2, str, null, bVar), new yi5.b(26));
                    } else {
                        hx7.e.n(new IllegalStateException(j6.a.q("MultiIban is not allowed for ", str)));
                        cVar2.n2(new v(cVar2, str, bVar, continuation, 2), new whi.b(6));
                    }
                }
                return Unit.f186387a;
            default:
                c cVar3 = (c) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                h hVarF33 = pocketsListScreen.R2();
                String currency = cVar3.f3979a;
                wi0.b bVar2 = cVar3.f3980b;
                com.revolut.feature.pockets.impl.ui.pockets_list.c cVar4 = (com.revolut.feature.pockets.impl.ui.pockets_list.c) hVarF33;
                cVar4.getClass();
                Intrinsics.checkNotNullParameter(currency, "currency");
                cVar4.l2(new v(cVar4, currency, bVar2, null, 1), new yi5.b(26));
                return Unit.f186387a;
        }
    }
}
