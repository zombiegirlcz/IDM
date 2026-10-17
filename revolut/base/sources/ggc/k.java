package ggc;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f143639a;

    public k(String accessUrl) {
        Intrinsics.checkNotNullParameter(accessUrl, "accessUrl");
        this.f143639a = accessUrl;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f143639a, ((k) obj2).f143639a);
    }

    public final int hashCode() {
        return this.f143639a.hashCode();
    }
}
