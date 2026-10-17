package ip0;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f163821a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y0 f163822b;

    public d1(TextLocalisedClause label, y0 bar) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(bar, "bar");
        this.f163821a = label;
        this.f163822b = bar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d1)) {
            return false;
        }
        d1 d1Var = (d1) obj2;
        return this.f163821a.equals(d1Var.f163821a) && this.f163822b.equals(d1Var.f163822b);
    }

    public final int hashCode() {
        return this.f163822b.hashCode() + (this.f163821a.hashCode() * 31);
    }
}
