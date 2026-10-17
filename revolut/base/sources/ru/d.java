package ru;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class d extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f257360a;

    public d(dj0.d dVar) {
        this.f257360a = dVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f257360a, ((d) obj2).f257360a);
    }

    public final int hashCode() {
        dj0.d dVar = this.f257360a;
        if (dVar == null) {
            return 0;
        }
        return dVar.hashCode();
    }
}
