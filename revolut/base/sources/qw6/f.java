package qw6;

import com.revolut.feature.acquiring.pro_merchant.toggles.api.model.FreelancerPluginType;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FreelancerPluginType f249787a;

    public f(FreelancerPluginType pluginType) {
        Intrinsics.checkNotNullParameter(pluginType, "pluginType");
        this.f249787a = pluginType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f249787a, ((f) obj2).f249787a);
    }

    public final int hashCode() {
        return this.f249787a.hashCode();
    }
}
