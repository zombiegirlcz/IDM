package ttk;

import kotlin.jvm.internal.Intrinsics;
import mel.j0;

/* JADX INFO: loaded from: classes12.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j0 f274435a;

    public a(j0 tradeRecommendation) {
        Intrinsics.checkNotNullParameter(tradeRecommendation, "tradeRecommendation");
        this.f274435a = tradeRecommendation;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && this.f274435a == ((a) obj2).f274435a;
    }

    public final int hashCode() {
        return this.f274435a.hashCode();
    }
}
