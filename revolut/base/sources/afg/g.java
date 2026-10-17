package afg;

import cli.p;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class g implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f4054a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f4055b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f4056c;
    public final boolean d;

    public g(Clause title, TextLocalisedClause textLocalisedClause, List items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f4054a = items;
        this.f4055b = title;
        this.f4056c = textLocalisedClause;
        this.d = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f4054a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f4054a, gVar.f4054a) && Intrinsics.f(this.f4055b, gVar.f4055b) && Intrinsics.f(this.f4056c, gVar.f4056c) && this.d == gVar.d;
    }

    public final int hashCode() {
        int iA = p.a.a(this.f4054a.hashCode() * 31, 31, this.f4055b);
        Clause clause = this.f4056c;
        return Boolean.hashCode(this.d) + ((iA + (clause == null ? 0 : clause.hashCode())) * 31);
    }
}
