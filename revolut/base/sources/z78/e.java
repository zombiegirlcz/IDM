package z78;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f319946a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f319947b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f319948c;

    public e(List profilesWithWalletId, Integer num, Integer num2) {
        Intrinsics.checkNotNullParameter(profilesWithWalletId, "profilesWithWalletId");
        this.f319946a = profilesWithWalletId;
        this.f319947b = num;
        this.f319948c = num2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f319946a, eVar.f319946a) && Intrinsics.f(this.f319947b, eVar.f319947b) && Intrinsics.f(this.f319948c, eVar.f319948c);
    }

    public final int hashCode() {
        int iHashCode = this.f319946a.hashCode() * 31;
        Integer num = this.f319947b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f319948c;
        return iHashCode2 + (num2 != null ? num2.hashCode() : 0);
    }
}
