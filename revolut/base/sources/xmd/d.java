package xmd;

import com.revolut.core.ui_kit.models.MoneyClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class d implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MoneyClause f307167a;

    public d(MoneyClause value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f307167a = value;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && this.f307167a.equals(((d) obj2).f307167a);
    }

    public final int hashCode() {
        return this.f307167a.hashCode();
    }
}
