package so1;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class o implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f264683a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f264684b;

    public o(aim.e items, TextLocalisedClause mainButtonClause) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(mainButtonClause, "mainButtonClause");
        this.f264683a = items;
        this.f264684b = mainButtonClause;
    }

    @Override // cli.p
    public final List c() {
        return this.f264683a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f264683a, oVar.f264683a) && this.f264684b.equals(oVar.f264684b);
    }

    public final int hashCode() {
        return this.f264684b.hashCode() + (this.f264683a.hashCode() * 31);
    }
}
