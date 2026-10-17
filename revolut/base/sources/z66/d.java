package z66;

import com.revolut.core.ui_kit.models.Clause;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f319689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f319690b;

    public d(Clause clause, ArrayList items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f319689a = clause;
        this.f319690b = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f319690b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f319689a, dVar.f319689a) && this.f319690b.equals(dVar.f319690b);
    }

    public final int hashCode() {
        Clause clause = this.f319689a;
        return this.f319690b.hashCode() + ((clause == null ? 0 : clause.hashCode()) * 31);
    }
}
