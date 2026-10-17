package njj;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class g0 implements i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f216561a;

    public g0(String simProfileId) {
        Intrinsics.checkNotNullParameter(simProfileId, "simProfileId");
        this.f216561a = simProfileId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g0) && Intrinsics.f(this.f216561a, ((g0) obj2).f216561a);
    }

    public final int hashCode() {
        return this.f216561a.hashCode();
    }
}
