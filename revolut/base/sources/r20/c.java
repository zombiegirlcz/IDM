package r20;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class c implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f251018a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f251019b;

    public c(int i, String reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        this.f251018a = i;
        this.f251019b = reason;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f251018a == cVar.f251018a && Intrinsics.f(this.f251019b, cVar.f251019b);
    }

    public final int hashCode() {
        return this.f251019b.hashCode() + (Integer.hashCode(this.f251018a) * 31);
    }
}
