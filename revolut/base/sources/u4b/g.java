package u4b;

import cli.p;
import com.revolut.core.ui_kit.models.Clause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class g implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f277294a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f277295b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final aw0.e f277296c;

    public g(Clause clause, List items, aw0.e withdrawButtonModel) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(withdrawButtonModel, "withdrawButtonModel");
        this.f277294a = clause;
        this.f277295b = items;
        this.f277296c = withdrawButtonModel;
    }

    @Override // cli.p
    public final List c() {
        return this.f277295b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f277294a, gVar.f277294a) && this.f277295b.equals(gVar.f277295b) && this.f277296c.equals(gVar.f277296c);
    }

    public final int hashCode() {
        Clause clause = this.f277294a;
        return this.f277296c.hashCode() + p.a.d((clause == null ? 0 : clause.hashCode()) * 31, 31, this.f277295b);
    }
}
