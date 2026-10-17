package eqd;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GlyphImage f128435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f128436b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f128437c;
    public final rdh.b d;

    public c(GlyphImage glyphImage, Clause titleClause, TextLocalisedClause buttonClause, rdh.b scope) {
        Intrinsics.checkNotNullParameter(titleClause, "titleClause");
        Intrinsics.checkNotNullParameter(buttonClause, "buttonClause");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f128435a = glyphImage;
        this.f128436b = titleClause;
        this.f128437c = buttonClause;
        this.d = scope;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f128435a, cVar.f128435a) && Intrinsics.f(this.f128436b, cVar.f128436b) && this.f128437c.equals(cVar.f128437c) && this.d == cVar.d;
    }

    public final int hashCode() {
        GlyphImage glyphImage = this.f128435a;
        return this.d.hashCode() + t61.a.a(p.a.a((glyphImage == null ? 0 : glyphImage.hashCode()) * 31, 31, this.f128436b), 31, this.f128437c);
    }
}
