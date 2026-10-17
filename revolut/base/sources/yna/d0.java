package yna;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.avatar.AvatarModel;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import tx0.w1;

/* JADX INFO: loaded from: classes5.dex */
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextClause f315326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f315327b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f315328c;
    public final AvatarModel.Default d;
    public final List e;
    public final List f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final w1 f315329g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final tx0.q1 f315330h;

    public d0(TextClause title, Clause clause, CompositeClause compositeClause, AvatarModel.Default icon, List actions, List menuItems, w1 w1Var, tx0.q1 avatarVariant) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(actions, "actions");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        Intrinsics.checkNotNullParameter(avatarVariant, "avatarVariant");
        this.f315326a = title;
        this.f315327b = clause;
        this.f315328c = compositeClause;
        this.d = icon;
        this.e = actions;
        this.f = menuItems;
        this.f315329g = w1Var;
        this.f315330h = avatarVariant;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj2;
        return this.f315326a.equals(d0Var.f315326a) && Intrinsics.f(this.f315327b, d0Var.f315327b) && Intrinsics.f(this.f315328c, d0Var.f315328c) && this.d.equals(d0Var.d) && Intrinsics.f(this.e, d0Var.e) && Intrinsics.f(this.f, d0Var.f) && Intrinsics.f(this.f315329g, d0Var.f315329g) && this.f315330h == d0Var.f315330h;
    }

    public final int hashCode() {
        int iHashCode = this.f315326a.hashCode() * 31;
        Clause clause = this.f315327b;
        int iHashCode2 = (iHashCode + (clause == null ? 0 : clause.hashCode())) * 31;
        Clause clause2 = this.f315328c;
        int iD = p.a.d(p.a.d((this.d.hashCode() + ((iHashCode2 + (clause2 == null ? 0 : clause2.hashCode())) * 31)) * 31, 31, this.e), 31, this.f);
        w1 w1Var = this.f315329g;
        return this.f315330h.hashCode() + ((iD + (w1Var != null ? w1Var.hashCode() : 0)) * 31);
    }
}
