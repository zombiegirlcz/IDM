package ftk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f138037a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f138038b;

    public e(String ref2, boolean z) {
        Intrinsics.checkNotNullParameter(ref2, "ref");
        this.f138037a = ref2;
        this.f138038b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f138037a, eVar.f138037a) && this.f138038b == eVar.f138038b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f138038b) + (this.f138037a.hashCode() * 31);
    }
}
