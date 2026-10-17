package ip0;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class c10 implements qv0.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f163672a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f163673b;

    public c10(Clause text, Object obj2) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f163672a = text;
        this.f163673b = obj2;
    }

    @Override // qv0.p
    /* JADX INFO: renamed from: a */
    public final Object getF53520g() {
        return this.f163673b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c10)) {
            return false;
        }
        c10 c10Var = (c10) obj2;
        return Intrinsics.f(this.f163672a, c10Var.f163672a) && Intrinsics.f(this.f163673b, c10Var.f163673b);
    }

    public final int hashCode() {
        int iHashCode = this.f163672a.hashCode() * 31;
        Object obj2 = this.f163673b;
        return iHashCode + (obj2 == null ? 0 : obj2.hashCode());
    }
}
