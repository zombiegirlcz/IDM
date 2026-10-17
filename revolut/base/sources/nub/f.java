package nub;

import aw0.p9;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class f implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p9 f219279a;

    public f() {
        this(p9.ONLY_NEGATIVE);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && this.f219279a == ((f) obj2).f219279a;
    }

    public final int hashCode() {
        return this.f219279a.hashCode();
    }

    public f(p9 signShowingPolicy) {
        Intrinsics.checkNotNullParameter(signShowingPolicy, "signShowingPolicy");
        this.f219279a = signShowingPolicy;
    }
}
