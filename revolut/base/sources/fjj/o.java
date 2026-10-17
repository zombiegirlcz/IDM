package fjj;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class o extends p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f135665a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f135666b;

    public o(String subscriptionId, String mobilePlanId) {
        Intrinsics.checkNotNullParameter(subscriptionId, "subscriptionId");
        Intrinsics.checkNotNullParameter(mobilePlanId, "mobilePlanId");
        this.f135665a = subscriptionId;
        this.f135666b = mobilePlanId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f135665a, oVar.f135665a) && Intrinsics.f(this.f135666b, oVar.f135666b);
    }

    public final int hashCode() {
        return this.f135666b.hashCode() + (this.f135665a.hashCode() * 31);
    }
}
