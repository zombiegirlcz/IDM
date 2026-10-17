package fuk;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class j0 {

    @NotNull
    public static final i0 Companion = new i0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f138245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rwk.k f138246b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f138247c;
    public final Clause d;

    public j0(ArrayList points, rwk.k valueUnit, TextLocalisedClause legendTitle, Clause clause) {
        Intrinsics.checkNotNullParameter(points, "points");
        Intrinsics.checkNotNullParameter(valueUnit, "valueUnit");
        Intrinsics.checkNotNullParameter(legendTitle, "legendTitle");
        this.f138245a = points;
        this.f138246b = valueUnit;
        this.f138247c = legendTitle;
        this.d = clause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj2;
        return this.f138245a.equals(j0Var.f138245a) && this.f138246b.equals(j0Var.f138246b) && this.f138247c.equals(j0Var.f138247c) && Intrinsics.f(this.d, j0Var.d);
    }

    public final int hashCode() {
        int iA = t61.a.a((this.f138246b.hashCode() + (this.f138245a.hashCode() * 31)) * 31, 31, this.f138247c);
        Clause clause = this.d;
        return iA + (clause == null ? 0 : clause.hashCode());
    }
}
