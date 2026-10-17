package jgk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class f extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lha.k f174073a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f174074b;

    public f(lha.k manager, boolean z) {
        Intrinsics.checkNotNullParameter(manager, "manager");
        this.f174073a = manager;
        this.f174074b = z;
    }

    @Override // jgk.g
    public final boolean a() {
        return this.f174074b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f174073a, fVar.f174073a) && this.f174074b == fVar.f174074b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f174074b) + (this.f174073a.hashCode() * 31);
    }
}
