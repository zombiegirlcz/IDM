package n47;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f212322a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f212323b;

    public n(TextLocalisedClause title, TextLocalisedClause caption) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(caption, "caption");
        this.f212322a = title;
        this.f212323b = caption;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return this.f212322a.equals(nVar.f212322a) && this.f212323b.equals(nVar.f212323b);
    }

    public final int hashCode() {
        return this.f212323b.hashCode() + (this.f212322a.hashCode() * 31);
    }
}
