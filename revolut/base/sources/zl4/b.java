package zl4;

import h30.l;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f323177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xi0.b f323178b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.revolut.feature.credit.card.api.navigation.a f323179c;

    public b(String facilityId, xi0.b currency, com.revolut.feature.credit.card.api.navigation.a screenMode) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(screenMode, "screenMode");
        this.f323177a = facilityId;
        this.f323178b = currency;
        this.f323179c = screenMode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f323177a, bVar.f323177a) && Intrinsics.f(this.f323178b, bVar.f323178b) && this.f323179c == bVar.f323179c;
    }

    public final int hashCode() {
        return this.f323179c.hashCode() + l.j(this.f323178b, this.f323177a.hashCode() * 31, 31);
    }
}
