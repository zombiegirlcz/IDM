package nhg;

import com.revolut.core.ui_kit.models.CompositeClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class x extends z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CompositeClause f215488a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CompositeClause f215489b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f215490c;

    public x(CompositeClause primaryClause, CompositeClause secondaryClause, boolean z) {
        Intrinsics.checkNotNullParameter(primaryClause, "primaryClause");
        Intrinsics.checkNotNullParameter(secondaryClause, "secondaryClause");
        this.f215488a = primaryClause;
        this.f215489b = secondaryClause;
        this.f215490c = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x)) {
            return false;
        }
        x xVar = (x) obj2;
        return this.f215488a.equals(xVar.f215488a) && this.f215489b.equals(xVar.f215489b) && this.f215490c == xVar.f215490c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f215490c) + h30.l.c(this.f215489b, this.f215488a.hashCode() * 31, 31);
    }
}
