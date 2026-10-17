package vg6;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import pfm.r;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ k f288763w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f288764x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ String f288765y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(k kVar, String str, String str2, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f288763w = kVar;
        this.f288764x = str;
        this.f288765y = str2;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new f(this.f288763w, this.f288764x, this.f288765y, continuation, 0);
            default:
                return new f(this.f288763w, this.f288764x, this.f288765y, continuation, 1);
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
                if (i == 0) {
                    yhm.o.b(obj2);
                    oe6.a aVar2 = this.f288763w.f288773t;
                    r rVarN = ((xg6.j) aVar2).n("akahu", this.f288764x, this.f288765y);
                    this.v = 1;
                    if (nim.a.a(rVarN, this) == aVar) {
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
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    oe6.a aVar4 = this.f288763w.f288773t;
                    r rVarN2 = ((xg6.j) aVar4).n("akahu", this.f288764x, this.f288765y);
                    this.v = 1;
                    if (nim.a.a(rVarN2, this) == aVar3) {
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
