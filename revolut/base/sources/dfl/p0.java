package dfl;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class p0 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f114449a;

    public p0(xi0.b currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f114449a = currency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof p0) && Intrinsics.f(this.f114449a, ((p0) obj2).f114449a);
    }

    public final int hashCode() {
        return this.f114449a.hashCode();
    }
}
