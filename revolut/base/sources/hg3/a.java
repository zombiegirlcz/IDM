package hg3;

import cli.j;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class a implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f152078a;

    public a(dj0.d amount) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.f152078a = amount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f152078a, ((a) obj2).f152078a);
    }

    public final int hashCode() {
        return this.f152078a.hashCode();
    }
}
