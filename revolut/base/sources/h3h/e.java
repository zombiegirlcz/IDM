package h3h;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f149127a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f149128b;

    public e(String ref2, boolean z) {
        Intrinsics.checkNotNullParameter(ref2, "ref");
        this.f149127a = ref2;
        this.f149128b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f149127a, eVar.f149127a) && this.f149128b == eVar.f149128b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f149128b) + (this.f149127a.hashCode() * 31);
    }
}
