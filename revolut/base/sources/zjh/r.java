package zjh;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class r implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MoneyClause f322852a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f322853b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LayeredImage f322854c;

    public r(MoneyClause title, Clause subtitle, LayeredImage image) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(image, "image");
        this.f322852a = title;
        this.f322853b = subtitle;
        this.f322854c = image;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return this.f322852a.equals(rVar.f322852a) && this.f322853b.equals(rVar.f322853b) && this.f322854c.equals(rVar.f322854c);
    }

    public final int hashCode() {
        return this.f322854c.hashCode() + p.a.b(this.f322852a.hashCode() * 31, 31, this.f322853b);
    }
}
