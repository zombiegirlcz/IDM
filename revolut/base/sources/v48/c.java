package v48;

import com.revolut.feature.joint.api.navigation.JointCreationConfiguration;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JointCreationConfiguration f285985a;

    public c(JointCreationConfiguration configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.f285985a = configuration;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f285985a, ((c) obj2).f285985a);
    }

    public final int hashCode() {
        return this.f285985a.hashCode();
    }
}
