package sxd;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class l implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f266434a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f266435b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f266436c;
    public final Clause d;

    public l(TextLocalisedClause textLocalisedClause, List items, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f266434a = items;
        this.f266435b = z;
        this.f266436c = z3;
        this.d = textLocalisedClause;
    }

    @Override // cli.p
    public final List c() {
        return this.f266434a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f266434a, lVar.f266434a) && this.f266435b == lVar.f266435b && this.f266436c == lVar.f266436c && Intrinsics.f(this.d, lVar.d);
    }

    public final int hashCode() {
        int iC = j6.a.c(j6.a.c(this.f266434a.hashCode() * 31, 31, this.f266435b), 31, this.f266436c);
        Clause clause = this.d;
        return iC + (clause == null ? 0 : clause.hashCode());
    }
}
