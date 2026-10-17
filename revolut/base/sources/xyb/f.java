package xyb;

import cli.p;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class f implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f309701a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f309702b;

    public f(TextLocalisedClause textLocalisedClause, ArrayList items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f309701a = items;
        this.f309702b = textLocalisedClause;
    }

    @Override // cli.p
    public final List c() {
        return this.f309701a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f309701a.equals(fVar.f309701a) && Intrinsics.f(this.f309702b, fVar.f309702b);
    }

    public final int hashCode() {
        int iHashCode = this.f309701a.hashCode() * 31;
        Clause clause = this.f309702b;
        return iHashCode + (clause == null ? 0 : clause.hashCode());
    }
}
