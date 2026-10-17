package oq9;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class f implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f227814a;

    public f(dj0.d amount) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.f227814a = amount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f227814a, ((f) obj2).f227814a);
    }

    public final int hashCode() {
        return this.f227814a.hashCode();
    }
}
