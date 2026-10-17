package ojk;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f225803a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f225804b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b0 f225805c;

    public a0(y expandedListsData, Data slotManagerItems, b0 pagerTabsData) {
        Intrinsics.checkNotNullParameter(expandedListsData, "expandedListsData");
        Intrinsics.checkNotNullParameter(slotManagerItems, "slotManagerItems");
        Intrinsics.checkNotNullParameter(pagerTabsData, "pagerTabsData");
        this.f225803a = expandedListsData;
        this.f225804b = slotManagerItems;
        this.f225805c = pagerTabsData;
    }

    public static a0 a(a0 a0Var, y expandedListsData, Data slotManagerItems, b0 pagerTabsData, int i) {
        if ((i & 1) != 0) {
            expandedListsData = a0Var.f225803a;
        }
        if ((i & 2) != 0) {
            slotManagerItems = a0Var.f225804b;
        }
        if ((i & 4) != 0) {
            pagerTabsData = a0Var.f225805c;
        }
        a0Var.getClass();
        Intrinsics.checkNotNullParameter(expandedListsData, "expandedListsData");
        Intrinsics.checkNotNullParameter(slotManagerItems, "slotManagerItems");
        Intrinsics.checkNotNullParameter(pagerTabsData, "pagerTabsData");
        return new a0(expandedListsData, slotManagerItems, pagerTabsData);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj2;
        return Intrinsics.f(this.f225803a, a0Var.f225803a) && Intrinsics.f(this.f225804b, a0Var.f225804b) && Intrinsics.f(this.f225805c, a0Var.f225805c);
    }

    public final int hashCode() {
        return this.f225805c.hashCode() + kii.e.c(this.f225804b, this.f225803a.f225847a.hashCode() * 31, 31);
    }
}
