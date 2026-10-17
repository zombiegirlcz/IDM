package mx0;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class a6 extends c6 {
    public final String d;
    public final Clause e;

    public a6(Clause label, String listId) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(label, "label");
        this.d = listId;
        this.e = label;
    }

    @Override // mx0.c6, koi.j
    /* JADX INFO: renamed from: b */
    public final String getF53816a() {
        return this.d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a6)) {
            return false;
        }
        a6 a6Var = (a6) obj2;
        return Intrinsics.f(this.d, a6Var.d) && Intrinsics.f(this.e, a6Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + (this.d.hashCode() * 31);
    }
}
