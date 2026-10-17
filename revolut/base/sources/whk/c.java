package whk;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedQuantityClause f297679a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedQuantityClause f297680b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f297681c;
    public final TextLocalisedClause d;

    public c(TextLocalisedQuantityClause title, TextLocalisedQuantityClause subtitle, Clause primaryButton, TextLocalisedClause secondaryButton) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(primaryButton, "primaryButton");
        Intrinsics.checkNotNullParameter(secondaryButton, "secondaryButton");
        this.f297679a = title;
        this.f297680b = subtitle;
        this.f297681c = primaryButton;
        this.d = secondaryButton;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f297679a.equals(cVar.f297679a) && this.f297680b.equals(cVar.f297680b) && this.f297681c.equals(cVar.f297681c) && this.d.equals(cVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.b((this.f297680b.hashCode() + (this.f297679a.hashCode() * 31)) * 31, 31, this.f297681c);
    }
}
