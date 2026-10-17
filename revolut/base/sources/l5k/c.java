package l5k;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class c implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Double f192308a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f192309b;

    public c(dj0.d amount, Double d) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.f192308a = d;
        this.f192309b = amount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f192308a, cVar.f192308a) && Intrinsics.f(this.f192309b, cVar.f192309b);
    }

    public final int hashCode() {
        Double d = this.f192308a;
        return this.f192309b.hashCode() + ((d == null ? 0 : d.hashCode()) * 31);
    }
}
