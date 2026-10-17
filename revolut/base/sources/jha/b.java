package jha;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class b implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f174186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f174187b;

    public b(Long l2, dj0.d amount) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.f174186a = l2;
        this.f174187b = amount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f174186a, bVar.f174186a) && Intrinsics.f(this.f174187b, bVar.f174187b);
    }

    public final int hashCode() {
        Long l2 = this.f174186a;
        return this.f174187b.hashCode() + ((l2 == null ? 0 : l2.hashCode()) * 31);
    }
}
