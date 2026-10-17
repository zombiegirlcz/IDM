package uv1;

import com.revolut.feature.apm.core.models.alias.Alias;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import nii.n1;

/* JADX INFO: loaded from: classes20.dex */
public final class a0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d0 f283260w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a0(d0 d0Var, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f283260w = d0Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new a0(this.f283260w, continuation, 0);
            case 1:
                return new a0(this.f283260w, continuation, 1);
            case 2:
                return new a0(this.f283260w, continuation, 2);
            default:
                return new a0(this.f283260w, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((a0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((a0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((a0) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((a0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        d0 d0Var = this.f283260w;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    pfm.r rVarB = d0Var.f283270r.b(n02.b.BREB);
                    this.v = 1;
                    if (nim.a.a(rVarB, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    zu1.a aVar3 = d0Var.u;
                    this.v = 1;
                    obj2 = ((rv1.r) aVar3).i(this);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                Alias alias = (Alias) obj2;
                if (alias == null) {
                    return null;
                }
                d0Var.C2(new q(alias));
                return alias;
            case 2:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    zu1.a aVar5 = d0Var.u;
                    this.v = 1;
                    vw1.b bVar = ((rv1.r) aVar5).f257672a;
                    vw1.a aVar6 = vw1.b.Companion;
                    Object objJ = ((uy1.j) bVar).j(false, this);
                    if (objJ != aVar4) {
                        objJ = Unit.f186387a;
                    }
                    if (objJ == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 == 0) {
                    yhm.o.b(obj2);
                    lx1.d dVar = d0Var.f283269q;
                    n02.b bVar2 = n02.b.BREB;
                    this.v = 1;
                    if (((fy1.o) dVar).g(bVar2, this) == aVar7) {
                        return aVar7;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
