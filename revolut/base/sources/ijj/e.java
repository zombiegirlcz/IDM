package ijj;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f161805a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LargeActionButton.ButtonStyle f161806b;

    public e(TextLocalisedClause clause, LargeActionButton.ButtonStyle.BlackOrWhiteButton.Plain style) {
        Intrinsics.checkNotNullParameter(clause, "clause");
        Intrinsics.checkNotNullParameter(style, "style");
        this.f161805a = clause;
        this.f161806b = style;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.f161805a.equals(eVar.f161805a) && Intrinsics.f(this.f161806b, eVar.f161806b);
    }

    public final int hashCode() {
        return this.f161806b.hashCode() + (this.f161805a.hashCode() * 31);
    }
}
