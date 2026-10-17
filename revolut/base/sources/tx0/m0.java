package tx0;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f275194a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f275195b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f275196c;

    public m0(TextLocalisedClause textLocalisedClause, float f, int i) {
        this.f275194a = textLocalisedClause;
        this.f275195b = f;
        this.f275196c = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj2;
        return Intrinsics.f(this.f275194a, m0Var.f275194a) && Float.compare(this.f275195b, m0Var.f275195b) == 0 && this.f275196c == m0Var.f275196c;
    }

    public final int hashCode() {
        Clause clause = this.f275194a;
        return Integer.hashCode(this.f275196c) + m72.b.b(this.f275195b, (clause == null ? 0 : clause.hashCode()) * 31, 31);
    }
}
