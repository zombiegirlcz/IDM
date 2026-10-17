package wz6;

import aii.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f301374a;

    public e(String perkId) {
        Intrinsics.checkNotNullParameter(perkId, "perkId");
        this.f301374a = perkId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f301374a, ((e) obj2).f301374a);
    }

    public final int hashCode() {
        return this.f301374a.hashCode();
    }
}
