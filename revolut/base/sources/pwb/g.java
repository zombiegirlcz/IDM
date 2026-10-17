package pwb;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class g extends com.revolut.feature.rev_points.giftcards.impl.ui.flow.home.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f240381a;

    public g(String userVoucherId) {
        Intrinsics.checkNotNullParameter(userVoucherId, "userVoucherId");
        this.f240381a = userVoucherId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f240381a, ((g) obj2).f240381a);
    }

    public final int hashCode() {
        return this.f240381a.hashCode();
    }
}
