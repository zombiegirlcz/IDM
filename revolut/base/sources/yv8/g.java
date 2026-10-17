package yv8;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class g implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f317145a;

    public g(String closingUrl) {
        Intrinsics.checkNotNullParameter(closingUrl, "closingUrl");
        this.f317145a = closingUrl;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f317145a, ((g) obj2).f317145a);
    }

    public final int hashCode() {
        return this.f317145a.hashCode();
    }
}
