package ru;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class f extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f257362a;

    public f(dj0.d dVar) {
        this.f257362a = dVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f257362a, ((f) obj2).f257362a);
    }

    public final int hashCode() {
        dj0.d dVar = this.f257362a;
        if (dVar == null) {
            return 0;
        }
        return dVar.hashCode();
    }
}
