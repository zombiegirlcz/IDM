package rya;

import com.revolut.core.ui_kit.models.Clause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class k extends l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f258279a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f258280b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f258281c;

    public k(Clause clause, Clause clause2, List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f258279a = clause;
        this.f258280b = clause2;
        this.f258281c = items;
    }

    @Override // rya.l
    public final Clause b() {
        return this.f258280b;
    }

    @Override // cli.p
    public final List c() {
        return this.f258281c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f258279a, kVar.f258279a) && Intrinsics.f(this.f258280b, kVar.f258280b) && Intrinsics.f(this.f258281c, kVar.f258281c);
    }

    public final int hashCode() {
        Clause clause = this.f258279a;
        int iHashCode = (clause == null ? 0 : clause.hashCode()) * 31;
        Clause clause2 = this.f258280b;
        return this.f258281c.hashCode() + ((iHashCode + (clause2 != null ? clause2.hashCode() : 0)) * 31);
    }
}
