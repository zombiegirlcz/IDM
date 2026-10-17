package wb3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class g extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f296002a;

    public g(String termsUrl) {
        Intrinsics.checkNotNullParameter(termsUrl, "termsUrl");
        this.f296002a = termsUrl;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f296002a, ((g) obj2).f296002a);
    }

    public final int hashCode() {
        return this.f296002a.hashCode();
    }
}
