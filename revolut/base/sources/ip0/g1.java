package ip0;

import com.revolut.core.ui_kit.models.TimeClause;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f164323a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TimeClause f164324b;

    public g1(ArrayList fractions, TimeClause label) {
        Intrinsics.checkNotNullParameter(fractions, "fractions");
        Intrinsics.checkNotNullParameter(label, "label");
        this.f164323a = fractions;
        this.f164324b = label;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g1)) {
            return false;
        }
        g1 g1Var = (g1) obj2;
        return this.f164323a.equals(g1Var.f164323a) && this.f164324b.equals(g1Var.f164324b);
    }

    public final int hashCode() {
        return this.f164324b.hashCode() + (this.f164323a.hashCode() * 31);
    }
}
