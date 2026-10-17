package s32;

import com.revolut.core.ui_kit.models.Clause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class e implements oki.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f259398a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f259399b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f259400c;
    public final Clause d;

    public e(List pagerItems, String selectedPagerItemId, Clause scannerTabClause, Clause detailsTabClause) {
        Intrinsics.checkNotNullParameter(pagerItems, "pagerItems");
        Intrinsics.checkNotNullParameter(selectedPagerItemId, "selectedPagerItemId");
        Intrinsics.checkNotNullParameter(scannerTabClause, "scannerTabClause");
        Intrinsics.checkNotNullParameter(detailsTabClause, "detailsTabClause");
        this.f259398a = pagerItems;
        this.f259399b = selectedPagerItemId;
        this.f259400c = scannerTabClause;
        this.d = detailsTabClause;
    }

    @Override // oki.a
    public final List W() {
        return this.f259398a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f259398a, eVar.f259398a) && Intrinsics.f(this.f259399b, eVar.f259399b) && Intrinsics.f(this.f259400c, eVar.f259400c) && Intrinsics.f(this.d, eVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.a(p.a.c(this.f259398a.hashCode() * 31, 31, this.f259399b), 31, this.f259400c);
    }

    @Override // oki.a
    public final String z() {
        return this.f259399b;
    }
}
