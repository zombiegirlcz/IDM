package xdi;

import com.revolut.feature_rev_points_pocket_api.model.RevPointsPocketInfo;
import com.revolut.retail.core.navigation.NaviCommand;
import efm.d0;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zh9.u0;
import zhm.h0;

/* JADX INFO: loaded from: classes10.dex */
public final class p extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ u f304464w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(int i, Continuation continuation, u uVar) {
        super(1, continuation);
        this.u = i;
        this.f304464w = uVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new p(0, continuation, this.f304464w);
            case 1:
                return new p(1, continuation, this.f304464w);
            case 2:
                return new p(2, continuation, this.f304464w);
            case 3:
                return new p(3, continuation, this.f304464w);
            default:
                return new p(4, continuation, this.f304464w);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((p) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        int i = this.u;
        int i2 = 2;
        Continuation continuation = null;
        u uVar = this.f304464w;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 != 0) {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                ldi.f fVar = uVar.f304470p;
                this.v = 1;
                Object objA = ((pdi.k) fVar.f194134a).a(this);
                return objA == aVar ? aVar : objA;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    u uVar2 = this.f304464w;
                    lic.a aVar3 = new lic.a(uVar2, 27);
                    up4.h hVar = new up4.h(12);
                    p pVar = new p(0, continuation, uVar2);
                    this.v = 1;
                    obj2 = n14.k.Q(uVar2, null, aVar3, hVar, pVar, this, 1);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                nii.e eVar = (nii.e) obj2;
                if (eVar instanceof nii.d) {
                    return (RevPointsPocketInfo) ((nii.d) eVar).f216133a;
                }
                if (!(eVar instanceof nii.c)) {
                    throw new NoWhenBranchMatchedException();
                }
                Throwable th10 = ((nii.c) eVar).f216123a;
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, th10, h0Var);
                return null;
            case 2:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 == 0) {
                    yhm.o.b(obj2);
                    d0 d0VarE = uVar.f304471q.e();
                    this.v = 1;
                    obj2 = nim.a.b(d0VarE, this);
                    if (obj2 != aVar4) {
                    }
                    return aVar4;
                }
                if (i6 != 1) {
                    if (i6 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                hha.d dVar = (hha.d) obj2;
                jgk.v vVar = uVar.f304473s;
                Intrinsics.h(dVar);
                this.v = 2;
                Object objD = ((jjk.c) vVar).d(dVar, this);
                if (objD != aVar4) {
                    return objD;
                }
                return aVar4;
            case 3:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i21 = this.v;
                if (i21 == 0) {
                    yhm.o.b(obj2);
                    p pVar2 = new p(i2, continuation, uVar);
                    this.v = 1;
                    obj2 = uVar.p2(this, pVar2);
                    if (obj2 == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return uVar.C1(u0.b((NaviCommand) obj2));
            default:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                int i22 = this.v;
                if (i22 == 0) {
                    yhm.o.b(obj2);
                    t tVar = new t(uVar, null);
                    this.v = 1;
                    obj2 = uVar.p2(this, tVar);
                    if (obj2 == aVar6) {
                        return aVar6;
                    }
                } else {
                    if (i22 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                NaviCommand naviCommand = (NaviCommand) obj2;
                Intrinsics.h(naviCommand);
                return uVar.C1(u0.b(naviCommand));
        }
    }
}
