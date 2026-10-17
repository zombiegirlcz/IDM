package ft2;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class h implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f137789a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.revolut.feature.business.referrals.ui.screens.referral_invitee_details.a f137790b;

    public h(List items, com.revolut.feature.business.referrals.ui.screens.referral_invitee_details.a header) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(header, "header");
        this.f137789a = items;
        this.f137790b = header;
    }

    @Override // cli.p
    public final List c() {
        return this.f137789a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f137789a, hVar.f137789a) && Intrinsics.f(this.f137790b, hVar.f137790b);
    }

    public final int hashCode() {
        return this.f137790b.hashCode() + (this.f137789a.hashCode() * 31);
    }
}
