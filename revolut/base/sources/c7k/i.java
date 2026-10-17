package c7k;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import n14.k;
import yhm.o;

/* JADX INFO: loaded from: classes11.dex */
public final class i extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ j f22054w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(j jVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f22054w = jVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new i(this.f22054w, continuation, 0);
            default:
                return new i(this.f22054w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((i) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    o.b(obj2);
                    j jVar = this.f22054w;
                    pfm.a aVarD = ((u6k.c) jVar.f22055p).d(((a) jVar.t2()).f22045a, ((a) jVar.t2()).f22046b);
                    this.v = 1;
                    if (nim.a.a(aVarD, this) == aVar) {
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
                j jVar2 = this.f22054w;
                if (i2 == 0) {
                    o.b(obj2);
                    an1.d dVar = new an1.d(jVar2, 7);
                    a3b.h hVar = new a3b.h(jVar2, 8);
                    i iVar = new i(jVar2, null, 0);
                    this.v = 1;
                    obj2 = k.V(jVar2, null, hVar, dVar, iVar, this, 1);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                if (((nii.h) obj2) instanceof nii.g) {
                    jVar2.u2();
                }
                return Unit.f186387a;
        }
    }
}
