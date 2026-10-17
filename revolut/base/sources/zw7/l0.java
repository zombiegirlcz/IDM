package zw7;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Boolean f325813a;

    public l0(Boolean bool) {
        this.f325813a = bool;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l0) && Intrinsics.f(this.f325813a, ((l0) obj2).f325813a);
    }

    public final int hashCode() {
        Boolean bool = this.f325813a;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }
}
