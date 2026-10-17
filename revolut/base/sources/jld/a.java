package jld;

import com.revolut.feature.feedback.api.navigation.OneClickFeedbackFlowDescriptor;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OneClickFeedbackFlowDescriptor f175712a;

    public a(OneClickFeedbackFlowDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        this.f175712a = descriptor;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f175712a, ((a) obj2).f175712a);
    }

    public final int hashCode() {
        return this.f175712a.f73153a.hashCode();
    }
}
