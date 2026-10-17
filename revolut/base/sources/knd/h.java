package knd;

import kotlin.jvm.internal.Intrinsics;
import tof.i7;
import tof.s9;

/* JADX INFO: loaded from: classes7.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i7 f186082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i7 f186083b;

    public h(i7 i7Var, s9 s9Var) {
        this.f186082a = i7Var;
        this.f186083b = s9Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f186082a, hVar.f186082a) && Intrinsics.f(this.f186083b, hVar.f186083b);
    }

    public final int hashCode() {
        i7 i7Var = this.f186082a;
        int iHashCode = (i7Var == null ? 0 : i7Var.hashCode()) * 31;
        i7 i7Var2 = this.f186083b;
        return iHashCode + (i7Var2 != null ? i7Var2.hashCode() : 0);
    }
}
