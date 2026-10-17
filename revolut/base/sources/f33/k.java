package f33;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class k extends l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d93.b f131895a;

    public k(d93.b selectedDeliveryMethod) {
        Intrinsics.checkNotNullParameter(selectedDeliveryMethod, "selectedDeliveryMethod");
        this.f131895a = selectedDeliveryMethod;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f131895a, ((k) obj2).f131895a);
    }

    public final int hashCode() {
        return this.f131895a.hashCode();
    }
}
