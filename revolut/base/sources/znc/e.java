package znc;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.badge.CircleBadgeModel;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class e implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MoneyClause f323691a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f323692b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f323693c;
    public final Image d;
    public final Image e;
    public final CircleBadgeModel f;

    public e(MoneyClause title, Clause subtitle, Clause description, Image icon, Image image, CircleBadgeModel circleBadgeModel) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.f323691a = title;
        this.f323692b = subtitle;
        this.f323693c = description;
        this.d = icon;
        this.e = image;
        this.f = circleBadgeModel;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.f323691a.equals(eVar.f323691a) && this.f323692b.equals(eVar.f323692b) && this.f323693c.equals(eVar.f323693c) && this.d.equals(eVar.d) && Intrinsics.f(this.e, eVar.e) && Intrinsics.f(this.f, eVar.f);
    }

    public final int hashCode() {
        int iC = a10.b.c(this.d, p.a.a(p.a.b(this.f323691a.hashCode() * 31, 31, this.f323692b), 31, this.f323693c), 31);
        Image image = this.e;
        int iHashCode = (iC + (image == null ? 0 : image.hashCode())) * 31;
        CircleBadgeModel circleBadgeModel = this.f;
        return iHashCode + (circleBadgeModel != null ? circleBadgeModel.hashCode() : 0);
    }
}
