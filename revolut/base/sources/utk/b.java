package utk;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoice;
import com.revolut.feature.freelancer.impl.R$string;
import com.revolut.feature.insurance_embedded.impl.ui.flow.documents_review.InsuranceDocumentsReviewFlowContract$Step;
import com.revolut.feature.insurance_embedded.impl.ui.screen.documents.preview.InsuranceDocumentsPreviewScreen;
import com.revolut.feature.insurance_embedded.impl.ui.screen.documents.preview.InsuranceDocumentsPreviewScreenContract$InputData;
import com.revolut.feature.statements.api.models.StatementUrlState;
import com.revolut.feature.topup_screen.api.model.StoredMethod;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.airport_details.a;
import com.revolut.retail.trading.core.domain.account_closure.AccountClosureStatus;
import java.util.List;
import koi.j;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import uu6.k;
import uyd.h0;
import yki.l;
import zhm.f0;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class b implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f283120a;

    public /* synthetic */ b(int i) {
        this.f283120a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f283120a) {
            case 0:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 1:
                Integer num = (Integer) obj2;
                num.intValue();
                j listItem = (j) obj3;
                Intrinsics.checkNotNullParameter(listItem, "listItem");
                return new Pair(num, listItem);
            case 2:
                Function1 getDefaultErrorItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems, "getDefaultErrorItems");
                return new k((List) getDefaultErrorItems.invoke(new iii.d(12, null, true, true, null)));
            case 3:
                l FlowCoordinator = (l) obj2;
                InsuranceDocumentsReviewFlowContract$Step step = (InsuranceDocumentsReviewFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step, "step");
                if (step instanceof InsuranceDocumentsReviewFlowContract$Step.DocumentsReview) {
                    return new InsuranceDocumentsPreviewScreen(new InsuranceDocumentsPreviewScreenContract$InputData(((InsuranceDocumentsReviewFlowContract$Step.DocumentsReview) step).f76067a));
                }
                throw new NoWhenBranchMatchedException();
            case 4:
                Throwable th10 = (Throwable) obj2;
                if (((AccountClosureStatus) obj3) == null) {
                    return th10;
                }
                return null;
            case 5:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return new TextLocalisedClause(R$string.freelancer_cashback_upsell_card_order_header_title, null, null, 14);
            case 6:
                Function1 getDefaultErrorItems2 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems2, "getDefaultErrorItems");
                return (List) getDefaultErrorItems2.invoke(new iii.d(12, null, true, true, null));
            case 7:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 8:
                Function1 getDefaultErrorItems3 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems3, "getDefaultErrorItems");
                return (List) getDefaultErrorItems3.invoke(new iii.d(12, null, false, true, null));
            case 9:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return new TextLocalisedClause(com.revolut.feature.card_add_to_googlepay.impl.R$string.x_pay_otp_verification_title, null, null, 14);
            case 10:
                Throwable error = (Throwable) obj2;
                List list = (List) obj3;
                Intrinsics.checkNotNullParameter(error, "error");
                if (list == null) {
                    return error;
                }
                return null;
            case 11:
                Throwable error2 = (Throwable) obj2;
                Boolean bool = (Boolean) obj3;
                Intrinsics.checkNotNullParameter(error2, "error");
                if (bool == null) {
                    return error2;
                }
                return null;
            case 12:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return null;
            case 13:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return null;
            case 14:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return a.c.f99034a;
            case 15:
                Function1 getDefaultErrorItems4 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems4, "getDefaultErrorItems");
                return (List) getDefaultErrorItems4.invoke(new iii.d(12, null, true, true, null));
            case 16:
                Throwable th11 = (Throwable) obj2;
                if (((FreelancerInvoice) obj3) == null) {
                    return th11;
                }
                return null;
            case 17:
                Function1 getDefaultErrorItems5 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems5, "getDefaultErrorItems");
                return (List) getDefaultErrorItems5.invoke(new iii.d(12, null, true, true, null));
            case 18:
                Function1 getDefaultErrorItems6 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems6, "getDefaultErrorItems");
                return (List) getDefaultErrorItems6.invoke(new iii.d(12, null, false, true, null));
            case 19:
                Function1 getDefaultErrorItems7 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems7, "getDefaultErrorItems");
                return (List) getDefaultErrorItems7.invoke(new iii.d(12, null, true, true, null));
            case 20:
                w4l.f DataObservableDelegate = (w4l.f) obj2;
                if (obj3 != null) {
                    throw new ClassCastException();
                }
                Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                Intrinsics.checkNotNullParameter(null, "params");
                throw null;
            case 21:
                if (obj2 != null) {
                    throw new ClassCastException();
                }
                List availableYears = (List) obj3;
                Intrinsics.checkNotNullParameter(null, "params");
                Intrinsics.checkNotNullParameter(availableYears, "availableYears");
                throw null;
            case 22:
                if (obj2 != null) {
                    throw new ClassCastException();
                }
                List years = (List) obj3;
                Intrinsics.checkNotNullParameter(null, "params");
                Intrinsics.checkNotNullParameter(years, "years");
                throw null;
            case 23:
                w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                if (obj3 != null) {
                    throw new ClassCastException();
                }
                Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                Intrinsics.checkNotNullParameter(null, "params");
                throw null;
            case 24:
                if (obj2 != null) {
                    throw new ClassCastException();
                }
                StatementUrlState value = (StatementUrlState) obj3;
                Intrinsics.checkNotNullParameter(null, "params");
                Intrinsics.checkNotNullParameter(value, "value");
                throw null;
            case 25:
                Throwable error3 = (Throwable) obj2;
                StoredMethod storedMethod = (StoredMethod) obj3;
                Intrinsics.checkNotNullParameter(error3, "error");
                if (storedMethod == null) {
                    return error3;
                }
                return null;
            case 26:
                Throwable error4 = (Throwable) obj2;
                e7l.f fVar = (e7l.f) obj3;
                Intrinsics.checkNotNullParameter(error4, "error");
                if (fVar == null) {
                    return error4;
                }
                return null;
            case 27:
                Throwable th12 = (Throwable) obj2;
                if (((e7l.f) obj3) == null) {
                    return th12;
                }
                return null;
            case 28:
                Function1 defaultError = (Function1) obj3;
                Intrinsics.checkNotNullParameter(defaultError, "defaultError");
                return (List) defaultError.invoke(new iii.d(14, null, true, false, null));
            default:
                Throwable error5 = (Throwable) obj2;
                e7l.f fVar2 = (e7l.f) obj3;
                Intrinsics.checkNotNullParameter(error5, "error");
                if (fVar2 == null) {
                    return error5;
                }
                return null;
        }
    }

    public /* synthetic */ b(h0 h0Var, int i) {
        this.f283120a = i;
    }
}
