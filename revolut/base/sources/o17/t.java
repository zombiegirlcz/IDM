package o17;

import com.revolut.feature.freelancer.common.models.FreelancerAccountOnboardingState;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class t implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t f221335a = new t();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        FreelancerAccountOnboardingState it8 = (FreelancerAccountOnboardingState) obj2;
        Intrinsics.checkNotNullParameter(it8, "it");
        return com.revolut.feature.freelancer.common.models.a.e(it8);
    }
}
