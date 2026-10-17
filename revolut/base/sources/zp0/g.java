package zp0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f324117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f324118b;

    public g(int i, String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f324117a = i;
        this.f324118b = value;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f324117a == gVar.f324117a && Intrinsics.f(this.f324118b, gVar.f324118b);
    }

    public final int hashCode() {
        return this.f324118b.hashCode() + (Integer.hashCode(this.f324117a) * 31);
    }
}
