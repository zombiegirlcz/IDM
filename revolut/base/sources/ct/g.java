package ct;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class g implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f108554a;

    public g(String code) {
        Intrinsics.checkNotNullParameter(code, "code");
        this.f108554a = code;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f108554a, ((g) obj2).f108554a);
    }

    public final int hashCode() {
        return this.f108554a.hashCode();
    }
}
