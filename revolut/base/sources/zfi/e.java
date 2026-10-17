package zfi;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f321965a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x f321966b;

    public e(b filter, x value) {
        Intrinsics.checkNotNullParameter(filter, "filter");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f321965a = filter;
        this.f321966b = value;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f321965a, eVar.f321965a) && Intrinsics.f(this.f321966b, eVar.f321966b);
    }

    public final int hashCode() {
        return this.f321966b.hashCode() + (this.f321965a.hashCode() * 31);
    }
}
