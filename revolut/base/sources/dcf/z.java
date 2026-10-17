package dcf;

import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.CdnImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f112982a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CdnImage f112983b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f112984c;
    public final TagViewData d;

    public z(TextLocalisedClause title, CdnImage backgroundImage, Clause clause, TagViewData tagViewData) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(backgroundImage, "backgroundImage");
        this.f112982a = title;
        this.f112983b = backgroundImage;
        this.f112984c = clause;
        this.d = tagViewData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z)) {
            return false;
        }
        z zVar = (z) obj2;
        return this.f112982a.equals(zVar.f112982a) && this.f112983b.equals(zVar.f112983b) && Intrinsics.f(this.f112984c, zVar.f112984c) && Intrinsics.f(this.d, zVar.d);
    }

    public final int hashCode() {
        int iHashCode = (this.f112983b.hashCode() + (this.f112982a.hashCode() * 31)) * 31;
        Clause clause = this.f112984c;
        int iHashCode2 = (iHashCode + (clause == null ? 0 : clause.hashCode())) * 31;
        TagViewData tagViewData = this.d;
        return iHashCode2 + (tagViewData != null ? tagViewData.hashCode() : 0);
    }
}
