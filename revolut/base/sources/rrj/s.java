package rrj;

import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.retail.feature.impl.budgeting.ui.rev10.goals.category_budget.CategoryBudgetScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class s extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CategoryBudgetScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(CategoryBudgetScreen categoryBudgetScreen, Continuation continuation) {
        super(2, continuation);
        this.v = categoryBudgetScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        s sVar = new s(this.v, continuation);
        sVar.u = obj2;
        return sVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((s) create((ActionsView.Item) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ActionsView.Item item = (ActionsView.Item) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        e eVar = (e) this.v.c0.getValue();
        String actionId = item.f58316a;
        o oVar = (o) eVar;
        oVar.getClass();
        Intrinsics.checkNotNullParameter(actionId, "actionId");
        if (!Intrinsics.f(actionId, "ACTION_ADJUST_ANALYTICS")) {
            throw new IllegalStateException(h30.l.r("Unknown action ", actionId));
        }
        efm.b bVarFlatMapCompletable = oVar.y2().flatMapCompletable(new rpi.d(new k(oVar, 0), 15));
        Intrinsics.checkNotNullExpressionValue(bVarFlatMapCompletable, "flatMapCompletable(...)");
        os2.g gVar = new os2.g(new qp5.x(new BreadcrumbException(), 19));
        bVarFlatMapCompletable.getClass();
        pfm.a aVar2 = new pfm.a(bVarFlatMapCompletable, gVar, 2);
        Intrinsics.checkNotNullExpressionValue(aVar2, "onErrorResumeNext(...)");
        Intrinsics.checkNotNullExpressionValue(aVar2.w(new lhi.b(28, n.f256868a), m.f256867a), "subscribe(...)");
        return Unit.f186387a;
    }
}
