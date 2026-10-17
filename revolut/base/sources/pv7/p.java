package pv7;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class p extends com.revolut.feature.insurance_embedded.impl.ui.screen.embedded.details.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f239994a;

    public p(String coverageId) {
        Intrinsics.checkNotNullParameter(coverageId, "coverageId");
        this.f239994a = coverageId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof p) && Intrinsics.f(this.f239994a, ((p) obj2).f239994a);
    }

    public final int hashCode() {
        return this.f239994a.hashCode();
    }
}
