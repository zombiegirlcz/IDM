package j0i;

import com.revolut.core.ui_kit.models.Clause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class d implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f170045a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f170046b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f170047c;

    public d(Clause clause, List items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f170045a = items;
        this.f170046b = z;
        this.f170047c = clause;
    }

    @Override // cli.p
    public final List c() {
        return this.f170045a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f170045a, dVar.f170045a) && this.f170046b == dVar.f170046b && Intrinsics.f(this.f170047c, dVar.f170047c);
    }

    public final int hashCode() {
        int iC = j6.a.c(this.f170045a.hashCode() * 31, 31, this.f170046b);
        Clause clause = this.f170047c;
        return iC + (clause == null ? 0 : clause.hashCode());
    }
}
