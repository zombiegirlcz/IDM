package uo7;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class g extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f281575a;

    public g(String registrationNumber) {
        Intrinsics.checkNotNullParameter(registrationNumber, "registrationNumber");
        this.f281575a = registrationNumber;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f281575a, ((g) obj2).f281575a);
    }

    public final int hashCode() {
        return this.f281575a.hashCode();
    }
}
