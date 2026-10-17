package tch;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f269817a;

    public c0(y secondaryButtonParcel) {
        x primaryButtonParcel = x.f269850a;
        Intrinsics.checkNotNullParameter(primaryButtonParcel, "primaryButtonParcel");
        Intrinsics.checkNotNullParameter(secondaryButtonParcel, "secondaryButtonParcel");
        this.f269817a = secondaryButtonParcel;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj2;
        Object obj3 = x.f269850a;
        return obj3.equals(obj3) && this.f269817a.equals(c0Var.f269817a);
    }

    public final int hashCode() {
        return this.f269817a.f269851a.hashCode() + (x.f269850a.hashCode() * 31);
    }
}
