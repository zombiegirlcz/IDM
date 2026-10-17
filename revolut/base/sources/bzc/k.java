package bzc;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.CdnImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f19960a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f19961b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f19962c;
    public final Image d;

    public k(TextLocalisedClause title, TextLocalisedClause toolbarTitle, TextLocalisedClause textLocalisedClause, CdnImage cdnImage) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(toolbarTitle, "toolbarTitle");
        this.f19960a = title;
        this.f19961b = toolbarTitle;
        this.f19962c = textLocalisedClause;
        this.d = cdnImage;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return this.f19960a.equals(kVar.f19960a) && this.f19961b.equals(kVar.f19961b) && Intrinsics.f(this.f19962c, kVar.f19962c) && Intrinsics.f(this.d, kVar.d);
    }

    public final int hashCode() {
        int iA = t61.a.a(this.f19960a.hashCode() * 31, 31, this.f19961b);
        Clause clause = this.f19962c;
        int iHashCode = (iA + (clause == null ? 0 : clause.hashCode())) * 31;
        Image image = this.d;
        return iHashCode + (image != null ? image.hashCode() : 0);
    }
}
