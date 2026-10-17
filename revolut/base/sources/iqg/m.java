package iqg;

import b6d.r;
import cli.y;
import com.revolut.feature.shared.autoinvest.impl.network.AutoInvestService;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import vkm.j2;

/* JADX INFO: loaded from: classes9.dex */
public final class m extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.vaults.impl.ui.details.spare_change.kompot.b f167848w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(com.revolut.feature.vaults.impl.ui.details.spare_change.kompot.b bVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f167848w = bVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new m(this.f167848w, continuation, 0);
            case 1:
                return new m(this.f167848w, continuation, 1);
            case 2:
                return new m(this.f167848w, continuation, 2);
            default:
                return new m(this.f167848w, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((m) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        com.revolut.feature.vaults.impl.ui.details.spare_change.kompot.b bVar;
        Object objQ;
        ufm.n nVarI0;
        yvh.b bVar2;
        com.revolut.feature.vaults.impl.ui.details.spare_change.kompot.b bVar3;
        Object objQ2;
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
                com.revolut.feature.vaults.impl.ui.details.spare_change.kompot.b bVar4 = this.f167848w;
                h hVar = (h) ((g) ((j2) bVar4.f94751t.f22677a).getValue()).f167838a.getContent();
                j jVar = hVar != null ? hVar.f167840a : null;
                yvh.b bVar5 = jVar != null ? jVar.f167843b : null;
                if (bVar5 == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                ufm.n nVarL = ((r) bVar4.f94747p).l(yvh.b.a(bVar5, false, null, null, null, null, 4093));
                this.v = 1;
                Object objB = nim.a.b(nVarL, this);
                return objB == aVar ? aVar : objB;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                com.revolut.feature.vaults.impl.ui.details.spare_change.kompot.b bVar6 = this.f167848w;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    al6.c cVar = new al6.c(20);
                    ack.n nVar = new ack.n(24);
                    m mVar = new m(bVar6, null, 0);
                    this.v = 1;
                    bVar = bVar6;
                    objQ = n14.k.Q(bVar, null, cVar, nVar, mVar, this, 1);
                    if (objQ == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    bVar = bVar6;
                    objQ = obj2;
                }
                nii.e eVar = (nii.e) objQ;
                if (eVar instanceof nii.d) {
                    bVar.B2();
                } else if (!(eVar instanceof nii.c)) {
                    throw new NoWhenBranchMatchedException();
                }
                return Unit.f186387a;
            case 2:
                Object obj3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    com.revolut.feature.vaults.impl.ui.details.spare_change.kompot.b bVar7 = this.f167848w;
                    y yVar = bVar7.f94751t;
                    Integer num = ((g) ((j2) yVar.f22677a).getValue()).f167839b;
                    if (num == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    float fIntValue = num.intValue();
                    h hVar2 = (h) ((g) ((j2) yVar.f22677a).getValue()).f167838a.getContent();
                    d6d.e eVar2 = null;
                    j jVar2 = hVar2 != null ? hVar2.f167840a : null;
                    if (jVar2 == null || (bVar2 = jVar2.f167842a) == null) {
                        ppg.b bVar8 = bVar7.f94748q;
                        String recipient = bVar7.o.f94744a;
                        Float f = new Float(fIntValue);
                        ypg.p pVar = (ypg.p) bVar8;
                        pVar.getClass();
                        Intrinsics.checkNotNullParameter(recipient, "vaultId");
                        xvh.c cVar2 = pVar.e;
                        yvh.h type = yvh.h.VAULT;
                        yvh.f strategy = yvh.f.SPARE_CHANGE;
                        Intrinsics.checkNotNullParameter(recipient, "recipient");
                        Intrinsics.checkNotNullParameter(type, "type");
                        Intrinsics.checkNotNullParameter(strategy, "strategy");
                        e6d.r rVar = ((r) cVar2).f12732a;
                        rVar.getClass();
                        Intrinsics.checkNotNullParameter(recipient, "recipient");
                        Intrinsics.checkNotNullParameter(type, "type");
                        Intrinsics.checkNotNullParameter(strategy, "strategy");
                        AutoInvestService autoInvestService = rVar.f122986a;
                        if (recipient != null) {
                            String strB = type != null ? type.b() : null;
                            if (strB != null) {
                                eVar2 = new d6d.e(recipient, null, strB);
                            }
                        }
                        ufm.f fVar = new ufm.f(e6d.r.a(autoInvestService.setAutoInvestSetting(new d6d.a(true, eVar2, c6d.b.K(strategy), null, f, null))), new e31.e(26, new e6d.a(rVar, 7)), 3);
                        Intrinsics.checkNotNullExpressionValue(fVar, "doOnSuccess(...)");
                        nVarI0 = w.i0(fVar);
                    } else {
                        nVarI0 = ((r) bVar7.f94747p).l(yvh.b.a(bVar2, true, null, new Float(fIntValue), null, null, 3837));
                    }
                    Object objB2 = nim.a.b(nVarI0, this);
                    if (objB2 != obj3) {
                        objB2 = Unit.f186387a;
                    }
                    if (objB2 == obj3) {
                        return obj3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                com.revolut.feature.vaults.impl.ui.details.spare_change.kompot.b bVar9 = this.f167848w;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    al6.c cVar3 = new al6.c(21);
                    ack.n nVar2 = new ack.n(25);
                    m mVar2 = new m(bVar9, null, 2);
                    this.v = 1;
                    bVar3 = bVar9;
                    objQ2 = n14.k.Q(bVar3, null, cVar3, nVar2, mVar2, this, 1);
                    if (objQ2 == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    bVar3 = bVar9;
                    objQ2 = obj2;
                }
                nii.e eVar3 = (nii.e) objQ2;
                if (eVar3 instanceof nii.d) {
                    bVar3.B2();
                } else if (!(eVar3 instanceof nii.c)) {
                    throw new NoWhenBranchMatchedException();
                }
                return Unit.f186387a;
        }
    }
}
