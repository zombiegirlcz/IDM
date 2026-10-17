package o22;

import a12.r;
import com.revolut.core.ui_kit.delegates.g6;
import com.revolut.feature.apm.core.models.alias.AliasType;
import com.revolut.feature.apm.core.ui.impl.ui.new_alias.ApmNewAliasScreen;
import com.revolut.feature_web_view.declaration.WebViewControllerDescriptor;
import com.revolut.feature_web_view.declaration.WebViewInputData;
import com.revolut.feature_web_view.declaration.WebViewScreenTitleSource;
import com.revolut.kompot.common.ControllerDestination;
import com.revolut.kompot.common.ModalDestination;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import nya.b0;
import zhm.h0;

/* JADX INFO: loaded from: classes20.dex */
public final class h extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ApmNewAliasScreen f221425w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(ApmNewAliasScreen apmNewAliasScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f221425w = apmNewAliasScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                h hVar = new h(this.f221425w, continuation, 0);
                hVar.v = obj2;
                return hVar;
            default:
                h hVar2 = new h(this.f221425w, continuation, 1);
                hVar2.v = obj2;
                return hVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((h) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((h) create((g6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object obj3;
        int i = this.u;
        ApmNewAliasScreen apmNewAliasScreen = this.f221425w;
        switch (i) {
            case 0:
                ty0.a clickData = (ty0.a) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                d dVarE3 = apmNewAliasScreen.R2();
                Intrinsics.h(clickData);
                n nVar = (n) dVarE3;
                nVar.getClass();
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                Object obj4 = clickData.d;
                if ((obj4 instanceof r ? (r) obj4 : null) == null) {
                    IllegalStateException illegalStateException = new IllegalStateException(a0.d.s("Unknown footer interaction: ", clickData.f275445a, " / ", clickData.f275446b));
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                } else {
                    nVar.C1(new ControllerDestination.Modal(new WebViewControllerDescriptor(new WebViewInputData("https://www.revolut.com/en-HU/legal/privacy/", WebViewScreenTitleSource.Html.f98166a, false)), ModalDestination.Style.POPUP.f98311a));
                }
                break;
            default:
                g6 g6Var = (g6) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                d dVarE32 = apmNewAliasScreen.R2();
                String tab2 = g6Var.f54199a;
                n nVar2 = (n) dVarE32;
                nVar2.getClass();
                Intrinsics.checkNotNullParameter(tab2, "tab");
                if (Intrinsics.f(tab2, "PHONE")) {
                    obj3 = AliasType.PHONE.f61895b;
                } else if (!Intrinsics.f(tab2, "EMAIL")) {
                    IllegalStateException illegalStateException2 = new IllegalStateException(j6.a.q("Unknown tab clicked: ", tab2));
                    h0 h0Var2 = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalStateException2, h0Var2);
                } else {
                    obj3 = AliasType.EMAIL.f61894b;
                }
                nVar2.H2(nVar2.u, new b0(obj3, 17));
                break;
        }
        return Unit.f186387a;
    }
}
