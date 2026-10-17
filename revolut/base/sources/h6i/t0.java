package h6i;

import com.revolut.feature_move_money.api.model.AccountWrapper;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes10.dex */
public final class t0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ b9k.f f149721w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ AccountWrapper f149722x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ x5i.d f149723y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t0(b9k.f fVar, AccountWrapper accountWrapper, x5i.d dVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f149721w = fVar;
        this.f149722x = accountWrapper;
        this.f149723y = dVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new t0(this.f149721w, this.f149722x, this.f149723y, continuation, 0);
            case 1:
                return new t0(this.f149721w, this.f149722x, this.f149723y, continuation, 1);
            case 2:
                return new t0(this.f149721w, this.f149722x, this.f149723y, continuation, 2);
            case 3:
                return new t0(this.f149721w, this.f149722x, this.f149723y, continuation, 3);
            default:
                return new t0(this.f149721w, this.f149722x, this.f149723y, continuation, 4);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((t0) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
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
                wd6.c cVar = wd6.c.COMMODITY_ONLY;
                k1j.a aVar2 = k1j.a.COMMODITIES_NON_EXISTING_CURRENCY;
                this.v = 1;
                Object objN = this.f149721w.n(this.f149722x, this.f149723y, cVar, aVar2, this);
                return objN == aVar ? aVar : objN;
            case 1:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                wd6.c cVar2 = wd6.c.CRYPTO_ONLY;
                k1j.a aVar4 = k1j.a.CRYPTO_NON_EXISTING_CURRENCY;
                this.v = 1;
                Object objN2 = this.f149721w.n(this.f149722x, this.f149723y, cVar2, aVar4, this);
                return objN2 == aVar3 ? aVar3 : objN2;
            case 2:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 != 0) {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                wd6.c cVar3 = wd6.c.FIAT_ONLY;
                k1j.a aVar6 = k1j.a.NON_EXISTING_CURRENCY;
                this.v = 1;
                Object objN3 = this.f149721w.n(this.f149722x, this.f149723y, cVar3, aVar6, this);
                return objN3 == aVar5 ? aVar5 : objN3;
            case 3:
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    wkm.l lVarA = k38.c.a((g48.r0) this.f149721w.e, null, null, 3);
                    this.v = 1;
                    obj2 = vkm.q.x(lVarA, this);
                    if (obj2 == aVar7) {
                        return aVar7;
                    }
                } else {
                    if (i5 != 1) {
                        if (i5 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        return (Set) obj2;
                    }
                    yhm.o.b(obj2);
                }
                if (obj2 == null) {
                    return zhm.h0.f322473a;
                }
                wd6.c cVar4 = wd6.c.FIAT_ONLY;
                k1j.a aVar8 = k1j.a.JOINT_NON_EXISTING_CURRENCY;
                this.v = 2;
                obj2 = this.f149721w.n(this.f149722x, this.f149723y, cVar4, aVar8, this);
                if (obj2 == aVar7) {
                    return aVar7;
                }
                return (Set) obj2;
            default:
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 == 0) {
                    yhm.o.b(obj2);
                    gr6.a aVar10 = (gr6.a) this.f149721w.f;
                    this.v = 1;
                    obj2 = ((et6.g) aVar10).c(w4l.j.f294644c, this);
                    if (obj2 == aVar9) {
                        return aVar9;
                    }
                } else {
                    if (i6 != 1) {
                        if (i6 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        return (Set) obj2;
                    }
                    yhm.o.b(obj2);
                }
                if (!((Boolean) obj2).booleanValue()) {
                    return zhm.h0.f322473a;
                }
                wd6.c cVar5 = wd6.c.FREELANCER_ONLY;
                k1j.a aVar11 = k1j.a.PRO_NON_EXISTING_CURRENCY;
                this.v = 2;
                obj2 = this.f149721w.n(this.f149722x, this.f149723y, cVar5, aVar11, this);
                if (obj2 == aVar9) {
                    return aVar9;
                }
                return (Set) obj2;
        }
    }
}
