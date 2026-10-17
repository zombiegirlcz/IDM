package t9e;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class u extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f269001w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ w f269002x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(w wVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f269002x = wVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                u uVar = new u(this.f269002x, continuation, 0);
                uVar.f269001w = obj2;
                return uVar;
            default:
                u uVar2 = new u(this.f269002x, continuation, 1);
                uVar2.f269001w = obj2;
                return uVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        rp0.y yVar = (rp0.y) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((u) create(yVar, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                rp0.y yVar = (rp0.y) this.f269001w;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    j60.a aVar2 = this.f269002x.f269006s;
                    Intrinsics.h(yVar);
                    efm.b bVarG = aVar2.G(yVar);
                    this.f269001w = null;
                    this.v = 1;
                    if (nim.a.a(bVarG, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                rp0.y yVar2 = (rp0.y) this.f269001w;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    j60.a aVar4 = this.f269002x.f269006s;
                    Intrinsics.h(yVar2);
                    efm.b bVarG2 = aVar4.G(yVar2);
                    this.f269001w = null;
                    this.v = 1;
                    if (nim.a.a(bVarG2, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
