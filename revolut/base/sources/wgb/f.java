package wgb;

import aw0.n6;
import com.revolut.feature.retail.salary_account.impl.salary_promotion.SalaryPromotionController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class f extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ SalaryPromotionController f297279w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(SalaryPromotionController salaryPromotionController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f297279w = salaryPromotionController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                f fVar = new f(this.f297279w, continuation, 0);
                fVar.v = obj2;
                return fVar;
            case 1:
                f fVar2 = new f(this.f297279w, continuation, 1);
                fVar2.v = obj2;
                return fVar2;
            default:
                f fVar3 = new f(this.f297279w, continuation, 2);
                fVar3.v = obj2;
                return fVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((f) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((f) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((f) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        SalaryPromotionController salaryPromotionController = this.f297279w;
        switch (i) {
            case 0:
                ty0.a aVar = (ty0.a) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                i iVarE3 = salaryPromotionController.R2();
                Object obj3 = aVar.d;
                com.revolut.feature.retail.salary_account.impl.salary_promotion.b bVar = (com.revolut.feature.retail.salary_account.impl.salary_promotion.b) iVarE3;
                bVar.getClass();
                String strJ2 = com.revolut.feature.retail.salary_account.impl.salary_promotion.b.J2(obj3);
                if (strJ2 != null) {
                    Continuation continuation = null;
                    if (((s06.c) bVar.f83024r).c(strJ2)) {
                        bVar.n2(new vq5.w(bVar, continuation, strJ2, continuation, 28), new whi.b(6));
                    } else {
                        bVar.n2(new v(bVar, strJ2, continuation, 0), new whi.b(6));
                    }
                }
                break;
            case 1:
                n6 n6Var = (n6) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                i iVarE32 = salaryPromotionController.R2();
                Object obj4 = n6Var.k;
                String tag2 = n6Var.f;
                com.revolut.feature.retail.salary_account.impl.salary_promotion.b bVar2 = (com.revolut.feature.retail.salary_account.impl.salary_promotion.b) iVarE32;
                bVar2.getClass();
                Intrinsics.checkNotNullParameter(tag2, "tag");
                String strJ22 = com.revolut.feature.retail.salary_account.impl.salary_promotion.b.J2(obj4);
                if (strJ22 != null) {
                    bVar2.n2(new vq5.w(bVar2, tag2, strJ22, null, 28), new whi.b(6));
                }
                break;
            default:
                ty0.a aVar4 = (ty0.a) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                i iVarE33 = salaryPromotionController.R2();
                Object obj5 = aVar4.d;
                com.revolut.feature.retail.salary_account.impl.salary_promotion.b bVar3 = (com.revolut.feature.retail.salary_account.impl.salary_promotion.b) iVarE33;
                bVar3.getClass();
                String strJ23 = com.revolut.feature.retail.salary_account.impl.salary_promotion.b.J2(obj5);
                if (strJ23 != null) {
                    Continuation continuation2 = null;
                    bVar3.n2(new vq5.w(bVar3, continuation2, strJ23, continuation2, 28), new whi.b(6));
                }
                break;
        }
        return Unit.f186387a;
    }
}
