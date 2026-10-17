package g4h;

import cli.p;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class c implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f140525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f140526b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f140527c;
    public final ArrayList d;

    public c(TextLocalisedClause title, TextLocalisedClause textLocalisedClause, TextLocalisedClause secondDescription, ArrayList items) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(secondDescription, "secondDescription");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f140525a = title;
        this.f140526b = textLocalisedClause;
        this.f140527c = secondDescription;
        this.d = items;
    }

    @Override // cli.p
    public final List c() {
        return this.d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f140525a.equals(cVar.f140525a) && Intrinsics.f(this.f140526b, cVar.f140526b) && this.f140527c.equals(cVar.f140527c) && this.d.equals(cVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.f140525a.hashCode() * 31;
        Clause clause = this.f140526b;
        return this.d.hashCode() + t61.a.a((iHashCode + (clause == null ? 0 : clause.hashCode())) * 31, 31, this.f140527c);
    }
}
