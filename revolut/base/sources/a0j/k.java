package a0j;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f409a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f410b;

    public k(j actionType, boolean z) {
        Intrinsics.checkNotNullParameter(actionType, "actionType");
        this.f409a = actionType;
        this.f410b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return this.f409a.equals(kVar.f409a) && this.f410b == kVar.f410b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f410b) + (this.f409a.hashCode() * 31);
    }
}
