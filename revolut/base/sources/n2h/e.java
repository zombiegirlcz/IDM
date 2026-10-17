package n2h;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f211543a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f211544b;

    public e(String ref2, boolean z) {
        Intrinsics.checkNotNullParameter(ref2, "ref");
        this.f211543a = ref2;
        this.f211544b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f211543a, eVar.f211543a) && this.f211544b == eVar.f211544b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f211544b) + (this.f211543a.hashCode() * 31);
    }
}
