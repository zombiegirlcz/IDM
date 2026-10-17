package hyh;

import cli.j;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class c implements j, oki.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f156876a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f156877b;

    public c(String selectedPagerItemId, List pagerItems) {
        Intrinsics.checkNotNullParameter(selectedPagerItemId, "selectedPagerItemId");
        Intrinsics.checkNotNullParameter(pagerItems, "pagerItems");
        this.f156876a = selectedPagerItemId;
        this.f156877b = pagerItems;
    }

    @Override // oki.a
    public final List W() {
        return this.f156877b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f156876a, cVar.f156876a) && Intrinsics.f(this.f156877b, cVar.f156877b);
    }

    public final int hashCode() {
        return this.f156877b.hashCode() + (this.f156876a.hashCode() * 31);
    }

    @Override // oki.a
    public final String z() {
        return this.f156876a;
    }
}
