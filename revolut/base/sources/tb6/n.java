package tb6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class n extends com.revolut.feature.donations.impl.ui.kompot.screen.charity.details.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f269489a;

    public n(String charityId) {
        Intrinsics.checkNotNullParameter(charityId, "charityId");
        this.f269489a = charityId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof n) && Intrinsics.f(this.f269489a, ((n) obj2).f269489a);
    }

    public final int hashCode() {
        return this.f269489a.hashCode();
    }
}
