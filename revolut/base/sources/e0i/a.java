package e0i;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f121718a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r0i.a f121719b;

    public a(List bannerItems, r0i.a aVar) {
        Intrinsics.checkNotNullParameter(bannerItems, "bannerItems");
        this.f121718a = bannerItems;
        this.f121719b = aVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f121718a, aVar.f121718a) && this.f121719b == aVar.f121719b;
    }

    public final int hashCode() {
        int iHashCode = this.f121718a.hashCode() * 31;
        r0i.a aVar = this.f121719b;
        return iHashCode + (aVar == null ? 0 : aVar.hashCode());
    }
}
