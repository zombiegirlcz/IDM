package brc;

import com.revolut.core.ui_kit.delegates.sa;
import com.revolut.feature.salary_switch.impl.ui.brazil.screen.status.SalaryStatusScreen;
import com.revolut.feature.salary_switch.impl.ui.brazil.screen.status.SalaryStatusScreenContract$ModalStep;
import com.revolut.feature.shared.help_centre.api.faq.SharedFaqDestination;
import com.revolut.kompot.bridge.navigation.KompotOverlayFeatureConfig;
import com.revolut.kompot.common.ModalDestination;
import ip0.x10;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import zh9.u0;

/* JADX INFO: loaded from: classes6.dex */
public final class i extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ SalaryStatusScreen f17986w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(SalaryStatusScreen salaryStatusScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f17986w = salaryStatusScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                i iVar = new i(this.f17986w, continuation, 0);
                iVar.v = obj2;
                return iVar;
            case 1:
                i iVar2 = new i(this.f17986w, continuation, 1);
                iVar2.v = obj2;
                return iVar2;
            default:
                i iVar3 = new i(this.f17986w, continuation, 2);
                iVar3.v = obj2;
                return iVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((i) create((x10) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((i) create((sa) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((i) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        SalaryStatusScreen salaryStatusScreen = this.f17986w;
        switch (i) {
            case 0:
                x10 data = (x10) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                q qVarD3 = salaryStatusScreen.d();
                Intrinsics.h(data);
                com.revolut.feature.salary_switch.impl.ui.brazil.screen.status.a aVar2 = (com.revolut.feature.salary_switch.impl.ui.brazil.screen.status.a) qVarD3;
                aVar2.getClass();
                Intrinsics.checkNotNullParameter(data, "data");
                if (Intrinsics.f(data.f167082b.f58316a, "WARNING_ACTION_GET_HELP_ID")) {
                    oki.h.v2(aVar2.f85307t, SalaryStatusScreenContract$ModalStep.SubmitDispute.f85302a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                }
                break;
            case 1:
                sa model = (sa) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                q qVarD32 = salaryStatusScreen.d();
                Intrinsics.h(model);
                com.revolut.feature.salary_switch.impl.ui.brazil.screen.status.a aVar4 = (com.revolut.feature.salary_switch.impl.ui.brazil.screen.status.a) qVarD32;
                aVar4.getClass();
                Intrinsics.checkNotNullParameter(model, "model");
                if (Intrinsics.f(model.f54700a, "WARNING_WIDGET_ID")) {
                    aVar4.C1(u0.c(new KompotOverlayFeatureConfig(new SharedFaqDestination((SharedFaqDestination.StartPoint) new SharedFaqDestination.StartPoint.FaqExplicit("question.i-did-not-receive-my-salary", 6), (SharedFaqDestination.PassthroughData) null, false, 14), yhi.b.POPUP, (Integer) null, 12)));
                }
                break;
            default:
                ty0.a data2 = (ty0.a) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                q qVarD33 = salaryStatusScreen.d();
                Intrinsics.h(data2);
                com.revolut.feature.salary_switch.impl.ui.brazil.screen.status.a aVar6 = (com.revolut.feature.salary_switch.impl.ui.brazil.screen.status.a) qVarD33;
                aVar6.getClass();
                Intrinsics.checkNotNullParameter(data2, "data");
                if (Intrinsics.f(data2.f275445a, "DISPUTE_CHECK_STATUS_LINK_ID")) {
                    Object obj3 = data2.d;
                    cqc.a aVar7 = obj3 instanceof cqc.a ? (cqc.a) obj3 : null;
                    if (aVar7 != null) {
                        oki.h.v2(aVar6.f85307t, new SalaryStatusScreenContract$ModalStep.DisputeStatus(aVar7.f108071a), ModalDestination.Style.POPUP.f98311a);
                    }
                }
                break;
        }
        return Unit.f186387a;
    }
}
