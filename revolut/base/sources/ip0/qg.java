package ip0;

import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class qg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f165974a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TagViewData f165975b;

    public qg(TagViewData badgeData, Clause badgeTitle) {
        Intrinsics.checkNotNullParameter(badgeTitle, "badgeTitle");
        Intrinsics.checkNotNullParameter(badgeData, "badgeData");
        this.f165974a = badgeTitle;
        this.f165975b = badgeData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof qg)) {
            return false;
        }
        qg qgVar = (qg) obj2;
        return this.f165974a.equals(qgVar.f165974a) && this.f165975b.equals(qgVar.f165975b);
    }

    public final int hashCode() {
        return (this.f165975b.hashCode() + (this.f165974a.hashCode() * 31)) * 31;
    }
}
