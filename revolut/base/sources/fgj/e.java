package fgj;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class e implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f135088a;

    public e(String mobilePlanId) {
        Intrinsics.checkNotNullParameter(mobilePlanId, "mobilePlanId");
        this.f135088a = mobilePlanId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f135088a, ((e) obj2).f135088a);
    }

    public final int hashCode() {
        return this.f135088a.hashCode();
    }
}
