package hce;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f150886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f150887b;

    public c(b subscriptionResult, boolean z) {
        Intrinsics.checkNotNullParameter(subscriptionResult, "subscriptionResult");
        this.f150886a = subscriptionResult;
        this.f150887b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f150886a, cVar.f150886a) && this.f150887b == cVar.f150887b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f150887b) + (this.f150886a.hashCode() * 31);
    }
}
