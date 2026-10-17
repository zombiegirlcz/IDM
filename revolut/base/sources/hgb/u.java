package hgb;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes6.dex */
public final class u implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f152155a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f152156b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f152157c;
    public final List d;

    public u() {
        this(null, null, null, 15);
    }

    @Override // cli.p
    public final List c() {
        return this.d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return this.f152155a == uVar.f152155a && Intrinsics.f(this.f152156b, uVar.f152156b) && Intrinsics.f(this.f152157c, uVar.f152157c) && Intrinsics.f(this.d, uVar.d);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f152155a) * 31;
        t tVar = this.f152156b;
        int iHashCode2 = (iHashCode + (tVar == null ? 0 : tVar.hashCode())) * 31;
        Clause clause = this.f152157c;
        return this.d.hashCode() + ((iHashCode2 + (clause != null ? clause.hashCode() : 0)) * 31);
    }

    public u(t tVar, TextLocalisedClause textLocalisedClause, List items, int i) {
        boolean z = (i & 1) == 0;
        tVar = (i & 2) != 0 ? null : tVar;
        textLocalisedClause = (i & 4) != 0 ? null : textLocalisedClause;
        items = (i & 8) != 0 ? f0.f322471a : items;
        Intrinsics.checkNotNullParameter(items, "items");
        this.f152155a = z;
        this.f152156b = tVar;
        this.f152157c = textLocalisedClause;
        this.d = items;
    }
}
