package vb4;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class n implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f287410a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f287411b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f287412c;
    public final TextLocalisedClause d;
    public final TextLocalisedClause e;
    public final boolean f;

    public n(List items, TextLocalisedClause title, TextLocalisedClause textLocalisedClause, TextLocalisedClause search, TextLocalisedClause buttonTitle, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(search, "search");
        Intrinsics.checkNotNullParameter(buttonTitle, "buttonTitle");
        this.f287410a = items;
        this.f287411b = title;
        this.f287412c = textLocalisedClause;
        this.d = search;
        this.e = buttonTitle;
        this.f = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f287410a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f287410a, nVar.f287410a) && this.f287411b.equals(nVar.f287411b) && Intrinsics.f(this.f287412c, nVar.f287412c) && this.d.equals(nVar.d) && this.e.equals(nVar.e) && this.f == nVar.f;
    }

    public final int hashCode() {
        int iA = t61.a.a(this.f287410a.hashCode() * 31, 31, this.f287411b);
        Clause clause = this.f287412c;
        return Boolean.hashCode(this.f) + t61.a.a(t61.a.a((iA + (clause == null ? 0 : clause.hashCode())) * 31, 31, this.d), 31, this.e);
    }
}
