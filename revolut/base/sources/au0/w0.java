package au0;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f9412a;

    public w0(Clause clause) {
        Intrinsics.checkNotNullParameter(clause, "clause");
        this.f9412a = clause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof w0) && Intrinsics.f(this.f9412a, ((w0) obj2).f9412a);
    }

    public final int hashCode() {
        return this.f9412a.hashCode();
    }
}
