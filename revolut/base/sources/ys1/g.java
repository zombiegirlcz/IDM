package ys1;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import jki.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class g implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f316387a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f316388b;

    public g(aim.e items, TextLocalisedClause textLocalisedClause) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f316387a = items;
        this.f316388b = textLocalisedClause;
    }

    @Override // jki.n
    public final List c() {
        return this.f316387a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f316387a, gVar.f316387a) && Intrinsics.f(this.f316388b, gVar.f316388b);
    }

    public final int hashCode() {
        int iHashCode = this.f316387a.hashCode() * 31;
        Clause clause = this.f316388b;
        return iHashCode + (clause == null ? 0 : clause.hashCode());
    }
}
