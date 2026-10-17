package aw0;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class r1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f10505a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f10506b;

    public r1(List leftColumn, List rightColumn) {
        Intrinsics.checkNotNullParameter(leftColumn, "leftColumn");
        Intrinsics.checkNotNullParameter(rightColumn, "rightColumn");
        this.f10505a = leftColumn;
        this.f10506b = rightColumn;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r1)) {
            return false;
        }
        r1 r1Var = (r1) obj2;
        return Intrinsics.f(this.f10505a, r1Var.f10505a) && Intrinsics.f(this.f10506b, r1Var.f10506b);
    }

    public final int hashCode() {
        return this.f10506b.hashCode() + (this.f10505a.hashCode() * 31);
    }
}
