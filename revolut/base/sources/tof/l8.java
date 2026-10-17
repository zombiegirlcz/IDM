package tof;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class l8 extends i7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f272918a;

    public l8(String phone) {
        Intrinsics.checkNotNullParameter(phone, "phone");
        this.f272918a = phone;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l8) && Intrinsics.f(this.f272918a, ((l8) obj2).f272918a);
    }

    public final String getPhone() {
        return this.f272918a;
    }

    public final int hashCode() {
        return this.f272918a.hashCode();
    }
}
