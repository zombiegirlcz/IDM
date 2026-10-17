package vgg;

import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.ProfileCardModel;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.freelancer.common.models.FreelancerAccountOnboardingState;
import com.revolut.feature.pricingplans.models.PricingPlanSubscription;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.retail.feature.esim.impl.R$string;
import com.revolut.revolut.feature_fourthline_impl.R;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import vhg.c;
import zhm.f0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class a0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f289155a;

    public /* synthetic */ a0(int i) {
        this.f289155a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f289155a) {
            case 0:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 1:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 2:
                Throwable error = (Throwable) obj2;
                od0.i iVar = (od0.i) obj3;
                Intrinsics.checkNotNullParameter(error, "error");
                if (iVar == null) {
                    return error;
                }
                return null;
            case 3:
                Throwable th10 = (Throwable) obj2;
                if (((lha.g) obj3) == null) {
                    return th10;
                }
                return null;
            case 4:
                Function1 getDefaultErrorItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems, "getDefaultErrorItems");
                return (List) getDefaultErrorItems.invoke(new iii.d(14, null, true, false, null));
            case 5:
                Throwable error2 = (Throwable) obj2;
                do3.n nVar = (do3.n) obj3;
                Intrinsics.checkNotNullParameter(error2, "error");
                if (nVar == null) {
                    return error2;
                }
                return null;
            case 6:
                Throwable error3 = (Throwable) obj2;
                FreelancerAccountOnboardingState freelancerAccountOnboardingState = (FreelancerAccountOnboardingState) obj3;
                Intrinsics.checkNotNullParameter(error3, "error");
                if (freelancerAccountOnboardingState == null) {
                    return error3;
                }
                return null;
            case 7:
                Throwable error4 = (Throwable) obj2;
                FreelancerAccountOnboardingState freelancerAccountOnboardingState2 = (FreelancerAccountOnboardingState) obj3;
                Intrinsics.checkNotNullParameter(error4, "error");
                if (freelancerAccountOnboardingState2 == null) {
                    return error4;
                }
                return null;
            case 8:
                Throwable error5 = (Throwable) obj2;
                List list = (List) obj3;
                Intrinsics.checkNotNullParameter(error5, "error");
                if (list == null) {
                    return error5;
                }
                return null;
            case 9:
                Throwable th11 = (Throwable) obj2;
                if (((List) obj3) == null) {
                    return th11;
                }
                return null;
            case 10:
                Throwable th12 = (Throwable) obj2;
                if (((List) obj3) == null) {
                    return th12;
                }
                return null;
            case 11:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 12:
                Function1 getErrorItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getErrorItems, "getErrorItems");
                return (List) getErrorItems.invoke(new iii.d(4, c.C1599c.f289473a, true, true, null));
            case 13:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return null;
            case 14:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 15:
                yki.b LazyFlowCoordinator = (yki.b) obj2;
                FlowStep it8 = (FlowStep) obj3;
                Intrinsics.checkNotNullParameter(LazyFlowCoordinator, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(it8, "it");
                throw new IllegalStateException("No steps in this flow");
            case 16:
                Throwable error6 = (Throwable) obj2;
                wi0.b bVar = (wi0.b) obj3;
                Intrinsics.checkNotNullParameter(error6, "error");
                if (bVar == null) {
                    return error6;
                }
                return null;
            case 17:
                Function1 getDefaultErrorItems2 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems2, "getDefaultErrorItems");
                return (List) getDefaultErrorItems2.invoke(new iii.d(14, null, false, false, null));
            case 18:
                Function1 getDefaultErrorItems3 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems3, "getDefaultErrorItems");
                return new vjj.w((List) getDefaultErrorItems3.invoke(new iii.d(12, null, true, true, null)), null, null);
            case 19:
                Throwable th13 = (Throwable) obj2;
                if (((lha.g) obj3) == null) {
                    return th13;
                }
                return null;
            case 20:
                Throwable th14 = (Throwable) obj2;
                if (((PricingPlanSubscription) obj3) == null) {
                    return th14;
                }
                return null;
            case 21:
                Throwable th15 = (Throwable) obj2;
                if (((lha.e) obj3) == null) {
                    return th15;
                }
                return null;
            case 22:
                Function1 getDefaultErrorItems4 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems4, "getDefaultErrorItems");
                return (List) getDefaultErrorItems4.invoke(new iii.d(14, null, true, false, null));
            case 23:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return vk7.k.b();
            case 24:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                m70.a.c(t0.f186434a);
                return new vkh.k(new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
            case 25:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 26:
                Function1 getDefaultErrorItems5 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems5, "getDefaultErrorItems");
                return (List) getDefaultErrorItems5.invoke(new iii.d(12, null, true, true, null));
            case 27:
                Throwable error7 = (Throwable) obj2;
                Boolean bool = (Boolean) obj3;
                Intrinsics.checkNotNullParameter(error7, "error");
                if (bool == null) {
                    return error7;
                }
                return null;
            case 28:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            default:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return new ProfileCardModel.Error(new TextLocalisedClause(R$string.esim_gifting_share_qr_code_error_title, null, null, 14), new TextLocalisedClause(R$string.esim_common_offline_error_subtitle, null, null, 14), new com.revolut.core.ui_kit.models.a0(new TextLocalisedClause(R.string.common_action_retry, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_retry, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, 12));
        }
    }
}
