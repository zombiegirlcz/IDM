package mc6;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import jki.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class i implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f204281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f204282b;

    public i(TextLocalisedClause textLocalisedClause, List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f204281a = items;
        this.f204282b = textLocalisedClause;
    }

    @Override // jki.n
    public final List c() {
        return this.f204281a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f204281a, iVar.f204281a) && Intrinsics.f(this.f204282b, iVar.f204282b);
    }

    public final int hashCode() {
        int iHashCode = this.f204281a.hashCode() * 31;
        Clause clause = this.f204282b;
        return Boolean.hashCode(true) + ((iHashCode + (clause == null ? 0 : clause.hashCode())) * 31);
    }
}
