package fs2;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class i implements oki.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f137560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f137561b;

    public i(List pagerItems, String selectedPagerItemId) {
        Intrinsics.checkNotNullParameter(pagerItems, "pagerItems");
        Intrinsics.checkNotNullParameter(selectedPagerItemId, "selectedPagerItemId");
        this.f137560a = pagerItems;
        this.f137561b = selectedPagerItemId;
    }

    @Override // oki.a
    public final List W() {
        return this.f137560a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f137560a, iVar.f137560a) && Intrinsics.f(this.f137561b, iVar.f137561b);
    }

    public final int hashCode() {
        return this.f137561b.hashCode() + (this.f137560a.hashCode() * 31);
    }

    @Override // oki.a
    public final String z() {
        return this.f137561b;
    }
}
