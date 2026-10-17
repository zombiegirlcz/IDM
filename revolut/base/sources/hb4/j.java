package hb4;

import cli.p;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class j implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f150602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f150603b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f150604c;
    public final Clause d;
    public final boolean e;

    public j(TextLocalisedClause title, TextLocalisedClause textLocalisedClause, TextLocalisedClause textLocalisedClause2, List items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f150602a = items;
        this.f150603b = title;
        this.f150604c = textLocalisedClause;
        this.d = textLocalisedClause2;
        this.e = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f150602a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f150602a, jVar.f150602a) && Intrinsics.f(this.f150603b, jVar.f150603b) && Intrinsics.f(this.f150604c, jVar.f150604c) && Intrinsics.f(this.d, jVar.d) && this.e == jVar.e;
    }

    public final int hashCode() {
        int iA = t61.a.a(this.f150602a.hashCode() * 31, 31, this.f150603b);
        Clause clause = this.f150604c;
        int iHashCode = (iA + (clause == null ? 0 : clause.hashCode())) * 31;
        Clause clause2 = this.d;
        return Boolean.hashCode(this.e) + ((iHashCode + (clause2 != null ? clause2.hashCode() : 0)) * 31);
    }

    public /* synthetic */ j(TextLocalisedClause textLocalisedClause, List list) {
        this(textLocalisedClause, null, null, list, false);
    }
}
