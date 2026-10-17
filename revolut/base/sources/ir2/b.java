package ir2;

import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class b extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextClause f167981a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LargeActionButton.ButtonStyle f167982b;

    public b(TextClause title, LargeActionButton.ButtonStyle style) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(style, "style");
        this.f167981a = title;
        this.f167982b = style;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f167981a.equals(bVar.f167981a) && Intrinsics.f(this.f167982b, bVar.f167982b);
    }

    public final int hashCode() {
        return this.f167982b.hashCode() + (this.f167981a.hashCode() * 31);
    }
}
