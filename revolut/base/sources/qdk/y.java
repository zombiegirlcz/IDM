package qdk;

import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class y implements b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextClause f244994a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f244995b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TagViewData f244996c;

    public y(TextClause title, TextClause textClause, TagViewData tagViewData) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f244994a = title;
        this.f244995b = textClause;
        this.f244996c = tagViewData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y)) {
            return false;
        }
        y yVar = (y) obj2;
        return this.f244994a.equals(yVar.f244994a) && Intrinsics.f(this.f244995b, yVar.f244995b) && Intrinsics.f(this.f244996c, yVar.f244996c);
    }

    public final int hashCode() {
        int iHashCode = this.f244994a.hashCode() * 31;
        Clause clause = this.f244995b;
        int iHashCode2 = (iHashCode + (clause == null ? 0 : clause.hashCode())) * 31;
        TagViewData tagViewData = this.f244996c;
        return iHashCode2 + (tagViewData != null ? tagViewData.hashCode() : 0);
    }
}
