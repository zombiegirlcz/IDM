package fgj;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class d implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f135086a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f135087b;

    public d(String mobilePlanId, String phoneNumber) {
        Intrinsics.checkNotNullParameter(mobilePlanId, "mobilePlanId");
        Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
        this.f135086a = mobilePlanId;
        this.f135087b = phoneNumber;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f135086a, dVar.f135086a) && Intrinsics.f(this.f135087b, dVar.f135087b);
    }

    public final int hashCode() {
        return this.f135087b.hashCode() + (this.f135086a.hashCode() * 31);
    }
}
