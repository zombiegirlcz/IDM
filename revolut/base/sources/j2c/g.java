package j2c;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class g implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f170809a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f170810b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f170811c;

    public g(TextLocalisedClause title, TextLocalisedClause textLocalisedClause, List pages) {
        Intrinsics.checkNotNullParameter(pages, "pages");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f170809a = pages;
        this.f170810b = title;
        this.f170811c = textLocalisedClause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f170809a, gVar.f170809a) && this.f170810b.equals(gVar.f170810b) && this.f170811c.equals(gVar.f170811c);
    }

    public final int hashCode() {
        return this.f170811c.hashCode() + t61.a.a(this.f170809a.hashCode() * 31, 31, this.f170810b);
    }
}
