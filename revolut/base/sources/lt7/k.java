package lt7;

import cli.p;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class k implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f199831a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f199832b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f199833c;
    public final Clause d;
    public final Clause e;

    public k(TextLocalisedClause textLocalisedClause, TextLocalisedClause textLocalisedClause2, TextLocalisedClause textLocalisedClause3, List items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f199831a = items;
        this.f199832b = textLocalisedClause;
        this.f199833c = z;
        this.d = textLocalisedClause2;
        this.e = textLocalisedClause3;
    }

    @Override // cli.p
    public final List c() {
        return this.f199831a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f199831a, kVar.f199831a) && Intrinsics.f(this.f199832b, kVar.f199832b) && this.f199833c == kVar.f199833c && Intrinsics.f(this.d, kVar.d) && Intrinsics.f(this.e, kVar.e);
    }

    public final int hashCode() {
        int iHashCode = this.f199831a.hashCode() * 31;
        Clause clause = this.f199832b;
        int iC = j6.a.c((iHashCode + (clause == null ? 0 : clause.hashCode())) * 31, 31, this.f199833c);
        Clause clause2 = this.d;
        int iHashCode2 = (iC + (clause2 == null ? 0 : clause2.hashCode())) * 31;
        Clause clause3 = this.e;
        return iHashCode2 + (clause3 != null ? clause3.hashCode() : 0);
    }
}
