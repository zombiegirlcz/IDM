package rab;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f252803a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f252804b;

    public e(String vaultId, boolean z) {
        Intrinsics.checkNotNullParameter(vaultId, "vaultId");
        this.f252803a = vaultId;
        this.f252804b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f252803a, eVar.f252803a) && this.f252804b == eVar.f252804b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f252804b) + (this.f252803a.hashCode() * 31);
    }
}
