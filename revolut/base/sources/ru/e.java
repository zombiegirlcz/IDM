package ru;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class e extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f257361a;

    public e(Integer num) {
        this.f257361a = num;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f257361a, ((e) obj2).f257361a);
    }

    public final int hashCode() {
        Integer num = this.f257361a;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }
}
