package mb6;

import com.revolut.feature.terms.api.model.TermsScope;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import sa6.t;
import yhm.o;
import zh9.u0;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.donations.impl.ui.kompot.flow.acceptterms.a f204164w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(com.revolut.feature.donations.impl.ui.kompot.flow.acceptterms.a aVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f204164w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new f(this.f204164w, continuation, 0);
            case 1:
                return new f(this.f204164w, continuation, 1);
            default:
                return new f(this.f204164w, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((f) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                com.revolut.feature.donations.impl.ui.kompot.flow.acceptterms.a aVar2 = this.f204164w;
                if (i == 0) {
                    o.b(obj2);
                    pre.c cVar = ((t) aVar2.o).d;
                    TermsScope.INSTANCE.getClass();
                    pfm.a aVarC = pre.c.c(cVar, TermsScope.f90378r);
                    this.v = 1;
                    if (nim.a.a(aVarC, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                aVar2.C2(c.f204162a);
                return Unit.f186387a;
            case 1:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    com.revolut.feature.donations.impl.ui.kompot.flow.acceptterms.a aVar4 = this.f204164w;
                    f fVar = new f(aVar4, null, 0);
                    this.v = 1;
                    if (u0.c0(aVar4, "PRIMARY_BUTTON_LOADING_TAG", fVar, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 != 0) {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                com.revolut.feature.donations.impl.ui.kompot.flow.acceptterms.a aVar6 = this.f204164w;
                h hVar = new h(aVar6, null);
                this.v = 1;
                Object objP2 = aVar6.p2(this, hVar);
                return objP2 == aVar5 ? aVar5 : objP2;
        }
    }
}
