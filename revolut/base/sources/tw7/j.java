package tw7;

import com.revolut.core.ui_kit.background.AnimatedBackgroundType;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class j implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f274937a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f274938b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f274939c;
    public final AnimatedBackgroundType d;
    public final List e;
    public final List f;

    public j(boolean z, Clause clause, TextClause textClause, AnimatedBackgroundType backgroundType, List menuItems, List items) {
        Intrinsics.checkNotNullParameter(backgroundType, "backgroundType");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f274937a = z;
        this.f274938b = clause;
        this.f274939c = textClause;
        this.d = backgroundType;
        this.e = menuItems;
        this.f = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return this.f274937a == jVar.f274937a && Intrinsics.f(this.f274938b, jVar.f274938b) && Intrinsics.f(this.f274939c, jVar.f274939c) && this.d.equals(jVar.d) && Intrinsics.f(this.e, jVar.e) && Intrinsics.f(this.f, jVar.f);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f274937a) * 31;
        Clause clause = this.f274938b;
        int iHashCode2 = (iHashCode + (clause == null ? 0 : clause.hashCode())) * 31;
        Clause clause2 = this.f274939c;
        return this.f.hashCode() + p.a.d((this.d.hashCode() + ((iHashCode2 + (clause2 != null ? clause2.hashCode() : 0)) * 31)) * 31, 31, this.e);
    }
}
