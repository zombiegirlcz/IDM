package jw6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f178940a;

    public b(String address) {
        Intrinsics.checkNotNullParameter(address, "address");
        this.f178940a = address;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f178940a, ((b) obj2).f178940a);
    }

    public final int hashCode() {
        return this.f178940a.hashCode();
    }
}
