package m2f;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class r implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f201989a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f201990b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f201991c;

    public r(List items, CompositeClause compositeClause, k ctaButtonState) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(ctaButtonState, "ctaButtonState");
        this.f201989a = items;
        this.f201990b = compositeClause;
        this.f201991c = ctaButtonState;
    }

    @Override // cli.o
    public final cli.q a(cli.o oldState) {
        Intrinsics.checkNotNullParameter(oldState, "oldState");
        if (!(oldState instanceof r)) {
            return null;
        }
        r rVar = (r) oldState;
        return new p(!Intrinsics.f(rVar.f201990b, this.f201990b), !rVar.f201991c.equals(this.f201991c));
    }

    @Override // cli.p
    public final List c() {
        return this.f201989a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.f201989a, rVar.f201989a) && Intrinsics.f(this.f201990b, rVar.f201990b) && Intrinsics.f(this.f201991c, rVar.f201991c);
    }

    public final int hashCode() {
        int iHashCode = this.f201989a.hashCode() * 31;
        Clause clause = this.f201990b;
        return this.f201991c.hashCode() + ((iHashCode + (clause == null ? 0 : clause.hashCode())) * 31);
    }
}
