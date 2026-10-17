package fy6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class j implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f138940a;

    public j(Integer num) {
        this.f138940a = num;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f138940a, ((j) obj2).f138940a);
    }

    public final int hashCode() {
        Integer num = this.f138940a;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }
}
