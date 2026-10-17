package fy4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class s implements aii.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f138907a;

    public s(t inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f138907a = inputData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof s) && Intrinsics.f(this.f138907a, ((s) obj2).f138907a);
    }

    public final int hashCode() {
        return this.f138907a.f138908a.hashCode();
    }
}
