package ru;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class g extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f257363a;

    public g(dj0.d reward) {
        Intrinsics.checkNotNullParameter(reward, "reward");
        this.f257363a = reward;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f257363a, ((g) obj2).f257363a);
    }

    public final int hashCode() {
        return this.f257363a.hashCode();
    }
}
