package zrd;

import aw0.d2;
import aw0.k4;
import aw0.l4;
import aw0.m4;
import com.revolut.core.ui_kit.delegates.g6;
import com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.home.TotalWealthController;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class m extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ TotalWealthController f324698w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(TotalWealthController totalWealthController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f324698w = totalWealthController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                m mVar = new m(this.f324698w, continuation, 0);
                mVar.v = obj2;
                return mVar;
            case 1:
                m mVar2 = new m(this.f324698w, continuation, 1);
                mVar2.v = obj2;
                return mVar2;
            case 2:
                m mVar3 = new m(this.f324698w, continuation, 2);
                mVar3.v = obj2;
                return mVar3;
            case 3:
                m mVar4 = new m(this.f324698w, continuation, 3);
                mVar4.v = obj2;
                return mVar4;
            default:
                m mVar5 = new m(this.f324698w, continuation, 4);
                mVar5.v = obj2;
                return mVar5;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((m) create((d2) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((m) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((m) create((k4) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((m) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((m) create((g6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        String strA;
        yld.c chartStyle;
        int i = this.u;
        Object obj3 = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        TotalWealthController totalWealthController = this.f324698w;
        switch (i) {
            case 0:
                d2 selection = (d2) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                b bVarE3 = totalWealthController.R2();
                Intrinsics.h(selection);
                com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.home.a aVar2 = (com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.home.a) bVarE3;
                aVar2.getClass();
                Intrinsics.checkNotNullParameter(selection, "selection");
                aVar2.H2(aVar2.f88028y, new q(selection, 0));
                return Unit.f186387a;
            case 1:
                ty0.a aVar3 = (ty0.a) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                Object obj4 = aVar3.d;
                String url2 = obj4 instanceof String ? (String) obj4 : null;
                if (url2 != null) {
                    com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.home.a aVar5 = (com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.home.a) totalWealthController.R2();
                    aVar5.getClass();
                    Intrinsics.checkNotNullParameter(url2, "url");
                    aVar5.n2(new zr5.k(aVar5, url2, objArr == true ? 1 : 0, 2), new whi.b(6));
                }
                return Unit.f186387a;
            case 2:
                k4 model = (k4) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                b bVarE32 = totalWealthController.R2();
                Intrinsics.h(model);
                com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.home.a aVar7 = (com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.home.a) bVarE32;
                aVar7.getClass();
                Intrinsics.checkNotNullParameter(model, "model");
                if ((model instanceof k4.a) || (model instanceof l4)) {
                    strA = null;
                } else {
                    if (!(model instanceof m4)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    strA = ((m4) model).f10423a.a();
                }
                Iterator<E> it8 = amd.b.a().iterator();
                while (true) {
                    if (it8.hasNext()) {
                        Object next = it8.next();
                        if (Intrinsics.f(((amd.b) next).d(), strA)) {
                            obj3 = next;
                        }
                    }
                }
                aVar7.B.setValue((amd.b) obj3);
                return Unit.f186387a;
            case 3:
                String str = (String) this.v;
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (Intrinsics.f(str, "LINE_CHART_SELECTION_ID")) {
                    chartStyle = yld.c.LINE_CHART;
                } else {
                    if (!Intrinsics.f(str, "PIE_CHART_SELECTION_ID")) {
                        return Unit.f186387a;
                    }
                    chartStyle = yld.c.PIE_CHART;
                }
                com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.home.a aVar9 = (com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.home.a) totalWealthController.R2();
                aVar9.getClass();
                Intrinsics.checkNotNullParameter(chartStyle, "chartStyle");
                aVar9.n2(new zr5.k(aVar9, chartStyle, objArr2 == true ? 1 : 0, 1), new whi.b(6));
                return Unit.f186387a;
            default:
                g6 g6Var = (g6) this.v;
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                b bVarE33 = totalWealthController.R2();
                String id10 = g6Var.f54199a;
                com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.home.a aVar11 = (com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.home.a) bVarE33;
                aVar11.getClass();
                Intrinsics.checkNotNullParameter(id10, "id");
                aVar11.A.setValue(pyd.c.X(id10));
                return Unit.f186387a;
        }
    }
}
