package q43;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class v extends com.revolut.feature.card_payment_method.impl.flows.selector.screens.selector.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wi0.b f242051a;

    public v(wi0.b countryCode) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        this.f242051a = countryCode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof v) && Intrinsics.f(this.f242051a, ((v) obj2).f242051a);
    }

    public final int hashCode() {
        return this.f242051a.f297794a.hashCode();
    }
}
