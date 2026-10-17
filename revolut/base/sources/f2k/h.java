package f2k;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class h {

    @NotNull
    public static final g Companion = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f131846a;

    public h(Clause clause) {
        Intrinsics.checkNotNullParameter(clause, "clause");
        Intrinsics.checkNotNullParameter("price_comparison_widget", "contextType");
        this.f131846a = clause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f131846a, ((h) obj2).f131846a);
    }

    public final int hashCode() {
        return (this.f131846a.hashCode() * 31) + 1069791684;
    }
}
