package gkl;

import com.revolut.sso.api.models.ConsentChallenge;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class e implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConsentChallenge.Qr f144442a;

    public e(ConsentChallenge.Qr challenge) {
        Intrinsics.checkNotNullParameter(challenge, "challenge");
        this.f144442a = challenge;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f144442a, ((e) obj2).f144442a);
    }

    public final int hashCode() {
        return this.f144442a.hashCode();
    }
}
