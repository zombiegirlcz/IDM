package cv7;

import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.CdnImage;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import zhm.f0;

/* JADX INFO: loaded from: classes4.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f109306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Image f109307b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final aw0.k f109308c;
    public final List d;
    public final List e;

    public k() {
        this(null, null, 31);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f109306a, kVar.f109306a) && Intrinsics.f(this.f109307b, kVar.f109307b) && Intrinsics.f(this.f109308c, kVar.f109308c) && Intrinsics.f(this.d, kVar.d) && Intrinsics.f(this.e, kVar.e);
    }

    public final int hashCode() {
        int iHashCode = this.f109306a.hashCode() * 31;
        Image image = this.f109307b;
        int iHashCode2 = (iHashCode + (image == null ? 0 : image.hashCode())) * 31;
        aw0.k kVar = this.f109308c;
        return this.e.hashCode() + p.a.d((iHashCode2 + (kVar != null ? kVar.hashCode() : 0)) * 31, 31, this.d);
    }

    public k(Clause title, Image image, aw0.k kVar, List actions, List menuItems) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(actions, "actions");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        this.f109306a = title;
        this.f109307b = image;
        this.f109308c = kVar;
        this.d = actions;
        this.e = menuItems;
    }

    public k(Clause clause, CdnImage cdnImage, int i) {
        Clause textClause;
        if ((i & 1) != 0) {
            m70.a.c(t0.f186434a);
            textClause = new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        } else {
            textClause = clause;
        }
        cdnImage = (i & 2) != 0 ? null : cdnImage;
        f0 f0Var = f0.f322471a;
        this(textClause, cdnImage, null, f0Var, f0Var);
    }
}
