package t2i;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MoneyClause f267574a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f267575b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Image f267576c;
    public final Image d;

    public a(MoneyClause title, Clause description, Image endIconImage, LayeredImage layeredImage) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(endIconImage, "endIconImage");
        this.f267574a = title;
        this.f267575b = description;
        this.f267576c = endIconImage;
        this.d = layeredImage;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f267574a.equals(aVar.f267574a) && this.f267575b.equals(aVar.f267575b) && this.f267576c.equals(aVar.f267576c) && Intrinsics.f(this.d, aVar.d);
    }

    public final int hashCode() {
        int iC = a10.b.c(this.f267576c, p.a.b(this.f267574a.hashCode() * 31, 31, this.f267575b), 31);
        Image image = this.d;
        return iC + (image == null ? 0 : image.hashCode());
    }
}
