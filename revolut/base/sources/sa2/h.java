package sa2;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class h implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f261274a;

    public h(String code) {
        Intrinsics.checkNotNullParameter(code, "code");
        this.f261274a = code;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f261274a, ((h) obj2).f261274a);
    }

    public final int hashCode() {
        return this.f261274a.hashCode();
    }
}
