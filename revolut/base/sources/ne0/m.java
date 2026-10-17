package ne0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f214393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f214394b;

    public m(Object value) {
        long jD = jli.b.d();
        Intrinsics.checkNotNullParameter(value, "value");
        this.f214393a = value;
        this.f214394b = jD;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f214393a, mVar.f214393a) && this.f214394b == mVar.f214394b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f214394b) + (this.f214393a.hashCode() * 31);
    }
}
