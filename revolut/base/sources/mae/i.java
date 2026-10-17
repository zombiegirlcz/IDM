package mae;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f204004a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f204005b;

    public i(int i, TextLocalisedClause text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f204004a = text;
        this.f204005b = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return this.f204004a.equals(iVar.f204004a) && this.f204005b == iVar.f204005b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f204005b) + (this.f204004a.hashCode() * 31);
    }
}
