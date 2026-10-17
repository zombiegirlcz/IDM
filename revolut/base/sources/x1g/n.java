package x1g;

import com.revolut.core.ui_kit.models.Clause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class n implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f302429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f302430b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f302431c;

    public n(aim.e items, Clause checkoutButtonClause, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(checkoutButtonClause, "checkoutButtonClause");
        this.f302429a = items;
        this.f302430b = checkoutButtonClause;
        this.f302431c = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f302429a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f302429a, nVar.f302429a) && Intrinsics.f(this.f302430b, nVar.f302430b) && this.f302431c == nVar.f302431c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f302431c) + p.a.a(this.f302429a.hashCode() * 31, 31, this.f302430b);
    }
}
