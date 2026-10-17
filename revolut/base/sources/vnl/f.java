package vnl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class f implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f290823a;

    public f(String code) {
        Intrinsics.checkNotNullParameter(code, "code");
        this.f290823a = code;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f290823a, ((f) obj2).f290823a);
    }

    public final int hashCode() {
        return this.f290823a.hashCode();
    }
}
