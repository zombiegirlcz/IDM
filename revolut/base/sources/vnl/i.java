package vnl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class i implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f290825a;

    public i(String code) {
        Intrinsics.checkNotNullParameter(code, "code");
        this.f290825a = code;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f290825a, ((i) obj2).f290825a);
    }

    public final int hashCode() {
        return this.f290825a.hashCode();
    }
}
