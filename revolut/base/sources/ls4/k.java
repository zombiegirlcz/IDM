package ls4;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f199619a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f199620b;

    public k(TextLocalisedClause textLocalisedClause, boolean z) {
        this.f199619a = textLocalisedClause;
        this.f199620b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f199619a, kVar.f199619a) && this.f199620b == kVar.f199620b;
    }

    public final int hashCode() {
        Clause clause = this.f199619a;
        return Boolean.hashCode(this.f199620b) + ((clause == null ? 0 : clause.hashCode()) * 31);
    }
}
