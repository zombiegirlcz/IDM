package oxg;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class e implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f230822a;

    public e(xi0.b currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f230822a = currency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f230822a, ((e) obj2).f230822a);
    }

    public final int hashCode() {
        return this.f230822a.hashCode();
    }
}
