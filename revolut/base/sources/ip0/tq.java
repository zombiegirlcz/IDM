package ip0;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class tq implements uq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f166560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f166561b;

    public tq(Clause startLabel, Clause endLabel) {
        Intrinsics.checkNotNullParameter(startLabel, "startLabel");
        Intrinsics.checkNotNullParameter(endLabel, "endLabel");
        this.f166560a = startLabel;
        this.f166561b = endLabel;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof tq)) {
            return false;
        }
        tq tqVar = (tq) obj2;
        return this.f166560a.equals(tqVar.f166560a) && this.f166561b.equals(tqVar.f166561b);
    }

    public final int hashCode() {
        return this.f166561b.hashCode() + (this.f166560a.hashCode() * 31);
    }
}
