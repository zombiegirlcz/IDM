package mu;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f208941a;

    public c(String verificationToken) {
        Intrinsics.checkNotNullParameter(verificationToken, "verificationToken");
        this.f208941a = verificationToken;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f208941a, ((c) obj2).f208941a);
    }

    public final int hashCode() {
        return this.f208941a.hashCode();
    }
}
