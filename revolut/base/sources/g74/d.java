package g74;

import bs3.g;
import c84.t;
import ft3.h1;
import gim.i;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kp0.w0;
import yhm.o;

/* JADX INFO: loaded from: classes22.dex */
public final class d extends i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.credit.application.plugins.impl.ui.consents_v2.a f141105w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ List f141106x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(com.revolut.feature.credit.application.plugins.impl.ui.consents_v2.a aVar, List list, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f141105w = aVar;
        this.f141106x = list;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new d(this.f141105w, this.f141106x, continuation, 0);
            default:
                return new d(this.f141105w, this.f141106x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((d) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                com.revolut.feature.credit.application.plugins.impl.ui.consents_v2.a aVar2 = this.f141105w;
                if (i == 0) {
                    o.b(obj2);
                    sw3.c cVar = aVar2.f67301r;
                    h1 h1VarF = w0.F(aVar2.f67299p.f67293a);
                    lu3.d dVar = new lu3.d(this.f141106x);
                    this.v = 1;
                    obj2 = cVar.a(h1VarF, dVar, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        o.b(obj2);
                        return Unit.f186387a;
                    }
                    o.b(obj2);
                }
                this.v = 2;
                if (t.N2(aVar2, (it3.d) obj2, this, 2) == aVar) {
                    return aVar;
                }
                return Unit.f186387a;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                com.revolut.feature.credit.application.plugins.impl.ui.consents_v2.a aVar4 = this.f141105w;
                if (i2 == 0) {
                    o.b(obj2);
                    sp3.a aVar5 = aVar4.f67302s;
                    bs3.i iVar = new bs3.i("user-consent", g.INCOGNIA);
                    this.v = 1;
                    if (((qq3.g) aVar5).a(iVar, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        o.b(obj2);
                        return Unit.f186387a;
                    }
                    o.b(obj2);
                }
                d dVar2 = new d(aVar4, this.f141106x, null, 0);
                this.v = 2;
                if (aVar4.p2(this, dVar2) == aVar3) {
                    return aVar3;
                }
                return Unit.f186387a;
        }
    }
}
