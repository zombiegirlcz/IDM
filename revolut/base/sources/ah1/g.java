package ah1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class g extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jg1.g f4856a;

    public g(jg1.g walletType) {
        Intrinsics.checkNotNullParameter(walletType, "walletType");
        this.f4856a = walletType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && this.f4856a == ((g) obj2).f4856a;
    }

    public final int hashCode() {
        return this.f4856a.hashCode();
    }
}
