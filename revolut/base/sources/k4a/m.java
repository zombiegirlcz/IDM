package k4a;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class m implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f180876a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f180877b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f180878c;

    public m(TextLocalisedClause textLocalisedClause, List items, List menuItems) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        this.f180876a = textLocalisedClause;
        this.f180877b = items;
        this.f180878c = menuItems;
    }

    @Override // cli.p
    public final List c() {
        return this.f180877b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f180876a, mVar.f180876a) && Intrinsics.f(this.f180877b, mVar.f180877b) && Intrinsics.f(this.f180878c, mVar.f180878c);
    }

    public final int hashCode() {
        Clause clause = this.f180876a;
        return this.f180878c.hashCode() + p.a.d((clause == null ? 0 : clause.hashCode()) * 31, 31, this.f180877b);
    }
}
