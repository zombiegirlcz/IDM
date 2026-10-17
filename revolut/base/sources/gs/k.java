package gs;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f146256a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f146257b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f146258c;
    public final int d;
    public final boolean e;

    public k(j jVar, e pollingDialogsType, boolean z, int i, boolean z3) {
        Intrinsics.checkNotNullParameter(pollingDialogsType, "pollingDialogsType");
        this.f146256a = jVar;
        this.f146257b = pollingDialogsType;
        this.f146258c = z;
        this.d = i;
        this.e = z3;
    }

    public static k a(k kVar, j jVar, e eVar, int i, boolean z, int i2) {
        if ((i2 & 1) != 0) {
            jVar = kVar.f146256a;
        }
        j jVar2 = jVar;
        if ((i2 & 2) != 0) {
            eVar = kVar.f146257b;
        }
        e pollingDialogsType = eVar;
        boolean z3 = (i2 & 4) != 0 ? kVar.f146258c : false;
        if ((i2 & 8) != 0) {
            i = kVar.d;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            z = kVar.e;
        }
        kVar.getClass();
        Intrinsics.checkNotNullParameter(pollingDialogsType, "pollingDialogsType");
        return new k(jVar2, pollingDialogsType, z3, i3, z);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f146256a, kVar.f146256a) && Intrinsics.f(this.f146257b, kVar.f146257b) && this.f146258c == kVar.f146258c && this.d == kVar.d && this.e == kVar.e;
    }

    public final int hashCode() {
        j jVar = this.f146256a;
        return Boolean.hashCode(this.e) + j6.a.b(this.d, j6.a.c((this.f146257b.hashCode() + ((jVar == null ? 0 : jVar.hashCode()) * 31)) * 31, 31, this.f146258c), 31);
    }
}
