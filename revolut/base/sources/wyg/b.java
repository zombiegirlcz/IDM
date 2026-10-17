package wyg;

import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f301281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f301282b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CompositeClause f301283c;
    public final boolean d;
    public final Object e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TagViewData f301284g;

    public b(TextLocalisedClause topDescription, Clause title, CompositeClause description, boolean z, Clause thirdDescription, boolean z3, TagViewData tagViewData) {
        Intrinsics.checkNotNullParameter(topDescription, "topDescription");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(thirdDescription, "thirdDescription");
        this.f301281a = topDescription;
        this.f301282b = title;
        this.f301283c = description;
        this.d = z;
        this.e = thirdDescription;
        this.f = z3;
        this.f301284g = tagViewData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f301281a.equals(bVar.f301281a) && this.f301282b.equals(bVar.f301282b) && this.f301283c.equals(bVar.f301283c) && this.d == bVar.d && this.e.equals(bVar.e) && this.f == bVar.f && Intrinsics.f(this.f301284g, bVar.f301284g);
    }

    public final int hashCode() {
        int iC = j6.a.c(p.a.b(j6.a.c(h30.l.c(this.f301283c, p.a.b(this.f301281a.hashCode() * 31, 31, this.f301282b), 31), 31, this.d), 31, this.e), 31, this.f);
        TagViewData tagViewData = this.f301284g;
        return iC + (tagViewData == null ? 0 : tagViewData.hashCode());
    }
}
