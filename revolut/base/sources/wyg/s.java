package wyg;

import aw0.o9;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.defi.accounts.api.model.DeFiBalance;
import com.revolut.feature.defi.asset_details.api.model.DeFiAssetDetails;
import com.revolut.feature.freelancer.common.models.FreelancerProfileSettings;
import com.revolut.feature.rev_points.impl.ui.points_expiry.details.RevPointsExpiryDetailsScreen;
import com.revolut.feature.rev_points.impl.ui.points_expiry.details.RevPointsExpiryDetailsScreenContract$InputData;
import com.revolut.feature.rev_points.impl.ui.points_expiry.home.RevPointsExpiryHomeScreenContract$ModalStep;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.retail.wealth.resources.R$string;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import x18.x;
import zhm.f0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class s implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f301293a;

    public /* synthetic */ s(int i) {
        this.f301293a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f301293a) {
            case 0:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return null;
            case 1:
                yki.b LazyFlowCoordinator = (yki.b) obj2;
                FlowStep it8 = (FlowStep) obj3;
                Intrinsics.checkNotNullParameter(LazyFlowCoordinator, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(it8, "it");
                throw new IllegalStateException("flow is not supposed to have steps. it loads the document and proxies the call to the pdf viewer");
            case 2:
                Function1 getDefaultErrorItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems, "getDefaultErrorItems");
                return (List) getDefaultErrorItems.invoke(new iii.d(12, null, true, true, null));
            case 3:
                Throwable error = (Throwable) obj2;
                List list = (List) obj3;
                Intrinsics.checkNotNullParameter(error, "error");
                if (list == null) {
                    return error;
                }
                return null;
            case 4:
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                RevPointsExpiryHomeScreenContract$ModalStep step = (RevPointsExpiryHomeScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step, "step");
                if (!(step instanceof RevPointsExpiryHomeScreenContract$ModalStep.RevPointsExpiryDetails)) {
                    throw new NoWhenBranchMatchedException();
                }
                RevPointsExpiryHomeScreenContract$ModalStep.RevPointsExpiryDetails revPointsExpiryDetails = (RevPointsExpiryHomeScreenContract$ModalStep.RevPointsExpiryDetails) step;
                return new RevPointsExpiryDetailsScreen(new RevPointsExpiryDetailsScreenContract$InputData(revPointsExpiryDetails.f83830a, revPointsExpiryDetails.f83831b));
            case 5:
                Function1 getDefaultErrorItems2 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems2, "getDefaultErrorItems");
                return (List) getDefaultErrorItems2.invoke(new iii.d(12, null, false, false, null));
            case 6:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                return null;
            case 7:
                Throwable error2 = (Throwable) obj2;
                List list2 = (List) obj3;
                Intrinsics.checkNotNullParameter(error2, "error");
                if (list2 == null) {
                    return error2;
                }
                return null;
            case 8:
                Throwable th10 = (Throwable) obj2;
                if (((FreelancerProfileSettings) obj3) == null) {
                    return th10;
                }
                return null;
            case 9:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return null;
            case 10:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return null;
            case 11:
                Throwable error3 = (Throwable) obj2;
                t61.g gVar = (t61.g) obj3;
                Intrinsics.checkNotNullParameter(error3, "error");
                if (gVar == null) {
                    return error3;
                }
                return null;
            case 12:
                Function1 getDefaultErrorItems3 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems3, "getDefaultErrorItems");
                return (List) getDefaultErrorItems3.invoke(new iii.d(12, null, false, true, null));
            case 13:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return null;
            case 14:
                Throwable error4 = (Throwable) obj2;
                e7l.f fVar = (e7l.f) obj3;
                Intrinsics.checkNotNullParameter(error4, "error");
                if (fVar == null) {
                    return error4;
                }
                return null;
            case 15:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                return null;
            case 16:
                Function1 getDefaultErrorItems4 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems4, "getDefaultErrorItems");
                return new x0l.b(x0l.j.a(), new TextLocalisedClause(R$string.wealth_onboarding_risk_disclaimer_title, null, null, 14), null, (List) getDefaultErrorItems4.invoke(new iii.d(14, null, true, false, null)));
            case 17:
                Throwable th11 = (Throwable) obj2;
                if (((Boolean) obj3) == null) {
                    return th11;
                }
                return null;
            case 18:
                Throwable th12 = (Throwable) obj2;
                if (((Set) obj3) == null) {
                    return th12;
                }
                return null;
            case 19:
                Function1 getDefaultErrorItems5 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems5, "getDefaultErrorItems");
                aim.e eVarB = zhm.u.b();
                eVarB.add(x.a());
                eVarB.addAll((Collection) getDefaultErrorItems5.invoke(new iii.d(14, null, false, false, null)));
                return zhm.u.a(eVarB);
            case 20:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return Boolean.FALSE;
            case 21:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 22:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                m70.a.c(t0.f186434a);
                return new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            case 23:
                Throwable error5 = (Throwable) obj2;
                List list3 = (List) obj3;
                Intrinsics.checkNotNullParameter(error5, "error");
                if (list3 == null) {
                    return error5;
                }
                return null;
            case 24:
                Throwable error6 = (Throwable) obj2;
                DeFiBalance deFiBalance = (DeFiBalance) obj3;
                Intrinsics.checkNotNullParameter(error6, "error");
                if (deFiBalance == null) {
                    return error6;
                }
                return null;
            case 25:
                Throwable th13 = (Throwable) obj2;
                if (((DeFiAssetDetails) obj3) == null) {
                    return th13;
                }
                return null;
            case 26:
                Throwable th14 = (Throwable) obj2;
                if (((DeFiAssetDetails) obj3) == null) {
                    return th14;
                }
                return null;
            case 27:
                Throwable th15 = (Throwable) obj2;
                if (((DeFiAssetDetails) obj3) == null) {
                    return th15;
                }
                return null;
            case 28:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                return null;
            default:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                return null;
        }
    }

    public /* synthetic */ s(Object obj2, int i) {
        this.f301293a = i;
    }
}
