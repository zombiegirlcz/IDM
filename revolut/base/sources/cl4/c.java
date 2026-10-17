package cl4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class c implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24932a;

    public c(String rate) {
        Intrinsics.checkNotNullParameter(rate, "rate");
        this.f24932a = rate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f24932a, ((c) obj2).f24932a);
    }

    public final int hashCode() {
        return this.f24932a.hashCode();
    }
}
