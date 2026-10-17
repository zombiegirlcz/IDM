package kw4;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f190232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f190233b;

    public l(TextLocalisedClause textLocalisedClause, boolean z) {
        this.f190232a = textLocalisedClause;
        this.f190233b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f190232a, lVar.f190232a) && this.f190233b == lVar.f190233b;
    }

    public final int hashCode() {
        Clause clause = this.f190232a;
        return Boolean.hashCode(true) + j6.a.c((clause == null ? 0 : clause.hashCode()) * 31, 31, this.f190233b);
    }
}
