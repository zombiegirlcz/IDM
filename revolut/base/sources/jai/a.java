package jai;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class a implements aii.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f172479a;

    public a(b inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f172479a = inputData;
    }

    public final b b() {
        return this.f172479a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f172479a, ((a) obj2).f172479a);
    }

    public final int hashCode() {
        return this.f172479a.hashCode();
    }
}
