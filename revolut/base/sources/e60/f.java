package e60;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class f extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f122845a;

    public f(i inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f122845a = inputData;
    }

    @Override // e60.h
    public final i a() {
        return this.f122845a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f122845a, ((f) obj2).f122845a);
    }

    public final int hashCode() {
        return this.f122845a.hashCode();
    }
}
