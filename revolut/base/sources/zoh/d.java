package zoh;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class d implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zel.f f324057a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f324058b;

    public d(zel.f instrumentGroup, List filters) {
        Intrinsics.checkNotNullParameter(instrumentGroup, "instrumentGroup");
        Intrinsics.checkNotNullParameter(filters, "filters");
        this.f324057a = instrumentGroup;
        this.f324058b = filters;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f324057a == dVar.f324057a && Intrinsics.f(this.f324058b, dVar.f324058b);
    }

    public final int hashCode() {
        return this.f324058b.hashCode() + (this.f324057a.hashCode() * 31);
    }
}
