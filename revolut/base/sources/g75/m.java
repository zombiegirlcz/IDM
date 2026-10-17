package g75;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f141123a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f141124b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f141125c;
    public final Clause d;
    public final boolean e;

    public m(TextLocalisedClause title, TextLocalisedClause textLocalisedClause, TextLocalisedClause textLocalisedClause2, List items, boolean z) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f141123a = title;
        this.f141124b = textLocalisedClause;
        this.f141125c = items;
        this.d = textLocalisedClause2;
        this.e = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f141123a, mVar.f141123a) && Intrinsics.f(this.f141124b, mVar.f141124b) && Intrinsics.f(this.f141125c, mVar.f141125c) && Intrinsics.f(this.d, mVar.d) && this.e == mVar.e;
    }

    public final int hashCode() {
        int iHashCode = this.f141123a.hashCode() * 31;
        Clause clause = this.f141124b;
        int iD = p.a.d((iHashCode + (clause == null ? 0 : clause.hashCode())) * 31, 31, this.f141125c);
        Clause clause2 = this.d;
        return Boolean.hashCode(this.e) + ((iD + (clause2 != null ? clause2.hashCode() : 0)) * 31);
    }
}
