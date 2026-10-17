package v28;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f285678a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f285679b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f285680c;

    public b(int i, TextLocalisedClause widgetTitle, TextLocalisedClause overflowFooterText) {
        Intrinsics.checkNotNullParameter(widgetTitle, "widgetTitle");
        Intrinsics.checkNotNullParameter(overflowFooterText, "overflowFooterText");
        this.f285678a = widgetTitle;
        this.f285679b = i;
        this.f285680c = overflowFooterText;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f285678a.equals(bVar.f285678a) && this.f285679b == bVar.f285679b && this.f285680c.equals(bVar.f285680c);
    }

    public final int hashCode() {
        return this.f285680c.hashCode() + j6.a.b(this.f285679b, this.f285678a.hashCode() * 31, 31);
    }
}
