package i5e;

import cli.p;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class d implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f158816a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f158817b;

    public d(TextLocalisedClause navBarTitle, List items) {
        Intrinsics.checkNotNullParameter(navBarTitle, "navBarTitle");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f158816a = navBarTitle;
        this.f158817b = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f158817b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f158816a.equals(dVar.f158816a) && Intrinsics.f(this.f158817b, dVar.f158817b);
    }

    public final int hashCode() {
        return this.f158817b.hashCode() + (this.f158816a.hashCode() * 31);
    }
}
