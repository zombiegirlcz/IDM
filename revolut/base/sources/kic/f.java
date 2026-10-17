package kic;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class f implements mm.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f184198a;

    public f(String website) {
        Intrinsics.checkNotNullParameter(website, "website");
        this.f184198a = website;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f184198a, ((f) obj2).f184198a);
    }

    public final int hashCode() {
        return this.f184198a.hashCode();
    }
}
