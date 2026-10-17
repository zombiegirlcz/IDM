package y17;

import com.revolut.feature.freelancer.api.navigation.FreelancerBizFeatureDescriptor$AccountRestrictionDescriptor;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FreelancerBizFeatureDescriptor$AccountRestrictionDescriptor f310308a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f310309b;

    public b(FreelancerBizFeatureDescriptor$AccountRestrictionDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        this.f310308a = descriptor;
        this.f310309b = h.ACCOUNT_RESTRICTION;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f310308a, ((b) obj2).f310308a);
    }

    @Override // y17.j
    public final h getType() {
        return this.f310309b;
    }

    public final int hashCode() {
        return this.f310308a.f73257a.hashCode();
    }
}
