package ta4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class g implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f269092a;

    public g(String unverifiedEmail) {
        Intrinsics.checkNotNullParameter(unverifiedEmail, "unverifiedEmail");
        this.f269092a = unverifiedEmail;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f269092a, ((g) obj2).f269092a);
    }

    public final int hashCode() {
        return this.f269092a.hashCode();
    }
}
