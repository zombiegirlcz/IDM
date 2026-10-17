package lyf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f200826a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f200827b;

    public g(int i, c countStatus) {
        Intrinsics.checkNotNullParameter(countStatus, "countStatus");
        this.f200826a = i;
        this.f200827b = countStatus;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f200826a == gVar.f200826a && this.f200827b == gVar.f200827b;
    }

    public final int hashCode() {
        return this.f200827b.hashCode() + (Integer.hashCode(this.f200826a) * 31);
    }
}
