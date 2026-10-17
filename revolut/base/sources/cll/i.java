package cll;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import java.util.List;
import jki.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class i implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f25058a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f25059b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f25060c;

    public i(CompositeClause compositeClause, List items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f25058a = items;
        this.f25059b = z;
        this.f25060c = compositeClause;
    }

    @Override // jki.n
    public final List c() {
        return this.f25058a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f25058a, iVar.f25058a) && this.f25059b == iVar.f25059b && Intrinsics.f(this.f25060c, iVar.f25060c);
    }

    public final int hashCode() {
        int iC = j6.a.c(this.f25058a.hashCode() * 31, 31, this.f25059b);
        Clause clause = this.f25060c;
        return iC + (clause == null ? 0 : clause.hashCode());
    }
}
