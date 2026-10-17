package em4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class e implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f127614a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f127615b;

    public e(xi0.b currency, boolean z) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f127614a = currency;
        this.f127615b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f127614a, eVar.f127614a) && this.f127615b == eVar.f127615b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f127615b) + (this.f127614a.hashCode() * 31);
    }
}
