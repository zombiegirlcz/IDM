package x36;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import skm.e0;
import vkm.v1;

/* JADX INFO: loaded from: classes3.dex */
public final class r extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ y f302678w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(y yVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f302678w = yVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new r(this.f302678w, continuation, 0);
            case 1:
                return new r(this.f302678w, continuation, 1);
            case 2:
                return new r(this.f302678w, continuation, 2);
            case 3:
                return new r(this.f302678w, continuation, 3);
            case 4:
                return new r(this.f302678w, continuation, 4);
            case 5:
                return new r(this.f302678w, continuation, 5);
            case 6:
                return new r(this.f302678w, continuation, 6);
            case 7:
                return new r(this.f302678w, continuation, 7);
            default:
                return new r(this.f302678w, continuation, 8);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((r) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
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
                y yVar = this.f302678w;
                jhi.b bVarG = mo3.a.g(yVar.f302691s.a(yVar.o.f71756a.f306286a, w4l.h.f294642c), null, new wyg.s(25), 1);
                this.v = 1;
                Object objX = vkm.q.x(bVarG, this);
                return objX == aVar ? aVar : objX;
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
                this.v = 1;
                Object objJ2 = y.J2(this.f302678w, this);
                return objJ2 == aVar2 ? aVar2 : objJ2;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    s sVar = new s(this.f302678w, null, 0);
                    this.v = 1;
                    if (e0.o(sVar, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
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
                y yVar2 = this.f302678w;
                k18.c cVar = yVar2.f302692t;
                String excludedAssetExternalId = yVar2.o.f71756a.f306286a;
                cVar.getClass();
                Intrinsics.checkNotNullParameter(excludedAssetExternalId, "excludedAssetExternalId");
                jhi.b bVarG2 = mo3.a.g(new v1(new s36.i(cVar, excludedAssetExternalId, null, 1)), null, new wyg.s(26), 1);
                this.v = 1;
                Object objX2 = vkm.q.x(bVarG2, this);
                return objX2 == aVar4 ? aVar4 : objX2;
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
                y yVar3 = this.f302678w;
                String str = yVar3.o.f71756a.f306286a;
                this.v = 1;
                Object objI2 = y.I2(yVar3, str, this);
                return objI2 == aVar5 ? aVar5 : objI2;
            case 5:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                int i21 = this.v;
                if (i21 == 0) {
                    yhm.o.b(obj2);
                    s sVar2 = new s(this.f302678w, null, 1);
                    this.v = 1;
                    if (e0.o(sVar2, this) == aVar6) {
                        return aVar6;
                    }
                } else {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
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
                y yVar4 = this.f302678w;
                t tVar = new t(yVar4, null, 0);
                this.v = 1;
                Object objB = pu7.a.B(yVar4.k, "on_add_maximum_amount_click", tVar, this);
                return objB == aVar7 ? aVar7 : objB;
            case 7:
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                int i32 = this.v;
                if (i32 == 0) {
                    yhm.o.b(obj2);
                    y yVar5 = this.f302678w;
                    wma.e eVar = new wma.e(1, yVar5.f302690r, b46.c.class, "toggleInputPosition", "toggleInputPosition(Lcom/revolut/feature/defi/exchange/impl/ui/exchange_amount/model/DeFiExchangeOrderDraft;)Lcom/revolut/feature/defi/exchange/impl/ui/exchange_amount/model/DeFiExchangeOrderDraft;", 0, 13);
                    this.v = 1;
                    if (y.K2(yVar5, eVar, this) == aVar8) {
                        return aVar8;
                    }
                } else {
                    if (i32 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
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
                y yVar6 = this.f302678w;
                t tVar2 = new t(yVar6, null, 1);
                this.v = 1;
                Object objB2 = pu7.a.B(yVar6.k, "on_toolbar_description_click", tVar2, this);
                return objB2 == aVar9 ? aVar9 : objB2;
        }
    }
}
