package go8;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f145115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f145116b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f145117c;
    public final a d;
    public final GlyphImage e;

    public b(Clause title, TextLocalisedClause subtitle, a aVar, a aVar2, GlyphImage image) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(image, "image");
        this.f145115a = title;
        this.f145116b = subtitle;
        this.f145117c = aVar;
        this.d = aVar2;
        this.e = image;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f145115a.equals(bVar.f145115a) && this.f145116b.equals(bVar.f145116b) && Intrinsics.f(this.f145117c, bVar.f145117c) && Intrinsics.f(this.d, bVar.d) && this.e.equals(bVar.e);
    }

    public final int hashCode() {
        int iA = t61.a.a(this.f145115a.hashCode() * 31, 31, this.f145116b);
        a aVar = this.f145117c;
        int iHashCode = (iA + (aVar == null ? 0 : aVar.hashCode())) * 31;
        a aVar2 = this.d;
        return this.e.hashCode() + ((iHashCode + (aVar2 != null ? aVar2.hashCode() : 0)) * 31);
    }
}
