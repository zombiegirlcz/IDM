package kye;

import com.revolut.feature.topup_screen.common.TopUpTarget;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class z extends u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f190883a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TopUpTarget f190884b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final io3.d f190885c;

    public z(dj0.d amount, TopUpTarget topUpTarget, io3.d internalPocket) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(topUpTarget, "topUpTarget");
        Intrinsics.checkNotNullParameter(internalPocket, "internalPocket");
        this.f190883a = amount;
        this.f190884b = topUpTarget;
        this.f190885c = internalPocket;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z)) {
            return false;
        }
        z zVar = (z) obj2;
        return Intrinsics.f(this.f190883a, zVar.f190883a) && Intrinsics.f(this.f190884b, zVar.f190884b) && Intrinsics.f(this.f190885c, zVar.f190885c);
    }

    public final int hashCode() {
        return this.f190885c.hashCode() + ((this.f190884b.hashCode() + (this.f190883a.hashCode() * 31)) * 31);
    }
}
