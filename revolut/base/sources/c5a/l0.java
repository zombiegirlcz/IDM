package c5a;

import com.revolut.core.ui_kit.models.AppTipUIModel;
import java.time.Duration;
import java.time.Instant;
import java.time.temporal.TemporalAmount;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes5.dex */
public final class l0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.payments.who_to_transfer.impl.ui.chats.f f21511w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l0(com.revolut.feature.payments.who_to_transfer.impl.ui.chats.f fVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f21511w = fVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new l0(this.f21511w, continuation, 0);
            case 1:
                return new l0(this.f21511w, continuation, 1);
            case 2:
                return new l0(this.f21511w, continuation, 2);
            case 3:
                return new l0(this.f21511w, continuation, 3);
            case 4:
                return new l0(this.f21511w, continuation, 4);
            default:
                return new l0(this.f21511w, continuation, 5);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((l0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((l0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((l0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((l0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((l0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((l0) create((AppTipUIModel) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object objZ;
        efm.b aVar;
        switch (this.u) {
            case 0:
                Object obj3 = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    lal.a aVar2 = this.f21511w.T;
                    this.v = 1;
                    o4a.h hVar = (o4a.h) aVar2.f193427c;
                    Set filter = com.revolut.feature.payments.who_to_transfer.api.common.a.f80009a;
                    hVar.getClass();
                    Intrinsics.checkNotNullParameter(filter, "filter");
                    Map map = Intrinsics.f(filter, filter) ? (Map) hVar.f222185a.get("ALL_FILTERS_CACHE_KEY") : null;
                    if ((map != null && !map.isEmpty()) || (objZ = vkm.q.z(new njj.n(rd0.e.b(aVar2.y(filter)), 27), this)) != obj3) {
                        objZ = Unit.f186387a;
                    }
                    if (objZ == obj3) {
                        return obj3;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 1:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    pfm.n nVar = new pfm.n(new tx9.a(((tx9.f) this.f21511w.f80172p.d).f275378a, 5), 1);
                    Intrinsics.checkNotNullExpressionValue(nVar, "fromCallable(...)");
                    pfm.r rVarG0 = te0.w.g0(nVar);
                    this.v = 1;
                    if (nim.a.a(rVarG0, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 2:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    sl3.u uVar = ((wl3.h) this.f21511w.f80179y).f298381b;
                    Long l2 = (Long) uVar.d.T2("remote_contacts_sync_time", sl3.u.f);
                    Instant instantPlus = Instant.ofEpochMilli(l2 != null ? l2.longValue() : 0L).plus((TemporalAmount) Duration.ofHours(1L));
                    Instant instantOfEpochMilli = Instant.ofEpochMilli(System.currentTimeMillis());
                    if (instantOfEpochMilli.isAfter(instantPlus)) {
                        efm.d0 d0VarFirstOrError = uVar.f264132a.g().firstOrError();
                        sl3.r rVar = new sl3.r(new sl3.s(uVar, 0), 3);
                        d0VarFirstOrError.getClass();
                        aVar = new pfm.a(new pfm.a(d0VarFirstOrError, rVar, 4).l(new rzc.b(uVar, instantOfEpochMilli, 11)), mfm.f.f205044g, 1);
                    } else {
                        aVar = pfm.m.f235744a;
                    }
                    pfm.r rVarG02 = te0.w.g0(aVar);
                    this.v = 1;
                    if (nim.a.a(rVarG02, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 3:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 != 0) {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.payments.who_to_transfer.impl.ui.chats.f fVar = this.f21511w;
                n0 n0Var = new n0(fVar, null);
                this.v = 1;
                Object objB = pu7.a.B(fVar.k, "onNavBarTitleClicked", n0Var, this);
                return objB == aVar5 ? aVar5 : objB;
            case 4:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 != 0) {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.payments.who_to_transfer.impl.ui.chats.f fVar2 = this.f21511w;
                s0 s0Var = new s0(fVar2, null);
                this.v = 1;
                Object objB2 = pu7.a.B(fVar2.k, "onSearchClicked", s0Var, this);
                return objB2 == aVar6 ? aVar6 : objB2;
            default:
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                int i21 = this.v;
                if (i21 == 0) {
                    yhm.o.b(obj2);
                    i4a.d dVar = this.f21511w.f80178x;
                    this.v = 1;
                    Object objE = ((kce.q) dVar.f158319a).f182716j.e(new tk0.b("SCHEDULED_TOOLTIP_SHOWED_KEY"), Boolean.TRUE, this);
                    if (objE != aVar7) {
                        objE = Unit.f186387a;
                    }
                    if (objE != aVar7) {
                        objE = Unit.f186387a;
                    }
                    if (objE == aVar7) {
                        return aVar7;
                    }
                } else {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
