package hye;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class e extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qte.c f156858a;

    public e(qte.c fee2) {
        Intrinsics.checkNotNullParameter(fee2, "fee");
        this.f156858a = fee2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f156858a, ((e) obj2).f156858a);
    }

    public final int hashCode() {
        return this.f156858a.hashCode();
    }
}
