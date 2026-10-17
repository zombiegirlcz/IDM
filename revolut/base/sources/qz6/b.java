package qz6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lr6.d f250371a;

    public b(lr6.d bannerType) {
        Intrinsics.checkNotNullParameter(bannerType, "bannerType");
        this.f250371a = bannerType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && this.f250371a == ((b) obj2).f250371a;
    }

    public final int hashCode() {
        return this.f250371a.hashCode();
    }
}
