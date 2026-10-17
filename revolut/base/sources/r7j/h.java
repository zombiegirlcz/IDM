package r7j;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f252268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f252269b;

    public h(Clause titleClause, Clause secondDescriptionClause) {
        Intrinsics.checkNotNullParameter(titleClause, "titleClause");
        Intrinsics.checkNotNullParameter(secondDescriptionClause, "secondDescriptionClause");
        this.f252268a = titleClause;
        this.f252269b = secondDescriptionClause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return this.f252268a.equals(hVar.f252268a) && this.f252269b.equals(hVar.f252269b);
    }

    public final int hashCode() {
        return this.f252269b.hashCode() + (this.f252268a.hashCode() * 31);
    }
}
