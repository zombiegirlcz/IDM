package lfb;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f194840a;

    public d(String number) {
        Intrinsics.checkNotNullParameter(number, "number");
        this.f194840a = number;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f194840a, ((d) obj2).f194840a);
    }

    public final int hashCode() {
        return this.f194840a.hashCode();
    }
}
