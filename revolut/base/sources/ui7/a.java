package ui7;

import dj0.d;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f280313a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f280314b;

    public a(d total, d claimed) {
        Intrinsics.checkNotNullParameter(total, "total");
        Intrinsics.checkNotNullParameter(claimed, "claimed");
        this.f280313a = total;
        this.f280314b = claimed;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f280313a, aVar.f280313a) && Intrinsics.f(this.f280314b, aVar.f280314b);
    }

    public final int hashCode() {
        return this.f280314b.hashCode() + (this.f280313a.hashCode() * 31);
    }
}
