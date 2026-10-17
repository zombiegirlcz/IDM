package ozc;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f231259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f231260b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f231261c;
    public final boolean d;
    public final Clause e;
    public final Integer f;

    public b(Clause title, Clause toolbarTitle, Clause description, boolean z, TextLocalisedClause textLocalisedClause, Integer num, int i) {
        textLocalisedClause = (i & 16) != 0 ? null : textLocalisedClause;
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(toolbarTitle, "toolbarTitle");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f231259a = title;
        this.f231260b = toolbarTitle;
        this.f231261c = description;
        this.d = z;
        this.e = textLocalisedClause;
        this.f = num;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f231259a.equals(bVar.f231259a) && this.f231260b.equals(bVar.f231260b) && this.f231261c.equals(bVar.f231261c) && this.d == bVar.d && Intrinsics.f(this.e, bVar.e) && this.f.equals(bVar.f);
    }

    public final int hashCode() {
        int iC = j6.a.c(p.a.a(p.a.b(this.f231259a.hashCode() * 31, 31, this.f231260b), 31, this.f231261c), 31, this.d);
        Clause clause = this.e;
        return Boolean.hashCode(true) + ((this.f.hashCode() + ((iC + (clause == null ? 0 : clause.hashCode())) * 29791)) * 31);
    }
}
