package fnk;

import aw0.n6;
import com.revolut.feature_web_view.declaration.WebViewControllerDescriptor;
import com.revolut.feature_web_view.declaration.WebViewInputData;
import com.revolut.feature_web_view.declaration.WebViewScreenTitleSource;
import com.revolut.kompot.common.ControllerDestination;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_preview.PlanPreviewScreen;
import igk.b;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import zhm.h0;

/* JADX INFO: loaded from: classes11.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ PlanPreviewScreen f136696w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(PlanPreviewScreen planPreviewScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f136696w = planPreviewScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                e eVar = new e(this.f136696w, continuation, 0);
                eVar.v = obj2;
                return eVar;
            default:
                e eVar2 = new e(this.f136696w, continuation, 1);
                eVar2.v = obj2;
                return eVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((e) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((e) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        PlanPreviewScreen planPreviewScreen = this.f136696w;
        switch (i) {
            case 0:
                n6 model = (n6) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                i iVarE3 = planPreviewScreen.R2();
                Intrinsics.h(model);
                n nVar = (n) iVarE3;
                nVar.getClass();
                Intrinsics.checkNotNullParameter(model, "model");
                if (Intrinsics.f(model.f, "ID_ACCEPT_AND_CONTINUE_BUTTON")) {
                    nVar.C2(b.a.f161235a);
                }
                break;
            default:
                ty0.a clickData = (ty0.a) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                i iVarE32 = planPreviewScreen.R2();
                Intrinsics.h(clickData);
                n nVar2 = (n) iVarE32;
                nVar2.getClass();
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                if (Intrinsics.f(clickData.f275445a, "ID_FOOTER_TERMS_CLAUSE")) {
                    Object obj3 = clickData.d;
                    String str = obj3 instanceof String ? (String) obj3 : null;
                    if (str == null) {
                        h0 h0Var = h0.f322473a;
                        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                        rd0.d.a(rd0.c.ERROR, "PlanPreviewScreenModel", a0.d.m(obj3, "Unable to handle terms link url; parcel: "), null, h0Var);
                    } else {
                        nVar2.C1(new ControllerDestination.Stack(new WebViewControllerDescriptor(new WebViewInputData(str, WebViewScreenTitleSource.Html.f98166a, true)), null, true));
                    }
                }
                break;
        }
        return Unit.f186387a;
    }
}
