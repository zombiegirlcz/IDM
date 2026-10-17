package l54;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import nii.n1;
import yhm.o;

/* JADX INFO: loaded from: classes22.dex */
public final class i extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.credit.application.plugins.impl.ui.autopay.card.flow.b f192157w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(com.revolut.feature.credit.application.plugins.impl.ui.autopay.card.flow.b bVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f192157w = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new i(this.f192157w, continuation, 0);
            case 1:
                return new i(this.f192157w, continuation, 1);
            case 2:
                return new i(this.f192157w, continuation, 2);
            default:
                return new i(this.f192157w, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((i) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((i) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((i) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((i) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                com.revolut.feature.credit.application.plugins.impl.ui.autopay.card.flow.b bVar = this.f192157w;
                h hVar = new h(bVar, null, 0);
                this.v = 1;
                Object objB = pu7.a.B(bVar.k, "confirm autopay method", hVar, this);
                return objB == aVar ? aVar : objB;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    com.revolut.feature.credit.application.plugins.impl.ui.autopay.card.flow.b bVar2 = this.f192157w;
                    com.revolut.feature.credit.application.plugins.impl.ui.autopay.card.flow.a aVar3 = new com.revolut.feature.credit.application.plugins.impl.ui.autopay.card.flow.a(bVar2, null);
                    this.v = 1;
                    if (bVar2.p2(this, aVar3) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 2:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    o.b(obj2);
                    com.revolut.feature.credit.application.plugins.impl.ui.autopay.card.flow.b bVar3 = this.f192157w;
                    h hVar2 = new h(bVar3, null, 1);
                    this.v = 1;
                    if (bVar3.p2(this, hVar2) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    o.b(obj2);
                    com.revolut.feature.credit.application.plugins.impl.ui.autopay.card.flow.b bVar4 = this.f192157w;
                    h hVar3 = new h(bVar4, null, 2);
                    this.v = 1;
                    if (bVar4.p2(this, hVar3) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
