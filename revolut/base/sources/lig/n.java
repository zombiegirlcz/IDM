package lig;

import cli.q;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class n implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f195517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f195518b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f195519c;

    public n(TextLocalisedClause textLocalisedClause, String query, ArrayList items) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(query, "query");
        this.f195517a = items;
        this.f195518b = query;
        this.f195519c = textLocalisedClause;
    }

    @Override // cli.o
    public final q a(cli.o oldState) {
        Intrinsics.checkNotNullParameter(oldState, "oldState");
        if ((oldState instanceof n ? (n) oldState : null) == null) {
            return null;
        }
        return new m(!Intrinsics.f(this.f195518b, r4.f195518b), !Intrinsics.f(this.f195519c, r4.f195519c));
    }

    @Override // cli.p
    public final List c() {
        return this.f195517a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return this.f195517a.equals(nVar.f195517a) && Intrinsics.f(this.f195518b, nVar.f195518b) && Intrinsics.f(this.f195519c, nVar.f195519c);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f195517a.hashCode() * 31, 31, this.f195518b);
        Clause clause = this.f195519c;
        return iC + (clause == null ? 0 : clause.hashCode());
    }
}
