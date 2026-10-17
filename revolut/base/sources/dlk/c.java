package dlk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Boolean f115779a;

    public c(Boolean bool) {
        this.f115779a = bool;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f115779a, ((c) obj2).f115779a);
    }

    public final int hashCode() {
        Boolean bool = this.f115779a;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }
}
