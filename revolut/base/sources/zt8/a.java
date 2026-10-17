package zt8;

import kotlin.jvm.internal.Intrinsics;
import od0.i;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f325089a;

    public a(i citizenship) {
        Intrinsics.checkNotNullParameter(citizenship, "citizenship");
        this.f325089a = citizenship;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f325089a, ((a) obj2).f325089a);
    }

    public final int hashCode() {
        return this.f325089a.hashCode();
    }
}
