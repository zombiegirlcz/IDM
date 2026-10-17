package bs4;

import kotlin.jvm.internal.Intrinsics;
import ql4.y;

/* JADX INFO: loaded from: classes22.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final whf.p f18045a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y f18046b;

    public f(whf.p transactionsContent, y instalmentPlan) {
        Intrinsics.checkNotNullParameter(transactionsContent, "transactionsContent");
        Intrinsics.checkNotNullParameter(instalmentPlan, "instalmentPlan");
        this.f18045a = transactionsContent;
        this.f18046b = instalmentPlan;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f18045a, fVar.f18045a) && Intrinsics.f(this.f18046b, fVar.f18046b);
    }

    public final int hashCode() {
        return this.f18046b.hashCode() + (this.f18045a.hashCode() * 31);
    }
}
