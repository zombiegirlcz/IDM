package ip0;

import com.revolut.core.ui_kit.models.TextClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class fa0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextClause f164229a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f164230b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final da0 f164231c;

    public fa0(TextClause title, boolean z) {
        da0 completionIndicator = da0.IconAndText;
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(completionIndicator, "completionIndicator");
        this.f164229a = title;
        this.f164230b = z;
        this.f164231c = completionIndicator;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof fa0)) {
            return false;
        }
        fa0 fa0Var = (fa0) obj2;
        return Intrinsics.f(this.f164229a, fa0Var.f164229a) && this.f164230b == fa0Var.f164230b && this.f164231c == fa0Var.f164231c;
    }

    public final int hashCode() {
        return this.f164231c.hashCode() + j6.a.c(this.f164229a.hashCode() * 31, 31, this.f164230b);
    }
}
