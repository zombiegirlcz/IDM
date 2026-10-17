package n33;

import com.revolut.core.model.account.AccountId;
import com.revolut.feature.card_input.api.CardInputFeatureConfig;
import com.revolut.feature.cards_core.R$string;
import com.revolut.feature.freelancer.common.models.FreelancerAccountOnboardingState;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.revolut.feature_fourthline_impl.R;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class g2 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f211723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r2 f211724b;

    public /* synthetic */ g2(r2 r2Var, int i) {
        this.f211723a = i;
        this.f211724b = r2Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        h93.l0 l0Var;
        h93.j0 j0Var;
        h93.l0 l0Var2;
        h93.j0 j0Var2;
        switch (this.f211723a) {
            case 0:
                NaviCommand command = (NaviCommand) obj2;
                Intrinsics.checkNotNullParameter(command, "command");
                return new pfm.h(new l2(this.f211724b, command, 12), 2);
            case 1:
                od0.i creditCardRevolutCardDetailsOptional = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(creditCardRevolutCardDetailsOptional, "creditCardRevolutCardDetailsOptional");
                if (creditCardRevolutCardDetailsOptional.d()) {
                    cl4.o oVar = (cl4.o) creditCardRevolutCardDetailsOptional.c();
                    j0Var = oVar.f24956a;
                    l0Var = oVar.f24957b;
                } else {
                    l0Var = h93.l0.CREDIT;
                    j0Var = null;
                }
                h93.l0 l0Var3 = l0Var;
                h93.j0 j0Var3 = j0Var;
                r2 r2Var = this.f211724b;
                ufm.b bVarM = efm.d0.m(f73.b.b(r2Var.f211794b, b93.e.VIRTUAL, AccountId.Personal.f51414a, xfa.b.CARDS_TAB_FULL_SCREEN, null, false, ((t0) r2Var.d).c(), null, true, null, r2Var.d(), j0Var3, l0Var3, 696));
                Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
                return bVarM;
            case 2:
                NaviCommand command2 = (NaviCommand) obj2;
                Intrinsics.checkNotNullParameter(command2, "command");
                return new pfm.h(new l2(this.f211724b, command2, 5), 2);
            case 3:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                FreelancerAccountOnboardingState freelancerAccountOnboardingState = (FreelancerAccountOnboardingState) pair.f186385a;
                NaviCommand naviCommand = (NaviCommand) pair.f186386b;
                boolean z = freelancerAccountOnboardingState instanceof FreelancerAccountOnboardingState.NotOnboarded;
                r2 r2Var2 = this.f211724b;
                if (!z) {
                    return new pfm.h(new l2(r2Var2, naviCommand, 7), 2);
                }
                ufm.i iVar = new ufm.i(ks8.m.a(r2Var2.f211796g), new i2(21, new n09.j0(r2Var2, naviCommand, 23)), 0);
                Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
                pfm.a aVar = new pfm.a(iVar, new i2(20, new g2(r2Var2, 16)), 4);
                Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
                return aVar;
            case 4:
                NaviCommand command3 = (NaviCommand) obj2;
                Intrinsics.checkNotNullParameter(command3, "command");
                return new pfm.h(new l2(this.f211724b, command3, 1), 2);
            case 5:
                NaviCommand command4 = (NaviCommand) obj2;
                Intrinsics.checkNotNullParameter(command4, "command");
                return new pfm.h(new l2(this.f211724b, command4, 4), 2);
            case 6:
                NaviCommand command5 = (NaviCommand) obj2;
                Intrinsics.checkNotNullParameter(command5, "command");
                return new pfm.h(new l2(this.f211724b, command5, 13), 2);
            case 7:
                NaviCommand command6 = (NaviCommand) obj2;
                Intrinsics.checkNotNullParameter(command6, "command");
                return new pfm.h(new l2(this.f211724b, command6, 3), 2);
            case 8:
                od0.i creditCardRevolutCardDetailsOptional2 = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(creditCardRevolutCardDetailsOptional2, "creditCardRevolutCardDetailsOptional");
                if (creditCardRevolutCardDetailsOptional2.d()) {
                    cl4.o oVar2 = (cl4.o) creditCardRevolutCardDetailsOptional2.c();
                    j0Var2 = oVar2.f24956a;
                    l0Var2 = oVar2.f24957b;
                } else {
                    l0Var2 = h93.l0.CREDIT;
                    j0Var2 = null;
                }
                h93.l0 l0Var4 = l0Var2;
                h93.j0 j0Var4 = j0Var2;
                r2 r2Var3 = this.f211724b;
                ufm.b bVarM2 = efm.d0.m(f73.b.b(r2Var3.f211794b, b93.e.PHYSICAL, AccountId.Personal.f51414a, xfa.b.CARDS_TAB_FULL_SCREEN, null, false, ((t0) r2Var3.d).c(), null, true, null, r2Var3.d(), j0Var4, l0Var4, 696));
                Intrinsics.checkNotNullExpressionValue(bVarM2, "just(...)");
                return bVarM2;
            case 9:
                NaviCommand command7 = (NaviCommand) obj2;
                Intrinsics.checkNotNullParameter(command7, "command");
                return new pfm.h(new l2(this.f211724b, command7, 6), 2);
            case 10:
                NaviCommand command8 = (NaviCommand) obj2;
                Intrinsics.checkNotNullParameter(command8, "command");
                return new pfm.h(new l2(this.f211724b, command8, 11), 2);
            case 11:
                NaviCommand command9 = (NaviCommand) obj2;
                Intrinsics.checkNotNullParameter(command9, "command");
                return new pfm.h(new l2(this.f211724b, command9, 2), 2);
            case 12:
                h hVar = (h) obj2;
                boolean z3 = hVar.f211727c;
                r2 r2Var4 = this.f211724b;
                if (z3) {
                    int i = hVar.f211725a;
                    t70.g gVar = r2Var4.f211793a;
                    r2Var4.f211803q.onNext(new npi.d("CARD_LIMIT_REACHED_ID", gVar.getString(R$string.card_alert_limit_title_physical), gVar.i(R.string.card_alert_limit_message_physical, Integer.valueOf(i)), gVar.getString(com.revolut.retail.common.ui.R$string.common_action_ok), null, null, 240));
                } else {
                    r2Var4.f211802p.onNext(new FeatureCommand(CardInputFeatureConfig.LinkCard.f64743a));
                }
                return Unit.f186387a;
            case 13:
                NaviCommand command10 = (NaviCommand) obj2;
                Intrinsics.checkNotNullParameter(command10, "command");
                return new pfm.h(new l2(this.f211724b, command10, 10), 2);
            case 14:
                NaviCommand command11 = (NaviCommand) obj2;
                Intrinsics.checkNotNullParameter(command11, "command");
                return new pfm.h(new l2(this.f211724b, command11, 0), 2);
            case 15:
                NaviCommand command12 = (NaviCommand) obj2;
                Intrinsics.checkNotNullParameter(command12, "command");
                return new pfm.h(new l2(this.f211724b, command12, 8), 2);
            default:
                NaviCommand naviCommand2 = (NaviCommand) obj2;
                Intrinsics.checkNotNullParameter(naviCommand2, "naviCommand");
                return new pfm.h(new l2(this.f211724b, naviCommand2, 14), 2);
        }
    }
}
