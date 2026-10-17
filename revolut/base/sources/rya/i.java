package rya;

import com.revolut.core.ui_kit.models.Clause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class i extends l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f258274a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f258275b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f258276c;

    public i(Clause clause, Clause clause2, List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f258274a = clause;
        this.f258275b = clause2;
        this.f258276c = items;
    }

    @Override // rya.l
    public final Clause b() {
        return this.f258274a;
    }

    @Override // cli.p
    public final List c() {
        return this.f258276c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f258274a, iVar.f258274a) && Intrinsics.f(this.f258275b, iVar.f258275b) && Intrinsics.f(this.f258276c, iVar.f258276c);
    }

    public final int hashCode() {
        Clause clause = this.f258274a;
        int iHashCode = (clause == null ? 0 : clause.hashCode()) * 31;
        Clause clause2 = this.f258275b;
        return this.f258276c.hashCode() + ((iHashCode + (clause2 != null ? clause2.hashCode() : 0)) * 31);
    }
}
