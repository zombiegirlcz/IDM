package eac;

import kotlin.jvm.internal.Intrinsics;
import m1c.x0;

/* JADX INFO: loaded from: classes6.dex */
public final class m implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x0 f124170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f124171b;

    public m(x0 optInState, boolean z) {
        Intrinsics.checkNotNullParameter(optInState, "optInState");
        this.f124170a = optInState;
        this.f124171b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return this.f124170a == mVar.f124170a && this.f124171b == mVar.f124171b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f124171b) + (this.f124170a.hashCode() * 31);
    }
}
