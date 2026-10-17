package ojk;

import com.revolut.core.ui_kit.models.TextClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class k0 implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f225825a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextClause f225826b;

    public k0(TextClause navBarTitle, List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(navBarTitle, "navBarTitle");
        this.f225825a = items;
        this.f225826b = navBarTitle;
    }

    @Override // cli.p
    public final List c() {
        return this.f225825a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj2;
        return Intrinsics.f(this.f225825a, k0Var.f225825a) && this.f225826b.equals(k0Var.f225826b);
    }

    public final int hashCode() {
        return this.f225826b.hashCode() + (this.f225825a.hashCode() * 31);
    }
}
