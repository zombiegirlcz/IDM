package qzb;

import com.revolut.data.model.Data;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import nii.k1;
import nii.l1;
import nii.n1;
import w19.g;

/* JADX INFO: loaded from: classes6.dex */
public final class p extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.rev_points.impl.ui.opt_in.screen.a f250509w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(int i, com.revolut.feature.rev_points.impl.ui.opt_in.screen.a aVar, Continuation continuation) {
        super(2, continuation);
        this.u = i;
        this.f250509w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                p pVar = new p(0, this.f250509w, continuation);
                pVar.v = obj2;
                return pVar;
            case 1:
                p pVar2 = new p(1, this.f250509w, continuation);
                pVar2.v = obj2;
                return pVar2;
            default:
                p pVar3 = new p(2, this.f250509w, continuation);
                pVar3.v = obj2;
                return pVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((p) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((p) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((p) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        com.revolut.feature.rev_points.impl.ui.opt_in.screen.a aVar = this.f250509w;
        switch (i) {
            case 0:
                Data data = (Data) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.f83826x, new qna.p(data, 20));
                break;
            case 1:
                n1 n1Var = (n1) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if ((n1Var instanceof k1) || (n1Var instanceof l1)) {
                    aVar.B2();
                }
                break;
            default:
                Data data2 = (Data) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (data2.getContent() instanceof g.b) {
                    aVar.l2(new u(0, aVar, null), new yi5.b(26));
                }
                aVar.H2(aVar.f83826x, new qna.p(data2, 21));
                break;
        }
        return Unit.f186387a;
    }
}
