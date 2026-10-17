package h93;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class k extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f150149a;

    public k(String currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f150149a = currency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f150149a, ((k) obj2).f150149a);
    }

    public final int hashCode() {
        return this.f150149a.hashCode();
    }
}
