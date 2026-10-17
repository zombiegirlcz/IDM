package aw0;

import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class g7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f10324a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MoneyClause f10325b;

    public g7(TextLocalisedClause label, MoneyClause value) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f10324a = label;
        this.f10325b = value;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g7)) {
            return false;
        }
        g7 g7Var = (g7) obj2;
        return this.f10324a.equals(g7Var.f10324a) && this.f10325b.equals(g7Var.f10325b);
    }

    public final int hashCode() {
        return this.f10325b.hashCode() + (this.f10324a.hashCode() * 31);
    }
}
