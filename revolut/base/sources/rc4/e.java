package rc4;

import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes22.dex */
public final class e extends i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.credit.application.plugins.impl.ui.kontomatik.c f253192w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(com.revolut.feature.credit.application.plugins.impl.ui.kontomatik.c cVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f253192w = cVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new e(this.f253192w, continuation, 0);
            case 1:
                return new e(this.f253192w, continuation, 1);
            case 2:
                return new e(this.f253192w, continuation, 2);
            case 3:
                return new e(this.f253192w, continuation, 3);
            default:
                return new e(this.f253192w, continuation, 4);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    o.b(obj2);
                    com.revolut.feature.credit.application.plugins.impl.ui.kontomatik.c cVar = this.f253192w;
                    com.revolut.feature.credit.application.plugins.impl.ui.kontomatik.a aVar2 = new com.revolut.feature.credit.application.plugins.impl.ui.kontomatik.a(cVar, null, 0);
                    this.v = 1;
                    if (cVar.p2(this, aVar2) == aVar) {
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
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    com.revolut.feature.credit.application.plugins.impl.ui.kontomatik.c cVar2 = this.f253192w;
                    com.revolut.feature.credit.application.plugins.impl.ui.kontomatik.a aVar4 = new com.revolut.feature.credit.application.plugins.impl.ui.kontomatik.a(cVar2, null, 1);
                    this.v = 1;
                    if (cVar2.p2(this, aVar4) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 2:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    o.b(obj2);
                    com.revolut.feature.credit.application.plugins.impl.ui.kontomatik.c cVar3 = this.f253192w;
                    com.revolut.feature.credit.application.plugins.impl.ui.kontomatik.a aVar6 = new com.revolut.feature.credit.application.plugins.impl.ui.kontomatik.a(cVar3, null, 2);
                    this.v = 1;
                    if (cVar3.p2(this, aVar6) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 3:
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    o.b(obj2);
                    com.revolut.feature.credit.application.plugins.impl.ui.kontomatik.c cVar4 = this.f253192w;
                    com.revolut.feature.credit.application.plugins.impl.ui.kontomatik.a aVar8 = new com.revolut.feature.credit.application.plugins.impl.ui.kontomatik.a(cVar4, null, 3);
                    this.v = 1;
                    if (cVar4.p2(this, aVar8) == aVar7) {
                        return aVar7;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 == 0) {
                    o.b(obj2);
                    com.revolut.feature.credit.application.plugins.impl.ui.kontomatik.c cVar5 = this.f253192w;
                    com.revolut.feature.credit.application.plugins.impl.ui.kontomatik.a aVar10 = new com.revolut.feature.credit.application.plugins.impl.ui.kontomatik.a(cVar5, null, 4);
                    this.v = 1;
                    if (cVar5.p2(this, aVar10) == aVar9) {
                        return aVar9;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
