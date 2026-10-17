package kxk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gxk.g f190601a;

    public g(gxk.g mainAsset) {
        Intrinsics.checkNotNullParameter(mainAsset, "mainAsset");
        this.f190601a = mainAsset;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f190601a, ((g) obj2).f190601a);
    }

    public final int hashCode() {
        return this.f190601a.hashCode();
    }
}
