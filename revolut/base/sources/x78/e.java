package x78;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f303165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xi0.b f303166b;

    public e(String juniorId, xi0.b forceCurrency) {
        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
        Intrinsics.checkNotNullParameter(forceCurrency, "forceCurrency");
        this.f303165a = juniorId;
        this.f303166b = forceCurrency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f303165a, eVar.f303165a) && Intrinsics.f(this.f303166b, eVar.f303166b);
    }

    public final int hashCode() {
        return this.f303166b.hashCode() + (this.f303165a.hashCode() * 31);
    }
}
