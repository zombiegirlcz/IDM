package qb4;

import cli.p;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class g implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f244113a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f244114b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f244115c;

    public g(TextLocalisedClause title, TextLocalisedClause textLocalisedClause, ArrayList items) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f244113a = items;
        this.f244114b = title;
        this.f244115c = textLocalisedClause;
    }

    @Override // cli.p
    public final List c() {
        return this.f244113a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f244113a.equals(gVar.f244113a) && this.f244114b.equals(gVar.f244114b) && Intrinsics.f(this.f244115c, gVar.f244115c);
    }

    public final int hashCode() {
        int iA = t61.a.a(this.f244113a.hashCode() * 31, 31, this.f244114b);
        Clause clause = this.f244115c;
        return iA + (clause == null ? 0 : clause.hashCode());
    }
}
