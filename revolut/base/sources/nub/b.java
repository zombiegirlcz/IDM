package nub;

import aw0.p9;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p9 f219275a;

    public b() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && this.f219275a == ((b) obj2).f219275a;
    }

    public final int hashCode() {
        return this.f219275a.hashCode();
    }

    public /* synthetic */ b(int i) {
        this(p9.ONLY_NEGATIVE);
    }

    public b(p9 signShowingPolicy) {
        Intrinsics.checkNotNullParameter(signShowingPolicy, "signShowingPolicy");
        this.f219275a = signShowingPolicy;
    }
}
