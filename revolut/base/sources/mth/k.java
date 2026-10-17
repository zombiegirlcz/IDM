package mth;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class k implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wi0.b f208835a;

    public k(wi0.b selectedCitizenship) {
        Intrinsics.checkNotNullParameter(selectedCitizenship, "selectedCitizenship");
        this.f208835a = selectedCitizenship;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f208835a, ((k) obj2).f208835a);
    }

    public final int hashCode() {
        return this.f208835a.f297794a.hashCode();
    }
}
