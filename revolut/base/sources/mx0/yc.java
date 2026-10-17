package mx0;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class yc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f210131a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f210132b;

    public yc(Clause clause, boolean z) {
        Intrinsics.checkNotNullParameter(clause, "clause");
        this.f210131a = clause;
        this.f210132b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof yc)) {
            return false;
        }
        yc ycVar = (yc) obj2;
        return Intrinsics.f(this.f210131a, ycVar.f210131a) && this.f210132b == ycVar.f210132b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f210132b) + (this.f210131a.hashCode() * 31);
    }
}
