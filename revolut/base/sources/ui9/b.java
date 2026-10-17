package ui9;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import grl.r2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f280319a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f280320b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f280321c;
    public final r2 d;

    public b(TextLocalisedClause title, TextLocalisedClause description, TextLocalisedClause textLocalisedClause, r2 entryPointType) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(entryPointType, "entryPointType");
        this.f280319a = title;
        this.f280320b = description;
        this.f280321c = textLocalisedClause;
        this.d = entryPointType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f280319a, bVar.f280319a) && Intrinsics.f(this.f280320b, bVar.f280320b) && Intrinsics.f(this.f280321c, bVar.f280321c) && this.d == bVar.d;
    }

    public final int hashCode() {
        int iA = t61.a.a(this.f280319a.hashCode() * 31, 31, this.f280320b);
        Clause clause = this.f280321c;
        return this.d.hashCode() + ((iA + (clause == null ? 0 : clause.hashCode())) * 31);
    }
}
