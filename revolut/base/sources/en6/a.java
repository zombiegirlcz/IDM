package en6;

import com.revolut.feature.freelancer.common.models.FreelancerAccountOnboardingState;
import com.revolut.feature.referrals.common.data.api.domain.model.common.ReferralCampaignV4;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import zhm.h0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f127742a;

    public /* synthetic */ a(int i) {
        this.f127742a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Throwable error = (Throwable) obj2;
        switch (this.f127742a) {
            case 0:
                Function1 getDefaultErrorItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems, "getDefaultErrorItems");
                if (error != null) {
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, error, h0Var);
                }
                break;
            case 1:
                List list = (List) obj3;
                Intrinsics.checkNotNullParameter(error, "error");
                if (list == null) {
                }
                break;
            case 2:
                Function1 getDefaultErrorItems2 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems2, "getDefaultErrorItems");
                break;
            case 3:
                od0.i iVar = (od0.i) obj3;
                Intrinsics.checkNotNullParameter(error, "error");
                if (iVar == null) {
                }
                break;
            case 4:
                Optional optional = (Optional) obj3;
                Intrinsics.checkNotNullParameter(error, "error");
                if (optional == null) {
                }
                break;
            case 5:
                od0.i iVar2 = (od0.i) obj3;
                Intrinsics.checkNotNullParameter(error, "error");
                if (iVar2 == null) {
                }
                break;
            case 6:
                Function1 getDefaultErrorItems3 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems3, "getDefaultErrorItems");
                break;
            case 7:
                Function1 getDefaultErrorItems4 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems4, "getDefaultErrorItems");
                break;
            case 8:
                Function1 defaultErrorItem = (Function1) obj3;
                Intrinsics.checkNotNullParameter(defaultErrorItem, "defaultErrorItem");
                break;
            case 9:
                Function1 getDefaultErrorItems5 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems5, "getDefaultErrorItems");
                break;
            case 10:
                Function1 getDefaultErrorItems6 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems6, "getDefaultErrorItems");
                break;
            case 11:
                Function1 getDefaultErrorItems7 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems7, "getDefaultErrorItems");
                break;
            case 12:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                break;
            case 13:
                Intrinsics.checkNotNullParameter(error, "<unused var>");
                break;
            case 14:
                Intrinsics.checkNotNullParameter(error, "<unused var>");
                break;
            case 15:
                List list2 = (List) obj3;
                Intrinsics.checkNotNullParameter(error, "error");
                if (list2 == null) {
                }
                break;
            case 16:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                m70.a.c(t0.f186434a);
                break;
            case 17:
                xi0.b bVar = (xi0.b) obj3;
                Intrinsics.checkNotNullParameter(error, "error");
                if (bVar == null) {
                }
                break;
            case 18:
                Boolean bool = (Boolean) obj3;
                Intrinsics.checkNotNullParameter(error, "error");
                if (bool == null) {
                }
                break;
            case 19:
                FreelancerAccountOnboardingState freelancerAccountOnboardingState = (FreelancerAccountOnboardingState) obj3;
                Intrinsics.checkNotNullParameter(error, "error");
                if (freelancerAccountOnboardingState == null) {
                }
                break;
            case 20:
                List list3 = (List) obj3;
                Intrinsics.checkNotNullParameter(error, "error");
                if (list3 == null) {
                }
                break;
            case 21:
                Boolean bool2 = (Boolean) obj3;
                Intrinsics.checkNotNullParameter(error, "error");
                if (bool2 == null) {
                }
                break;
            case 22:
                ReferralCampaignV4 referralCampaignV4 = (ReferralCampaignV4) obj3;
                Intrinsics.checkNotNullParameter(error, "error");
                if (referralCampaignV4 == null) {
                }
                break;
            case 23:
                List list4 = (List) obj3;
                Intrinsics.checkNotNullParameter(error, "error");
                if (list4 == null) {
                }
                break;
            case 24:
                vf0.h hVar = (vf0.h) obj3;
                Intrinsics.checkNotNullParameter(error, "error");
                if (hVar == null) {
                }
                break;
            case 25:
                List list5 = (List) obj3;
                Intrinsics.checkNotNullParameter(error, "error");
                if (list5 == null) {
                }
                break;
            case 26:
                List list6 = (List) obj3;
                Intrinsics.checkNotNullParameter(error, "error");
                if (list6 == null) {
                }
                break;
            case 27:
                l71.d dVar = (l71.d) obj3;
                Intrinsics.checkNotNullParameter(error, "error");
                if (dVar == null) {
                }
                break;
            case 28:
                FreelancerAccountOnboardingState freelancerAccountOnboardingState2 = (FreelancerAccountOnboardingState) obj3;
                Intrinsics.checkNotNullParameter(error, "error");
                if (freelancerAccountOnboardingState2 == null) {
                }
                break;
            default:
                List list7 = (List) obj3;
                Intrinsics.checkNotNullParameter(error, "error");
                if (list7 == null) {
                }
                break;
        }
        return error;
    }
}
