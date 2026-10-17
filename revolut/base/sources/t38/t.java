package t38;

import com.revolut.core.model.account.AccountId;
import g48.r0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class t extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public rea.m v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public io3.d f267707w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f267708x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ cnh.f f267709y;
    public final /* synthetic */ io3.d z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(cnh.f fVar, io3.d dVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f267709y = fVar;
        this.z = dVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new t(this.f267709y, this.z, continuation, 0);
            default:
                return new t(this.f267709y, this.z, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((t) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        rea.m mVar;
        io3.d dVar;
        rea.m mVar2;
        io3.d dVar2;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.f267708x;
                if (i == 0) {
                    yhm.o.b(obj2);
                    cnh.f fVar = this.f267709y;
                    rea.m mVar3 = (rea.m) fVar.f25428n;
                    r0 r0Var = (r0) fVar.o;
                    this.v = mVar3;
                    io3.d dVar3 = this.z;
                    this.f267707w = dVar3;
                    this.f267708x = 1;
                    obj2 = s.c(r0Var, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                    mVar = mVar3;
                    dVar = dVar3;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        return Unit.f186387a;
                    }
                    dVar = this.f267707w;
                    mVar = this.v;
                    yhm.o.b(obj2);
                }
                pfm.r rVarD = mVar.d((AccountId) obj2, dVar);
                this.v = null;
                this.f267707w = null;
                this.f267708x = 2;
                if (nim.a.a(rVarD, this) == aVar) {
                    return aVar;
                }
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.f267708x;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    cnh.f fVar2 = this.f267709y;
                    rea.m mVar4 = (rea.m) fVar2.f25428n;
                    r0 r0Var2 = (r0) fVar2.o;
                    this.v = mVar4;
                    io3.d dVar4 = this.z;
                    this.f267707w = dVar4;
                    this.f267708x = 1;
                    obj2 = s.c(r0Var2, this);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                    mVar2 = mVar4;
                    dVar2 = dVar4;
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        return Unit.f186387a;
                    }
                    dVar2 = this.f267707w;
                    mVar2 = this.v;
                    yhm.o.b(obj2);
                }
                pfm.r rVarC = mVar2.c((AccountId) obj2, dVar2);
                this.v = null;
                this.f267707w = null;
                this.f267708x = 2;
                if (nim.a.a(rVarC, this) == aVar2) {
                    return aVar2;
                }
                return Unit.f186387a;
        }
    }
}
