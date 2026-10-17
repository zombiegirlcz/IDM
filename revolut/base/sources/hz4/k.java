package hz4;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f157025a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f157026b;

    public k(TextLocalisedClause title, boolean z) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f157025a = title;
        this.f157026b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return this.f157025a.equals(kVar.f157025a) && this.f157026b == kVar.f157026b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f157026b) + (this.f157025a.hashCode() * 31);
    }
}
