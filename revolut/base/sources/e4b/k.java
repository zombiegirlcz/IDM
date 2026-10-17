package e4b;

import com.revolut.core.ui_kit.models.Clause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class k implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f122527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f122528b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f122529c;
    public final h d;
    public final List e;

    public k(Clause title, Clause subtitle, Clause clause, h headerIcon, List items) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(headerIcon, "headerIcon");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f122527a = title;
        this.f122528b = subtitle;
        this.f122529c = clause;
        this.d = headerIcon;
        this.e = items;
    }

    @Override // cli.p
    public final List c() {
        return this.e;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f122527a, kVar.f122527a) && Intrinsics.f(this.f122528b, kVar.f122528b) && Intrinsics.f(this.f122529c, kVar.f122529c) && Intrinsics.f(this.d, kVar.d) && Intrinsics.f(this.e, kVar.e);
    }

    public final int hashCode() {
        int iA = p.a.a(this.f122527a.hashCode() * 31, 31, this.f122528b);
        Clause clause = this.f122529c;
        return this.e.hashCode() + ((this.d.hashCode() + ((iA + (clause == null ? 0 : clause.hashCode())) * 31)) * 31);
    }
}
