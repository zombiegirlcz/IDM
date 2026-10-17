package ss4;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f265287a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f265288b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f265289c;

    public o(TextLocalisedClause textLocalisedClause, boolean z, boolean z3) {
        this.f265287a = textLocalisedClause;
        this.f265288b = z;
        this.f265289c = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f265287a, oVar.f265287a) && this.f265288b == oVar.f265288b && this.f265289c == oVar.f265289c;
    }

    public final int hashCode() {
        Clause clause = this.f265287a;
        return Boolean.hashCode(this.f265289c) + j6.a.c((clause == null ? 0 : clause.hashCode()) * 31, 31, this.f265288b);
    }
}
