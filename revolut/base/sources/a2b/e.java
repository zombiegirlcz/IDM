package a2b;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class e implements aii.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f722a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f723b;

    public e() {
        this(null, null);
    }

    public final Clause b() {
        return this.f723b;
    }

    public final Clause c() {
        return this.f722a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f722a, eVar.f722a) && Intrinsics.f(this.f723b, eVar.f723b);
    }

    public final int hashCode() {
        Clause clause = this.f722a;
        int iHashCode = (clause == null ? 0 : clause.hashCode()) * 31;
        Clause clause2 = this.f723b;
        return iHashCode + (clause2 != null ? clause2.hashCode() : 0);
    }

    public e(TextLocalisedClause textLocalisedClause, TextLocalisedClause textLocalisedClause2) {
        this.f722a = textLocalisedClause;
        this.f723b = textLocalisedClause2;
    }
}
