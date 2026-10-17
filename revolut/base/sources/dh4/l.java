package dh4;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class l implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f114750a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f114751b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f114752c;
    public final Object d;
    public final boolean e;

    public l(Clause buttonText, TextLocalisedClause navBarTitle, TextLocalisedClause textLocalisedClause, List items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(navBarTitle, "navBarTitle");
        Intrinsics.checkNotNullParameter(buttonText, "buttonText");
        this.f114750a = items;
        this.f114751b = navBarTitle;
        this.f114752c = textLocalisedClause;
        this.d = buttonText;
        this.e = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f114750a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f114750a, lVar.f114750a) && Intrinsics.f(this.f114751b, lVar.f114751b) && Intrinsics.f(this.f114752c, lVar.f114752c) && Intrinsics.f(this.d, lVar.d) && this.e == lVar.e;
    }

    public final int hashCode() {
        int iA = t61.a.a(this.f114750a.hashCode() * 31, 31, this.f114751b);
        Clause clause = this.f114752c;
        return Boolean.hashCode(this.e) + p.a.b((iA + (clause == null ? 0 : clause.hashCode())) * 31, 31, this.d);
    }
}
