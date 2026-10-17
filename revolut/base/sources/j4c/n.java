package j4c;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes6.dex */
public final class n implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f171346a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f171347b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f171348c;
    public final Clause d;
    public final Clause e;
    public final List f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f171349g;

    public n(boolean z, TextLocalisedClause textLocalisedClause, TextClause textClause, TimeClause timeClause, TextLocalisedClause textLocalisedClause2, List filters, List items) {
        Intrinsics.checkNotNullParameter(filters, "filters");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f171346a = z;
        this.f171347b = textLocalisedClause;
        this.f171348c = textClause;
        this.d = timeClause;
        this.e = textLocalisedClause2;
        this.f = filters;
        this.f171349g = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f171349g;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return this.f171346a == nVar.f171346a && Intrinsics.f(this.f171347b, nVar.f171347b) && Intrinsics.f(this.f171348c, nVar.f171348c) && Intrinsics.f(this.d, nVar.d) && Intrinsics.f(this.e, nVar.e) && Intrinsics.f(this.f, nVar.f) && Intrinsics.f(this.f171349g, nVar.f171349g);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f171346a) * 31;
        Clause clause = this.f171347b;
        int iHashCode2 = (iHashCode + (clause == null ? 0 : clause.hashCode())) * 31;
        Clause clause2 = this.f171348c;
        int iHashCode3 = (iHashCode2 + (clause2 == null ? 0 : clause2.hashCode())) * 31;
        Clause clause3 = this.d;
        int iHashCode4 = (iHashCode3 + (clause3 == null ? 0 : clause3.hashCode())) * 31;
        Clause clause4 = this.e;
        return this.f171349g.hashCode() + p.a.d((iHashCode4 + (clause4 != null ? clause4.hashCode() : 0)) * 31, 31, this.f);
    }

    public n(boolean z, List list) {
        this(z, null, null, null, null, f0.f322471a, list);
    }
}
