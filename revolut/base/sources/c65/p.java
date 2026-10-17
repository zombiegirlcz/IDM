package c65;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class p implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f21668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f21669b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f21670c;
    public final List d;

    public p(aim.e items, TextLocalisedClause title, TextLocalisedClause buttonClause, TextLocalisedClause textLocalisedClause) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(buttonClause, "buttonClause");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f21668a = title;
        this.f21669b = buttonClause;
        this.f21670c = textLocalisedClause;
        this.d = items;
    }

    @Override // cli.p
    public final List c() {
        return this.d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return this.f21668a.equals(pVar.f21668a) && this.f21669b.equals(pVar.f21669b) && Intrinsics.f(this.f21670c, pVar.f21670c) && Intrinsics.f(this.d, pVar.d);
    }

    public final int hashCode() {
        int iA = t61.a.a(this.f21668a.hashCode() * 31, 31, this.f21669b);
        Clause clause = this.f21670c;
        return this.d.hashCode() + ((iA + (clause == null ? 0 : clause.hashCode())) * 31);
    }
}
