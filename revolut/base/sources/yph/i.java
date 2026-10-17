package yph;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zel.g f315900a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f315901b;

    public i(zel.g metric, String value) {
        Intrinsics.checkNotNullParameter(metric, "metric");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f315900a = metric;
        this.f315901b = value;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return this.f315900a == iVar.f315900a && Intrinsics.f(this.f315901b, iVar.f315901b);
    }

    public final int hashCode() {
        return this.f315901b.hashCode() + (this.f315900a.hashCode() * 31);
    }
}
