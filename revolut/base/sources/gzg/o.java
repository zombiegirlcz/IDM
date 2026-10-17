package gzg;

import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f148116a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f148117b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f148118c;
    public final Object d;
    public final boolean e;
    public final TagViewData f;

    public o(TextLocalisedClause topDescription, Clause title, Clause description, Clause thirdDescription, boolean z, TagViewData tagViewData) {
        Intrinsics.checkNotNullParameter(topDescription, "topDescription");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(thirdDescription, "thirdDescription");
        this.f148116a = topDescription;
        this.f148117b = title;
        this.f148118c = description;
        this.d = thirdDescription;
        this.e = z;
        this.f = tagViewData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return this.f148116a.equals(oVar.f148116a) && this.f148117b.equals(oVar.f148117b) && this.f148118c.equals(oVar.f148118c) && this.d.equals(oVar.d) && this.e == oVar.e && Intrinsics.f(this.f, oVar.f);
    }

    public final int hashCode() {
        int iC = j6.a.c(p.a.b(p.a.b(p.a.b(this.f148116a.hashCode() * 31, 31, this.f148117b), 31, this.f148118c), 31, this.d), 31, this.e);
        TagViewData tagViewData = this.f;
        return iC + (tagViewData == null ? 0 : tagViewData.hashCode());
    }
}
