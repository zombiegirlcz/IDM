package lf8;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f194668a;

    public e(Integer num) {
        this.f194668a = num;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f194668a, ((e) obj2).f194668a);
    }

    public final int hashCode() {
        Integer num = this.f194668a;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }
}
