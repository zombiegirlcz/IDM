package lc0;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f193762a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f193763b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ResourceImage f193764c;

    public p(TextLocalisedClause title, TextLocalisedClause description, ResourceImage navigationIconImage) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(navigationIconImage, "navigationIconImage");
        this.f193762a = title;
        this.f193763b = description;
        this.f193764c = navigationIconImage;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return this.f193762a.equals(pVar.f193762a) && this.f193763b.equals(pVar.f193763b) && this.f193764c.equals(pVar.f193764c);
    }

    public final int hashCode() {
        return this.f193764c.hashCode() + t61.a.a(this.f193762a.hashCode() * 31, 31, this.f193763b);
    }
}
