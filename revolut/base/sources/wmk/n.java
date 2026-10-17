package wmk;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class n implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GlyphImage f298699a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f298700b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedQuantityClause f298701c;
    public final ArrayList d;

    public n(GlyphImage headerImage, TextLocalisedClause title, TextLocalisedQuantityClause subtitle, ArrayList items) {
        Intrinsics.checkNotNullParameter(headerImage, "headerImage");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f298699a = headerImage;
        this.f298700b = title;
        this.f298701c = subtitle;
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
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return this.f298699a.equals(nVar.f298699a) && this.f298700b.equals(nVar.f298700b) && this.f298701c.equals(nVar.f298701c) && this.d.equals(nVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.f298701c.hashCode() + t61.a.a(this.f298699a.hashCode() * 31, 31, this.f298700b)) * 31);
    }
}
