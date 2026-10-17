package ft3;

import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@mlm.g
public final class m implements q0 {

    @NotNull
    public static final l Companion = new l();
    public static final Lazy[] e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f137847a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gt3.b f137848b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j1 f137849c;
    public final it3.k d;

    static {
        yhm.k kVar = yhm.k.PUBLICATION;
        e = new Lazy[]{null, yhm.j.c(kVar, new f(4)), yhm.j.c(kVar, new f(5)), yhm.j.c(kVar, new f(6))};
    }

    public /* synthetic */ m(int i, String str, gt3.b bVar, j1 j1Var, it3.k kVar) {
        if (3 != (i & 3)) {
            qlm.j1.f(k.f137842a.getDescriptor(), i, 3);
            throw null;
        }
        this.f137847a = str;
        this.f137848b = bVar;
        if ((i & 4) == 0) {
            this.f137849c = j1.CREDIT_CARD_LIMIT_DECREASE;
        } else {
            this.f137849c = j1Var;
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
        return this.f137848b;
    }

    @Override // ft3.q0
    /* JADX INFO: renamed from: E2 */
    public final j1 getF137852c() {
        return this.f137849c;
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
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f137847a, mVar.f137847a) && this.f137848b == mVar.f137848b;
    }

    @Override // ft3.q0
    /* JADX INFO: renamed from: f4 */
    public final String getF137850a() {
        return this.f137847a;
    }

    public final int hashCode() {
        int iHashCode = this.f137847a.hashCode() * 31;
        gt3.b bVar = this.f137848b;
        return iHashCode + (bVar == null ? 0 : bVar.hashCode());
    }

    public m(String originalFacilityId, gt3.b bVar) {
        Intrinsics.checkNotNullParameter(originalFacilityId, "originalFacilityId");
        this.f137847a = originalFacilityId;
        this.f137848b = bVar;
        this.f137849c = j1.CREDIT_CARD_LIMIT_DECREASE;
    }
}
