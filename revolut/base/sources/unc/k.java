package unc;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class k implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f281399a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f281400b;

    public k(TextLocalisedClause clause, boolean z) {
        Intrinsics.checkNotNullParameter(clause, "clause");
        this.f281399a = clause;
        this.f281400b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f281399a, kVar.f281399a) && this.f281400b == kVar.f281400b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f281400b) + (this.f281399a.hashCode() * 31);
    }
}
