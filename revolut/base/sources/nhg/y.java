package nhg;

import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TimeClause;
import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class y extends z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextClause f215491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextClause f215492b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TimeClause f215493c;

    public y(TextClause originClause, TextClause destinationClause, TimeClause dateClause) {
        Intrinsics.checkNotNullParameter(originClause, "originClause");
        Intrinsics.checkNotNullParameter(destinationClause, "destinationClause");
        Intrinsics.checkNotNullParameter(dateClause, "dateClause");
        this.f215491a = originClause;
        this.f215492b = destinationClause;
        this.f215493c = dateClause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y)) {
            return false;
        }
        y yVar = (y) obj2;
        return this.f215491a.equals(yVar.f215491a) && this.f215492b.equals(yVar.f215492b) && this.f215493c.equals(yVar.f215493c);
    }

    public final int hashCode() {
        return this.f215493c.hashCode() + v7.b(this.f215491a.hashCode() * 31, 31, this.f215492b);
    }
}
