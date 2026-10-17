package o9a;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import skm.p0;
import vkm.j2;
import zh9.u0;

/* JADX INFO: loaded from: classes5.dex */
public final class b0 extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.pix.impl.flow.authorisation_request.screens.request.a f223147w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ g8a.a f223148x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b0(com.revolut.feature.pix.impl.flow.authorisation_request.screens.request.a aVar, g8a.a aVar2, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f223147w = aVar;
        this.f223148x = aVar2;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new b0(this.f223147w, this.f223148x, continuation, 0);
            case 1:
                return new b0(this.f223147w, this.f223148x, continuation, 1);
            default:
                return new b0(this.f223147w, this.f223148x, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((b0) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        int i = this.u;
        Continuation continuation = null;
        g8a.a aVar = this.f223148x;
        com.revolut.feature.pix.impl.flow.authorisation_request.screens.request.a aVar2 = this.f223147w;
        int i2 = 1;
        switch (i) {
            case 0:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 != 0) {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                ryc.a aVar4 = aVar2.f80596q;
                String str = ((j) ((j2) aVar2.f80599t.f22677a).getValue()).f223154a;
                this.v = 1;
                n8a.s sVar = (n8a.s) aVar4.f258289a;
                sVar.getClass();
                n8a.r rVar = new n8a.r(sVar, str, this.f223148x, null, 0);
                p0 p0Var = p0.f264001a;
                Object objJ = skm.e0.J(elm.f.f127540b, rVar, this);
                return objJ == aVar3 ? aVar3 : objJ;
            case 1:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 != 0) {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                b0 b0Var = new b0(aVar2, aVar, continuation, 0);
                this.v = 1;
                Object objT = do3.q.t(aVar2, b0Var, this);
                return objT == aVar5 ? aVar5 : objT;
            default:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 != 0) {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                b0 b0Var2 = new b0(aVar2, aVar, continuation, i2);
                this.v = 1;
                Object objB0 = u0.b0(aVar2.X(), "REJECT_BUTTON_TAG", b0Var2, this);
                return objB0 == aVar6 ? aVar6 : objB0;
        }
    }
}
