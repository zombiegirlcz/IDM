package jrc;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class d extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f177987a;

    public d(String number) {
        Intrinsics.checkNotNullParameter(number, "number");
        this.f177987a = number;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f177987a, ((d) obj2).f177987a);
    }

    public final int hashCode() {
        return this.f177987a.hashCode();
    }
}
