package g4b;

import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class q implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f140457a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f140458b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f140459c;
    public final yy0.h d;
    public final TagViewData e;

    public q(Clause title, Clause description, TextLocalisedClause secondDescription, yy0.h instrumentImage, TagViewData tagViewData) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(secondDescription, "secondDescription");
        Intrinsics.checkNotNullParameter(instrumentImage, "instrumentImage");
        this.f140457a = title;
        this.f140458b = description;
        this.f140459c = secondDescription;
        this.d = instrumentImage;
        this.e = tagViewData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return this.f140457a.equals(qVar.f140457a) && this.f140458b.equals(qVar.f140458b) && this.f140459c.equals(qVar.f140459c) && this.d.equals(qVar.d) && Intrinsics.f(this.e, qVar.e);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + t61.a.a(p.a.b(this.f140457a.hashCode() * 31, 31, this.f140458b), 31, this.f140459c)) * 31;
        TagViewData tagViewData = this.e;
        return iHashCode + (tagViewData == null ? 0 : tagViewData.hashCode());
    }
}
