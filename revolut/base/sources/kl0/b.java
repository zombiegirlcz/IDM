package kl0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gl0.a f185260a;

    public b(gl0.a localeStorageComponentApi) {
        Intrinsics.checkNotNullParameter(localeStorageComponentApi, "localeStorageComponentApi");
        this.f185260a = localeStorageComponentApi;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f185260a, ((b) obj2).f185260a);
    }

    public final int hashCode() {
        return this.f185260a.hashCode();
    }
}
