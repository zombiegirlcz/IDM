package pnh;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TimeClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class n implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k1h.k f237791a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f237792b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f237793c;
    public final TimeClause d;

    public n(k1h.k detailIcons, Clause title, Clause description, TimeClause secondDescription) {
        Intrinsics.checkNotNullParameter(detailIcons, "detailIcons");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(secondDescription, "secondDescription");
        this.f237791a = detailIcons;
        this.f237792b = title;
        this.f237793c = description;
        this.d = secondDescription;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f237791a, nVar.f237791a) && Intrinsics.f(this.f237792b, nVar.f237792b) && Intrinsics.f(this.f237793c, nVar.f237793c) && this.d.equals(nVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.a(p.a.a(this.f237791a.hashCode() * 31, 31, this.f237792b), 31, this.f237793c);
    }
}
