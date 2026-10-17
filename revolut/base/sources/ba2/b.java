package ba2;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class b extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f5j.a f13877a;

    public b(f5j.a beneficiary) {
        Intrinsics.checkNotNullParameter(beneficiary, "beneficiary");
        this.f13877a = beneficiary;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f13877a, ((b) obj2).f13877a);
    }

    public final int hashCode() {
        return this.f13877a.hashCode();
    }
}
