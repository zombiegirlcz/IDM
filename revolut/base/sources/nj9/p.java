package nj9;

import kotlin.jvm.internal.Intrinsics;
import zh9.k1;

/* JADX INFO: loaded from: classes5.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k1 f216432a;

    public p(k1 switchOption) {
        Intrinsics.checkNotNullParameter(switchOption, "switchOption");
        this.f216432a = switchOption;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof p) && Intrinsics.f(this.f216432a, ((p) obj2).f216432a);
    }

    public final int hashCode() {
        return this.f216432a.hashCode();
    }
}
