package o5l;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Boolean f222458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f222459b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f222460c;

    public e(Boolean bool, boolean z, boolean z3) {
        this.f222458a = bool;
        this.f222459b = z;
        this.f222460c = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f222458a, eVar.f222458a) && this.f222459b == eVar.f222459b && this.f222460c == eVar.f222460c;
    }

    public final int hashCode() {
        Boolean bool = this.f222458a;
        return Boolean.hashCode(this.f222460c) + j6.a.c((bool == null ? 0 : bool.hashCode()) * 31, 31, this.f222459b);
    }
}
