package a7b;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class q implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f1828a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f1829b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final aw0.i f1830c;

    public q(TextClause textClause, List items, aw0.e eVar) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f1828a = textClause;
        this.f1829b = items;
        this.f1830c = eVar;
    }

    @Override // cli.p
    public final List c() {
        return this.f1829b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.f1828a, qVar.f1828a) && Intrinsics.f(this.f1829b, qVar.f1829b) && Intrinsics.f(this.f1830c, qVar.f1830c);
    }

    public final int hashCode() {
        Clause clause = this.f1828a;
        int iD = p.a.d((clause == null ? 0 : clause.hashCode()) * 31, 31, this.f1829b);
        aw0.i iVar = this.f1830c;
        return iD + (iVar != null ? iVar.hashCode() : 0);
    }
}
