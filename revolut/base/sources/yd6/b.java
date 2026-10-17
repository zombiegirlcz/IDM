package yd6;

import com.revolut.sso.api.models.ConsentChallenge;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConsentChallenge.App f312640a;

    public b(ConsentChallenge.App challenge) {
        Intrinsics.checkNotNullParameter(challenge, "challenge");
        this.f312640a = challenge;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f312640a, ((b) obj2).f312640a);
    }

    public final int hashCode() {
        return this.f312640a.hashCode();
    }
}
