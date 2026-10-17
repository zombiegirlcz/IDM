package whg;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import hfg.i0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i0 f297652a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f297653b;

    public f(i0 sortBy, TextLocalisedClause title) {
        Intrinsics.checkNotNullParameter(sortBy, "sortBy");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f297652a = sortBy;
        this.f297653b = title;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f297652a == fVar.f297652a && this.f297653b.equals(fVar.f297653b);
    }

    public final int hashCode() {
        return this.f297653b.hashCode() + (this.f297652a.hashCode() * 31);
    }
}
