package yuc;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class k implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vuc.e f316983a;

    public k(vuc.e deviceParcel) {
        Intrinsics.checkNotNullParameter(deviceParcel, "deviceParcel");
        this.f316983a = deviceParcel;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f316983a, ((k) obj2).f316983a);
    }

    public final int hashCode() {
        return this.f316983a.hashCode();
    }
}
