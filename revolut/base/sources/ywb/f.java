package ywb;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class f extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f317406a;

    public f(String voucherProductGroupId) {
        Intrinsics.checkNotNullParameter(voucherProductGroupId, "voucherProductGroupId");
        this.f317406a = voucherProductGroupId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f317406a, ((f) obj2).f317406a);
    }

    public final int hashCode() {
        return this.f317406a.hashCode();
    }
}
