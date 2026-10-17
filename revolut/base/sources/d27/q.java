package d27;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f110765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f110766b;

    public q() {
        this(0);
    }

    public static q a(q qVar, String value, boolean z, int i) {
        if ((i & 1) != 0) {
            value = qVar.f110765a;
        }
        if ((i & 2) != 0) {
            z = qVar.f110766b;
        }
        qVar.getClass();
        Intrinsics.checkNotNullParameter(value, "value");
        return new q(value, z);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.f110765a, qVar.f110765a) && this.f110766b == qVar.f110766b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f110766b) + (this.f110765a.hashCode() * 31);
    }

    public q(String value, boolean z) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f110765a = value;
        this.f110766b = z;
    }

    public /* synthetic */ q(int i) {
        this("", false);
    }
}
