package bu4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class c implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18673a;

    public c(String boletoId) {
        Intrinsics.checkNotNullParameter(boletoId, "boletoId");
        this.f18673a = boletoId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f18673a, ((c) obj2).f18673a);
    }

    public final int hashCode() {
        return this.f18673a.hashCode();
    }
}
