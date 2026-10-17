package czc;

import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MoneyClause f110214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextClause f110215b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextClause f110216c;
    public final TimeClause d;
    public final Image e;
    public final LayeredImage f;

    public q(MoneyClause title, TextClause toolbarTitle, TextClause description, TimeClause timeClause, Image image, LayeredImage layeredImage) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(toolbarTitle, "toolbarTitle");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f110214a = title;
        this.f110215b = toolbarTitle;
        this.f110216c = description;
        this.d = timeClause;
        this.e = image;
        this.f = layeredImage;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return this.f110214a.equals(qVar.f110214a) && this.f110215b.equals(qVar.f110215b) && this.f110216c.equals(qVar.f110216c) && this.d.equals(qVar.d) && this.e.equals(qVar.e) && this.f.equals(qVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + a10.b.c(this.e, h30.l.d(this.d, v7.b(v7.b(this.f110214a.hashCode() * 31, 31, this.f110215b), 31, this.f110216c), 31), 31);
    }
}
