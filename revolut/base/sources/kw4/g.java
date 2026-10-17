package kw4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f190218a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f190219b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f190220c;

    public g(dj0.d amount, boolean z, f inputType) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(inputType, "inputType");
        this.f190218a = amount;
        this.f190219b = z;
        this.f190220c = inputType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f190218a, gVar.f190218a) && this.f190219b == gVar.f190219b && this.f190220c == gVar.f190220c;
    }

    public final int hashCode() {
        return this.f190220c.hashCode() + j6.a.c(j6.a.c(this.f190218a.hashCode() * 31, 31, true), 31, this.f190219b);
    }
}
