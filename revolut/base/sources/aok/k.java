package aok;

import cli.p;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import ip0.v7;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class k implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GlyphImage f8012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextClause f8013b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextClause f8014c;
    public final ArrayList d;

    public k(GlyphImage glyphImage, TextClause title, TextClause subtitle, ArrayList items) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f8012a = glyphImage;
        this.f8013b = title;
        this.f8014c = subtitle;
        this.d = items;
    }

    @Override // cli.p
    public final List c() {
        return this.d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f8012a, kVar.f8012a) && this.f8013b.equals(kVar.f8013b) && this.f8014c.equals(kVar.f8014c) && this.d.equals(kVar.d);
    }

    public final int hashCode() {
        GlyphImage glyphImage = this.f8012a;
        return this.d.hashCode() + v7.b(v7.b((glyphImage == null ? 0 : glyphImage.hashCode()) * 31, 31, this.f8013b), 31, this.f8014c);
    }
}
