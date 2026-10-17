package cuj;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import nii.l1;
import nii.n1;

/* JADX INFO: loaded from: classes11.dex */
public final class t extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f109056w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ y f109057x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ h f109058y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(y yVar, h hVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f109057x = yVar;
        this.f109058y = hVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                t tVar = new t(this.f109057x, this.f109058y, continuation, 0);
                tVar.f109056w = obj2;
                return tVar;
            default:
                t tVar2 = new t(this.f109057x, this.f109058y, continuation, 1);
                tVar2.f109056w = obj2;
                return tVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        n1 n1Var = (n1) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((t) create(n1Var, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                n1 n1Var = (n1) this.f109056w;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    if (n1Var instanceof l1) {
                        this.f109056w = null;
                        this.v = 1;
                        if (y.I2(this.f109057x, this.f109058y, this) == aVar) {
                            return aVar;
                        }
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                n1 n1Var2 = (n1) this.f109056w;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    if (n1Var2 instanceof l1) {
                        this.f109056w = null;
                        this.v = 1;
                        if (y.J2(this.f109057x, this.f109058y, this) == aVar2) {
                            return aVar2;
                        }
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
