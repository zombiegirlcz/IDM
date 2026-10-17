package tof;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class g6 extends h6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f272767a;

    public g6(String phone) {
        Intrinsics.checkNotNullParameter(phone, "phone");
        this.f272767a = phone;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g6) && Intrinsics.f(this.f272767a, ((g6) obj2).f272767a);
    }

    public final int hashCode() {
        return this.f272767a.hashCode();
    }
}
