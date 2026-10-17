package rq7;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes4.dex */
public final class q implements jki.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f256495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f256496b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f256497c;
    public final Image d;
    public final aw0.k e;
    public final List f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f256498g;

    public q(List items, TextClause textClause, CompositeClause compositeClause, Image image, aw0.k kVar, f0 menuItems, List actions) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        Intrinsics.checkNotNullParameter(actions, "actions");
        this.f256495a = items;
        this.f256496b = textClause;
        this.f256497c = compositeClause;
        this.d = image;
        this.e = kVar;
        this.f = menuItems;
        this.f256498g = actions;
    }

    @Override // jki.n
    public final List c() {
        return this.f256495a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.f256495a, qVar.f256495a) && Intrinsics.f(this.f256496b, qVar.f256496b) && Intrinsics.f(this.f256497c, qVar.f256497c) && Intrinsics.f(this.d, qVar.d) && Intrinsics.f(this.e, qVar.e) && Intrinsics.f(this.f, qVar.f) && Intrinsics.f(this.f256498g, qVar.f256498g);
    }

    public final int hashCode() {
        int iHashCode = this.f256495a.hashCode() * 31;
        Clause clause = this.f256496b;
        int iHashCode2 = (iHashCode + (clause == null ? 0 : clause.hashCode())) * 31;
        Clause clause2 = this.f256497c;
        int iHashCode3 = (iHashCode2 + (clause2 == null ? 0 : clause2.hashCode())) * 31;
        Image image = this.d;
        int iHashCode4 = (iHashCode3 + (image == null ? 0 : image.hashCode())) * 31;
        aw0.k kVar = this.e;
        return this.f256498g.hashCode() + p.a.d((iHashCode4 + (kVar != null ? kVar.hashCode() : 0)) * 31, 31, this.f);
    }
}
