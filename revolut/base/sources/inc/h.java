package inc;

import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f162778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CompositeClause f162779b;

    public h(CompositeClause subtitle, TextLocalisedClause title) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        this.f162778a = title;
        this.f162779b = subtitle;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return this.f162778a.equals(hVar.f162778a) && this.f162779b.equals(hVar.f162779b);
    }

    public final int hashCode() {
        return this.f162779b.hashCode() + (this.f162778a.hashCode() * 31);
    }
}
