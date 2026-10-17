package fce;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class w extends y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qua.p f133724a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f133725b;

    public w(qua.p subscription, boolean z) {
        Intrinsics.checkNotNullParameter(subscription, "subscription");
        this.f133724a = subscription;
        this.f133725b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w)) {
            return false;
        }
        w wVar = (w) obj2;
        return Intrinsics.f(this.f133724a, wVar.f133724a) && this.f133725b == wVar.f133725b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f133725b) + (this.f133724a.hashCode() * 31);
    }
}
