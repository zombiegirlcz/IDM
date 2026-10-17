package q03;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class p0 implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f241096a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f241097b;

    public p0(TextLocalisedClause titleClause, List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(titleClause, "titleClause");
        this.f241096a = items;
        this.f241097b = titleClause;
    }

    @Override // cli.p
    public final List c() {
        return this.f241096a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj2;
        return Intrinsics.f(this.f241096a, p0Var.f241096a) && this.f241097b.equals(p0Var.f241097b);
    }

    public final int hashCode() {
        return this.f241097b.hashCode() + (this.f241096a.hashCode() * 31);
    }
}
