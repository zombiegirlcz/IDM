package uhb;

import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerInnerConfiguration;
import com.revolut.feature.retail.salary_account.api.domain.SalaryAccountDestination$SwitchAssistant;
import com.revolut.feature.retail.salary_account.impl.switch_assistant.data.SalarySwitchAssistantService;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import fnc.s;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import skm.e0;
import skm.p0;
import yhm.o;
import zh9.u0;

/* JADX INFO: loaded from: classes6.dex */
public final class h extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.retail.salary_account.impl.switch_assistant.flow.b f280195w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f280196x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(com.revolut.feature.retail.salary_account.impl.switch_assistant.flow.b bVar, String str, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f280195w = bVar;
        this.f280196x = str;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new h(this.f280195w, this.f280196x, continuation, 0);
            default:
                return new h(this.f280195w, this.f280196x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((h) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        int i = this.u;
        String str = this.f280196x;
        com.revolut.feature.retail.salary_account.impl.switch_assistant.flow.b bVar = this.f280195w;
        switch (i) {
            case 0:
                Object obj3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                Continuation continuation = null;
                if (i2 == 0) {
                    o.b(obj2);
                    fkg.a aVar = bVar.f83053s;
                    this.v = 1;
                    ihb.a aVar2 = new ihb.a((s) aVar.f135824b, str, continuation, 0);
                    p0 p0Var = p0.f264001a;
                    Object objJ = e0.J(elm.f.f127540b, aVar2, this);
                    if (objJ != obj3) {
                        objJ = Unit.f186387a;
                    }
                    if (objJ != obj3) {
                        objJ = Unit.f186387a;
                    }
                    if (objJ == obj3) {
                        return obj3;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                bVar.C1(u0.c(new MainScreenFeatureConfig.WithInnerConfiguration(s49.a.AS_TOP, new MainContainerInnerConfiguration(u49.a.f277275a, null, u0.f(new SalaryAccountDestination$SwitchAssistant(SalaryAccountDestination$SwitchAssistant.SwitchAssistantDestination.Entry.f82956a)), 2))));
                return Unit.f186387a;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    o.b(obj2);
                    t1j.b bVar2 = bVar.f83051q;
                    this.v = 1;
                    Object objMarkPayrollUpdateCompleted = ((SalarySwitchAssistantService) ((ugc.a) bVar2.f267380b).f279998b).markPayrollUpdateCompleted(str, this);
                    if (objMarkPayrollUpdateCompleted != aVar3) {
                        objMarkPayrollUpdateCompleted = Unit.f186387a;
                    }
                    if (objMarkPayrollUpdateCompleted != aVar3) {
                        objMarkPayrollUpdateCompleted = Unit.f186387a;
                    }
                    if (objMarkPayrollUpdateCompleted == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                bVar.C1(new BridgeDestination(new FeatureCommand(new MainScreenFeatureConfig.JustShow(s49.a.SINGLE_TOP))));
                return Unit.f186387a;
        }
    }
}
