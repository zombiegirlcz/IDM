package sbb;

import com.revolut.feature.apm.core.api.ApmToggles$Breb;
import com.revolut.feature.apm.core.api.ApmToggles$Swish;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class j extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ k f261549w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(k kVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f261549w = kVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new j(this.f261549w, continuation, 0);
            case 1:
                return new j(this.f261549w, continuation, 1);
            case 2:
                return new j(this.f261549w, continuation, 2);
            case 3:
                return new j(this.f261549w, continuation, 3);
            case 4:
                return new j(this.f261549w, continuation, 4);
            case 5:
                return new j(this.f261549w, continuation, 5);
            case 6:
                return new j(this.f261549w, continuation, 6);
            case 7:
                return new j(this.f261549w, continuation, 7);
            case 8:
                return new j(this.f261549w, continuation, 8);
            default:
                return new j(this.f261549w, continuation, 9);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((j) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    ty1.b bVar = (ty1.b) this.f261549w.f261550l;
                    bVar.getClass();
                    pfm.z zVarC = bVar.c(yoj.c.APM_BIZUM);
                    this.v = 1;
                    obj2 = nim.a.b(zVarC, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                Intrinsics.checkNotNullExpressionValue(obj2, "await(...)");
                return obj2;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    ufm.i iVarA = ((ty1.b) this.f261549w.f261550l).a();
                    this.v = 1;
                    obj2 = nim.a.b(iVarA, this);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                Intrinsics.checkNotNullExpressionValue(obj2, "await(...)");
                return obj2;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    ty1.b bVar2 = (ty1.b) this.f261549w.f261550l;
                    bVar2.getClass();
                    ufm.c cVarD = bVar2.d(uw1.f.BREB, ApmToggles$Breb.f61793c);
                    this.v = 1;
                    obj2 = nim.a.b(cVarD, this);
                    if (obj2 == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                Intrinsics.checkNotNullExpressionValue(obj2, "await(...)");
                return obj2;
            case 3:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    ufm.c cVarE = ((ty1.b) this.f261549w.f261550l).e();
                    this.v = 1;
                    obj2 = nim.a.b(cVarE, this);
                    if (obj2 == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                Intrinsics.checkNotNullExpressionValue(obj2, "await(...)");
                return obj2;
            case 4:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 == 0) {
                    yhm.o.b(obj2);
                    ty1.b bVar3 = (ty1.b) this.f261549w.f261550l;
                    bVar3.getClass();
                    pfm.z zVarC2 = bVar3.c(yoj.c.APM_MULTIBANCO);
                    this.v = 1;
                    obj2 = nim.a.b(zVarC2, this);
                    if (obj2 == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                Intrinsics.checkNotNullExpressionValue(obj2, "await(...)");
                return obj2;
            case 5:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                int i21 = this.v;
                if (i21 == 0) {
                    yhm.o.b(obj2);
                    ty1.b bVar4 = (ty1.b) this.f261549w.f261550l;
                    bVar4.getClass();
                    ufm.c cVarF = bVar4.f(uw1.f.PAY_ID);
                    this.v = 1;
                    obj2 = nim.a.b(cVarF, this);
                    if (obj2 == aVar6) {
                        return aVar6;
                    }
                } else {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                Intrinsics.checkNotNullExpressionValue(obj2, "await(...)");
                return obj2;
            case 6:
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                int i22 = this.v;
                if (i22 == 0) {
                    yhm.o.b(obj2);
                    ufm.c cVarG = ((ty1.b) this.f261549w.f261550l).g();
                    this.v = 1;
                    obj2 = nim.a.b(cVarG, this);
                    if (obj2 == aVar7) {
                        return aVar7;
                    }
                } else {
                    if (i22 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                Intrinsics.checkNotNullExpressionValue(obj2, "await(...)");
                return obj2;
            case 7:
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                int i32 = this.v;
                if (i32 == 0) {
                    yhm.o.b(obj2);
                    ty1.b bVar5 = (ty1.b) this.f261549w.f261550l;
                    bVar5.getClass();
                    ufm.c cVarF2 = bVar5.f(uw1.f.SPIN);
                    this.v = 1;
                    obj2 = nim.a.b(cVarF2, this);
                    if (obj2 == aVar8) {
                        return aVar8;
                    }
                } else {
                    if (i32 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                Intrinsics.checkNotNullExpressionValue(obj2, "await(...)");
                return obj2;
            case 8:
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                int i33 = this.v;
                if (i33 == 0) {
                    yhm.o.b(obj2);
                    ty1.b bVar6 = (ty1.b) this.f261549w.f261550l;
                    bVar6.getClass();
                    ufm.c cVarD2 = bVar6.d(uw1.f.SWISH, ApmToggles$Swish.f61804c);
                    this.v = 1;
                    obj2 = nim.a.b(cVarD2, this);
                    if (obj2 == aVar9) {
                        return aVar9;
                    }
                } else {
                    if (i33 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                Intrinsics.checkNotNullExpressionValue(obj2, "await(...)");
                return obj2;
            default:
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                int i43 = this.v;
                if (i43 == 0) {
                    yhm.o.b(obj2);
                    ty1.b bVar7 = (ty1.b) this.f261549w.f261550l;
                    bVar7.getClass();
                    pfm.z zVarC3 = bVar7.c(yoj.c.APM_WERO);
                    this.v = 1;
                    obj2 = nim.a.b(zVarC3, this);
                    if (obj2 == aVar10) {
                        return aVar10;
                    }
                } else {
                    if (i43 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                Intrinsics.checkNotNullExpressionValue(obj2, "await(...)");
                return obj2;
        }
    }
}
