package fnc;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f136648a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f136649b;

    public p(TextLocalisedClause primaryActionText, boolean z) {
        Intrinsics.checkNotNullParameter(primaryActionText, "primaryActionText");
        this.f136648a = primaryActionText;
        this.f136649b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return this.f136648a.equals(pVar.f136648a) && this.f136649b == pVar.f136649b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f136649b) + (this.f136648a.hashCode() * 31);
    }
}
