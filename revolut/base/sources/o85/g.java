package o85;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f222936a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f222937b;

    public g(TextLocalisedClause title, TextLocalisedClause subtitle) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        this.f222936a = title;
        this.f222937b = subtitle;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f222936a.equals(gVar.f222936a) && this.f222937b.equals(gVar.f222937b);
    }

    public final int hashCode() {
        return this.f222937b.hashCode() + (this.f222936a.hashCode() * 31);
    }
}
