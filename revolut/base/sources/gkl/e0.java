package gkl;

import com.revolut.sso.impl.domain.models.Challenge;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class e0 implements h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Challenge f144443a;

    public e0(Challenge challenge) {
        Intrinsics.checkNotNullParameter(challenge, "challenge");
        this.f144443a = challenge;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e0) && Intrinsics.f(this.f144443a, ((e0) obj2).f144443a);
    }

    public final int hashCode() {
        return this.f144443a.hashCode();
    }
}
