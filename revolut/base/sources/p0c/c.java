package p0c;

import cli.j;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements j, oki.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f231497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f231498b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f231499c;

    public c(List pagerItems, String selectedPagerItemId, Integer num) {
        Intrinsics.checkNotNullParameter(selectedPagerItemId, "selectedPagerItemId");
        Intrinsics.checkNotNullParameter(pagerItems, "pagerItems");
        this.f231497a = selectedPagerItemId;
        this.f231498b = pagerItems;
        this.f231499c = num;
    }

    public static c a(c cVar, String selectedPagerItemId, List pagerItems, Integer num, int i) {
        if ((i & 1) != 0) {
            selectedPagerItemId = cVar.f231497a;
        }
        if ((i & 2) != 0) {
            pagerItems = cVar.f231498b;
        }
        if ((i & 4) != 0) {
            num = cVar.f231499c;
        }
        cVar.getClass();
        Intrinsics.checkNotNullParameter(selectedPagerItemId, "selectedPagerItemId");
        Intrinsics.checkNotNullParameter(pagerItems, "pagerItems");
        return new c(pagerItems, selectedPagerItemId, num);
    }

    @Override // oki.a
    public final List W() {
        return this.f231498b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f231497a, cVar.f231497a) && Intrinsics.f(this.f231498b, cVar.f231498b) && Intrinsics.f(this.f231499c, cVar.f231499c);
    }

    public final int hashCode() {
        int iD = p.a.d(this.f231497a.hashCode() * 31, 31, this.f231498b);
        Integer num = this.f231499c;
        return iD + (num == null ? 0 : num.hashCode());
    }

    @Override // oki.a
    public final String z() {
        return this.f231497a;
    }
}
