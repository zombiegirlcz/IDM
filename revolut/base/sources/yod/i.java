package yod;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f315661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MoneyClause f315662b;

    public i(Clause label, MoneyClause value) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f315661a = label;
        this.f315662b = value;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f315661a, iVar.f315661a) && this.f315662b.equals(iVar.f315662b);
    }

    public final int hashCode() {
        return this.f315662b.hashCode() + (this.f315661a.hashCode() * 31);
    }
}
