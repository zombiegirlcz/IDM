package og2;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class e implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f224999a;

    public e(String merchantName) {
        Intrinsics.checkNotNullParameter(merchantName, "merchantName");
        this.f224999a = merchantName;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f224999a, ((e) obj2).f224999a);
    }

    public final int hashCode() {
        return this.f224999a.hashCode();
    }
}
