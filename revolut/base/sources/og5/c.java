package og5;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f225034a;

    public c(xi0.b currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f225034a = currency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f225034a, ((c) obj2).f225034a);
    }

    public final int hashCode() {
        return this.f225034a.hashCode();
    }
}
