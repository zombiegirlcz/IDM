package bcb;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f14419a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f14420b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f14421c;

    public b(MoneyClause moneyClause, TextLocalisedClause textLocalisedClause, Image image) {
        Intrinsics.checkNotNullParameter(image, "image");
        this.f14419a = image;
        this.f14420b = textLocalisedClause;
        this.f14421c = moneyClause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f14419a.equals(bVar.f14419a) && this.f14420b.equals(bVar.f14420b) && Intrinsics.f(this.f14421c, bVar.f14421c);
    }

    public final int hashCode() {
        int iA = t61.a.a(this.f14419a.hashCode() * 31, 31, this.f14420b);
        Clause clause = this.f14421c;
        return iA + (clause == null ? 0 : clause.hashCode());
    }
}
