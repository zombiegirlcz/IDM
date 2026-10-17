package zjc;

import com.revolut.feature.rewards.api.model.rewards.ActivationNotice;
import com.revolut.feature.rewards.api.model.rewards.ExistingSubscriptionCheck;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f322777a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f322778b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ExistingSubscriptionCheck f322779c;
    public final ActivationNotice d;

    public a(String perkId, String merchantAvatar, ExistingSubscriptionCheck existingSubscriptionCheck, ActivationNotice activationNotice) {
        Intrinsics.checkNotNullParameter(perkId, "perkId");
        Intrinsics.checkNotNullParameter(merchantAvatar, "merchantAvatar");
        Intrinsics.checkNotNullParameter(existingSubscriptionCheck, "existingSubscriptionCheck");
        this.f322777a = perkId;
        this.f322778b = merchantAvatar;
        this.f322779c = existingSubscriptionCheck;
        this.d = activationNotice;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f322777a, aVar.f322777a) && Intrinsics.f(this.f322778b, aVar.f322778b) && Intrinsics.f(this.f322779c, aVar.f322779c) && Intrinsics.f(this.d, aVar.d);
    }

    public final int hashCode() {
        int iHashCode = (this.f322779c.hashCode() + p.a.c(this.f322777a.hashCode() * 31, 31, this.f322778b)) * 31;
        ActivationNotice activationNotice = this.d;
        return iHashCode + (activationNotice == null ? 0 : activationNotice.hashCode());
    }
}
