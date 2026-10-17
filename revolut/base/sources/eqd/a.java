package eqd;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GlyphImage f128430a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f128431b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f128432c;

    public a(GlyphImage glyphImage, Clause titleClause, TextLocalisedClause buttonClause) {
        Intrinsics.checkNotNullParameter(titleClause, "titleClause");
        Intrinsics.checkNotNullParameter(buttonClause, "buttonClause");
        this.f128430a = glyphImage;
        this.f128431b = titleClause;
        this.f128432c = buttonClause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f128430a, aVar.f128430a) && Intrinsics.f(this.f128431b, aVar.f128431b) && this.f128432c.equals(aVar.f128432c);
    }

    public final int hashCode() {
        GlyphImage glyphImage = this.f128430a;
        return this.f128432c.hashCode() + p.a.a((glyphImage == null ? 0 : glyphImage.hashCode()) * 31, 31, this.f128431b);
    }
}
