package xkf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f306715a;

    public i0(String phone) {
        Intrinsics.checkNotNullParameter(phone, "phone");
        this.f306715a = phone;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i0) && Intrinsics.f(this.f306715a, ((i0) obj2).f306715a);
    }

    public final int hashCode() {
        return this.f306715a.hashCode();
    }
}
