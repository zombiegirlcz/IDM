package iu0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class n implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f168450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f168451b = 1.0f;

    public n(Integer num) {
        this.f168450a = num;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f168450a, nVar.f168450a) && Float.compare(this.f168451b, nVar.f168451b) == 0;
    }

    public final int hashCode() {
        Integer num = this.f168450a;
        return Float.hashCode(this.f168451b) + ((num == null ? 0 : num.hashCode()) * 31);
    }
}
