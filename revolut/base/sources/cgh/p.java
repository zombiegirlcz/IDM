package cgh;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class p implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f23981a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f23982b;

    public p(TextLocalisedClause toolbarTitle, List items) {
        Intrinsics.checkNotNullParameter(toolbarTitle, "toolbarTitle");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f23981a = toolbarTitle;
        this.f23982b = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f23982b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return this.f23981a.equals(pVar.f23981a) && Intrinsics.f(this.f23982b, pVar.f23982b);
    }

    public final int hashCode() {
        return this.f23982b.hashCode() + (this.f23981a.hashCode() * 31);
    }
}
