package rya;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes5.dex */
public final class j extends l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f258277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f258278b;

    public j(Clause clause, List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f258277a = clause;
        this.f258278b = items;
    }

    @Override // rya.l
    public final Clause b() {
        return this.f258277a;
    }

    @Override // cli.p
    public final List c() {
        return this.f258278b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f258277a, jVar.f258277a) && Intrinsics.f(this.f258278b, jVar.f258278b);
    }

    public final int hashCode() {
        Clause clause = this.f258277a;
        return this.f258278b.hashCode() + ((clause == null ? 0 : clause.hashCode()) * 31);
    }

    public j(TextLocalisedClause textLocalisedClause) {
        this(textLocalisedClause, f0.f322471a);
    }
}
