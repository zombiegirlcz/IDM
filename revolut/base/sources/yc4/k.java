package yc4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class k implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f312521a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f312522b;

    public k(String sessionId, String sessionIdSignature) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(sessionIdSignature, "sessionIdSignature");
        this.f312521a = sessionId;
        this.f312522b = sessionIdSignature;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f312521a, kVar.f312521a) && Intrinsics.f(this.f312522b, kVar.f312522b);
    }

    public final int hashCode() {
        return this.f312522b.hashCode() + (this.f312521a.hashCode() * 31);
    }
}
