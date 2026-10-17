package gq9;

import com.revolut.feature.pay_with_photo.api.scanflow.ScanFlowFileTooLargeException;
import e60.k;
import e60.l;
import e60.m;
import gm6.j;
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
public final class b extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ f f145597w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(f fVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f145597w = fVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                b bVar = new b(this.f145597w, continuation, 0);
                bVar.v = obj2;
                return bVar;
            case 1:
                b bVar2 = new b(this.f145597w, continuation, 1);
                bVar2.v = obj2;
                return bVar2;
            default:
                b bVar3 = new b(this.f145597w, continuation, 2);
                bVar3.v = obj2;
                return bVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((b) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((b) create((l) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((b) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        Continuation continuation = null;
        f fVar = this.f145597w;
        switch (i) {
            case 0:
                n1 n1Var = (n1) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                if (n1Var instanceof k1) {
                    a2 a2Var = fVar.v;
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
                    a2 a2Var2 = fVar.u;
                    if (a2Var2 != null) {
                        a2Var2.f(null);
                    }
                    fVar.u = fVar.T2(new j(fVar, lVar, continuation, 4), new yi5.b(27));
                } else if (lVar instanceof e60.j) {
                    t80.m mVar = ((e60.j) lVar).f122857a;
                    if (mVar instanceof n) {
                        fVar.f3(new ScanFlowFileTooLargeException());
                    } else if (mVar instanceof t80.o) {
                        fVar.f3(((t80.o) mVar).f268773a);
                    } else if ((mVar instanceof m.e) || (mVar instanceof m.b) || (mVar instanceof m.c)) {
                        fVar.f3(new RuntimeException());
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
                    fVar.e3();
                }
                return Unit.f186387a;
        }
    }
}
