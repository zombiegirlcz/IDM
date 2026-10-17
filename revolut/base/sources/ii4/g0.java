package ii4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f161524a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ks3.b f161525b;

    public g0(String applicationId, ks3.b pluginName) {
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        Intrinsics.checkNotNullParameter(pluginName, "pluginName");
        this.f161524a = applicationId;
        this.f161525b = pluginName;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj2;
        return Intrinsics.f(this.f161524a, g0Var.f161524a) && this.f161525b == g0Var.f161525b;
    }

    public final int hashCode() {
        return this.f161525b.hashCode() + (this.f161524a.hashCode() * 31);
    }
}
