package e06;

import cli.p;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import ip0.v7;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f121429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MoneyClause f121430b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f121431c;
    public final boolean d;

    public f(List items, MoneyClause titleClause, TextLocalisedClause textLocalisedClause, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(titleClause, "titleClause");
        this.f121429a = items;
        this.f121430b = titleClause;
        this.f121431c = textLocalisedClause;
        this.d = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f121429a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f121429a, fVar.f121429a) && this.f121430b.equals(fVar.f121430b) && Intrinsics.f(this.f121431c, fVar.f121431c) && this.d == fVar.d;
    }

    public final int hashCode() {
        int iA = v7.a(this.f121429a.hashCode() * 31, 31, this.f121430b);
        Clause clause = this.f121431c;
        return Boolean.hashCode(this.d) + ((iA + (clause == null ? 0 : clause.hashCode())) * 31);
    }
}
