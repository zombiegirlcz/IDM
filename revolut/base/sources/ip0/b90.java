package ip0;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class b90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f163566a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f163567b;

    public b90(TextLocalisedClause startLabel, TextLocalisedClause endLabel) {
        Intrinsics.checkNotNullParameter(startLabel, "startLabel");
        Intrinsics.checkNotNullParameter(endLabel, "endLabel");
        this.f163566a = startLabel;
        this.f163567b = endLabel;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b90)) {
            return false;
        }
        b90 b90Var = (b90) obj2;
        return this.f163566a.equals(b90Var.f163566a) && this.f163567b.equals(b90Var.f163567b);
    }

    public final int hashCode() {
        return this.f163567b.hashCode() + (this.f163566a.hashCode() * 31);
    }
}
