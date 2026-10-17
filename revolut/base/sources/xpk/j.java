package xpk;

import aw0.q0;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.data.model.Data;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class j implements jki.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f307991a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f307992b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f307993c;
    public final Clause d;
    public final Image e;
    public final Data f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final q0 f307994g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Clause f307995h;

    public j(List items, List menuItems, Clause toolbarTitle, Clause clause, Image toolbarImage, Data headerData, q0 q0Var, Clause clause2) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        Intrinsics.checkNotNullParameter(toolbarTitle, "toolbarTitle");
        Intrinsics.checkNotNullParameter(toolbarImage, "toolbarImage");
        Intrinsics.checkNotNullParameter(headerData, "headerData");
        this.f307991a = items;
        this.f307992b = menuItems;
        this.f307993c = toolbarTitle;
        this.d = clause;
        this.e = toolbarImage;
        this.f = headerData;
        this.f307994g = q0Var;
        this.f307995h = clause2;
    }

    @Override // jki.n
    public final List c() {
        return this.f307991a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f307991a, jVar.f307991a) && Intrinsics.f(this.f307992b, jVar.f307992b) && Intrinsics.f(this.f307993c, jVar.f307993c) && Intrinsics.f(this.d, jVar.d) && Intrinsics.f(this.e, jVar.e) && Intrinsics.f(this.f, jVar.f) && Intrinsics.f(this.f307994g, jVar.f307994g) && Intrinsics.f(this.f307995h, jVar.f307995h);
    }

    public final int hashCode() {
        int iA = p.a.a(p.a.d(this.f307991a.hashCode() * 31, 31, this.f307992b), 31, this.f307993c);
        Clause clause = this.d;
        int iC = kii.e.c(this.f, a10.b.c(this.e, (iA + (clause == null ? 0 : clause.hashCode())) * 31, 31), 31);
        q0 q0Var = this.f307994g;
        int iHashCode = (iC + (q0Var == null ? 0 : q0Var.hashCode())) * 31;
        Clause clause2 = this.f307995h;
        return iHashCode + (clause2 != null ? clause2.hashCode() : 0);
    }
}
