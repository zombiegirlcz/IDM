package tg2;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class e extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f271043a;

    public e(String merchantName) {
        Intrinsics.checkNotNullParameter(merchantName, "merchantName");
        this.f271043a = merchantName;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f271043a, ((e) obj2).f271043a);
    }

    public final int hashCode() {
        return this.f271043a.hashCode();
    }
}
