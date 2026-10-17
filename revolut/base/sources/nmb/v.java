package nmb;

import aw0.o9;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.junior_profile.api.models.JuniorBankingProfile;
import com.revolut.feature.retail.savings.api.R$string;
import com.revolut.feature.retail.savings.impl.core.calculator.presentation.SavingsCalculatorScreen;
import com.revolut.feature.retail.savings.impl.core.calculator.presentation.SavingsCalculatorScreenContract$InputData;
import com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.savings_currency_selection.SavingsCurrencySelectionContract$ModalStep;
import com.revolut.feature.shared.savings.models.SavingsAccountDetails;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import zhm.f0;
import zhm.h0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class v implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f217258a;

    public /* synthetic */ v(int i) {
        this.f217258a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object data, Object data2) {
        switch (this.f217258a) {
            case 0:
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) data;
                SavingsCurrencySelectionContract$ModalStep step = (SavingsCurrencySelectionContract$ModalStep) data2;
                Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step, "step");
                if (step instanceof SavingsCurrencySelectionContract$ModalStep.SavingsCalculator) {
                    return new SavingsCalculatorScreen(new SavingsCalculatorScreenContract$InputData(((SavingsCurrencySelectionContract$ModalStep.SavingsCalculator) step).f83319a.f86683a));
                }
                throw new NoWhenBranchMatchedException();
            case 1:
                Throwable th10 = (Throwable) data;
                if (((List) data2) == null) {
                    return th10;
                }
                return null;
            case 2:
                Throwable illegalStateException = (Throwable) data;
                Function1 getErrorItems = (Function1) data2;
                Intrinsics.checkNotNullParameter(getErrorItems, "getErrorItems");
                if (illegalStateException == null) {
                    illegalStateException = new IllegalStateException("mapState error");
                }
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, "TabLifestyleScreenStateMapper", null, illegalStateException, h0Var);
                return (List) getErrorItems.invoke(new iii.d(14, null, true, false, null));
            case 3:
                Intrinsics.checkNotNullParameter((Function1) data2, "<unused var>");
                f0 f0Var = f0.f322471a;
                return new nn3.g(f0Var, null, null, false, f0Var);
            case 4:
                Function1 defaultErrorItems = (Function1) data2;
                Intrinsics.checkNotNullParameter(defaultErrorItems, "defaultErrorItems");
                return new nnb.k(nnb.q.a(0), (List) defaultErrorItems.invoke(new iii.d(12, null, true, true, null)), false);
            case 5:
                Throwable error = (Throwable) data;
                fo3.c cVar = (fo3.c) data2;
                Intrinsics.checkNotNullParameter(error, "error");
                if (cVar == null) {
                    return error;
                }
                return null;
            case 6:
                Function1 getDefaultErrorItems = (Function1) data2;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems, "getDefaultErrorItems");
                return new nnd.r((List) getDefaultErrorItems.invoke(new iii.d(12, null, true, false, null)));
            case 7:
                Intrinsics.checkNotNullParameter((Function1) data2, "<unused var>");
                return null;
            case 8:
                Function1 getDefaultErrorItems2 = (Function1) data2;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems2, "getDefaultErrorItems");
                return new nnj.p((List) getDefaultErrorItems2.invoke(new iii.d(12, null, true, true, null)), nnj.o.HIDDEN);
            case 9:
                Function1 getDefaultErrorItems3 = (Function1) data2;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems3, "getDefaultErrorItems");
                m70.a.c(t0.f186434a);
                return new nnk.f(new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), f0.f322471a, (List) getDefaultErrorItems3.invoke(new iii.d(12, null, false, true, null)));
            case 10:
                String strO = (String) data;
                String str = (String) data2;
                if (strO == null && str == null) {
                    strO = null;
                } else if (strO == null && str != null) {
                    strO = str;
                } else if (strO == null || str != null) {
                    strO = com.google.android.gms.internal.mlkit_vision_face.a.o(strO, ";", str);
                }
                if (strO != null) {
                    return kotlin.text.f0.V0(128, strO);
                }
                return null;
            case 11:
                Function1 getDefaultErrorItems4 = (Function1) data2;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems4, "getDefaultErrorItems");
                return new nob.h((List) getDefaultErrorItems4.invoke(new iii.d(14, null, true, false, null)), new lw0.a(new TextLocalisedClause(R$string.savings_sheets_automations_title, null, null, 14), null, null, null, false, 30));
            case 12:
                Intrinsics.checkNotNullParameter((Function1) data2, "<unused var>");
                return f0.f322471a;
            case 13:
                Function1 getDefaultErrorItems5 = (Function1) data2;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems5, "getDefaultErrorItems");
                return new noe.f((List) getDefaultErrorItems5.invoke(new iii.d(14, null, true, false, null)));
            case 14:
                Throwable error2 = (Throwable) data;
                List list = (List) data2;
                Intrinsics.checkNotNullParameter(error2, "error");
                if (list == null) {
                    return error2;
                }
                return null;
            case 15:
                Throwable error3 = (Throwable) data;
                List list2 = (List) data2;
                Intrinsics.checkNotNullParameter(error3, "error");
                if (list2 == null) {
                    return error3;
                }
                return null;
            case 16:
                Throwable error4 = (Throwable) data;
                List list3 = (List) data2;
                Intrinsics.checkNotNullParameter(error4, "error");
                if (list3 == null) {
                    return error4;
                }
                return null;
            case 17:
                Throwable error5 = (Throwable) data;
                fo3.c cVar2 = (fo3.c) data2;
                Intrinsics.checkNotNullParameter(error5, "error");
                if (cVar2 == null) {
                    return error5;
                }
                return null;
            case 18:
                Boolean analyticsEnabled = (Boolean) data2;
                Intrinsics.checkNotNullParameter(data, "data");
                Intrinsics.checkNotNullParameter(analyticsEnabled, "analyticsEnabled");
                return new Pair(data, analyticsEnabled);
            case 19:
                mm0.o oldSession = (mm0.o) data;
                mm0.o newSession = (mm0.o) data2;
                Intrinsics.checkNotNullParameter(oldSession, "oldSession");
                Intrinsics.checkNotNullParameter(newSession, "newSession");
                return Boolean.valueOf(oldSession.getClass() == newSession.getClass());
            case 20:
                ((Integer) data).intValue();
                Intrinsics.checkNotNullParameter(data2, "data");
                return Boolean.valueOf(data2 instanceof np0.b);
            case 21:
                Throwable th11 = (Throwable) data;
                if (((JuniorBankingProfile) data2) == null) {
                    return th11;
                }
                return null;
            case 22:
                Throwable error6 = (Throwable) data;
                SavingsAccountDetails savingsAccountDetails = (SavingsAccountDetails) data2;
                Intrinsics.checkNotNullParameter(error6, "error");
                if (savingsAccountDetails != null) {
                    return error6;
                }
                return null;
            case 23:
                Intrinsics.checkNotNullParameter((String) data, "<unused var>");
                int i = jli.h.f175850a;
                return Unit.f186387a;
            case 24:
                Function1 getDefaultErrorItems6 = (Function1) data2;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems6, "getDefaultErrorItems");
                return new nqd.e((List) getDefaultErrorItems6.invoke(new iii.d(12, null, true, false, null)));
            case 25:
                Function1 getDefaultErrorItems7 = (Function1) data2;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems7, "getDefaultErrorItems");
                return new nrd.c((List) getDefaultErrorItems7.invoke(new iii.d(14, null, true, false, null)), false);
            case 26:
                Function1 getDefaultErrorItems8 = (Function1) data2;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems8, "getDefaultErrorItems");
                return new ns9.g((List) getDefaultErrorItems8.invoke(new iii.d(12, null, true, true, null)));
            case 27:
                Function1 getDefaultErrorItems9 = (Function1) data2;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems9, "getDefaultErrorItems");
                return (List) getDefaultErrorItems9.invoke(new iii.d(14, null, true, false, null));
            case 28:
                Throwable error7 = (Throwable) data;
                Pair pair = (Pair) data2;
                Intrinsics.checkNotNullParameter(error7, "error");
                if (pair == null) {
                    return error7;
                }
                return null;
            default:
                Throwable error8 = (Throwable) data;
                Pair pair2 = (Pair) data2;
                Intrinsics.checkNotNullParameter(error8, "error");
                if (pair2 == null) {
                    return error8;
                }
                return null;
        }
    }

    public /* synthetic */ v(cli.n nVar, int i) {
        this.f217258a = i;
    }
}
