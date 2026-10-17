package pzd;

import com.revolut.feature.statements.impl.ui.consolidated.StatementsModeConfig;
import com.revolut.feature.statements.impl.ui.consolidated.screen.ConsolidatedStatementScreen;
import com.revolut.feature_web_view.declaration.WebViewControllerDescriptor;
import com.revolut.feature_web_view.declaration.WebViewInputData;
import com.revolut.feature_web_view.declaration.WebViewScreenTitleSource;
import com.revolut.kompot.common.ControllerDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes7.dex */
public final class l extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ConsolidatedStatementScreen f240968w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(ConsolidatedStatementScreen consolidatedStatementScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f240968w = consolidatedStatementScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                l lVar = new l(this.f240968w, continuation, 0);
                lVar.v = obj2;
                return lVar;
            default:
                l lVar2 = new l(this.f240968w, continuation, 1);
                lVar2.v = obj2;
                return lVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((l) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((l) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        ConsolidatedStatementScreen consolidatedStatementScreen = this.f240968w;
        switch (i) {
            case 0:
                String id10 = (String) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                o oVarE3 = consolidatedStatementScreen.R2();
                Intrinsics.h(id10);
                com.revolut.feature.statements.impl.ui.consolidated.screen.a aVar2 = (com.revolut.feature.statements.impl.ui.consolidated.screen.a) oVarE3;
                aVar2.getClass();
                Intrinsics.checkNotNullParameter(id10, "id");
                aVar2.H2(aVar2.f88322x, new pig.y(id10, 12));
                break;
            default:
                ty0.a clickData = (ty0.a) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                o oVarE32 = consolidatedStatementScreen.R2();
                Intrinsics.h(clickData);
                com.revolut.feature.statements.impl.ui.consolidated.screen.a aVar4 = (com.revolut.feature.statements.impl.ui.consolidated.screen.a) oVarE32;
                aVar4.getClass();
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                StatementsModeConfig.Warning warning = ((p) ((j2) aVar4.f88322x.f22677a).getValue()).i.d;
                if (warning != null && Intrinsics.f(warning.d, clickData.f275445a)) {
                    aVar4.C1(new ControllerDestination.Stack(new WebViewControllerDescriptor(new WebViewInputData(warning.f88300c, WebViewScreenTitleSource.Html.f98166a, false)), null, true));
                }
                break;
        }
        return Unit.f186387a;
    }
}
