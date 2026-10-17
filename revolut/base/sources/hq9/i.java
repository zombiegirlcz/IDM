package hq9;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f154643a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f154644b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f154645c;
    public final boolean d;

    public i(long j2, List items, xi0.b currency, boolean z) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f154643a = currency;
        this.f154644b = j2;
        this.f154645c = items;
        this.d = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f154643a, iVar.f154643a) && this.f154644b == iVar.f154644b && Intrinsics.f(this.f154645c, iVar.f154645c) && this.d == iVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + p.a.d(a0.d.c(this.f154643a.hashCode() * 31, 31, this.f154644b), 31, this.f154645c);
    }
}
