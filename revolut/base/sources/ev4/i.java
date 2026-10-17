package ev4;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f129711a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f129712b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f129713c;

    public i(TextLocalisedClause textLocalisedClause, boolean z, boolean z3) {
        this.f129711a = textLocalisedClause;
        this.f129712b = z;
        this.f129713c = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f129711a, iVar.f129711a) && this.f129712b == iVar.f129712b && this.f129713c == iVar.f129713c;
    }

    public final int hashCode() {
        Clause clause = this.f129711a;
        return Boolean.hashCode(this.f129713c) + j6.a.c((clause == null ? 0 : clause.hashCode()) * 31, 31, this.f129712b);
    }
}
