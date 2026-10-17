package ll9;

import com.revolut.feature.pay_with_photo.api.scanflow.ScanFlowFileTooLargeException;
import e60.j;
import e60.k;
import e60.l;
import e60.m;
import gim.i;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import nii.k1;
import nii.l1;
import nii.n1;
import skm.a2;
import t80.m;
import t80.n;
import yhm.o;

/* JADX INFO: loaded from: classes5.dex */
public final class c extends i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ f f196674w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(f fVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f196674w = fVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                c cVar = new c(this.f196674w, continuation, 0);
                cVar.v = obj2;
                return cVar;
            case 1:
                c cVar2 = new c(this.f196674w, continuation, 1);
                cVar2.v = obj2;
                return cVar2;
            default:
                c cVar3 = new c(this.f196674w, continuation, 2);
                cVar3.v = obj2;
                return cVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((c) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((c) create((l) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((c) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        Continuation continuation = null;
        f fVar = this.f196674w;
        switch (i) {
            case 0:
                n1 n1Var = (n1) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                if (n1Var instanceof k1) {
                    a2 a2Var = fVar.f196685s;
                    if (a2Var != null) {
                        a2Var.f(null);
                    }
                    fVar.d3();
                }
                return Unit.f186387a;
            case 1:
                l lVar = (l) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                if (lVar instanceof m) {
                    a2 a2Var2 = fVar.f196684r;
                    if (a2Var2 != null) {
                        a2Var2.f(null);
                    }
                    fVar.f196684r = fVar.T2(new ll6.i(fVar, lVar, continuation, 5), new yi5.b(27));
                } else if (lVar instanceof j) {
                    t80.m mVar = ((j) lVar).f122857a;
                    if (mVar instanceof n) {
                        fVar.e3(new ScanFlowFileTooLargeException());
                    } else if (mVar instanceof t80.o) {
                        fVar.e3(((t80.o) mVar).f268773a);
                    } else if ((mVar instanceof m.e) || (mVar instanceof m.b) || (mVar instanceof m.c)) {
                        fVar.e3(new RuntimeException());
                    } else if (!(mVar instanceof m.a) && !(mVar instanceof m.d)) {
                        throw new NoWhenBranchMatchedException();
                    }
                } else if (!(lVar instanceof k) && !(lVar instanceof l.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                return Unit.f186387a;
            default:
                n1 n1Var2 = (n1) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                fVar.d3();
                if (n1Var2 instanceof l1) {
                    fVar.Z2();
                }
                return Unit.f186387a;
        }
    }
}
