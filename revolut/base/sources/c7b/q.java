package c7b;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class q implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f21905a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f21906b;

    public q(TextClause textClause, List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f21905a = textClause;
        this.f21906b = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f21906b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.f21905a, qVar.f21905a) && Intrinsics.f(this.f21906b, qVar.f21906b);
    }

    public final int hashCode() {
        Clause clause = this.f21905a;
        return this.f21906b.hashCode() + ((clause == null ? 0 : clause.hashCode()) * 31);
    }
}
