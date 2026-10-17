package im8;

import aii.e;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f162313a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f162314b;

    public a(String juniorId, String perkId) {
        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
        Intrinsics.checkNotNullParameter(perkId, "perkId");
        this.f162313a = juniorId;
        this.f162314b = perkId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f162313a, aVar.f162313a) && Intrinsics.f(this.f162314b, aVar.f162314b);
    }

    public final int hashCode() {
        return this.f162314b.hashCode() + (this.f162313a.hashCode() * 31);
    }
}
