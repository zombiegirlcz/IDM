package vch;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class w implements y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f287739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f287740b;

    public w(Clause title, CompositeClause compositeClause) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f287739a = title;
        this.f287740b = compositeClause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w)) {
            return false;
        }
        w wVar = (w) obj2;
        return Intrinsics.f(this.f287739a, wVar.f287739a) && Intrinsics.f(this.f287740b, wVar.f287740b);
    }

    public final int hashCode() {
        int iHashCode = this.f287739a.hashCode() * 31;
        Clause clause = this.f287740b;
        return iHashCode + (clause == null ? 0 : clause.hashCode());
    }
}
