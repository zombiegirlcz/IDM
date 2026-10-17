package ip0;

import com.revolut.core.ui_kit.models.TextClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class ni0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextClause f165517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextClause f165518b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextClause f165519c;

    public ni0(TextClause smallTitleStart, TextClause smallTitleEnd, TextClause bigTitle) {
        Intrinsics.checkNotNullParameter(smallTitleStart, "smallTitleStart");
        Intrinsics.checkNotNullParameter(smallTitleEnd, "smallTitleEnd");
        Intrinsics.checkNotNullParameter(bigTitle, "bigTitle");
        this.f165517a = smallTitleStart;
        this.f165518b = smallTitleEnd;
        this.f165519c = bigTitle;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ni0)) {
            return false;
        }
        ni0 ni0Var = (ni0) obj2;
        return this.f165517a.equals(ni0Var.f165517a) && this.f165518b.equals(ni0Var.f165518b) && this.f165519c.equals(ni0Var.f165519c);
    }

    public final int hashCode() {
        return this.f165519c.hashCode() + v7.b(this.f165517a.hashCode() * 31, 31, this.f165518b);
    }
}
