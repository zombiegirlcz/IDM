package ef5;

import cli.p;
import com.revolut.core.ui_kit.models.Clause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f125274a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f125275b;

    public c(Clause clause, aim.e items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f125274a = clause;
        this.f125275b = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f125275b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f125274a, cVar.f125274a) && Intrinsics.f(this.f125275b, cVar.f125275b);
    }

    public final int hashCode() {
        Clause clause = this.f125274a;
        return this.f125275b.hashCode() + ((clause == null ? 0 : clause.hashCode()) * 31);
    }
}
