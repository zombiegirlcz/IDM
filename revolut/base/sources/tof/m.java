package tof;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class m implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f272922a;

    public m(n provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.f272922a = provider;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m) && this.f272922a == ((m) obj2).f272922a;
    }

    public final int hashCode() {
        return this.f272922a.hashCode();
    }
}
