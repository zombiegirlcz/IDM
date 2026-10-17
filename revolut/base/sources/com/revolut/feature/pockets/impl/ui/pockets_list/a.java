package com.revolut.feature.pockets.impl.ui.pockets_list;

import afa.v;
import com.revolut.feature.onboarding.api.exchange_global_access.ExchangeGlobalAccessInteractor$Output;
import com.revolut.feature.pockets.impl.ui.pockets_list.PocketsListContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import gim.i;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import yhm.o;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends i implements Function1 {
    public int u;
    public final /* synthetic */ c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f80916w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ wi0.b f80917x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, String str, Continuation continuation, wi0.b bVar) {
        super(1, continuation);
        this.v = cVar;
        this.f80916w = str;
        this.f80917x = bVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new a(this.v, this.f80916w, continuation, this.f80917x);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((a) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        c cVar = this.v;
        if (i == 0) {
            o.b(obj2);
            s99.i iVar = cVar.f80925w;
            this.u = 1;
            obj2 = iVar.a(this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        ExchangeGlobalAccessInteractor$Output exchangeGlobalAccessInteractor$Output = (ExchangeGlobalAccessInteractor$Output) obj2;
        boolean z = exchangeGlobalAccessInteractor$Output instanceof ExchangeGlobalAccessInteractor$Output.ShouldLaunch;
        wi0.b bVar = this.f80917x;
        String str = this.f80916w;
        if (z) {
            h.v2(cVar.E, new PocketsListContract$ModalStep.GlobalExchangeAccessCheck(str, bVar, ((ExchangeGlobalAccessInteractor$Output.ShouldLaunch) exchangeGlobalAccessInteractor$Output).f78169a), ModalDestination.Style.FULLSCREEN_FADE.f98307a);
        } else {
            if (!Intrinsics.f(exchangeGlobalAccessInteractor$Output, ExchangeGlobalAccessInteractor$Output.ShouldNotLaunch.f78170a)) {
                throw new NoWhenBranchMatchedException();
            }
            cVar.l2(new v(cVar, str, bVar, null, 0), new yi5.b(26));
        }
        return Unit.f186387a;
    }
}
