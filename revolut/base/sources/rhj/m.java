package rhj;

import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.wero.impl.ui.flow.WeroFlow;
import com.revolut.feature.apm.wero.impl.ui.p2m.WeroP2MFlow;
import com.revolut.feature.apm.wero.impl.ui.wrapper.WeroWrapperFlowContract$Step;
import com.revolut.feature.credit.core.R$string;
import com.revolut.retail.feature.api.AnalyticsAccount;
import ip0.h2;
import ip0.j2;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import nel.w0;
import qua.p;
import rk7.n;
import rk9.o;
import rk9.r;
import rlh.x;
import rlh.z;
import tof.a3;
import zhm.f0;
import zhm.u;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class m implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f254504a;

    public /* synthetic */ m(int i) {
        this.f254504a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f254504a) {
            case 0:
                Function1 getDefaultErrorItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems, "getDefaultErrorItems");
                return (List) getDefaultErrorItems.invoke(ynj.h.f315483a);
            case 1:
                Throwable th10 = (Throwable) obj2;
                if (((List) obj3) == null) {
                    return th10;
                }
                return null;
            case 2:
                yki.b LazyFlowCoordinator = (yki.b) obj2;
                WeroWrapperFlowContract$Step step = (WeroWrapperFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(LazyFlowCoordinator, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step, "step");
                if (step instanceof WeroWrapperFlowContract$Step.Wero) {
                    return new WeroFlow(((WeroWrapperFlowContract$Step.Wero) step).f63109a);
                }
                if (step instanceof WeroWrapperFlowContract$Step.WeroP2M) {
                    return new WeroP2MFlow(((WeroWrapperFlowContract$Step.WeroP2M) step).f63110a);
                }
                throw new NoWhenBranchMatchedException();
            case 3:
                Function1 defaultErrorItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(defaultErrorItems, "defaultErrorItems");
                List list = (List) defaultErrorItems.invoke(new iii.d(14, null, true, false, null));
                t0 t0Var = t0.f186434a;
                m70.a.c(t0Var);
                TextClause textClause = new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                Intrinsics.checkNotNullParameter(t0Var, "<this>");
                return new ri4.j(textClause, null, null, new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), list, false, false);
            case 4:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                return null;
            case 5:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                return null;
            case 6:
                Throwable error = (Throwable) obj2;
                pha.a aVar = (pha.a) obj3;
                Intrinsics.checkNotNullParameter(error, "error");
                if (aVar == null) {
                    return error;
                }
                return null;
            case 7:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 8:
                Function1 getDefaultErrorItems2 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems2, "getDefaultErrorItems");
                return (List) getDefaultErrorItems2.invoke(new iii.d(12, null, true, true, null));
            case 9:
                Throwable error2 = (Throwable) obj2;
                p pVar = (p) obj3;
                Intrinsics.checkNotNullParameter(error2, "error");
                if (pVar == null) {
                    return error2;
                }
                return null;
            case 10:
                Throwable error3 = (Throwable) obj2;
                p pVar2 = (p) obj3;
                Intrinsics.checkNotNullParameter(error3, "error");
                if (pVar2 == null) {
                    return error3;
                }
                return null;
            case 11:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return n.c();
            case 12:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return n.b();
            case 13:
                Function1 getDefaultErrorItems3 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems3, "getDefaultErrorItems");
                List list2 = (List) getDefaultErrorItems3.invoke(new iii.d(14, null, true, false, null));
                int i = R$string.credit_right_to_cancel_cancellation_summary_title;
                t0 t0Var2 = t0.f186434a;
                m70.a.c(t0Var2);
                TextLocalisedClause textLocalisedClauseA = ky4.a.a(i, "");
                int i2 = R$string.credit_right_to_cancel_cancellation_summary_description;
                Intrinsics.checkNotNullParameter(t0Var2, "<this>");
                return new r(list2, new o(textLocalisedClauseA, ky4.a.a(i2, "")), null);
            case 14:
                Function1 getDefaultErrorItems4 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems4, "getDefaultErrorItems");
                return (List) getDefaultErrorItems4.invoke(new iii.d(14, null, false, false, null));
            case 15:
                Throwable error4 = (Throwable) obj2;
                Boolean bool = (Boolean) obj3;
                Intrinsics.checkNotNullParameter(error4, "error");
                if (bool == null) {
                    return error4;
                }
                return null;
            case 16:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 17:
                Throwable error5 = (Throwable) obj2;
                nel.n nVar = (nel.n) obj3;
                Intrinsics.checkNotNullParameter(error5, "error");
                if (nVar == null) {
                    return error5;
                }
                return null;
            case 18:
                Throwable error6 = (Throwable) obj2;
                w0 w0Var = (w0) obj3;
                Intrinsics.checkNotNullParameter(error6, "error");
                if (w0Var == null) {
                    return error6;
                }
                return null;
            case 19:
                Function1 getDefaultErrorItems5 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems5, "getDefaultErrorItems");
                return new z(x.f255076a, (List) getDefaultErrorItems5.invoke(new iii.d(14, null, true, false, null)));
            case 20:
                Throwable error7 = (Throwable) obj2;
                String str = (String) obj3;
                Intrinsics.checkNotNullParameter(error7, "error");
                if (str == null) {
                    return error7;
                }
                return null;
            case 21:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return u.c(new h2("RETRY_BUTTON_LIST_ID", new ResourceImage(R$drawable.uikit_icn_24_warning, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), new TextLocalisedClause(com.revolut.feature.backgroundpicker.impl.R$string.background_picker_button_try_again, null, null, 14), j2.GRID));
            case 22:
                Function1 defaultErrorItems2 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(defaultErrorItems2, "defaultErrorItems");
                return new rmb.e((List) defaultErrorItems2.invoke(new iii.d(12, null, true, true, null)), null, false);
            case 23:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 24:
                a3 transaction = (a3) obj2;
                do3.n user = (do3.n) obj3;
                Intrinsics.checkNotNullParameter(transaction, "transaction");
                Intrinsics.checkNotNullParameter(user, "user");
                return Boolean.valueOf(k71.k.q0(transaction) || k71.k.M(user.f116408a, transaction) != null);
            case 25:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 26:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return iii.c.c(5);
            case 27:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return null;
            case 28:
                Throwable error8 = (Throwable) obj2;
                AnalyticsAccount.Personal.CreditCard creditCard = (AnalyticsAccount.Personal.CreditCard) obj3;
                Intrinsics.checkNotNullParameter(error8, "error");
                if (creditCard == null) {
                    return error8;
                }
                return null;
            default:
                Throwable error9 = (Throwable) obj2;
                AnalyticsAccount analyticsAccount = (AnalyticsAccount) obj3;
                Intrinsics.checkNotNullParameter(error9, "error");
                if (analyticsAccount == null) {
                    return error9;
                }
                return null;
        }
    }

    public /* synthetic */ m(Object obj2, int i) {
        this.f254504a = i;
    }
}
