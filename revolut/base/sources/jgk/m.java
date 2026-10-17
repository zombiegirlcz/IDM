package jgk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hha.z f174080a;

    public m(hha.z freeTrial) {
        Intrinsics.checkNotNullParameter(freeTrial, "freeTrial");
        this.f174080a = freeTrial;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m) && Intrinsics.f(this.f174080a, ((m) obj2).f174080a);
    }

    public final int hashCode() {
        return this.f174080a.hashCode();
    }
}
