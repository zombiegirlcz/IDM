package bt9;

import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Image f18468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f18469b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MoneyClause f18470c;
    public final TimeClause d;
    public final TextClause e;

    public l(Image image, Image badge, MoneyClause moneyClause, TimeClause dateClause, TextClause description) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(badge, "badge");
        Intrinsics.checkNotNullParameter(moneyClause, "moneyClause");
        Intrinsics.checkNotNullParameter(dateClause, "dateClause");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f18468a = image;
        this.f18469b = badge;
        this.f18470c = moneyClause;
        this.d = dateClause;
        this.e = description;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f18468a, lVar.f18468a) && this.f18469b.equals(lVar.f18469b) && this.f18470c.equals(lVar.f18470c) && this.d.equals(lVar.d) && this.e.equals(lVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + h30.l.d(this.d, v7.a(p.a.b(this.f18468a.hashCode() * 31, 31, this.f18469b), 31, this.f18470c), 31);
    }
}
