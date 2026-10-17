package wl5;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class q extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public xi0.b f298424w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f298425x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ s f298426y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(s sVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f298426y = sVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new q(this.f298426y, continuation, 0);
            default:
                return new q(this.f298426y, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((q) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        xi0.b bVarY2;
        int i;
        xi0.b bVarY22;
        int i2;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.f298425x;
                s sVar = this.f298426y;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    bVarY2 = s.y2(sVar);
                    int iZ2 = s.z2(sVar);
                    sl5.f fVar = sVar.f298429q;
                    this.f298424w = bVarY2;
                    this.v = iZ2;
                    this.f298425x = 1;
                    Object objE = fVar.e(bVarY2, iZ2, this);
                    if (objE == aVar) {
                        return aVar;
                    }
                    i = iZ2;
                    obj2 = objE;
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i = this.v;
                    bVarY2 = this.f298424w;
                    yhm.o.b(obj2);
                }
                if (((il5.d) obj2) instanceof il5.b) {
                    sVar.v2(new jl5.d(i, bVarY2));
                }
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.f298425x;
                s sVar2 = this.f298426y;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    int iZ22 = s.z2(sVar2);
                    bVarY22 = s.y2(sVar2);
                    sl5.f fVar2 = sVar2.f298429q;
                    this.f298424w = bVarY22;
                    this.v = iZ22;
                    this.f298425x = 1;
                    Object objA = fVar2.a(bVarY22, iZ22, this);
                    if (objA == aVar2) {
                        return aVar2;
                    }
                    i2 = iZ22;
                    obj2 = objA;
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i2 = this.v;
                    bVarY22 = this.f298424w;
                    yhm.o.b(obj2);
                }
                if (((il5.d) obj2) instanceof il5.b) {
                    sVar2.v2(new jl5.b(i2, bVarY22));
                }
                return Unit.f186387a;
        }
    }
}
