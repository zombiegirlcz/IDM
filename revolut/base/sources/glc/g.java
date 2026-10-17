package glc;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class g implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f144605a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f144606b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f144607c;

    public g(TextLocalisedClause title, TextLocalisedClause description, TextLocalisedClause buttonTitle) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(buttonTitle, "buttonTitle");
        this.f144605a = title;
        this.f144606b = description;
        this.f144607c = buttonTitle;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f144605a.equals(gVar.f144605a) && this.f144606b.equals(gVar.f144606b) && this.f144607c.equals(gVar.f144607c);
    }

    public final int hashCode() {
        return this.f144607c.hashCode() + t61.a.a(this.f144605a.hashCode() * 31, 31, this.f144606b);
    }
}
