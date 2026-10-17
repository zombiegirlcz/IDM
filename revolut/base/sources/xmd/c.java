package xmd;

import com.revolut.core.ui_kit.models.MoneyClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class c implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MoneyClause f307164a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MoneyClause f307165b;

    public c(MoneyClause from, MoneyClause to6) {
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(to6, "to");
        this.f307164a = from;
        this.f307165b = to6;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f307164a, cVar.f307164a) && Intrinsics.f(this.f307165b, cVar.f307165b);
    }

    public final int hashCode() {
        return this.f307165b.hashCode() + (this.f307164a.hashCode() * 31);
    }
}
