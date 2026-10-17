package tw0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f274848a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f274849b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f274850c;

    public m0(int i, int i2, Object obj2) {
        this.f274848a = i;
        this.f274849b = i2;
        this.f274850c = obj2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj2;
        return this.f274848a == m0Var.f274848a && this.f274849b == m0Var.f274849b && Intrinsics.f(this.f274850c, m0Var.f274850c);
    }

    public final int hashCode() {
        int iB = j6.a.b(this.f274849b, Integer.hashCode(this.f274848a) * 31, 31);
        Object obj2 = this.f274850c;
        return iB + (obj2 == null ? 0 : obj2.hashCode());
    }
}
