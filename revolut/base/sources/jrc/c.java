package jrc;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f177986a;

    public c(String number) {
        Intrinsics.checkNotNullParameter(number, "number");
        this.f177986a = number;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f177986a, ((c) obj2).f177986a);
    }

    public final int hashCode() {
        return this.f177986a.hashCode();
    }
}
