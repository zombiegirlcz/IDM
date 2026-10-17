package iw4;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class p implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f168954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f168955b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f168956c;

    public p(List items, o button, TextLocalisedClause title) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(button, "button");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f168954a = items;
        this.f168955b = button;
        this.f168956c = title;
    }

    @Override // cli.p
    public final List c() {
        return this.f168954a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f168954a, pVar.f168954a) && this.f168955b.equals(pVar.f168955b) && this.f168956c.equals(pVar.f168956c);
    }

    public final int hashCode() {
        return this.f168956c.hashCode() + ((this.f168955b.hashCode() + (this.f168954a.hashCode() * 31)) * 31);
    }
}
