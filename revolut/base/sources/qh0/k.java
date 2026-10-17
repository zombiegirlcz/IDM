package qh0;

import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes19.dex */
@mlm.g
public final class k {

    @NotNull
    public static final h Companion = new h();
    public static final Lazy[] e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f246398a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f246399b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f246400c;
    public final n0 d;

    static {
        yhm.k kVar = yhm.k.PUBLICATION;
        e = new Lazy[]{yhm.j.c(kVar, new d(0)), null, yhm.j.c(kVar, new d(1)), yhm.j.c(kVar, new d(2))};
    }

    public /* synthetic */ k(int i, g gVar, boolean z, j jVar, n0 n0Var) {
        if (15 != (i & 15)) {
            j1.f(e.f246393a.getDescriptor(), i, 15);
            throw null;
        }
        this.f246398a = gVar;
        this.f246399b = z;
        this.f246400c = jVar;
        this.d = n0Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return this.f246398a == kVar.f246398a && this.f246399b == kVar.f246399b && this.f246400c == kVar.f246400c && this.d == kVar.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.f246400c.hashCode() + j6.a.c(this.f246398a.hashCode() * 31, 31, this.f246399b)) * 31);
    }

    public k(g authenticatorAttachment, j residentKey, n0 userVerification) {
        Intrinsics.checkNotNullParameter(authenticatorAttachment, "authenticatorAttachment");
        Intrinsics.checkNotNullParameter(residentKey, "residentKey");
        Intrinsics.checkNotNullParameter(userVerification, "userVerification");
        this.f246398a = authenticatorAttachment;
        this.f246399b = true;
        this.f246400c = residentKey;
        this.d = userVerification;
    }
}
