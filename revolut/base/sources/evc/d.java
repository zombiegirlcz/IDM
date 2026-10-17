package evc;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class d implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kuc.d f129766a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f129767b;

    public d(kuc.d gamblingBlockState, boolean z) {
        Intrinsics.checkNotNullParameter(gamblingBlockState, "gamblingBlockState");
        this.f129766a = gamblingBlockState;
        this.f129767b = z;
    }

    public static d a(d dVar, kuc.d gamblingBlockState, boolean z, int i) {
        if ((i & 1) != 0) {
            gamblingBlockState = dVar.f129766a;
        }
        if ((i & 2) != 0) {
            z = dVar.f129767b;
        }
        dVar.getClass();
        Intrinsics.checkNotNullParameter(gamblingBlockState, "gamblingBlockState");
        return new d(gamblingBlockState, z);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f129766a, dVar.f129766a) && this.f129767b == dVar.f129767b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f129767b) + (this.f129766a.hashCode() * 31);
    }
}
