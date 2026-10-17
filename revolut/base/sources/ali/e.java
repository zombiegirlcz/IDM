package ali;

import com.revolut.kompot.navigable.vc.ViewController;
import eki.m;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes10.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ f f6273w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(f fVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f6273w = fVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                e eVar = new e(this.f6273w, continuation, 0);
                eVar.v = obj2;
                return eVar;
            default:
                e eVar2 = new e(this.f6273w, continuation, 1);
                eVar2.v = obj2;
                return eVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((e) create((j) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((e) create((oki.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        f fVar = this.f6273w;
        switch (i) {
            case 0:
                j jVar = (j) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                yji.o oVar = fVar.f6274a;
                if (!(jVar instanceof j)) {
                    throw new NoWhenBranchMatchedException();
                }
                Intrinsics.i(oVar, "null cannot be cast to non-null type com.revolut.kompot.navigable.vc.ViewController<*>");
                if (rd0.e.h(pd.b.e((ViewController) oVar).R, jVar)) {
                    mki.j.a("ScrollerCoordinator#quit()");
                    Intrinsics.i(oVar, "null cannot be cast to non-null type com.revolut.kompot.navigable.vc.ViewController<*>");
                    Intrinsics.i(oVar, "null cannot be cast to non-null type com.revolut.kompot.navigable.vc.ViewController<*>");
                    rd0.e.o((ViewController) oVar, pd.b.e((ViewController) oVar).R, false);
                }
                return Unit.f186387a;
            default:
                oki.a aVar2 = (oki.a) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                m mVar = fVar.d;
                if (Intrinsics.f(mVar.getCurrentList(), aVar2.getF85754b())) {
                    fVar.a(aVar2.getD());
                } else {
                    List currentList = mVar.getCurrentList();
                    Intrinsics.checkNotNullExpressionValue(currentList, "getCurrentList(...)");
                    mVar.e(currentList, aVar2.getF85754b());
                    mVar.submitList(aVar2.getF85754b(), new a4.a(fVar, aVar2, 4));
                }
                return Unit.f186387a;
        }
    }
}
