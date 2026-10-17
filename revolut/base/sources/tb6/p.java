package tb6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class p extends com.revolut.feature.donations.impl.ui.kompot.screen.charity.details.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f269491a;

    public p(String charityId) {
        Intrinsics.checkNotNullParameter(charityId, "charityId");
        this.f269491a = charityId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof p) && Intrinsics.f(this.f269491a, ((p) obj2).f269491a);
    }

    public final int hashCode() {
        return this.f269491a.hashCode();
    }
}
