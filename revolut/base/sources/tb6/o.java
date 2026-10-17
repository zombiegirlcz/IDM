package tb6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class o extends com.revolut.feature.donations.impl.ui.kompot.screen.charity.details.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f269490a;

    public o(String charityId) {
        Intrinsics.checkNotNullParameter(charityId, "charityId");
        this.f269490a = charityId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof o) && Intrinsics.f(this.f269490a, ((o) obj2).f269490a);
    }

    public final int hashCode() {
        return this.f269490a.hashCode();
    }
}
