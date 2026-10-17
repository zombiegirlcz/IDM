package vr4;

import com.revolut.feature.credit.card.impl.ui.instalment.create.InstalmentFlowContract$InputData;
import com.revolut.feature.credit.card.impl.ui.instalment.create.InstalmentFlowContract$State;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import om4.r1;
import om4.x2;
import vkm.j2;
import zh9.u0;

/* JADX INFO: loaded from: classes22.dex */
public final class o extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.credit.card.impl.ui.instalment.create.b f291495w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(com.revolut.feature.credit.card.impl.ui.instalment.create.b bVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f291495w = bVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new o(this.f291495w, continuation, 0);
            case 1:
                return new o(this.f291495w, continuation, 1);
            case 2:
                return new o(this.f291495w, continuation, 2);
            case 3:
                return new o(this.f291495w, continuation, 3);
            case 4:
                return new o(this.f291495w, continuation, 4);
            default:
                return new o(this.f291495w, continuation, 5);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((o) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        switch (this.u) {
            case 0:
                com.revolut.feature.credit.card.impl.ui.instalment.create.b bVar = this.f291495w;
                qki.d dVar = bVar.f69347w;
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
                f fVar = bVar.f69344r;
                String str = ((InstalmentFlowContract$State) ((j2) dVar.f22677a).getValue()).f69329a;
                Set set = ((InstalmentFlowContract$State) ((j2) dVar.f22677a).getValue()).f69330b;
                ql4.s sVar = ((InstalmentFlowContract$State) ((j2) dVar.f22677a).getValue()).f69331c;
                if (sVar == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                int i2 = sVar.f247179a;
                ql4.s sVar2 = ((InstalmentFlowContract$State) ((j2) dVar.f22677a).getValue()).f69331c;
                if (sVar2 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                String str2 = sVar2.f247183h;
                io3.l lVar = ((InstalmentFlowContract$State) ((j2) dVar.f22677a).getValue()).d;
                this.v = 1;
                Object objA = fVar.a(str, set, i2, str2, lVar, this);
                return objA == aVar ? aVar : objA;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 != 0) {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.credit.card.impl.ui.instalment.create.b bVar2 = this.f291495w;
                o oVar = new o(bVar2, null, 0);
                this.v = 1;
                Object objP2 = bVar2.p2(this, oVar);
                return objP2 == aVar2 ? aVar2 : objP2;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 != 0) {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.credit.card.impl.ui.instalment.create.b bVar3 = this.f291495w;
                o oVar2 = new o(bVar3, null, 1);
                this.v = 1;
                Object objF0 = ue8.c.f0(bVar3, oVar2, this);
                return objF0 == aVar3 ? aVar3 : objF0;
            case 3:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                com.revolut.feature.credit.card.impl.ui.instalment.create.b bVar4 = this.f291495w;
                if (i6 == 0) {
                    yhm.o.b(obj2);
                    lic.a aVar5 = new lic.a(bVar4, 24);
                    up4.h hVar = new up4.h(6);
                    o oVar3 = new o(bVar4, null, 2);
                    this.v = 1;
                    obj2 = n14.k.S(bVar4.X(), null, aVar5, hVar, oVar3, this);
                    if (obj2 == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                if (((nii.h) obj2) instanceof nii.g) {
                    oki.h.D2(bVar4.f69348x);
                }
                return Unit.f186387a;
            case 4:
                com.revolut.feature.credit.card.impl.ui.instalment.create.b bVar5 = this.f291495w;
                qki.d dVar2 = bVar5.f69347w;
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
                s sVar3 = bVar5.f69345s;
                String f69322a = bVar5.o.getF69322a();
                io3.l lVar2 = ((InstalmentFlowContract$State) ((j2) dVar2.f22677a).getValue()).d;
                dj0.d dVar3 = ((InstalmentFlowContract$State) ((j2) dVar2.f22677a).getValue()).e;
                this.v = 1;
                Object objA2 = sVar3.a(f69322a, lVar2, dVar3, this);
                return objA2 == aVar6 ? aVar6 : objA2;
            default:
                com.revolut.feature.credit.card.impl.ui.instalment.create.b bVar6 = this.f291495w;
                InstalmentFlowContract$InputData instalmentFlowContract$InputData = bVar6.o;
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
                al4.n nVar = bVar6.f69346t;
                String f69322a2 = instalmentFlowContract$InputData.getF69322a();
                w4l.h hVar2 = w4l.h.f294642c;
                Continuation continuation = null;
                jhi.b bVarG = mo3.a.g(nim.a.u(new vfg.m(bVar6, continuation, 27), nim.a.u(new tk9.i(2, 20, continuation), u0.m(u0.i(((x2) nVar).p(f69322a2, hVar2), ((r1) bVar6.f69343q).m(instalmentFlowContract$InputData.getF69322a(), w4l.i.f294643c), nim.a.v(bVar6.v.j(hVar2), p.f)), ngm.n.K(new o(bVar6, continuation, 4))))), null, null, 3);
                this.v = 1;
                Object objX = vkm.q.x(bVarG, this);
                return objX == aVar7 ? aVar7 : objX;
        }
    }
}
