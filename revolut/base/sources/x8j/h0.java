package x8j;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class h0 extends aii.m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xi0.b f303448b;

    public h0(xi0.b currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f303448b = currency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h0) && Intrinsics.f(this.f303448b, ((h0) obj2).f303448b);
    }

    public final int hashCode() {
        return this.f303448b.hashCode();
    }
}
