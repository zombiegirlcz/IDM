package vz9;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class c extends e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f293424b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f293425c;
    public final boolean d;
    public final j e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(boolean z, boolean z3, boolean z4, j firstSmallButtonState) {
        super(true);
        Intrinsics.checkNotNullParameter(firstSmallButtonState, "firstSmallButtonState");
        this.f293424b = z;
        this.f293425c = z3;
        this.d = z4;
        this.e = firstSmallButtonState;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f293424b == cVar.f293424b && this.f293425c == cVar.f293425c && this.d == cVar.d && Intrinsics.f(this.e, cVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + j6.a.c(j6.a.c(Boolean.hashCode(this.f293424b) * 31, 31, this.f293425c), 31, this.d);
    }
}
