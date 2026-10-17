package jmb;

import com.revolut.feature.retail.savings.api.challenge.model.SavingsChallenge;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SavingsChallenge f176511a;

    public a(SavingsChallenge challenge) {
        Intrinsics.checkNotNullParameter(challenge, "challenge");
        this.f176511a = challenge;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f176511a, ((a) obj2).f176511a);
    }

    public final int hashCode() {
        return this.f176511a.hashCode();
    }
}
