package k50;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;

/* JADX INFO: loaded from: classes19.dex */
public final class l4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f181169a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f181170b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f181171c;
    public final Function1 d;

    public l4(boolean z, long j2, long j3, Function1 suppressAgentTyping) {
        Intrinsics.checkNotNullParameter(suppressAgentTyping, "suppressAgentTyping");
        this.f181169a = z;
        this.f181170b = j2;
        this.f181171c = j3;
        this.d = suppressAgentTyping;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l4)) {
            return false;
        }
        l4 l4Var = (l4) obj2;
        return this.f181169a == l4Var.f181169a && kotlin.time.b.d(this.f181170b, l4Var.f181170b) && kotlin.time.b.d(this.f181171c, l4Var.f181171c) && Intrinsics.f(this.d, l4Var.d);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f181169a) * 31;
        b.Companion companion = kotlin.time.b.INSTANCE;
        return this.d.hashCode() + a0.d.c(a0.d.c(iHashCode, 31, this.f181170b), 31, this.f181171c);
    }
}
