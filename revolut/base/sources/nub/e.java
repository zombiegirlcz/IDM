package nub;

import aw0.p9;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class e implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p9 f219278a;

    public e() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && this.f219278a == ((e) obj2).f219278a;
    }

    public final int hashCode() {
        return this.f219278a.hashCode();
    }

    public /* synthetic */ e(int i) {
        this(p9.ONLY_NEGATIVE);
    }

    public e(p9 signShowingPolicy) {
        Intrinsics.checkNotNullParameter(signShowingPolicy, "signShowingPolicy");
        this.f219278a = signShowingPolicy;
    }
}
