package xkf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f306713a;

    public h0(String phone) {
        Intrinsics.checkNotNullParameter(phone, "phone");
        this.f306713a = phone;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h0) && Intrinsics.f(this.f306713a, ((h0) obj2).f306713a);
    }

    public final int hashCode() {
        return this.f306713a.hashCode();
    }
}
