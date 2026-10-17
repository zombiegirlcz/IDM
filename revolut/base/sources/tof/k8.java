package tof;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class k8 extends i7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f272892a;

    public k8(String phone) {
        Intrinsics.checkNotNullParameter(phone, "phone");
        this.f272892a = phone;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k8) && Intrinsics.f(this.f272892a, ((k8) obj2).f272892a);
    }

    public final String getPhone() {
        return this.f272892a;
    }

    public final int hashCode() {
        return this.f272892a.hashCode();
    }
}
