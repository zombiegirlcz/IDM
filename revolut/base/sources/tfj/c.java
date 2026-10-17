package tfj;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class c extends com.revolut.retail.feature.esim.impl.ui.flows.checkout.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f270323a;

    public c(String simProfileId) {
        Intrinsics.checkNotNullParameter(simProfileId, "simProfileId");
        this.f270323a = simProfileId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f270323a, ((c) obj2).f270323a);
    }

    public final int hashCode() {
        return this.f270323a.hashCode();
    }
}
