package aw0;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10551a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f10552b;

    public u(int i, TextLocalisedClause textLocalisedClause) {
        this.f10551a = i;
        this.f10552b = textLocalisedClause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return this.f10551a == uVar.f10551a && Intrinsics.f(this.f10552b, uVar.f10552b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f10551a) * 31;
        Clause clause = this.f10552b;
        return iHashCode + (clause == null ? 0 : clause.hashCode());
    }
}
