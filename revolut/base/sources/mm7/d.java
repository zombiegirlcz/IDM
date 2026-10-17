package mm7;

import com.revolut.chat.domain.model.ChatListFilter;
import com.revolut.chat.domain.model.ChatTarget;
import com.revolut.chat.domain.model.TicketCreationContext;
import com.revolut.chat.navigation.ChatFlowDestination;
import com.revolut.feature.insurance_car.impl.data.model.ApplicationForm;
import com.revolut.feature.insurance_car.impl.ui.flow.onboarding.main.CarOnboardingFlowContract$State;
import com.revolut.feature.insurance_car.impl.ui.flow.onboarding.main.CarOnboardingFlowContract$Step;
import com.revolut.feature.insurance_car.impl.ui.flow.onboarding.main.j;
import jn7.e;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f207168a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f207169b;

    public /* synthetic */ d(j jVar, int i) {
        this.f207168a = i;
        this.f207169b = jVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f207168a) {
            case 0:
                km7.c it8 = (km7.c) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                j jVar = this.f207169b;
                jVar.U2(ApplicationForm.a(((CarOnboardingFlowContract$State) jVar.A2().f98429a).f75402a, null, it8.f185731a, null, null, null, 1019));
                jVar.S2(CarOnboardingFlowContract$Step.AddressPicker.f75406a);
                return Unit.f186387a;
            case 1:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                j jVar2 = this.f207169b;
                jVar2.s1();
                jVar2.B2(true);
                return Boolean.TRUE;
            case 2:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                j jVar3 = this.f207169b;
                jVar3.s1();
                jVar3.B2(true);
                return Boolean.TRUE;
            default:
                jn7.e result = (jn7.e) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                if (!Intrinsics.f(result, e.a.f176653a)) {
                    throw new NoWhenBranchMatchedException();
                }
                this.f207169b.C1(new ChatFlowDestination(new ChatTarget.ChatList((ChatListFilter) null, (TicketCreationContext) null, (String) null, 15), true));
                return Unit.f186387a;
        }
    }
}
