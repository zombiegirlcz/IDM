package ag1;

import cli.p;
import com.revolut.core.ui_kit.models.Clause;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class d implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f4754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f4755b;

    public d(Clause clause, ArrayList items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f4754a = clause;
        this.f4755b = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f4755b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f4754a, dVar.f4754a) && this.f4755b.equals(dVar.f4755b);
    }

    public final int hashCode() {
        Clause clause = this.f4754a;
        return this.f4755b.hashCode() + ((clause == null ? 0 : clause.hashCode()) * 31);
    }
}
