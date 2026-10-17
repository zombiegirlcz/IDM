package wyg;

import cli.y;
import com.revolut.core.ui_kit.models.popup.PopupMenuItem;
import com.revolut.data.model.Data;
import com.revolut.feature.wealth.analytics.ui.widgetised.performance.WidgetisedAnalyticsPerformanceContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.feature.crypto.disclaimer.api.DisclaimerParams;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import wvg.d0;

/* JADX INFO: loaded from: classes9.dex */
public final class v extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.wealth.analytics.ui.widgetised.performance.a f301297w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(com.revolut.feature.wealth.analytics.ui.widgetised.performance.a aVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f301297w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                v vVar = new v(this.f301297w, continuation, 0);
                vVar.v = obj2;
                return vVar;
            case 1:
                v vVar2 = new v(this.f301297w, continuation, 1);
                vVar2.v = obj2;
                return vVar2;
            case 2:
                v vVar3 = new v(this.f301297w, continuation, 2);
                vVar3.v = obj2;
                return vVar3;
            case 3:
                v vVar4 = new v(this.f301297w, continuation, 3);
                vVar4.v = obj2;
                return vVar4;
            default:
                v vVar5 = new v(this.f301297w, continuation, 4);
                vVar5.v = obj2;
                return vVar5;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((v) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((v) create((DisclaimerParams) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((v) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((v) create((PopupMenuItem) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((v) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        int i2 = 21;
        int i3 = 22;
        com.revolut.feature.wealth.analytics.ui.widgetised.performance.a aVar = this.f301297w;
        switch (i) {
            case 0:
                Data data = (Data) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.f95110w, new wug.i(data, 20));
                break;
            case 1:
                DisclaimerParams disclaimerParams = (DisclaimerParams) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.f95110w, new bzg.r(disclaimerParams, 5));
                break;
            case 2:
                Data data2 = (Data) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.f95110w, new wug.i(data2, 21));
                break;
            case 3:
                y yVar = aVar.f95110w;
                PopupMenuItem popupMenuItem = (PopupMenuItem) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                Object e = popupMenuItem.getE();
                if (e instanceof iwg.c) {
                    aVar.H2(yVar, new d0((iwg.c) e, i2));
                } else if (e instanceof yyg.a) {
                    oki.h.v2(aVar.f95111x, WidgetisedAnalyticsPerformanceContract$ModalStep.LearnMore.f95104a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                } else if (e instanceof vyg.e) {
                    aVar.H2(yVar, new d0((vyg.e) e, i3));
                }
                break;
            default:
                Data data3 = (Data) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.f95110w, new wug.i(data3, 22));
                break;
        }
        return Unit.f186387a;
    }
}
