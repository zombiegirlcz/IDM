package vi9;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f289531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f289532b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f289533c;
    public final Clause d;
    public final boolean e;

    public c(String id10, TextLocalisedClause title, TextLocalisedClause textLocalisedClause, TextLocalisedClause textLocalisedClause2, boolean z) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f289531a = id10;
        this.f289532b = title;
        this.f289533c = textLocalisedClause;
        this.d = textLocalisedClause2;
        this.e = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f289531a, cVar.f289531a) && Intrinsics.f(this.f289532b, cVar.f289532b) && Intrinsics.f(this.f289533c, cVar.f289533c) && Intrinsics.f(this.d, cVar.d) && this.e == cVar.e;
    }

    public final int hashCode() {
        int iA = t61.a.a(this.f289531a.hashCode() * 31, 31, this.f289532b);
        TextLocalisedClause textLocalisedClause = this.f289533c;
        int iHashCode = (iA + (textLocalisedClause == null ? 0 : textLocalisedClause.hashCode())) * 31;
        Clause clause = this.d;
        return Boolean.hashCode(this.e) + ((iHashCode + (clause != null ? clause.hashCode() : 0)) * 31);
    }
}
