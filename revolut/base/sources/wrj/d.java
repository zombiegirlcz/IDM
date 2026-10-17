package wrj;

import com.revolut.core.ui_kit.models.MoneyClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class d implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MoneyClause f299595a;

    public d(MoneyClause title) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f299595a = title;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && this.f299595a.equals(((d) obj2).f299595a);
    }

    public final int hashCode() {
        return this.f299595a.hashCode();
    }
}
