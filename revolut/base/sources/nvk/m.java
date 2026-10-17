package nvk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f219720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f219721b;

    public m(String id10, int i) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f219720a = id10;
        this.f219721b = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f219720a, mVar.f219720a) && this.f219721b == mVar.f219721b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f219721b) + (this.f219720a.hashCode() * 31);
    }
}
