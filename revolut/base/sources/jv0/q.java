package jv0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class q extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final oz0.a f178759a;

    public q(oz0.a aVar) {
        this.f178759a = aVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof q) && Intrinsics.f(this.f178759a, ((q) obj2).f178759a);
    }

    public final int hashCode() {
        oz0.a aVar = this.f178759a;
        if (aVar == null) {
            return 0;
        }
        return aVar.hashCode();
    }
}
