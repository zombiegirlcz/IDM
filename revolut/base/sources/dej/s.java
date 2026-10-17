package dej;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class s extends u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f113644a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f113645b;

    public s(String subscriptionId, String mobilePlanId) {
        Intrinsics.checkNotNullParameter(subscriptionId, "subscriptionId");
        Intrinsics.checkNotNullParameter(mobilePlanId, "mobilePlanId");
        this.f113644a = subscriptionId;
        this.f113645b = mobilePlanId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return Intrinsics.f(this.f113644a, sVar.f113644a) && Intrinsics.f(this.f113645b, sVar.f113645b);
    }

    public final int hashCode() {
        return this.f113645b.hashCode() + (this.f113644a.hashCode() * 31);
    }
}
