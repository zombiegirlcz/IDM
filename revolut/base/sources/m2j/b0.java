package m2j;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a0 f202015a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final io3.d f202016b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f202017c;

    public b0(a0 profileWithExtra, io3.d pocket, boolean z) {
        Intrinsics.checkNotNullParameter(profileWithExtra, "profileWithExtra");
        Intrinsics.checkNotNullParameter(pocket, "pocket");
        this.f202015a = profileWithExtra;
        this.f202016b = pocket;
        this.f202017c = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj2;
        return Intrinsics.f(this.f202015a, b0Var.f202015a) && Intrinsics.f(this.f202016b, b0Var.f202016b) && this.f202017c == b0Var.f202017c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f202017c) + h30.l.g(this.f202016b, this.f202015a.hashCode() * 31, 31);
    }
}
