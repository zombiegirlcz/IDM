package al4;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fs3.b f6144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6145b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f6146c;
    public final Clause d;

    public k(fs3.b type, int i, TextLocalisedClause title, TextLocalisedClause textLocalisedClause) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f6144a = type;
        this.f6145b = i;
        this.f6146c = title;
        this.d = textLocalisedClause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return this.f6144a == kVar.f6144a && this.f6145b == kVar.f6145b && this.f6146c.equals(kVar.f6146c) && Intrinsics.f(this.d, kVar.d);
    }

    public final int hashCode() {
        int iA = t61.a.a(j6.a.b(this.f6145b, this.f6144a.hashCode() * 31, 31), 31, this.f6146c);
        Clause clause = this.d;
        return iA + (clause == null ? 0 : clause.hashCode());
    }
}
