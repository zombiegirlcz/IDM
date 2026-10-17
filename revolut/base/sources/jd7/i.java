package jd7;

import cli.p;
import com.revolut.core.ui_kit.models.Clause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class i implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f172989a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f172990b;

    public i(Clause title, List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f172989a = items;
        this.f172990b = title;
    }

    @Override // cli.p
    public final List c() {
        return this.f172989a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f172989a, iVar.f172989a) && Intrinsics.f(this.f172990b, iVar.f172990b);
    }

    public final int hashCode() {
        return this.f172990b.hashCode() + (this.f172989a.hashCode() * 31);
    }
}
