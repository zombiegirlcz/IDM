package oy6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f230895a;

    public g(Integer num) {
        this.f230895a = num;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f230895a, ((g) obj2).f230895a);
    }

    public final int hashCode() {
        Integer num = this.f230895a;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    @Override // oy6.i
    public final Integer w() {
        return this.f230895a;
    }
}
