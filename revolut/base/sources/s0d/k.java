package s0d;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f258946a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f258947b;

    public k(TextLocalisedClause title, TextLocalisedClause subtitle) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        this.f258946a = title;
        this.f258947b = subtitle;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return this.f258946a.equals(kVar.f258946a) && this.f258947b.equals(kVar.f258947b);
    }

    public final int hashCode() {
        return this.f258947b.hashCode() + (this.f258946a.hashCode() * 31);
    }
}
