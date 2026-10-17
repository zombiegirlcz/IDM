package j94;

import aii.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class h implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final my3.f f172281a;

    public h(my3.f hubScreenConfig) {
        Intrinsics.checkNotNullParameter(hubScreenConfig, "hubScreenConfig");
        this.f172281a = hubScreenConfig;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f172281a, ((h) obj2).f172281a);
    }

    public final int hashCode() {
        return this.f172281a.hashCode();
    }
}
