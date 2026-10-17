package s54;

import gim.i;
import hs3.k;
import hs3.l;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;
import zhm.r0;

/* JADX INFO: loaded from: classes22.dex */
public final class c extends i implements Function1 {
    public final /* synthetic */ int u = 1;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.credit.application.plugins.impl.ui.banner.a f259918w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ rv3.b f259919x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.revolut.feature.credit.application.plugins.impl.ui.banner.a aVar, rv3.b bVar, Continuation continuation) {
        super(1, continuation);
        this.f259918w = aVar;
        this.f259919x = bVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c(this.f259919x, this.f259918w, continuation);
            default:
                return new c(this.f259918w, this.f259919x, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((c) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    o.b(obj2);
                    ht3.a aVar2 = ((rv3.c) this.f259919x).f257693b;
                    Intrinsics.i(aVar2, "null cannot be cast to non-null type com.revolut.feature.credit.application.models.metadata.BannerMetadata.PromptAction");
                    com.revolut.feature.credit.application.plugins.impl.ui.banner.a aVar3 = this.f259918w;
                    k kVar = (k) r0.h((l) aVar2, aVar3.f67160q.f67156a.f154908b);
                    this.v = 1;
                    if (com.revolut.feature.credit.application.plugins.impl.ui.banner.a.P2(aVar3, kVar, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    rv3.b bVar = this.f259919x;
                    com.revolut.feature.credit.application.plugins.impl.ui.banner.a aVar5 = this.f259918w;
                    c cVar = new c(bVar, aVar5, (Continuation) null);
                    this.v = 1;
                    if (aVar5.p2(this, cVar) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(rv3.b bVar, com.revolut.feature.credit.application.plugins.impl.ui.banner.a aVar, Continuation continuation) {
        super(1, continuation);
        this.f259919x = bVar;
        this.f259918w = aVar;
    }
}
