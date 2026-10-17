package ck3;

import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes21.dex */
public final class k extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ n f24765w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(n nVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f24765w = nVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new k(this.f24765w, continuation, 0);
            default:
                return new k(this.f24765w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((k) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
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
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                n nVar = this.f24765w;
                j jVar = new j(nVar, null);
                this.v = 1;
                Object objB = pu7.a.B(nVar.k, "getTermsAndConditions", jVar, this);
                return objB == aVar ? aVar : objB;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                n nVar2 = this.f24765w;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    an1.d dVar = new an1.d(nVar2, 8);
                    a3b.h hVar = new a3b.h(nVar2, 9);
                    m mVar = new m(nVar2, null, 1);
                    this.v = 1;
                    obj2 = n14.k.S(nVar2.X(), null, hVar, dVar, mVar, this);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                nii.h hVar2 = (nii.h) obj2;
                if (!(hVar2 instanceof nii.f)) {
                    if (!(hVar2 instanceof nii.g)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    nVar2.C2(aii.q.f5292a);
                }
                return Unit.f186387a;
        }
    }
}
