package s1g;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import jki.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class i implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f259137a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f259138b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f259139c;

    public i(TextLocalisedClause textLocalisedClause, List items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f259137a = items;
        this.f259138b = textLocalisedClause;
        this.f259139c = z;
    }

    @Override // jki.n
    public final List c() {
        return this.f259137a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f259137a, iVar.f259137a) && Intrinsics.f(this.f259138b, iVar.f259138b) && this.f259139c == iVar.f259139c;
    }

    public final int hashCode() {
        int iHashCode = this.f259137a.hashCode() * 31;
        Clause clause = this.f259138b;
        return Boolean.hashCode(this.f259139c) + ((iHashCode + (clause == null ? 0 : clause.hashCode())) * 31);
    }
}
