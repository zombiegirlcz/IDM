package ft9;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import h30.l;
import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f137967a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Image f137968b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MoneyClause f137969c;
    public final TimeClause d;
    public final Object e;

    public g(Image image, LayeredImage badge, MoneyClause moneyClause, TimeClause dateClause, Clause description) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(badge, "badge");
        Intrinsics.checkNotNullParameter(moneyClause, "moneyClause");
        Intrinsics.checkNotNullParameter(dateClause, "dateClause");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f137967a = image;
        this.f137968b = badge;
        this.f137969c = moneyClause;
        this.d = dateClause;
        this.e = description;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f137967a.equals(gVar.f137967a) && Intrinsics.f(this.f137968b, gVar.f137968b) && this.f137969c.equals(gVar.f137969c) && this.d.equals(gVar.d) && this.e.equals(gVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + l.d(this.d, v7.a(a10.b.c(this.f137968b, this.f137967a.hashCode() * 31, 31), 31, this.f137969c), 31);
    }
}
