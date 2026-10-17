package ozc;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f231263a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f231264b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f231265c;

    public /* synthetic */ c(boolean z, TextLocalisedClause textLocalisedClause, int i) {
        this(z, true, (Clause) ((i & 4) != 0 ? null : textLocalisedClause));
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f231263a == cVar.f231263a && this.f231264b == cVar.f231264b && Intrinsics.f(this.f231265c, cVar.f231265c);
    }

    public final int hashCode() {
        int iC = j6.a.c(Boolean.hashCode(this.f231263a) * 31, 31, this.f231264b);
        Clause clause = this.f231265c;
        return iC + (clause == null ? 0 : clause.hashCode());
    }

    public c(boolean z, boolean z3, Clause clause) {
        this.f231263a = z;
        this.f231264b = z3;
        this.f231265c = clause;
    }
}
