package uo;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final koi.j f281498a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f281499b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f281500c;

    public p(koi.j jVar, int i, int i2) {
        this.f281498a = jVar;
        this.f281499b = i;
        this.f281500c = i2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f281498a, pVar.f281498a) && this.f281499b == pVar.f281499b && this.f281500c == pVar.f281500c;
    }

    public final int hashCode() {
        koi.j jVar = this.f281498a;
        return Integer.hashCode(this.f281500c) + j6.a.b(this.f281499b, (jVar == null ? 0 : jVar.hashCode()) * 31, 31);
    }
}
