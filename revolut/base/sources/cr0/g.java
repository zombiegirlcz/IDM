package cr0;

import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.views.DialogHeaderView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f108168a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f108169b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final DialogHeaderView.b f108170c;
    public final DialogHeaderView.a d;
    public final Parcelable e;

    public g(Clause title, Clause clause, DialogHeaderView.b bVar, DialogHeaderView.a aVar, Parcelable parcelable) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f108168a = title;
        this.f108169b = clause;
        this.f108170c = bVar;
        this.d = aVar;
        this.e = parcelable;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f108168a, gVar.f108168a) && Intrinsics.f(this.f108169b, gVar.f108169b) && Intrinsics.f(this.f108170c, gVar.f108170c) && Intrinsics.f(this.d, gVar.d) && Intrinsics.f(this.e, gVar.e);
    }

    public final int hashCode() {
        int iHashCode = this.f108168a.hashCode() * 31;
        Clause clause = this.f108169b;
        int iHashCode2 = (iHashCode + (clause == null ? 0 : clause.hashCode())) * 31;
        DialogHeaderView.b bVar = this.f108170c;
        int iHashCode3 = (iHashCode2 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        DialogHeaderView.a aVar = this.d;
        int iHashCode4 = (iHashCode3 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        Parcelable parcelable = this.e;
        return iHashCode4 + (parcelable != null ? parcelable.hashCode() : 0);
    }

    public /* synthetic */ g(Clause clause, CompositeClause compositeClause, com.revolut.core.ui_kit.views.f fVar, int i) {
        this(clause, compositeClause, null, (i & 8) != 0 ? null : fVar, null);
    }
}
