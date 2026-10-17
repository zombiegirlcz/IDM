package njg;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import skm.e0;
import yhm.o;

/* JADX INFO: loaded from: classes9.dex */
public final class l extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.trusted_merchants.impl.ui.kompot.list.a f216516w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(com.revolut.feature.trusted_merchants.impl.ui.kompot.list.a aVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f216516w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new l(this.f216516w, continuation, 0);
            case 1:
                return new l(this.f216516w, continuation, 1);
            case 2:
                return new l(this.f216516w, continuation, 2);
            case 3:
                return new l(this.f216516w, continuation, 3);
            default:
                return new l(this.f216516w, continuation, 4);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((l) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    o.b(obj2);
                    efm.b bVarG = ((bjg.f) this.f216516w.o).d.g(Unit.f186387a, false);
                    this.v = 1;
                    if (nim.a.a(bVarG, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    efm.b bVarG2 = ((bjg.f) this.f216516w.o).e.g(Unit.f186387a, false);
                    this.v = 1;
                    if (nim.a.a(bVarG2, this) == aVar2) {
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
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    o.b(obj2);
                    efm.b bVarIgnoreElements = mo3.a.n(((bjg.f) this.f216516w.o).d.f(Unit.f186387a, true)).ignoreElements();
                    Intrinsics.checkNotNullExpressionValue(bVarIgnoreElements, "ignoreElements(...)");
                    this.v = 1;
                    if (nim.a.a(bVarIgnoreElements, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 3:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    o.b(obj2);
                    efm.b bVarIgnoreElements2 = mo3.a.n(((bjg.f) this.f216516w.o).e.f(Unit.f186387a, true)).ignoreElements();
                    Intrinsics.checkNotNullExpressionValue(bVarIgnoreElements2, "ignoreElements(...)");
                    this.v = 1;
                    if (nim.a.a(bVarIgnoreElements2, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 != 0) {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                m mVar = new m(this.f216516w, null, 1);
                this.v = 1;
                Object objO = e0.o(mVar, this);
                return objO == aVar5 ? aVar5 : objO;
        }
    }
}
