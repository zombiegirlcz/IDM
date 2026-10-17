package j84;

import cli.p;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class i implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f172124a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f172125b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f172126c;
    public final TextLocalisedClause d;
    public final Clause e;

    public i(ArrayList items, TextLocalisedClause title, TextLocalisedClause textLocalisedClause, TextLocalisedClause primaryButtonTitle, TextLocalisedClause textLocalisedClause2) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(primaryButtonTitle, "primaryButtonTitle");
        this.f172124a = items;
        this.f172125b = title;
        this.f172126c = textLocalisedClause;
        this.d = primaryButtonTitle;
        this.e = textLocalisedClause2;
    }

    @Override // cli.p
    public final List c() {
        return this.f172124a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return this.f172124a.equals(iVar.f172124a) && this.f172125b.equals(iVar.f172125b) && Intrinsics.f(this.f172126c, iVar.f172126c) && this.d.equals(iVar.d) && Intrinsics.f(this.e, iVar.e);
    }

    public final int hashCode() {
        int iA = t61.a.a(this.f172124a.hashCode() * 31, 31, this.f172125b);
        Clause clause = this.f172126c;
        int iA2 = t61.a.a((iA + (clause == null ? 0 : clause.hashCode())) * 31, 31, this.d);
        Clause clause2 = this.e;
        return iA2 + (clause2 != null ? clause2.hashCode() : 0);
    }
}
