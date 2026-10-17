package ldc;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f194055a;

    public a(Clause clause) {
        Intrinsics.checkNotNullParameter(clause, "clause");
        this.f194055a = clause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f194055a, ((a) obj2).f194055a);
    }

    public final int hashCode() {
        return this.f194055a.hashCode();
    }
}
