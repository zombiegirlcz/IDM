package o9a;

import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes5.dex */
public final class w extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.pix.impl.flow.authorisation_request.screens.request.a f223174w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(com.revolut.feature.pix.impl.flow.authorisation_request.screens.request.a aVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f223174w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new w(this.f223174w, continuation, 0);
            case 1:
                return new w(this.f223174w, continuation, 1);
            default:
                return new w(this.f223174w, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((w) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        Continuation continuation = null;
        com.revolut.feature.pix.impl.flow.authorisation_request.screens.request.a aVar = this.f223174w;
        switch (i) {
            case 0:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    ku1.v vVar = new ku1.v(10);
                    v vVar2 = new v(0);
                    u uVar = new u(aVar, continuation, 5);
                    this.v = 1;
                    obj2 = n14.k.P(aVar.X(), null, vVar2, vVar, uVar, this);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                nii.e eVar = (nii.e) obj2;
                if (eVar instanceof nii.d) {
                    aVar.C2(l.f223159a);
                } else {
                    if (!(eVar instanceof nii.c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    int i3 = jli.h.f175850a;
                }
                return Unit.f186387a;
            case 1:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    wsg.n nVar = aVar.f80595p;
                    xi0.b.Companion.getClass();
                    efm.d0 d0VarR = osg.b.r(nVar, xi0.b.D, null, null, null, 62);
                    this.v = 1;
                    obj2 = nim.a.b(d0VarR, this);
                    if (obj2 == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                aVar.H2(aVar.f80599t, new afa.s((io3.d) obj2, 12));
                return Unit.f186387a;
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 == 0) {
                    yhm.o.b(obj2);
                    u uVar2 = new u(aVar, continuation, 6);
                    this.v = 1;
                    if (aVar.p2(this, uVar2) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
