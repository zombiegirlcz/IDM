package ft3;

import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@mlm.g
public final class d0 implements q0 {

    @NotNull
    public static final c0 Companion = new c0();
    public static final Lazy[] e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f137807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gt3.e f137808b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j1 f137809c;
    public final it3.k d;

    static {
        yhm.k kVar = yhm.k.PUBLICATION;
        e = new Lazy[]{null, yhm.j.c(kVar, new f(20)), yhm.j.c(kVar, new f(21)), yhm.j.c(kVar, new f(22))};
    }

    public /* synthetic */ d0(int i, String str, gt3.e eVar, j1 j1Var, it3.k kVar) {
        if (3 != (i & 3)) {
            qlm.j1.f(b0.f137800a.getDescriptor(), i, 3);
            throw null;
        }
        this.f137807a = str;
        this.f137808b = eVar;
        if ((i & 4) == 0) {
            this.f137809c = j1.MORTGAGE_RENEGOTIATION;
        } else {
            this.f137809c = j1Var;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = kVar;
        }
    }

    @Override // ft3.q0
    /* JADX INFO: renamed from: A4 */
    public final gt3.f getD() {
        return this.f137808b;
    }

    @Override // ft3.q0
    /* JADX INFO: renamed from: E2 */
    public final j1 getF137852c() {
        return this.f137809c;
    }

    @Override // ft3.q0
    /* JADX INFO: renamed from: c0 */
    public final it3.k getF137851b() {
        return this.d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj2;
        return Intrinsics.f(this.f137807a, d0Var.f137807a) && this.f137808b == d0Var.f137808b;
    }

    @Override // ft3.q0
    /* JADX INFO: renamed from: f4 */
    public final String getF137850a() {
        return this.f137807a;
    }

    public final int hashCode() {
        return this.f137808b.hashCode() + (this.f137807a.hashCode() * 31);
    }

    public d0(String originalFacilityId, gt3.e productSubtype) {
        Intrinsics.checkNotNullParameter(originalFacilityId, "originalFacilityId");
        Intrinsics.checkNotNullParameter(productSubtype, "productSubtype");
        this.f137807a = originalFacilityId;
        this.f137808b = productSubtype;
        this.f137809c = j1.MORTGAGE_RENEGOTIATION;
    }
}
