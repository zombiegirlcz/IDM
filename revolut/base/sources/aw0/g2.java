package aw0;

import com.revolut.core.ui_kit.models.MoneyClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class g2 implements j2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MoneyClause f10318a;

    public g2(MoneyClause yLabel) {
        Intrinsics.checkNotNullParameter(yLabel, "yLabel");
        this.f10318a = yLabel;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g2) && this.f10318a.equals(((g2) obj2).f10318a);
    }

    public final int hashCode() {
        return this.f10318a.hashCode();
    }
}
