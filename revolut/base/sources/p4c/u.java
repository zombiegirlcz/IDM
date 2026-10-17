package p4c;

import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.content.NavBackStackEntry;
import androidx.content.compose.NavBackStackEntryProviderKt;
import androidx.content.compose.NavHostKt;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.data.model.Data;
import com.revolut.feature.credit.loan.api.models.LoanRepaymentTerms;
import com.revolut.feature.wealth.api.ui.providers.composite_add_money.CompositeAddMoneyPortfolioInfoProviderContract$Limits;
import com.revolut.feature_market_data_impl.ui.activity.stackedbreakdown.Screen;
import com.revolut.feature_market_data_impl.ui.activity.stackedbreakdown.StackedBreakdownActivity;
import com.revolut.feature_market_data_impl.ui.delegates.faq.FaqDelegateContract$ClauseClickParcel;
import com.revolut.retail.core.navigation.NaviCommand;
import ip0.s7;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Stack;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class u implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f232897a;

    public /* synthetic */ u(int i) {
        this.f232897a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f232897a) {
            case 0:
                od0.i it8 = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return zhm.v.l(it8.f224257a);
            case 1:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                aim.e eVarB = zhm.u.b();
                eVarB.add(new s7("FEE_MONTHLY_LIST_ID", 0, 0, 0, 0, false, null, 126));
                eVarB.add(new s7("FEE_LOCAL_CONSUMER_LIST_ID", 0, 0, 0, 0, false, null, 126));
                eVarB.add(new s7("FEE_INTERNATIONAL_CONSUMER_LIST_ID", 0, 0, 0, 0, false, null, 126));
                return zhm.u.a(eVarB);
            case 2:
                m1h.h config = (m1h.h) obj2;
                Intrinsics.checkNotNullParameter(config, "config");
                return new CompositeAddMoneyPortfolioInfoProviderContract$Limits(new dj0.d(1L, config.f201496a), null, null);
            case 3:
                wel.e portfolio = (wel.e) obj2;
                Intrinsics.checkNotNullParameter(portfolio, "portfolio");
                for (kel.g gVar : portfolio.e) {
                    if (gVar instanceof kel.b) {
                        String str = ((kel.b) gVar).f183148a.e;
                        xi0.b.Companion.getClass();
                        return xi0.a.a(str);
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            case 4:
                CellDetailsActionDelegate.Model it9 = (CellDetailsActionDelegate.Model) obj2;
                int i = StackedBreakdownActivity.C0;
                Intrinsics.checkNotNullParameter(it9, "it");
                return new p4i.b(p4i.c.GENERIC, it9.f51787l);
            case 5:
                CellDetailsActionDelegate.Model it10 = (CellDetailsActionDelegate.Model) obj2;
                int i2 = StackedBreakdownActivity.C0;
                Intrinsics.checkNotNullParameter(it10, "it");
                return Boolean.valueOf(Intrinsics.f(it10.f51781a, "breakdown.price"));
            case 6:
                CellDetailsActionDelegate.Model it11 = (CellDetailsActionDelegate.Model) obj2;
                int i3 = StackedBreakdownActivity.C0;
                Intrinsics.checkNotNullParameter(it11, "it");
                return new p4i.b(p4i.c.TITLE_END_IMAGE, it11.f51787l);
            case 7:
                CellDetailsDelegate.Model it12 = (CellDetailsDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                return new p4i.b(p4i.c.GENERIC, it12.o);
            case 8:
                rp0.z it13 = (rp0.z) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                Object obj3 = it13.f256228b;
                if (obj3 instanceof FaqDelegateContract$ClauseClickParcel.Terms) {
                    return (FaqDelegateContract$ClauseClickParcel.Terms) obj3;
                }
                return null;
            case 9:
                rp0.a0 state = (rp0.a0) obj2;
                Intrinsics.checkNotNullParameter(state, "state");
                return Boolean.valueOf(!state.f256040a);
            case 10:
                Stack stack = (Stack) obj2;
                if (stack.isEmpty()) {
                    return null;
                }
                return (Screen) stack.peek();
            case 11:
                Object obj4 = ((rp0.a0) obj2).f256041b;
                if (obj4 instanceof Screen) {
                    return (Screen) obj4;
                }
                return null;
            case 12:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                Screen screen = (Screen) pair.f186385a;
                Stack stack2 = (Stack) pair.f186386b;
                if (!stack2.isEmpty() && Intrinsics.f(stack2.peek(), screen)) {
                    stack2.pop();
                }
                return stack2;
            case 13:
                Pair pair2 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                Intrinsics.checkNotNullExpressionValue(pair2.f186386b, "component2(...)");
                return Boolean.valueOf(!((Stack) r12).isEmpty());
            case 14:
                Data it14 = (Data) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                return Boolean.valueOf(it14.getLoading());
            case 15:
                List list = (List) obj2;
                Intrinsics.checkNotNullParameter(list, "list");
                return Boolean.valueOf(!list.isEmpty());
            case 16:
                return NavBackStackEntryProviderKt.SaveableStateProvider$lambda$2$lambda$1((CreationExtras) obj2);
            case 17:
                return NavHostKt.NavHost$lambda$9$lambda$8((AnimatedContentTransitionScope) obj2);
            case 18:
                return NavHostKt.NavHost$lambda$11$lambda$10((AnimatedContentTransitionScope) obj2);
            case 19:
                return NavHostKt.NavHost$lambda$33$lambda$32((AnimatedContentTransitionScope) obj2);
            case 20:
                return ((NavBackStackEntry) obj2).getId();
            case 21:
                return NavHostKt.NavHost$lambda$35$lambda$34((AnimatedContentTransitionScope) obj2);
            case 22:
                v20.n it15 = (v20.n) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                return it15.getTicketCreatedAt();
            case 23:
                v20.n it16 = (v20.n) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                return it16.getTime();
            case 24:
                v20.n it17 = (v20.n) obj2;
                Intrinsics.checkNotNullParameter(it17, "it");
                return it17.getTicketCreatedAt();
            case 25:
                v20.n it18 = (v20.n) obj2;
                Intrinsics.checkNotNullParameter(it18, "it");
                return it18.getTime();
            case 26:
                v20.n it19 = (v20.n) obj2;
                Intrinsics.checkNotNullParameter(it19, "it");
                return it19.getTicketCreatedAt();
            case 27:
                v20.n it20 = (v20.n) obj2;
                Intrinsics.checkNotNullParameter(it20, "it");
                return it20.getTime();
            case 28:
                NaviCommand applicationScreenCommand = (NaviCommand) obj2;
                Intrinsics.checkNotNullParameter(applicationScreenCommand, "applicationScreenCommand");
                return r6.b.g(null, null, null, 7, applicationScreenCommand);
            default:
                LoanRepaymentTerms it21 = (LoanRepaymentTerms) obj2;
                Intrinsics.checkNotNullParameter(it21, "it");
                return new Data(it21, null, false, 6, null);
        }
    }

    public /* synthetic */ u(a0 a0Var) {
        this.f232897a = 1;
    }
}
