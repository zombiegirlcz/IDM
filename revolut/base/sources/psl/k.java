package psl;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes12.dex */
public final class k extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ n f239527w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(n nVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f239527w = nVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new k(this.f239527w, continuation, 0);
            case 1:
                return new k(this.f239527w, continuation, 1);
            case 2:
                return new k(this.f239527w, continuation, 2);
            case 3:
                return new k(this.f239527w, continuation, 3);
            case 4:
                return new k(this.f239527w, continuation, 4);
            case 5:
                return new k(this.f239527w, continuation, 5);
            case 6:
                return new k(this.f239527w, continuation, 6);
            case 7:
                return new k(this.f239527w, continuation, 7);
            case 8:
                return new k(this.f239527w, continuation, 8);
            default:
                return new k(this.f239527w, continuation, 9);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((k) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                n nVar = this.f239527w;
                j jVar = new j(nVar, null, 0);
                this.v = 1;
                Object objB = pu7.a.B(nVar.e, "on_show_stock_details_screen", jVar, this);
                return objB == aVar ? aVar : objB;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                n nVar2 = this.f239527w;
                j jVar2 = new j(nVar2, null, 1);
                this.v = 1;
                Object objB2 = pu7.a.B(nVar2.e, "showEstimatedSharesDialog", jVar2, this);
                return objB2 == aVar2 ? aVar2 : objB2;
            case 2:
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
                n nVar3 = this.f239527w;
                j jVar3 = new j(nVar3, null, 2);
                this.v = 1;
                Object objB3 = pu7.a.B(nVar3.e, "showEstimatedTotalCostDialog", jVar3, this);
                return objB3 == aVar3 ? aVar3 : objB3;
            case 3:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 != 0) {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                n nVar4 = this.f239527w;
                j jVar4 = new j(nVar4, null, 3);
                this.v = 1;
                Object objB4 = pu7.a.B(nVar4.e, "showEstimatedTotalCreditDialog", jVar4, this);
                return objB4 == aVar4 ? aVar4 : objB4;
            case 4:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 != 0) {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                n nVar5 = this.f239527w;
                j jVar5 = new j(nVar5, null, 4);
                this.v = 1;
                Object objB5 = pu7.a.B(nVar5.e, "showEstimatedTotalValueDialog", jVar5, this);
                return objB5 == aVar5 ? aVar5 : objB5;
            case 5:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                int i21 = this.v;
                if (i21 != 0) {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                n nVar6 = this.f239527w;
                j jVar6 = new j(nVar6, null, 5);
                this.v = 1;
                Object objB6 = pu7.a.B(nVar6.e, "showExpiryDialog", jVar6, this);
                return objB6 == aVar6 ? aVar6 : objB6;
            case 6:
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                int i22 = this.v;
                if (i22 != 0) {
                    if (i22 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                n nVar7 = this.f239527w;
                j jVar7 = new j(nVar7, null, 6);
                this.v = 1;
                Object objB7 = pu7.a.B(nVar7.e, "showFeeBreakdownDialog", jVar7, this);
                return objB7 == aVar7 ? aVar7 : objB7;
            case 7:
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
                n nVar8 = this.f239527w;
                j jVar8 = new j(nVar8, null, 7);
                this.v = 1;
                Object objB8 = pu7.a.B(nVar8.e, "showPartiallyExecutedDialog", jVar8, this);
                return objB8 == aVar8 ? aVar8 : objB8;
            case 8:
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
                n nVar9 = this.f239527w;
                j jVar9 = new j(nVar9, null, 8);
                this.v = 1;
                Object objB9 = pu7.a.B(nVar9.e, "showProjectionsDisclaimerDialog", jVar9, this);
                return objB9 == aVar9 ? aVar9 : objB9;
            default:
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                int i43 = this.v;
                if (i43 != 0) {
                    if (i43 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                n nVar10 = this.f239527w;
                j jVar10 = new j(nVar10, null, 9);
                this.v = 1;
                Object objB10 = pu7.a.B(nVar10.e, "showSettlementDateDialog", jVar10, this);
                return objB10 == aVar10 ? aVar10 : objB10;
        }
    }
}
