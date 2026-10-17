package cd3;

import cd3.b;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class e extends b.AbstractC0145b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uc3.d f23169a;

    public e(uc3.d cashbackSourceType) {
        Intrinsics.checkNotNullParameter(cashbackSourceType, "cashbackSourceType");
        this.f23169a = cashbackSourceType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && this.f23169a == ((e) obj2).f23169a;
    }

    public final int hashCode() {
        return this.f23169a.hashCode();
    }
}
