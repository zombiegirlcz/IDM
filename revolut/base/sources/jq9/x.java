package jq9;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class x extends t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ba6.l f177525a;

    public x(ba6.l charity) {
        Intrinsics.checkNotNullParameter(charity, "charity");
        this.f177525a = charity;
    }

    @Override // jq9.t
    public final String a() {
        return this.f177525a.f13939b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof x) && Intrinsics.f(this.f177525a, ((x) obj2).f177525a);
    }

    public final int hashCode() {
        return this.f177525a.hashCode();
    }
}
