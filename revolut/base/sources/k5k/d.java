package k5k;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class d implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f181534a;

    public d(a config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.f181534a = config;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f181534a, ((d) obj2).f181534a);
    }

    public final int hashCode() {
        return this.f181534a.hashCode();
    }
}
