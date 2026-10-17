package o9a;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import skm.p0;
import vkm.j2;
import zh9.u0;

/* JADX INFO: loaded from: classes5.dex */
public final class u extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.pix.impl.flow.authorisation_request.screens.request.a f223172w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(com.revolut.feature.pix.impl.flow.authorisation_request.screens.request.a aVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f223172w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new u(this.f223172w, continuation, 0);
            case 1:
                return new u(this.f223172w, continuation, 1);
            case 2:
                return new u(this.f223172w, continuation, 2);
            case 3:
                return new u(this.f223172w, continuation, 3);
            case 4:
                return new u(this.f223172w, continuation, 4);
            case 5:
                return new u(this.f223172w, continuation, 5);
            default:
                return new u(this.f223172w, continuation, 6);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((u) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        int i = this.u;
        int i2 = 0;
        Continuation continuation = null;
        com.revolut.feature.pix.impl.flow.authorisation_request.screens.request.a aVar = this.f223172w;
        int i3 = 1;
        switch (i) {
            case 0:
                cli.y yVar = aVar.f80599t;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 != 0) {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                ryc.a aVar3 = aVar.f80596q;
                String str = ((j) ((j2) yVar.f22677a).getValue()).f223154a;
                boolean z = ((j) ((j2) yVar.f22677a).getValue()).f;
                dj0.d dVar = ((j) ((j2) yVar.f22677a).getValue()).e;
                this.v = 1;
                n8a.s sVar = (n8a.s) aVar3.f258289a;
                sVar.getClass();
                ack.o oVar = new ack.o(str, z, dVar, sVar, (Continuation) null, 16);
                p0 p0Var = p0.f264001a;
                Object objJ = skm.e0.J(elm.f.f127540b, oVar, this);
                return objJ == aVar2 ? aVar2 : objJ;
            case 1:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 != 0) {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                u uVar = new u(aVar, continuation, i2);
                this.v = 1;
                Object objT = do3.q.t(aVar, uVar, this);
                return objT == aVar4 ? aVar4 : objT;
            case 2:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i21 = this.v;
                if (i21 != 0) {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                u uVar2 = new u(aVar, continuation, i3);
                this.v = 1;
                Object objB0 = u0.b0(aVar.X(), "CONFIRM_BUTTON_TAG", uVar2, this);
                return objB0 == aVar5 ? aVar5 : objB0;
            case 3:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                int i22 = this.v;
                if (i22 != 0) {
                    if (i22 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                ryc.a aVar7 = aVar.f80596q;
                String str2 = ((j) ((j2) aVar.f80599t.f22677a).getValue()).f223154a;
                this.v = 1;
                n8a.s sVar2 = (n8a.s) aVar7.f258289a;
                sVar2.getClass();
                n8a.q qVar = new n8a.q(sVar2, str2, continuation, i2);
                p0 p0Var2 = p0.f264001a;
                Object objJ2 = skm.e0.J(elm.f.f127540b, qVar, this);
                return objJ2 == aVar6 ? aVar6 : objJ2;
            case 4:
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                int i32 = this.v;
                if (i32 != 0) {
                    if (i32 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                u uVar3 = new u(aVar, continuation, 3);
                this.v = 1;
                Object objT2 = do3.q.t(aVar, uVar3, this);
                return objT2 == aVar8 ? aVar8 : objT2;
            case 5:
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                int i33 = this.v;
                if (i33 != 0) {
                    if (i33 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                u uVar4 = new u(aVar, continuation, 4);
                this.v = 1;
                Object objB02 = u0.b0(aVar.X(), "CONFIRM_BUTTON_TAG", uVar4, this);
                return objB02 == aVar9 ? aVar9 : objB02;
            default:
                cli.y yVar2 = aVar.f80599t;
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                int i43 = this.v;
                if (i43 == 0) {
                    yhm.o.b(obj2);
                    ryc.a aVar11 = aVar.f80596q;
                    String str3 = ((j) ((j2) yVar2.f22677a).getValue()).f223154a;
                    boolean z3 = !((j) ((j2) yVar2.f22677a).getValue()).f;
                    this.v = 1;
                    n8a.s sVar3 = (n8a.s) aVar11.f258289a;
                    sVar3.getClass();
                    l10.m mVar = new l10.m(sVar3, str3, z3, (Continuation) null, 4);
                    p0 p0Var3 = p0.f264001a;
                    obj2 = skm.e0.J(elm.f.f127540b, mVar, this);
                    if (obj2 == aVar10) {
                        return aVar10;
                    }
                } else {
                    if (i43 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                aVar.H2(yVar2, new a0((g8a.k) obj2, i2));
                return Unit.f186387a;
        }
    }
}
