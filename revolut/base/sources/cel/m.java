package cel;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f23504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f23505b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f23506c;
    public final Object d;

    public m(l type, int i, k kVar, Object obj2) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f23504a = type;
        this.f23505b = i;
        this.f23506c = kVar;
        this.d = obj2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return this.f23504a == mVar.f23504a && this.f23505b == mVar.f23505b && this.f23506c == mVar.f23506c && Intrinsics.f(this.d, mVar.d);
    }

    public final int hashCode() {
        int iB = j6.a.b(this.f23505b, this.f23504a.hashCode() * 31, 31);
        k kVar = this.f23506c;
        int iHashCode = (iB + (kVar == null ? 0 : kVar.hashCode())) * 31;
        Object obj2 = this.d;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }
}
