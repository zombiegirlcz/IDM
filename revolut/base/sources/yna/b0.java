package yna;

import com.revolut.feature.profile.impl.ui.profile.ProfileFlowContract$Step;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class b0 implements aii.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProfileFlowContract$Step f315303a;

    public b0(ProfileFlowContract$Step nextStep) {
        Intrinsics.checkNotNullParameter(nextStep, "nextStep");
        this.f315303a = nextStep;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b0) && Intrinsics.f(this.f315303a, ((b0) obj2).f315303a);
    }

    public final int hashCode() {
        return this.f315303a.hashCode();
    }
}
