package v4h;

import cli.p;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class g implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f286095a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f286096b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f286097c;

    public g(TextLocalisedClause navBarTitle, TextLocalisedClause navBarDescription, List items) {
        Intrinsics.checkNotNullParameter(navBarTitle, "navBarTitle");
        Intrinsics.checkNotNullParameter(navBarDescription, "navBarDescription");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f286095a = navBarTitle;
        this.f286096b = navBarDescription;
        this.f286097c = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f286097c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f286095a.equals(gVar.f286095a) && this.f286096b.equals(gVar.f286096b) && Intrinsics.f(this.f286097c, gVar.f286097c);
    }

    public final int hashCode() {
        return this.f286097c.hashCode() + t61.a.a(this.f286095a.hashCode() * 31, 31, this.f286096b);
    }
}
