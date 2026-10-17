package jvc;

import com.revolut.feature.slot_manager.api.model.SlotContext;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import skm.p0;

/* JADX INFO: loaded from: classes7.dex */
public final class f0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.security_hub.impl.ui.security_hub.c f178821w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f0(com.revolut.feature.security_hub.impl.ui.security_hub.c cVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f178821w = cVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new f0(this.f178821w, continuation, 0);
            default:
                return new f0(this.f178821w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((f0) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        int i = this.u;
        int i2 = 3;
        com.revolut.feature.security_hub.impl.ui.security_hub.c cVar = this.f178821w;
        Continuation continuation = null;
        switch (i) {
            case 0:
                mkd.d dVar = cVar.A;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    se9.d dVar2 = cVar.C;
                    this.v = 1;
                    dVar2.getClass();
                    se9.c cVar2 = new se9.c(dVar2, null, 1);
                    p0 p0Var = p0.f264001a;
                    obj2 = skm.e0.J(elm.f.f127540b, cVar2, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        return Unit.f186387a;
                    }
                    yhm.o.b(obj2);
                }
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                ((gld.f0) dVar).c3(new mkd.a(new SlotContext(akd.s.SECURITY_HUB)));
                jhi.b bVarG = mo3.a.g(((gld.f0) dVar).f144638l.h(), null, null, 3);
                au.c0 c0Var = new au.c0(12, continuation, cVar, zBooleanValue);
                this.v = 2;
                Object objCollect = bVarG.collect(new akg.m(wkm.s.f298328a, c0Var, 5), this);
                if (objCollect != aVar) {
                    objCollect = Unit.f186387a;
                }
                if (objCollect != aVar) {
                    objCollect = Unit.f186387a;
                }
                if (objCollect == aVar) {
                    return aVar;
                }
                return Unit.f186387a;
            default:
                jla.h hVar = cVar.f85643p;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    boolean z = false;
                    boolean z3 = cVar.f85648w == otc.b.RETAIL;
                    if (z3 && hVar.d("security_hub.outbound_limit", null) == bla.c.ENABLED) {
                        z = true;
                    }
                    if ((z3 && hVar.d("security_hub.transaction_limits", null) == bla.c.ENABLED) || z) {
                        smd.s sVar = cVar.z;
                        this.v = 1;
                        obj2 = sVar.c(this);
                        if (obj2 == aVar2) {
                            return aVar2;
                        }
                    }
                    return Unit.f186387a;
                }
                if (i5 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yhm.o.b(obj2);
                cVar.H2(cVar.K, new jck.y(((Boolean) obj2).booleanValue(), i2));
                return Unit.f186387a;
        }
    }
}
