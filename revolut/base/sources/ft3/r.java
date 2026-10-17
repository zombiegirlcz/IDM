package ft3;

import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@mlm.g
public final class r implements t {

    @NotNull
    public static final q Companion = new q();
    public static final Lazy[] e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f137864a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j1 f137865b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gt3.f f137866c;
    public final it3.k d;

    static {
        yhm.k kVar = yhm.k.PUBLICATION;
        e = new Lazy[]{null, yhm.j.c(kVar, new f(10)), yhm.j.c(kVar, new f(11)), yhm.j.c(kVar, new f(12))};
    }

    public /* synthetic */ r(int i, j1 j1Var, gt3.f fVar, it3.k kVar, String str) {
        if (1 != (i & 1)) {
            qlm.j1.f(p.f137861a.getDescriptor(), i, 1);
            throw null;
        }
        this.f137864a = str;
        this.f137865b = (i & 2) == 0 ? j1.FAMILY_CREDIT_CARD : j1Var;
        if ((i & 4) == 0) {
            this.f137866c = null;
        } else {
            this.f137866c = fVar;
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
        return this.f137866c;
    }

    @Override // ft3.q0
    /* JADX INFO: renamed from: E2 */
    public final j1 getF137852c() {
        return this.f137865b;
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
        return (obj2 instanceof r) && Intrinsics.f(this.f137864a, ((r) obj2).f137864a);
    }

    @Override // ft3.q0
    /* JADX INFO: renamed from: f4 */
    public final String getF137850a() {
        return this.f137864a;
    }

    public final int hashCode() {
        return this.f137864a.hashCode();
    }

    public r(String originalFacilityId) {
        Intrinsics.checkNotNullParameter(originalFacilityId, "originalFacilityId");
        this.f137864a = originalFacilityId;
        this.f137865b = j1.FAMILY_CREDIT_CARD;
    }
}
