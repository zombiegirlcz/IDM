package p9j;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.RateClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f234323a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f234324b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f234325c;
    public final Clause d;
    public final Image e;

    public a(RateClause rateClause, Clause description, Clause clause, Clause clause2, Image icon) {
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.f234323a = rateClause;
        this.f234324b = description;
        this.f234325c = clause;
        this.d = clause2;
        this.e = icon;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f234323a, aVar.f234323a) && Intrinsics.f(this.f234324b, aVar.f234324b) && Intrinsics.f(this.f234325c, aVar.f234325c) && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e);
    }

    public final int hashCode() {
        Clause clause = this.f234323a;
        int iA = p.a.a((clause == null ? 0 : clause.hashCode()) * 31, 31, this.f234324b);
        Clause clause2 = this.f234325c;
        int iHashCode = (iA + (clause2 == null ? 0 : clause2.hashCode())) * 31;
        Clause clause3 = this.d;
        return this.e.hashCode() + ((iHashCode + (clause3 != null ? clause3.hashCode() : 0)) * 31);
    }
}
