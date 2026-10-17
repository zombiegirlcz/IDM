package rc4;

import gim.i;
import iv3.f;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yc4.q;
import yc4.u;
import yhm.o;

/* JADX INFO: loaded from: classes22.dex */
public final class f extends i implements Function2 {
    public final /* synthetic */ int u = 0;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ u f253193w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.credit.application.plugins.impl.ui.kontomatik.c f253194x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.revolut.feature.credit.application.plugins.impl.ui.kontomatik.c cVar, u uVar, Continuation continuation) {
        super(2, continuation);
        this.f253194x = cVar;
        this.f253193w = uVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new f(this.f253194x, this.f253193w, continuation);
            default:
                return new f(this.f253193w, this.f253194x, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    o.b(obj2);
                    com.revolut.feature.credit.application.plugins.impl.ui.kontomatik.c cVar = this.f253194x;
                    com.revolut.feature.credit.application.plugins.impl.ui.kontomatik.b bVar = new com.revolut.feature.credit.application.plugins.impl.ui.kontomatik.b(cVar, this.f253193w, null, 0);
                    this.v = 1;
                    if (cVar.p2(this, bVar) == aVar) {
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
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    u uVar = this.f253193w;
                    if (!(((q) uVar).f312527a instanceof f.a)) {
                        com.revolut.feature.credit.application.plugins.impl.ui.kontomatik.c cVar2 = this.f253194x;
                        com.revolut.feature.credit.application.plugins.impl.ui.kontomatik.b bVar2 = new com.revolut.feature.credit.application.plugins.impl.ui.kontomatik.b(cVar2, uVar, null, 1);
                        this.v = 1;
                        if (cVar2.p2(this, bVar2) == aVar2) {
                            return aVar2;
                        }
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
    public f(u uVar, com.revolut.feature.credit.application.plugins.impl.ui.kontomatik.c cVar, Continuation continuation) {
        super(2, continuation);
        this.f253193w = uVar;
        this.f253194x = cVar;
    }
}
