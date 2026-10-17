package tof;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class v7 extends i7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f273117a;

    public v7(String phone) {
        Intrinsics.checkNotNullParameter(phone, "phone");
        this.f273117a = phone;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof v7) && Intrinsics.f(this.f273117a, ((v7) obj2).f273117a);
    }

    public final String getPhone() {
        return this.f273117a;
    }

    public final int hashCode() {
        return this.f273117a.hashCode();
    }
}
