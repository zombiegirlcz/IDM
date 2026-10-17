package jq9;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class v extends t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f5j.a f177523a;

    public v(f5j.a beneficiary) {
        Intrinsics.checkNotNullParameter(beneficiary, "beneficiary");
        this.f177523a = beneficiary;
    }

    @Override // jq9.t
    public final String a() {
        return n61.j.c(this.f177523a);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof v) && Intrinsics.f(this.f177523a, ((v) obj2).f177523a);
    }

    public final int hashCode() {
        return this.f177523a.hashCode();
    }
}
