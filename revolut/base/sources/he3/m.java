package he3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class m extends p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f151567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f151568b;

    public m(int i, t weekendPolicy) {
        Intrinsics.checkNotNullParameter(weekendPolicy, "weekendPolicy");
        this.f151567a = i;
        this.f151568b = weekendPolicy;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return this.f151567a == mVar.f151567a && this.f151568b == mVar.f151568b;
    }

    public final int hashCode() {
        return this.f151568b.hashCode() + (Integer.hashCode(this.f151567a) * 31);
    }

    public /* synthetic */ m(int i) {
        this(i, t.SAME_DAY);
    }
}
