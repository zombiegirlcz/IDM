package ft3;

import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@mlm.g
public final class z implements q0 {

    @NotNull
    public static final y Companion = new y();
    public static final Lazy[] e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f137892a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j1 f137893b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gt3.f f137894c;
    public final it3.k d;

    static {
        yhm.k kVar = yhm.k.PUBLICATION;
        e = new Lazy[]{null, yhm.j.c(kVar, new f(16)), yhm.j.c(kVar, new f(17)), yhm.j.c(kVar, new f(18))};
    }

    public /* synthetic */ z(int i, j1 j1Var, gt3.f fVar, it3.k kVar, String str) {
        if (1 != (i & 1)) {
            qlm.j1.f(x.f137889a.getDescriptor(), i, 1);
            throw null;
        }
        this.f137892a = str;
        this.f137893b = (i & 2) == 0 ? j1.FTC_FORBEARANCE : j1Var;
        if ((i & 4) == 0) {
            this.f137894c = null;
        } else {
            this.f137894c = fVar;
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
        return this.f137894c;
    }

    @Override // ft3.q0
    /* JADX INFO: renamed from: E2 */
    public final j1 getF137852c() {
        return this.f137893b;
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
        return (obj2 instanceof z) && Intrinsics.f(this.f137892a, ((z) obj2).f137892a);
    }

    @Override // ft3.q0
    /* JADX INFO: renamed from: f4 */
    public final String getF137850a() {
        return this.f137892a;
    }

    public final int hashCode() {
        return this.f137892a.hashCode();
    }

    public z(String originalFacilityId) {
        Intrinsics.checkNotNullParameter(originalFacilityId, "originalFacilityId");
        this.f137892a = originalFacilityId;
        this.f137893b = j1.FTC_FORBEARANCE;
    }
}
